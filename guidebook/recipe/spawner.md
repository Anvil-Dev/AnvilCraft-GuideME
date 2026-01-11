---
navigation:
  title: "制造刷怪笼"
  icon: "minecraft:spawner"
  position: 210
  parent: anvilcraft_guideme:recipe.md
item_ids:
  - anvilcraft:resentful_amber_block
---

# 制造刷怪笼

<Row>
<ItemImage id="anvilcraft:resin_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:mob_amber_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:resentful_amber_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:cursed_gold_block" scale="2"></ItemImage>
<ItemImage id="minecraft:spawner" scale="2"></ItemImage>
</Row>

# 怨念琥珀块

- 将<ItemLink id="anvilcraft:resin_block"/>[时移](../block/corrupted_beacon.md)为<ItemLink id="anvilcraft:amber_block"/>
- 如果<ItemLink id="anvilcraft:resin_block"/>中含有**非被动生物**，则有 5% 的概率产生<ItemLink id="anvilcraft:resentful_amber_block"/>
- 利用<ItemLink id="anvilcraft:resentful_amber_block"/>和<ItemLink id="anvilcraft:cursed_gold_block" />
  ，可以生产对应的<ItemLink id="minecraft:spawner"/>

# 制作刷怪笼

<Row>
<GameScene zoom="2" interactive={true}>
    <ImportStructure src="../ac_assets/structure/muti_spawner.snbt" />
</GameScene>

<Column>
> 制造<ItemLink id="minecraft:spawner"/>，仅接受[多方块转化](../block/giant_anvil.md#功能)，不接受[多方块合成](../block/giant_anvil.md#功能)!

> 若没有搬运<ItemLink id="minecraft:spawner"/>的手段，请提前规划好位置

</Column>
</Row>

推荐配合[强制刷怪](../feature/spawner.md)使用

