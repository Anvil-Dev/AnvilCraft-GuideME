---
navigation:
  title: "§6空间超压器"
  icon: "anvilcraft:space_overcompressor"
  position: 220
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:nesting_shulker_box
  - anvilcraft:over_nesting_shulker_box
  - anvilcraft:supercritical_nesting_shulker_box
  - anvilcraft:space_overcompressor
---

# 空间超压器

<Row>
<ItemImage id="anvilcraft:nesting_shulker_box" scale="3"></ItemImage>
<ItemImage id="anvilcraft:over_nesting_shulker_box" scale="3"></ItemImage>
<ItemImage id="anvilcraft:supercritical_nesting_shulker_box" scale="3"></ItemImage>
<ItemImage id="anvilcraft:space_overcompressor" scale="3"></ItemImage>
</Row>

# 空间超压器

## 合成

<Row>
<Recipe id="anvilcraft:item_inject/nesting_shulker_box"></Recipe>
<Recipe id="anvilcraft:item_inject/over_nesting_shulker_box"></Recipe>
<Recipe id="anvilcraft:item_inject/supercritical_nesting_shulker_box"></Recipe>
<Recipe id="anvilcraft:block_compress/space_overcompressor"></Recipe>
</Row>

## 功能

- 生产<ItemLink id="anvilcraft:neutronium_ingot" />：
    - 将任意金属块/锭/粒置于<ItemLink id="anvilcraft:space_overcompressor" />之上
    - 用铁砧砸入，转化为质量值
    - 当<ItemLink id="anvilcraft:space_overcompressor" />的积攒了足够的质量值后，在下方输出一个<ItemLink id="anvilcraft:neutronium_ingot" />
- 参与[多方块合成](giant_anvil.md#功能)

---

# 嵌套潜影盒

## 特性

- 继承了潜影盒的性质，会被活塞破坏
- 右键三种嵌套潜影盒，其分别会发出1,2,3次开启和关闭的声音，每次都会被<ItemLink id="minecraft:observer" />识别
- 可以解压回<ItemLink id="minecraft:shulker_box" />

<Row>
<Recipe id="anvilcraft:stamping/shulker_box_from_nesting_shulker_box"></Recipe>
<Recipe id="anvilcraft:stamping/shulker_box_from_over_nesting_shulker_box"></Recipe>
<Recipe id="anvilcraft:stamping/shulker_box_from_supercritical_nesting_shulker_box"></Recipe>
</Row>