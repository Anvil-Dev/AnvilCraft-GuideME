package dev.anvilcraft.guideme.guide.compiler.tag;

import dev.anvilcraft.guideme.guide.compiler.util.ColorUtil;
import dev.anvilcraft.guideme.util.IntegrationUtil;
import guideme.PageAnchor;
import guideme.compiler.LinkParser;
import guideme.compiler.PageCompiler;
import guideme.compiler.tags.FlowTagCompiler;
import guideme.compiler.tags.MdxAttrs;
import guideme.document.flow.LytFlowLink;
import guideme.document.flow.LytFlowParent;
import guideme.libs.mdast.mdx.model.MdxJsxElementFields;
import guideme.style.TextStyle;
import net.minecraft.network.chat.Component;

import java.net.URI;
import java.util.Set;

/**
 * ModInfo标签编译器，继承自FlowTagCompiler
 * 用于处理ModInfo元素，负责编译ModInfo标签并显示模组信息
 */
public class ModInfoTagCompiler extends FlowTagCompiler implements LinkParser.Visitor {
    @Override
    public Set<String> getTagNames() {
        return Set.of("ModInfo");
    }

    @Override
    protected void compile(PageCompiler compiler, LytFlowParent parent, MdxJsxElementFields el) {
        String id = MdxAttrs.getString(compiler, parent, el, "id", null);
        if (id == null) {
            parent.appendError(compiler, "Missing 'id' attribute", el);
            return;
        }
        LytFlowLink link = new LytFlowLink();
        String modName = IntegrationUtil.getName(id);
        String modVersion = IntegrationUtil.getVersion(id);
        String url = el.getAttributeString("url", null);
        String nameAndVersion;
        if (modName != null && modVersion != null) {
            nameAndVersion = modName + " " + modVersion;
            link.appendText(Component.translatable("gui.ac_guideme.loaded", nameAndVersion).getString());
            link.setStyle(TextStyle.builder().color(new ColorUtil("98fb98")).build());
            link.setHoverStyle(TextStyle.builder().bold(true).color(new ColorUtil("00ff00")).build());
        } else if (modName != null) {
            nameAndVersion = modName;
            link.appendText(Component.translatable("gui.ac_guideme.loaded", nameAndVersion).getString());
            link.setStyle(TextStyle.builder().color(new ColorUtil("98fb98")).build());
            link.setHoverStyle(TextStyle.builder().bold(true).color(new ColorUtil("00ff00")).build());
        } else {
            nameAndVersion = id;
            link.appendText(Component.translatable("gui.ac_guideme.unloaded", nameAndVersion).getString());
            link.setStyle(TextStyle.builder().color(new ColorUtil("dc143c")).build());
            link.setHoverStyle(TextStyle.builder().bold(true).color(new ColorUtil("ff0000")).build());
        }

        if (url != null) {
            LinkParser.parseLink(
                compiler, url, new LinkParser.Visitor() {
                    @Override
                    public void handlePage(PageAnchor page) {
                        link.setPageLink(page);
                    }

                    @Override
                    public void handleExternal(URI uri) {
                        link.setExternalUrl(uri);
                    }

                    @Override
                    public void handleError(String error) {
                        parent.appendError(compiler, error, el);
                    }
                }
            );
        }

        parent.append(link);
    }
}
