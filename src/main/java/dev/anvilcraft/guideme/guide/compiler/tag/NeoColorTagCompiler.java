package dev.anvilcraft.guideme.guide.compiler.tag;

import dev.anvilcraft.guideme.guide.compiler.util.ColorUtil;
import guideme.color.ColorValue;
import guideme.compiler.PageCompiler;
import guideme.compiler.tags.FlowTagCompiler;
import guideme.compiler.tags.MdxAttrs;
import guideme.document.flow.LytFlowParent;
import guideme.document.flow.LytFlowSpan;
import guideme.libs.mdast.mdx.model.MdxJsxElementFields;
import guideme.style.TextStyle;

import java.util.Set;

/**
 * NeoColor标签编译器，继承自FlowTagCompiler
 * 用于处理NeoColor标签，将指定颜色应用到文本内容上
 */
public class NeoColorTagCompiler extends FlowTagCompiler {
    @Override
    public Set<String> getTagNames() {
        return Set.of("NeoColor");
    }

    @Override
    protected void compile(PageCompiler compiler, LytFlowParent parent, MdxJsxElementFields el) {
        String string = MdxAttrs.getString(compiler, parent, el, "id", null);
        if (string == null) {
            parent.appendError(compiler, "Missing 'id' attribute", el);
            return;
        }

        ColorValue colorValue;

        try {
            colorValue = new ColorUtil(string);
        } catch (IllegalArgumentException e) {
            parent.appendError(compiler, "Unknown color: '" + string + "'", el);
            return;
        }

        LytFlowSpan span = new LytFlowSpan();
        span.setStyle(TextStyle.builder().color(colorValue).build());
        parent.append(span);
        compiler.compileFlowContext(el.children(), span);
    }
}
