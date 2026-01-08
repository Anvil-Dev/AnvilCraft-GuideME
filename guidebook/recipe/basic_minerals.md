---
navigation:
  title: "量产基础矿物"
  icon: "anvilcraft:silver_ingot"
  position: 1
  parent: anvilcraft_guideme:recipe.md
---

# 量产基础矿物

<Row>
<ItemImage id="anvilcraft:tungsten_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:titanium_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:zinc_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:tin_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:lead_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:silver_ingot" scale="2"></ItemImage>
</Row>

---

<Row>
<ItemImage id="minecraft:copper_ingot" scale="2"></ItemImage>
<ItemImage id="minecraft:gold_ingot" scale="2"></ItemImage>
<ItemImage id="minecraft:redstone" scale="2"></ItemImage>
<ItemImage id="minecraft:quartz" scale="2"></ItemImage>
<ItemImage id="minecraft:glowstone_dust" scale="2"></ItemImage>
<ItemImage id="minecraft:lapis_lazuli" scale="2"></ItemImage>
</Row>

# 刷石机——万物之源

<GameScene zoom="2" interactive={true}>
    <ImportStructure src="../ac_assets/structure/stone_machine.snbt" />
</GameScene>

# <ItemLink id="minecraft:gold_ingot" />-<ItemLink id="minecraft:clay_ball" />产线

<Row>
<Recipe id="anvilcraft:block_crush/gravel"></Recipe>
<Recipe id="anvilcraft:block_crush/sand"></Recipe>
<Recipe id="anvilcraft:mesh/sand"></Recipe>
</Row>

# <ItemLink id="minecraft:quartz" />循环产线

<Row>
<Recipe id="minecraft:diorite"></Recipe>
<Recipe id="anvilcraft:block_crush/quartz_sand"></Recipe>
<Recipe id="anvilcraft:mesh/quartz_sand"></Recipe>
</Row>

# <ItemLink id="minecraft:copper_ingot" />-<ItemLink id="minecraft:glowstone_dust" />产线

<Row>
<Recipe id="minecraft:granite"></Recipe>
<Recipe id="anvilcraft:block_crush/red_sand"></Recipe>
<Recipe id="anvilcraft:mesh/red_sand"></Recipe>
</Row>

# 火山灰产线

<Row>
<Recipe id="minecraft:andesite"></Recipe>
<Recipe id="anvilcraft:block_crush/cinerite"></Recipe>
<Recipe id="anvilcraft:mesh/cinerite"></Recipe>
</Row>

# <ItemLink id="anvilcraft:tungsten_ingot" />-<ItemLink id="minecraft:redstone" />产线

<Row>
<Recipe id="anvilcraft:rotten_flesh_block"></Recipe>
<Recipe id="minecraft:netherrack"></Recipe>
<Recipe id="anvilcraft:block_crush/nether_dust"></Recipe>
<Recipe id="anvilcraft:mesh/nether_dust"></Recipe>
</Row>
> 也可以考虑在下界自己挖下界岩

# <ItemLink id="anvilcraft:titanium_ingot" />-<ItemLink id="anvilcraft:levitation_powder" />产线

<Row>
[生产<ItemLink id="anvilcraft:end_dust" />](../feature/end_portal.md)
<Recipe id="anvilcraft:mesh/end_dust"></Recipe>
</Row>