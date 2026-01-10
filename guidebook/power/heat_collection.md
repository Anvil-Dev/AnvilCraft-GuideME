---
navigation:
  title: "热能收集"
  icon: "anvilcraft:heat_collector"
  position: 201
  parent: anvilcraft_guideme:power.md
item_ids:
  - anvilcraft:heat_collector
---

# 热能收集

<ItemImage id="anvilcraft:heat_collector" scale="3"></ItemImage>

# <ItemLink id="anvilcraft:heat_collector" />

<Recipe id="anvilcraft:heat_collector"></Recipe>

收集*可集热方块*的热能以发电

- 发电功率上限: 4096KW
- 工作范围: 以自己为中心5x5x5
- 范围内的*可集热方块*决定发电功率

## 可集热方块

|                                   方块                                    |                  转化结果                   | 提供能量(kW) |
|:-----------------------------------------------------------------------:|:---------------------------------------:|:--------:|
|                 <ItemLink id="minecraft:magma_block" />                 | <ItemLink id="minecraft:netherrack" />  |    2     |
|                  <ItemLink id="minecraft:campfire" />                   | 熄灭的<ItemLink id="minecraft:campfire" /> |    4     |
|                                   熔岩                                    |  <ItemLink id="minecraft:obsidian" />   |    4     |
|             <ItemLink id="anvilcraft:ember_metal_block" />              |                   不变                    |    4     |
| <NeoColor id="661111">高温</NeoColor>的[可加热方块](../feature/heated_block.md) |                   不变                    |    4     |  
| <NeoColor id="aa2222">红热</NeoColor>的[可加热方块](../feature/heated_block.md) |                   不变                    |    16    |
| <NeoColor id="cc8844">炽热</NeoColor>的[可加热方块](../feature/heated_block.md) |                   不变                    |    64    |
| <NeoColor id="ffccaa">白炽</NeoColor>的[可加热方块](../feature/heated_block.md) |                   不变                    |   256    |

# 发电方法

前中期好用的方法的有以下二种：

## 太阳能发电

- 通过<ItemLink id="anvilcraft:heliostats" />将太阳能收集到可加热方块上，集热器再吸收热能发电
- 优点：耗材简单，且无须后续投入
- 缺点：但是占地较大，且光路上不可有方块阻挡

## 油离子发电

- [燃烧原油发热](../struct/plasma_jets.md)需要大量的肉，但是发电量绝对够本
- 优点：占地面积小，效率高
- 缺点：持续消耗肉类，难以自动运行，需要配套的牧场/刷怪塔/刷怪笼

# 相关

- [热能系统](../feature/heated_block.md)