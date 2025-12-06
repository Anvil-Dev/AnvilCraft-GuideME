package dev.anvilcraft.guideme.lyt;

import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.anvilcraft.lib.recipe.component.ChanceBlockState;
import guideme.document.LytRect;
import guideme.document.block.LytBlock;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.MultiBufferSource;

import java.util.List;
import java.util.concurrent.TimeUnit;

// WIP or RIP
public class LytRecipeBlock extends LytBlock {

    private static final int BLOCK_SIZE = 16;
    private static final int COMMON_HEIGHT = BLOCK_SIZE * 3;
    private static final int LAGER_HEIGHT = BLOCK_SIZE * 4;
    private static int CYCLE_TIME = Math.toIntExact(System.nanoTime() / TimeUnit.MILLISECONDS.toNanos(2000));
    public static final int WIDTH = 162;

    @Setter
    @Getter
    private int workingBlockCount = 2;

    private List<BlockStatePredicate> blockStatePredicates;
    private List<ChanceBlockState> chanceBlockStates;

    // 没填的了填null也可以的
    public LytRecipeBlock(
        List<BlockStatePredicate> blockStatePredicateList,
        List<ChanceBlockState> chanceBlockStateList,
        boolean anvil
    ) {
        if (blockStatePredicateList != null) this.blockStatePredicates = blockStatePredicateList;
        if (chanceBlockStateList != null) this.chanceBlockStates = chanceBlockStateList;
    }

    @Override
    protected LytRect computeLayout(LayoutContext context, int x, int y, int availableWidth) {
        if (workingBlockCount > 2) {
            return new LytRect(x, y, WIDTH, COMMON_HEIGHT);
        } else {
            return new LytRect(x, y, WIDTH, LAGER_HEIGHT);
        }
    }

    @Override
    public void render(RenderContext context) {
        int x = bounds.x();
        int y = bounds.y();

        if (!blockStatePredicates.isEmpty()) {

        }

        if (!chanceBlockStates.isEmpty()) {

        }
    }

    @Override
    protected void onLayoutMoved(int deltaX, int deltaY) {
        // 似乎没用()
    }

    @Override
    public void renderBatch(RenderContext context, MultiBufferSource buffers) {
        // 似乎没用()
    }
}
