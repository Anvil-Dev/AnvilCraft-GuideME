---
navigation:
  title: "基本方块处理"
  icon: "minecraft:stone"
  position: 0
  parent: anvilcraft_guideme:struct.md
---

# 铁砧：方块加工

让<ItemLink id="minecraft:anvil" />落在不同的方块上可以触发不同的效果，本条目的后续页面将会依次介绍：
> 注意：<ItemLink id="minecraft:anvil" />从高度不低于2格的砸落时，有概率损坏

> 在此之前，了解<ItemLink id="anvilcraft:magnet_block" />会让你更方便地加工

# 单方块处理：方块粉碎

<Row>
<GameScene><ImportStructure src="../ac_assets/structure/block_crush.snbt" /></GameScene>

- <ItemLink id="minecraft:cobblestone" /> → <ItemLink id="minecraft:gravel" /> → <ItemLink id="minecraft:sand" />
- <ItemLink id="minecraft:polished_granite" /> → <ItemLink id="minecraft:granite" /> → <ItemLink id="minecraft:red_sand" />
- 有裂纹变种的方块 → 对应的裂纹变种
- ...

</Row>

# 双方块处理：方块压合

<Row>
<GameScene><ImportStructure src="../ac_assets/structure/press.snbt" /></GameScene>

- 苔藓块 + 泥土 → 草方块
- 树叶 + 泥土 → 灰化土
- 蘑菇块 + 泥土 → 菌丝体
- 下界疣块 + 下界岩 → 绯红菌岩
- 诡异疣块 + 下界岩 → 诡异菌岩
- 石头 + 石头 → 深板岩
- 玄武岩 + 玄武岩 → 黑石
- ...

</Row>

# 双方块处理：方块涂抹

<Row>
<GameScene><ImportStructure src="../ac_assets/structure/smear.snbt" /></GameScene>

- 苔藓块 + 圆石 → 苔石
- 苔藓块 + 石砖 → 苔石砖
- 蜜脾块 + 任意铜制方块 → 对应的涂蜡铜制方块
- ...

</Row>

# 方块 + 炼药锅：方块压榨

<Row>
<GameScene><ImportStructure src="../ac_assets/structure/squeeze.snbt" /></GameScene>
<Column>

- 湿海绵 → 海绵 + 水
- 苔藓块 → 覆地苔藓 + 水
- 岩浆块 → 下界岩 + 熔岩
- 雪块 → 冰 + 细雪
- 满蜂巢 → 空蜂巢 + 蜂蜜
- ...

> 当炼药锅集满4层蜂蜜时，可以用漏斗等物流方块取出蜂蜜块"

</Column>
</Row>

# 方块 + 切石机：方块破坏

<Row>
<GameScene><ImportStructure src="../ac_assets/structure/break.snbt" /></GameScene>
<Column>

可以破坏无法被普通TNT爆炸破坏的方块，如<ItemLink id="minecraft:obsidian" />，但是普通铁砧将固定损坏一个耐久等级。

为了防止方块破坏后铁砧掉在切石机上变为掉落物，你需要控制<ItemLink id="anvilcraft:magnet_block" />收回铁砧的时间。

属于[铁砧挖掘](../feature/anvil_destroy.md)的一种实现

</Column>
</Row>

    