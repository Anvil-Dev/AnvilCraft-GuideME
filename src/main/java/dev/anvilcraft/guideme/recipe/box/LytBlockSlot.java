package dev.anvilcraft.guideme.recipe.box;

import dev.anvilcraft.guideme.util.GuideMERenderUtil;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import guideme.document.LytRect;
import guideme.document.block.LytBlock;
import guideme.document.interaction.GuideTooltip;
import guideme.document.interaction.InteractiveElement;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.MultiBufferSource;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LytBlockSlot extends LytBlock implements InteractiveElement {
    private static final int WIDTH = 16;
    private static final int HEIGHT = 16;

    public final List<BlockStatePredicate> blockStatePredicates;

    @Setter
    @Getter
    private boolean anvilAnimation;

    public LytBlockSlot(@Nullable List<BlockStatePredicate> blockStatePredicates) {
        this.blockStatePredicates = Objects.requireNonNullElseGet(blockStatePredicates, ArrayList::new);
    }

    @Override
    protected LytRect computeLayout(LayoutContext context, int x, int y, int availableWidth) {
        int size = blockStatePredicates.size();
        if (anvilAnimation) {
            return new LytRect(x, y, WIDTH, size * HEIGHT);
        } else {
            return new LytRect(x, y, WIDTH, size * HEIGHT);
        }
    }

    @Override
    protected void onLayoutMoved(int deltaX, int deltaY) {

    }

    @Override
    public void renderBatch(RenderContext context, MultiBufferSource buffers) {

    }

    @Override
    public void render(RenderContext context) {
        int x = getSafeX();
        int y = getSafeY();
        if (blockStatePredicates.isEmpty()) return;
        if (anvilAnimation) {
            GuideMERenderUtil.renderedBlockStatesAndAnvilAnimation(
                context.guiGraphics(),
                blockStatePredicates,
                x,
                y
            );
        } else {
            GuideMERenderUtil.renderedBlockStatesAndAnvil(
                context.guiGraphics(),
                blockStatePredicates,
                x,
                y
            );
        }
    }

    @Override
    public Optional<GuideTooltip> getTooltip(float mouseX, float mouseY) {
        // TODO: 懒得写了 调位置太烦了
        return Optional.empty();
    }

    public int getSafeX() {
        return bounds.width() / 2 + bounds.x();
    }

    public int getSafeY() {
        return bounds.height() / 2 + bounds.y();
    }
}
