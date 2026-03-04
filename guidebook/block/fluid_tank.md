---
navigation:
  title: "流体储罐"
  icon: "anvilcraft:fluid_tank"
  position: 215
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:fluid_tank
  - anvilcraft:large_fluid_tank
---

# 流体储罐

<Row>
<ItemImage id="anvilcraft:fluid_tank" scale="3"></ItemImage>
<ItemImage id="anvilcraft:large_fluid_tank" scale="3"></ItemImage>
</Row>

# <ItemLink id="anvilcraft:fluid_tank" />

<Recipe id="anvilcraft:fluid_tank"></Recipe>

- 可以存放 16B 液体

# <ItemLink id="anvilcraft:large_fluid_tank" />

1. 将27个<ItemLink id="anvilcraft:fluid_tank" />按3x3x3实心摆放，进行[多方块转化](../block/giant_anvil.md#功能)获得
2. 将26个<ItemLink id="anvilcraft:fluid_tank" />按3x3x3中空摆放，进行[多方块转化](../block/giant_anvil.md#功能)获得

- 可以存放 320B 液体

# 门格海绵增幅

## 门格海绵结构的判断条件

将3x3x3（也可以是9x9x9甚至更大）的空间均分为27份。保证每个面最中心的那块和正方体最中心的那块是空气，另外20个块都满足门格海绵结构。

如果是1x1x1的空间，则要求此方块为<ItemLink id="anvilcraft:menger_sponge" />

> 游戏内判定时，门格海绵结构中的空气部分可以是其他方块，但不能是门格海绵

<GameScene zoom="1" interactive={true}>
    <ImportStructure src="../ac_assets/structure/menger_sponge_struct.snbt" />
    <IsometricCamera yaw="0" pitch="0" />
</GameScene>

## 门格海绵对储罐的增幅

- 当<ItemLink id="anvilcraft:fluid_tank" />位于一个3x3x3门格海绵结构中心时，其储量变为 640B

- 当<ItemLink id="anvilcraft:large_fluid_tank" />位于一个9x9x9门格海绵结构中心时，其储量变为12800B。且一旦输入的流体达到了上限，接下来视为无限流体储罐，可无限输入与输出