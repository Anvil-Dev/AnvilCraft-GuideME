package dev.anvilcraft.guideme.guide.compiler.tag;

import dev.anvilcraft.guideme.guide.compiler.util.ColorUtil;
import guideme.compiler.PageCompiler;
import guideme.compiler.tags.FlowTagCompiler;
import guideme.compiler.tags.MdxAttrs;
import guideme.document.flow.LytFlowParent;
import guideme.document.flow.LytFlowSpan;
import guideme.libs.mdast.mdx.model.MdxJsxElementFields;
import guideme.style.TextStyle;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.chat.Component;

import java.util.Set;

// 不移除 原因:guideme本体做的KeyBind信息不全
public class KeyMapTagCompiler extends FlowTagCompiler {
    @Override
    public Set<String> getTagNames() {
        return Set.of("Key");
    }

    @Override
    protected void compile(PageCompiler compiler, LytFlowParent parent, MdxJsxElementFields el) {
        String string = MdxAttrs.getString(compiler, parent, el, "id", null);
        if (string == null) {
            parent.appendError(compiler, "Missing 'id', attribute", el);
            return;
        }

        Component component = KeyMapping.createNameSupplier(string).get();
        Component component1 = Component.translatable(string);
        String name = component1.getString() + " [" + component.getString() + "] ";
        LytFlowSpan span = new LytFlowSpan();
        span.appendText(name);
        span.setHoverStyle(TextStyle.builder().underlined(true).color(new ColorUtil("97d9e1")).build());
        span.setStyle(TextStyle.builder().color(new ColorUtil("d9afd9")).build());
        parent.append(span);
    }
}
