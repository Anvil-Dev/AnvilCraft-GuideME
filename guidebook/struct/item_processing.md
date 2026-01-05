---
navigation:
  title: "基本物品处理"
  icon: "minecraft:stone"
  position: 0
  parent: anvilcraft_guideme:struct.md
item_ids:
  - anvilcraft:stamping_platform
  - anvilcraft:crushing_table
---

# 铁砧：物品加工

让<ItemLink id="minecraft:anvil" />落在特定方块上就可以加工该方块顶部或内部的物品，不同的特定方块有不同的处理，本条目的后续页面依次介绍

> 注意：<ItemLink id="minecraft:anvil" />从高度不低于2格的砸落时，有概率损坏

> 在此之前，了解<ItemLink id="anvilcraft:magnet_block" />会让你更方便地加工

<Row>
<Recipe id="anvilcraft:stamping_platform"/>
<Recipe id="anvilcraft:shaped_crushing_table_recipe"/>
</Row>

# 冲压

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/item_stamping.snbt"/></GameScene>
<Column>
下方是<ItemLink id="anvilcraft:stamping_platform" />时，执行**物品冲压**操作，产物会从平台前掉出
- 铁锭→铁压力板 
- 金锭→金压力板 
- 雪球→雪片 
- 樱花树叶→粉色花瓣 
> 基本都是将物品砸成对应的薄片
</Column>
</Row>

# 粉碎

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/item_crush.snbt" /></GameScene>

<Column>
下方是<ItemLink id="anvilcraft:crushing_table" />时，执行**物品粉碎**操作，原料放在平台上，产物从下方掉出

- 可以回收工具、武器和盔甲并分解出原料，远多于熔炼得到的
- 处理头颅：骷髅头颅 → 64骨粉；苦力怕的头 → 64火药
- 兼容[方块粉碎](block_processing.md)的所有配方，但是存在 **20%** 的损耗

<Recipe id="anvilcraft:item_crush/armor/diamond_boots_2_diamond"/>
</Column>
</Row>

# 压缩

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/item_compress.snbt" /></GameScene>

<Column>
下方是<ItemLink id="minecraft:cauldron" />时，执行**物品压缩**操作，原料和产物都在锅中

- 如果物品有2x2或3x3的合成配方则会被执行，例如9铁粒→铁锭；9铁锭→铁块；4线→羊毛
- 如果一个物品既可以2x2合成又可以3x3合成，则执行3x3合成
- 除了原版的配方外，增加了3骨头→1骨块的配方也可以在此合成

</Column>
</Row>

# 分解

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/unpack.snbt" /></GameScene>
<Column>
下方是<ItemLink id="minecraft:iron_trapdoor" />时，执行**物品分解**操作，原料置于铁活版门上，产物出现在铁活版门下

- 如果物品有1→n的合成配方则会被执行，例如1铁锭→9铁粒
- 额外地，原版可以通过打破方块来分解的也可执行，数量按最大来

> 西瓜→9西瓜片；荧石→4荧石粉

- 一些原版无法分解的建筑方块也可以通过此方法分解

> 石英块→4石英；紫水晶块→4紫水晶碎片

</Column>
</Row>
<Row>
<Recipe id="anvilcraft:unpack_warp_iron_ingot_2_iron_nugget"/>
<Recipe id="anvilcraft:unpack/amethyst_shard"/>
</Row>

# 过筛

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/mesh.snbt" /></GameScene>
<Column>
下方是<ItemLink id="minecraft:scaffolding" />时，执行**物品过筛**操作，原料置于脚手架上，产物出现在脚手架下

> 过筛额外产出约一半原料，可循环利用

<Recipe id="anvilcraft:mesh/gravel"/>
</Column>
</Row>

# 膨发

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/bulging.snbt" /></GameScene>
<Column>
下方是装水<ItemLink id="minecraft:cauldron" />时，执行**物品膨发**操作，原料和产物都在锅中，消耗一层水

- 铜制方块→锈蚀铜制方块
- 泥土→黏土
- 下界菌→对应疣块
- 蘑菇→对应蘑菇块
- 蜘蛛眼→发酵蜘蛛眼
- 珊瑚→对应珊瑚块
- 干海带→海带

</Column>
</Row>

# 烹饪

<Row>
<GameScene zoom="2"><ImportStructure src="../ac_assets/structure/cooking.snbt" /></GameScene>
<Column>
下方是<ItemLink id="minecraft:cauldron" />和<ItemLink id="minecraft:campfire" />时，
执行**物品膨发**操作，原料和产物都在锅中，有的配方需要水

- 自动兼容所有烟熏炉配方和营火配方，此时不需要水

<Recipe id="anvilcraft:smoking_warp_beef_2_cooked_beef"/>
</Column>
</Row>

