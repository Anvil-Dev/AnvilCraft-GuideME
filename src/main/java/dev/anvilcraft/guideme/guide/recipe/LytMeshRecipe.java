package dev.anvilcraft.guideme.guide.recipe;

import dev.anvilcraft.guideme.guide.slot.LytBlockSlot;
import dev.anvilcraft.guideme.guide.slot.LytInputItemSlot;
import dev.anvilcraft.guideme.guide.slot.LytOutputItemSlot;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import dev.dubhe.anvilcraft.recipe.anvil.wrap.MeshRecipe;
import guideme.document.LytRect;
import guideme.document.block.LytVBox;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class LytMeshRecipe extends LytVBox {
    private final LytBlockSlot workBlocks;
    private final LytInputItemSlot inputItemSlot;
    private final LytOutputItemSlot outputItemSlot;

    public LytMeshRecipe(MeshRecipe recipe) {
        List<BlockStatePredicate> work = new ArrayList<>();
        work.add(BlockStatePredicate.builder().of(Blocks.SCAFFOLDING).build());
        append(workBlocks = new LytBlockSlot(work));
        workBlocks.setAnvilAnimation(true);
        workBlocks.setHasAnvil(true);
        append(inputItemSlot = new LytInputItemSlot(recipe.getInputItems()));
        append(outputItemSlot = new LytOutputItemSlot(recipe.getResultItems()));
    }

    @Override
    public void render(RenderContext context) {
        workBlocks.render(context);
        inputItemSlot.render(context);
        outputItemSlot.render(context);
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        workBlocks.layout(context, x + 70, y + 10, availableWidth);
        inputItemSlot.layout(context, x + 15, y, availableWidth);
        outputItemSlot.layout(context, x + 87, y, availableWidth);
        return new LytRect(x, y, 162, 64);
    }
}
