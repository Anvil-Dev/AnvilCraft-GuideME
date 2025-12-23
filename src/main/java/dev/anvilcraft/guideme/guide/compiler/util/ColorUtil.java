package dev.anvilcraft.guideme.guide.compiler.util;

import guideme.color.ColorValue;
import guideme.color.LightDarkMode;
import net.minecraft.util.FastColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 大部分代码来自 guideme.color.Colors ： https://github.com/AppliedEnergistics/GuideME : LGPL-3.0 https://github.com/AppliedEnergistics/GuideME/blob/main/LICENSE.md
public class ColorUtil implements ColorValue {
    private static final Logger LOG = LoggerFactory.getLogger(ColorUtil.class);

    private final int color;

    public ColorUtil(String color) {
        this.color = hexToRgb(color);
    }

    public static int hexToRgb(String hexColor) {
        if (!hexColor.isEmpty()) {
            int start = 0;
            if (hexColor.charAt(0) == '#') {
                start++;
            }

            int remainingChars = hexColor.length() - start;

            if (remainingChars == 3 || remainingChars == 4) {
                int r = fromHexChar(hexColor.charAt(start));
                int g = fromHexChar(hexColor.charAt(start + 1));
                int b = fromHexChar(hexColor.charAt(start + 2));
                int a = 15;
                if (remainingChars == 4) {
                    a = fromHexChar(hexColor.charAt(start + 3));
                }
                if (r != -1 && g != -1 && b != -1 && a != -1) {
                    return argb(a << 4 | a, r << 4 | r, g << 4 | g, b << 4 | b);
                }
            } else if (remainingChars == 6 || remainingChars == 8) {
                int rHi = fromHexChar(hexColor.charAt(start));
                int rLo = fromHexChar(hexColor.charAt(start + 1));
                int gHi = fromHexChar(hexColor.charAt(start + 2));
                int gLo = fromHexChar(hexColor.charAt(start + 3));
                int bHi = fromHexChar(hexColor.charAt(start + 4));
                int bLo = fromHexChar(hexColor.charAt(start + 5));
                int aHi = 15, aLo = 15;
                if (remainingChars == 8) {
                    aHi = fromHexChar(hexColor.charAt(start + 6));
                    aLo = fromHexChar(hexColor.charAt(start + 7));
                }
                if (rHi != -1 && rLo != -1 && gHi != -1 && gLo != -1 && bHi != -1 && bLo != -1 && aHi != -1 && aLo != -1) {
                    return argb(aHi << 4 | aLo, rHi << 4 | rLo, gHi << 4 | gLo, bHi << 4 | bLo);
                }
            }
        }

        LOG.error("Tried to parse an invalid hexadecimal color string: '{}'", hexColor);
        return 0;
    }

    private static int fromHexChar(int ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else if (ch >= 'a' && ch <= 'f') {
            return 0xa + (ch - 'a');
        } else if (ch >= 'A' && ch <= 'F') {
            return 0xa + (ch - 'A');
        } else {
            return -1;
        }
    }

    public static int argb(int a, int r, int g, int b) {
        return FastColor.ARGB32.color(a, r, g, b);
    }

    @Override
    public int resolve(LightDarkMode lightDarkMode) {
        return color;
    }
}
