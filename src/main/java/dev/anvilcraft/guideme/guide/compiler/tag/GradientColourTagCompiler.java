package dev.anvilcraft.guideme.guide.compiler.tag;

import dev.anvilcraft.guideme.guide.compiler.util.ColorUtil;
import guideme.color.ColorValue;
import guideme.compiler.PageCompiler;
import guideme.compiler.tags.FlowTagCompiler;
import guideme.compiler.tags.MdxAttrs;
import guideme.document.flow.LytFlowParent;
import guideme.document.flow.LytFlowSpan;
import guideme.libs.mdast.mdx.model.MdxJsxElementFields;
import guideme.libs.mdast.model.MdAstNode;
import guideme.style.TextStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GradientColourTagCompiler extends FlowTagCompiler {
    @Override
    public Set<String> getTagNames() {
        return Set.of("Colour", "GradientColour", "BetterColor");
    }

    @Override
    protected void compile(PageCompiler compiler, LytFlowParent parent, MdxJsxElementFields el) {
        String string1 = MdxAttrs.getString(compiler, parent, el, "firstColor", null);
        String string2 = MdxAttrs.getString(compiler, parent, el, "lastColor", null);
        if (string1 == null) {
            parent.appendError(compiler, "Missing 'firstColor' attribute", el);
            return;
        } else if (string2 == null) {
            parent.appendError(compiler, "Missing 'lastColor' attribute", el);
            return;
        }

        ColorValue firstColor;
        ColorValue lastColor;

        try {
            firstColor = new ColorUtil(string1);
            lastColor = new ColorUtil(string2);
        } catch (IllegalArgumentException e) {
            parent.appendError(compiler, "Unknown color: '" + string1 + "||" + string2 + "'", el);
            return;
        }

        List<String> strings = new ArrayList<>();
        List<LytFlowSpan> spans = new ArrayList<>();
        List<ColorValue> colorValues = new ArrayList<>();

        boolean bold = MdxAttrs.getBoolean(compiler, parent, el, "bold", false);
        boolean italic = MdxAttrs.getBoolean(compiler, parent, el, "italic", false);
        boolean underlined = MdxAttrs.getBoolean(compiler, parent, el, "underlined", false);
        boolean strikethrough = MdxAttrs.getBoolean(compiler, parent, el, "strikethrough", false);
        boolean obfuscated = MdxAttrs.getBoolean(compiler, parent, el, "obfuscated", false);
        boolean dropShadow = MdxAttrs.getBoolean(compiler, parent, el, "dropShadow", false);

        if (el.children() != null) {
            for (var child : el.children()) {
                if (child instanceof MdAstNode node) {
                    String text = node.toText();
                    for (int i = 0; i < text.length(); i++) {
                        strings.add(String.valueOf(text.charAt(i)));
                    }
                }
            }
        }

        int stringSize = strings.size();
        if (stringSize > 0) {
            for (int i = 0; i < stringSize; i++) {
                float ratio = stringSize > 1 ? (float) i / (stringSize - 1) : 0.0f;
                String gradientColor = ColorUtil.calculateGradientColor(firstColor, lastColor, ratio);
                colorValues.add(new ColorUtil(gradientColor));
            }

            for (String string : strings) {
                LytFlowSpan span = new LytFlowSpan();
                span.appendText(string);
                spans.add(span);
            }

            int spanSize = spans.size();
            for (int i = 0; i < spanSize; i++) {
                var span = spans.get(i);
                span.setStyle(
                    TextStyle.builder()
                        .color(colorValues.get(i))
                        .bold(bold)
                        .italic(italic)
                        .underlined(underlined)
                        .strikethrough(strikethrough)
                        .obfuscated(obfuscated)
                        .dropShadow(dropShadow)
                        .build()
                );
                parent.append(span);
            }
        }
    }
}
