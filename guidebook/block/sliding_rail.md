---
navigation:
  title: "滑轨系统"
  icon: "anvilcraft:sliding_rail"
  position: 1
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:sliding_rail
  - anvilcraft:sliding_rail_stop
  - anvilcraft:powered_sliding_rail
  - anvilcraft:activator_sliding_rail
  - anvilcraft:detector_sliding_rail
---

# 滑轨系统

<Row>
<ItemImage id="anvilcraft:sliding_rail" scale="2"></ItemImage>
<ItemImage id="anvilcraft:sliding_rail_stop" scale="2"></ItemImage>
<ItemImage id="anvilcraft:powered_sliding_rail" scale="2"></ItemImage>
<ItemImage id="anvilcraft:activator_sliding_rail" scale="2"></ItemImage>
<ItemImage id="anvilcraft:detector_sliding_rail" scale="2"></ItemImage>
</Row>

# <ItemLink id="anvilcraft:sliding_rail" />

<Recipe id="anvilcraft:sliding_rail"></Recipe>

- 类似于用于承载矿车的铁轨，滑轨用于运输*物品*和*方块*，并使得它们可以一直滑行下去
- 当一个*方块*被活塞推到滑轨上时，其将在滑轨上持续滑行
    - 若*方块*粘连别的*方块*一起移动(如<ItemLink id="minecraft:slime_block" />)，则作为一个整体一起滑动
- 可以用来划船

> 本模组为各种冰提供了[量产方式](../recipe/ice.md)

# <ItemLink id="anvilcraft:sliding_rail_stop" />

<Recipe id="anvilcraft:sliding_rail_stop"></Recipe>

- 阻力极大
    - 滑入的*物品*会停止在其中心
    - 滑入的*方块*会停在上面
- 可以吸住生物

# <ItemLink id="anvilcraft:powered_sliding_rail" />

<Recipe id="anvilcraft:powered_sliding_rail"></Recipe>

- <NeoColor id="cccc44">未收到红石信号</NeoColor>时，与<ItemLink id="anvilcraft:sliding_rail_stop" />表现一致
- <NeoColor id="cccc44">收到红石信号</NeoColor>时，
    - 令上方的*实体*和*方块*沿朝向滑动
    - 当<ItemLink id="anvilcraft:powered_sliding_rail" />背后是<ItemLink id="anvilcraft:sliding_rail_stop" />时，
      <ItemLink id="anvilcraft:sliding_rail_stop" />上的*实体*和*方块*会被转移至<ItemLink id="anvilcraft:powered_sliding_rail" />，并向前移动
## 特性

- 将物品转变为滑动状态的逻辑与<ItemLink id="minecraft:piston" />相同：
  - 最多移动12个方块的结构 
  - 部分方块不可动，(如 <ItemLink id="minecraft:chest" /> )
  - 破坏部分方块，(如 <ItemLink id="minecraft:shulker_box" /> )


# <ItemLink id="anvilcraft:activator_sliding_rail" />

<Recipe id="anvilcraft:activator_sliding_rail"></Recipe>

- <NeoColor id="cccc44">未收到红石信号</NeoColor>时，与<ItemLink id="anvilcraft:sliding_rail" />表现一致
- <NeoColor id="cccc44">收到红石信号</NeoColor>时：
  - 使有滑行的*方块*经过，使其在上方停顿一下，并对其发出脉冲信号
  - 如上方存在静止的*方块*，则持续对其发出信号

# <ItemLink id="anvilcraft:detector_sliding_rail" />

<Recipe id="anvilcraft:detector_sliding_rail"></Recipe>

- 上方有*物品*和*方块*滑过时，自身向周围除了上方外的五个方向发出红石信号
- 可被<ItemLink id="minecraft:comparator" />检测，根据滑行的*方块*的所属结构的方块数量，输出红石信号
> eg：四个方块粘在一起经过时，<ItemLink id="minecraft:comparator" />发出信号强度为4