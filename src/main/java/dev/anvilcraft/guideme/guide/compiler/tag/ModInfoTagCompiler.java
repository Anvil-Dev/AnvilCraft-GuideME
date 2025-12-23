package dev.anvilcraft.guideme.guide.compiler.tag;

import dev.anvilcraft.guideme.guide.compiler.util.ColorUtil;
import dev.anvilcraft.guideme.util.IntegrationUtil;
import guideme.compiler.PageCompiler;
import guideme.compiler.tags.FlowTagCompiler;
import guideme.compiler.tags.MdxAttrs;
import guideme.document.flow.LytFlowParent;
import guideme.document.flow.LytFlowSpan;
import guideme.libs.mdast.mdx.model.MdxJsxElementFields;
import guideme.style.TextStyle;
import net.minecraft.network.chat.Component;

import java.util.Set;

/**
 * ModInfo标签编译器，继承自FlowTagCompiler
 * 用于处理ModInfo元素，负责编译ModInfo标签并显示模组信息
 */
public class ModInfoTagCompiler extends FlowTagCompiler {
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
        LytFlowSpan span = new LytFlowSpan();
        String modName = IntegrationUtil.getName(id);
        String modVersion = IntegrationUtil.getVersion(id);
        String nameAndVersion;
        if (modName != null && modVersion != null) {
            nameAndVersion = modName + " " + modVersion;
            span.appendText(Component.translatable("gui.ac_guideme.loaded", nameAndVersion).getString());
            span.setStyle(TextStyle.builder().color(new ColorUtil("#98fb98")).build());
            span.setHoverStyle(TextStyle.builder().bold(true).color(new ColorUtil("#00ff00")).build());
        } else if (modName != null) {
            nameAndVersion = modName;
            span.appendText(Component.translatable("gui.ac_guideme.loaded", nameAndVersion).getString());
            span.setStyle(TextStyle.builder().color(new ColorUtil("#98fb98")).build());
            span.setHoverStyle(TextStyle.builder().bold(true).color(new ColorUtil("#00ff00")).build());
        } else {
            nameAndVersion = id;
            span.appendText(Component.translatable("gui.ac_guideme.unloaded", nameAndVersion).getString());
            span.setStyle(TextStyle.builder().color(new ColorUtil("#dc143c")).build());
            span.setHoverStyle(TextStyle.builder().bold(true).color(new ColorUtil("#ff0000")).build());
        }
        parent.append(span);
    }
}
