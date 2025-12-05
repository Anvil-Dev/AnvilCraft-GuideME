package dev.anvilcraft.guideme.element;

import guideme.compiler.PageCompiler;
import guideme.compiler.tags.MdxAttrs;
import guideme.document.LytErrorSink;
import guideme.libs.mdast.mdx.model.MdxJsxElementFields;
import guideme.scene.GuidebookScene;
import guideme.scene.element.SceneElementTagCompiler;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3f;

import java.util.Set;

public class ItemEntityShapeCompiler implements SceneElementTagCompiler {
    public static final String TAG_NAME = "ItemEntity";

    @Override
    public Set<String> getTagNames() {
        return Set.of(TAG_NAME);
    }

    @Override
    public void compile(
        GuidebookScene scene,
        PageCompiler compiler,
        LytErrorSink errorSink,
        MdxJsxElementFields el
    ) {
        ItemStack itemStack = MdxAttrs.getRequiredItemStack(compiler, errorSink, el);
        if (itemStack == null) return;
        int count = MdxAttrs.getInt(compiler, errorSink, el, "count", 1);
        itemStack.setCount(count);
        Vector3f pos = MdxAttrs.getVector3(compiler, errorSink, el, "pos", new Vector3f(0.5f, 0, 0.5f));
        MdxAttrs.getFloatPos(compiler, errorSink, el, pos);
        // x/z加0.5 方便写
        ItemEntity itemEntity = new ItemEntity(scene.getLevel(), pos.x + 0.5, pos.y, pos.z + 0.5, itemStack);
        scene.getLevel().addEntity(itemEntity);
    }
}
