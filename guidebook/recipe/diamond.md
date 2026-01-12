---
navigation:
  title: "§6量产钻石"
  icon: "minecraft:diamond"
  position: 201
  parent: anvilcraft_guideme:recipe.md
---

# 熔岩再生

<Row>
<ItemImage id="minecraft:oak_log" scale="2"> </ItemImage>
<ItemImage id="minecraft:charcoal" scale="2"> </ItemImage>
<ItemImage id="minecraft:coal" scale="2"> </ItemImage>
<ItemImage id="minecraft:diamond" scale="2"> </ItemImage>
<ItemImage id="minecraft:diamond_block" scale="2"> </ItemImage>
</Row>

# 钻石生产线

- 通过[巨砧撼地](../block/giant_anvil.md)获得**原木**
<Recipe id="minecraft:charcoal"> </Recipe>
<Recipe id="anvilcraft:time_warp/coal"></Recipe>
<Recipe id="anvilcraft:super_heating/diamond"></Recipe>

# 更高效的转化路线
<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/muti_coal_block.snbt" />
</GameScene>
- 运用[多方块合成](../block/giant_anvil.md)的力量
- 27个 <ItemLink id="minecraft:coal_block" /> ⇒ 1个 <ItemLink id="minecraft:diamond_block" />，转化率更高