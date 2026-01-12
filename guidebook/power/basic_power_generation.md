---
navigation:
  title: "§a基础发电"
  icon: "anvilcraft:charge_collector"
  position: 100
  parent: anvilcraft_guideme:power.md
item_ids:
  - anvilcraft:charge_collector
  - anvilcraft:piezoelectric_crystal
---

# 基础发电

<Row>
<ItemImage id="anvilcraft:charge_collector" scale="3"></ItemImage>
<ItemImage id="anvilcraft:piezoelectric_crystal" scale="3"></ItemImage>
</Row>

# <ItemLink id="anvilcraft:charge_collector" />

<Recipe id="anvilcraft:charge_collector" />

<ItemLink id="anvilcraft:charge_collector" />是发电设施的核心部件

## 功能

- 发电功率上限: 128kW
- 工作范围: 以自己为中心5x5x5
- 集电器一个周期之内收到的电荷数量将成为它下个周期的发电功率（个→KW）。周期默认为2秒。

# 电荷

以下方块行为会产生电荷：

- <ItemLink id="minecraft:anvil" />砸到<ItemLink id="anvilcraft:piezoelectric_crystal" />
- 活塞推拉紧邻<ItemLink id="minecraft:anvil" />的<ItemLink id="anvilcraft:magnet_block" />
- <ItemLink id="minecraft:lightning_rod" />被雷劈。

## 压电晶体生产电荷

<Row>
<Recipe id="anvilcraft:piezoelectric_crystal" />
<Recipe id="anvilcraft:piezoelectric_crystal_amethyst" />
</Row>

- <ItemLink id="anvilcraft:piezoelectric_crystal" />被<ItemLink id="minecraft:anvil" />砸时，可以产生电荷
- 根据**铁砧种类**和**下落高度**不同，产生电荷量各不相同，已在下表列出
- 将<ItemLink id="anvilcraft:piezoelectric_crystal" />竖向堆叠，可以增加产电荷的量。
  下方的<ItemLink id="anvilcraft:piezoelectric_crystal" />产生它上方<ItemLink id="anvilcraft:piezoelectric_crystal" />一半的电荷量，小数向下取整。

|                       铁砧种类                       | 高度=1 | 高度=2 | 高度=3 | 高度≥4 |
|:------------------------------------------------:|:-----|:-----|:-----|:-----|
|   <ItemLink id="anvilcraft:spectral_anvil" />    | 1    | 2    | 3    | 4    |
|        <ItemLink id="minecraft:anvil" />         | 1    | 2    | 4    | 8    |
|     <ItemLink id="anvilcraft:royal_anvil" />     | 1    | 2    | 4    | 8    |
|     <ItemLink id="anvilcraft:ember_anvil" />     | 1    | 2    | 5    | 12   |
| <ItemLink id="anvilcraft:transcendence_anvil" /> | 2    | 5    | 15   | 60   |

|                   铁砧种类                   | 高度=1 | 高度=2 | 高度=3 | 高度=4 | 高度=5 | 高度=6 | 高度=7 | 高度≥8 | 
|:----------------------------------------:|:-----|:-----|:-----|:-----|:-----|:-----|:-----|:-----|
| <ItemLink id="anvilcraft:giant_anvil" /> | 1    | 2    | 3    | 4    | 5    | 6    | 7    | 8    |

## 摩擦生产电荷

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/triboelectric_power.snbt" />
</GameScene>

- <ItemLink id="anvilcraft:magnet_block" />被活塞推拉时，如果紧贴着铜块，可以产生电荷
- 铜块生锈会使电荷生产量减少，每次移动产生的电荷见下表
  
| 铜块种类 | <ItemLink id="minecraft:copper_block" /> | <ItemLink id="minecraft:exposed_copper" /> | <ItemLink id="minecraft:weathered_copper" /> | <ItemLink id="minecraft:oxidized_copper" /> | 任何<ItemLink id="minecraft:waxed_copper_block" /> |
|:----:|:-----------------------------------------|:-------------------------------------------|:---------------------------------------------|:--------------------------------------------|:-------------------------------------------------|
| 电荷量  | 1/4                                      | 1/8                                        | 1/16                                         | 0                                           | 0                                                |

## 收集雷电电荷

*避雷针*被雷劈可以产生电荷。每次产生32个电荷。

