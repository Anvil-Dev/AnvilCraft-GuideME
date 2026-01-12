---
navigation:
  title: "§6腐化信标"
  icon: "anvilcraft:corrupted_beacon"
  position: 200
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:corrupted_beacon
---

# 腐化信标

<Row>
<ItemImage id="minecraft:beacon" scale="3"></ItemImage>
<ItemImage id="anvilcraft:corrupted_beacon" scale="3"></ItemImage>
</Row>

<Colour firstColor="991155" lastColor="bbaa55">~~释放了曾被封印的凋灵之力~~</Colour>

# 腐化信标

## 获取

1. 完全使用<ItemLink id="anvilcraft:cursed_gold_block" />作为信标底座，
2. 消耗<ItemLink id="anvilcraft:cursed_gold_ingot" />激活信标
3. 信标有概率转化为<ItemLink id="anvilcraft:corrupted_beacon" />(底座层数越多，转化概率越大)，此时天气被控制为雷雨天

| 层数 |  概率  | 基座诅咒金块 |   等价诅咒金锭    | 期望成功转化所需次数 | 95%的把握成功转化所需次数 |
|:--:|:----:|:------:|:-----------:|:----------:|:--------------:|
| 1  |  2%  |   9    |  81 = 1组15  |     50     |      149       |
| 2  |  5%  |   34   | 306 = 4组50  |     20     |       59       |
| 3  | 20%  |   83   | 747 = 11组43 |     5      |       14       |
| 4  | 100% |  164   | 1479 = 23组4 |     1      |       1        |

> **自动化**：使用铁砧将诅咒金锭压入信标

## 功能

<GameScene zoom="2">
    <ImportStructure src="../ac_assets/structure/corrupted_beacon.snbt" />
</GameScene>

- 此结构可以实现时移操作，此时腐化信标必须是激活状态

> 这意味着如果使用磁铁块控制顶上的铁砧，其必须为<ItemLink id="anvilcraft:hollow_magnet_block" />

## 特性

- 信标光柱会赋予生物**凋零**效果
- 转化特定生物：

|     原生物      |         转化结果         |
|:------------:|:--------------------:|
|      猪       |         疣猪兽          |
|      牛       |         劫掠兽          |
|     守卫者      |        远古守卫者         |
|      猪灵      |         猪灵蛮兵         |
|      村民      | 30%掠夺者、60%卫道士、10%唤魔者 |
|      悦灵      |          恼鬼          |
|      蝙蝠      |          幻翼          |
|      马       |    10%僵尸马、90%骷髅马     |
|      蠹虫      |         末影螨          |
|      骷髅      |    20%凋零骷髅、80%流浪者    |
| **村民召唤**的铁傀儡 |         监守者          |

# 时移

<Row>
<Recipe id="anvilcraft:time_warp/raw_copper"></Recipe>
> 金属块可被时移为粗矿形式
<Recipe id="anvilcraft:time_warp/budding_amethyst"></Recipe>
<Recipe id="anvilcraft:time_warp/wither_skeleton_skull"></Recipe>
<Recipe id="anvilcraft:time_warp/wither_rose"></Recipe>
<Recipe id="anvilcraft:time_warp/crying_obsidian"></Recipe>
</Row>