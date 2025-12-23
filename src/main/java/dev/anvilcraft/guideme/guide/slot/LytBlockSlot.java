package dev.anvilcraft.guideme.guide.slot;

import dev.anvilcraft.guideme.util.GuideMERenderUtil;
import dev.anvilcraft.lib.recipe.component.BlockStatePredicate;
import guideme.document.LytRect;
import guideme.document.block.LytBox;
import guideme.document.interaction.GuideTooltip;
import guideme.document.interaction.InteractiveElement;
import guideme.layout.LayoutContext;
import guideme.render.RenderContext;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class LytBlockSlot extends LytBox implements InteractiveElement {
    private static final int WIDTH = 16;
    private static final int HEIGHT = 16;

    public final List<BlockStatePredicate> blockStatePredicates;

    @Setter
    @Getter
    private boolean anvilAnimation;
    @Setter
    @Getter
    private boolean hasAnvil;
    @Setter
    @Getter
    private boolean render;

    public LytBlockSlot(List<BlockStatePredicate> blockStatePredicates) {
        this.blockStatePredicates = Objects.requireNonNullElseGet(blockStatePredicates, ArrayList::new);
    }

    public LytBlockSlot(BlockState blockState) {
        BlockStatePredicate.Builder builder = BlockStatePredicate.builder();

        for (Map.Entry<Property<?>, Comparable<?>> entry : blockState.getValues().entrySet()) {
            Property<?> property = entry.getKey();
            Comparable<?> value = entry.getValue();
            builder.with(property, value.toString());
        }

        BlockStatePredicate predicate = builder.of(blockState.getBlock()).build();
        this.blockStatePredicates = List.of(predicate);
    }

    public LytBlockSlot(List<BlockStatePredicate> blockStatePredicates, BlockState blockState) {
        BlockStatePredicate.Builder builder = BlockStatePredicate.builder();
        for (Map.Entry<Property<?>, Comparable<?>> entry : blockState.getValues().entrySet()) {
            Property<?> property = entry.getKey();
            Comparable<?> value = entry.getValue();
            builder.with(property, value.toString());
        }
        BlockStatePredicate predicate = builder.of(blockState.getBlock()).build();

        List<BlockStatePredicate> list = new ArrayList<>(blockStatePredicates);
        list.add(predicate);
        this.blockStatePredicates = list;
    }

    public LytBlockSlot(BlockState state1, BlockState state2) {
        BlockStatePredicate.Builder builder1 = BlockStatePredicate.builder();
        BlockStatePredicate.Builder builder2 = BlockStatePredicate.builder();
        for (Map.Entry<Property<?>, Comparable<?>> entry : state1.getValues().entrySet()) {
            Property<?> property = entry.getKey();
            Comparable<?> value = entry.getValue();
            builder1.with(property, value.toString());
        }

        for (Map.Entry<Property<?>, Comparable<?>> entry : state2.getValues().entrySet()) {
            Property<?> property = entry.getKey();
            Comparable<?> value = entry.getValue();
            builder2.with(property, value.toString());
        }

        BlockStatePredicate predicate1 = builder1.of(state1.getBlock()).build();
        BlockStatePredicate predicate2 = builder2.of(state2.getBlock()).build();
        List<BlockStatePredicate> list = new ArrayList<>();
        list.add(predicate1);
        list.add(predicate2);
        this.blockStatePredicates = list;
    }

    @Override
    protected LytRect computeBoxLayout(LayoutContext context, int x, int y, int availableWidth) {
        int size = blockStatePredicates.size();
        return new LytRect(x, y, WIDTH, size * HEIGHT);
    }

    @Override
    public void render(RenderContext context) {
        int x = getSafeX();
        int y = getSafeY();
        if (blockStatePredicates.isEmpty()) return;
        if (anvilAnimation && hasAnvil) {
            GuideMERenderUtil.renderedBlockStatesAndAnvilAnimation(context.guiGraphics(), blockStatePredicates, x, y);
        } else if (hasAnvil) {
            GuideMERenderUtil.renderedBlockStatesAndAnvil(context.guiGraphics(), blockStatePredicates, x, y);
        } else if (!render) {
            GuideMERenderUtil.renderedBlock(context.guiGraphics(), blockStatePredicates, x, y);
        }
    }

    @Override
    public Optional<GuideTooltip> getTooltip(float mouseX, float mouseY) {
        // TODO: 这块的tooltip不会写 有没有好人帮我写下(发好人卡ing)
        return Optional.empty();
    }

    public int getSafeX() {
        return bounds.width() / 2 + bounds.x();
    }

    public int getSafeY() {
        return bounds.height() / 2 + bounds.y();
    }

    @Override
    protected void onLayoutMoved(int deltaX, int deltaY) {

    }

    @Override
    public void renderBatch(RenderContext context, MultiBufferSource buffers) {

    }
}
