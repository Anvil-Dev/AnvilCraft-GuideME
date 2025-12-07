package dev.anvilcraft.guideme.recipe.box;

import dev.anvilcraft.guideme.util.GuideMERenderUtil;
import guideme.document.block.LytVBox;

public abstract class BetterLytVBox extends LytVBox {
    protected static float ANVIL_ANIMATION = GuideMERenderUtil.getAnvilAnimationOffset();

    public int getSafeX() {
        return bounds.width() / 2 + bounds.x();
    }

    public int getSafeY() {
        return bounds.height() / 2 + bounds.y();
    }
}
