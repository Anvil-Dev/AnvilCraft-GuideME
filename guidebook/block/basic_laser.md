---
navigation:
  title: "激光"
  icon: "anvilcraft:ruby_laser"
  position: 201
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:ruby_laser
  - anvilcraft:ruby_prism
  - anvilcraft:laser_receiver
---

# 激光

<Row>
<ItemImage id="anvilcraft:ruby_laser" scale="3"></ItemImage>
<ItemImage id="anvilcraft:ruby_prism" scale="3"></ItemImage>
<ItemImage id="anvilcraft:laser_receiver" scale="3"></ItemImage>
</Row>

# 激光

> 要建立本模组的激光系统，需准备大量的<ItemLink id="anvilcraft:ruby" />，[点我](../recipe/gem.md)查看方法

- 定义：可被**不透明方块**阻挡的、笔直的光束
- 能力强度随**等级**决定
- 造成伤害 伤害[max:16] = 激光等级 - 4
- 加热[可加热方块](../feature/heated_block.md)
- 提取矿石，留下石头。矿产会从射出该激光的<ItemLink id="anvilcraft:ruby_prism" />的背部弹出或存入容器

> 如果<ItemLink id="anvilcraft:ruby_prism" />背部是也是**同方向**的<ItemLink id="anvilcraft:ruby_prism" />，
> 则从最后一个<ItemLink id="anvilcraft:ruby_prism" />的背部输出

|    等级    | 提取冷却(s) |    等级    |                加热能力                 |
|:--------:|:-------:|:--------:|:-----------------------------------:|
|  [4, 7]  |   24    |  [1, 3]  | <NeoColor id="661111">高温</NeoColor> |
| [8, 11]  |    6    | [4, 15]  | <NeoColor id="aa2222">红热</NeoColor> |
| [12, 15] |    3    | [16, 63] | <NeoColor id="cc8844">炽热</NeoColor> |
| [16, +∞) |    1    | [64,+∞)  | <NeoColor id="ffccaa">白炽</NeoColor> |

# <ItemLink id="anvilcraft:ruby_laser" />

<Recipe id="anvilcraft:ruby_laser"></Recipe>

- 耗电量16kW
- 受到红石信号停用
- 启用时发射激光[等级: 1, 射程: 128格]


# <ItemLink id="anvilcraft:ruby_prism" />

<Recipe id="anvilcraft:ruby_prism"></Recipe>

- 不消耗电能
- 汇总其他5个方向的激光及其等级，向前发射[射程: 128格]


# <ItemLink id="anvilcraft:laser_receiver" />

<Recipe id="anvilcraft:laser_receiver"></Recipe>

- 除底面外，可以接受激光并发电，同时根据激光等级发出红石信号
- 发电上限 = 激光等级 * 15kW
- 持续接收10s后，达到发电上限