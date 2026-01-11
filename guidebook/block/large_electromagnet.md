---
navigation:
  title: "大型电磁铁"
  icon: "anvilcraft:acceleration_ring"
  position: 215
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:acceleration_ring
  - anvilcraft:deflection_ring
---

# 大型电磁铁

<Row>
<ItemImage id="anvilcraft:acceleration_ring" scale="3"></ItemImage>
<ItemImage id="anvilcraft:deflection_ring" scale="3"></ItemImage>
</Row>

# <ItemLink id="anvilcraft:acceleration_ring" />

- 通过[多方块转化](../block/giant_anvil.md#功能)获得
- 启用耗电量256kW，受到红石信号停用
- 朝上摆放时，启用时，可以吸引12格以内的<ItemLink id="anvilcraft:giant_anvil" />。中间不能有方块阻挡
- 两个相同方向的启用的加速环之间会形成*加速区间*

## 加速区间

将以下方块或实体沿轨道加速:

- 铁砧(不包括巨型铁砧、幻灵铁砧)
- 弹射物
- 玩家(装备至少两件装备且头戴铁砧锤)

# <ItemLink id="anvilcraft:deflection_ring" />

- 通过[多方块转化](../block/giant_anvil.md#功能)获得
- 启用耗电量256kW，受到红石信号停用
- 竖直摆放时，启用时，可以吸引12格以内的<ItemLink id="anvilcraft:giant_anvil" />。中间不能有方块阻挡
- 启用时，扭曲前文中被加速的实体的运动，使其前进方向沿**环外箭头**所示方向旋转90°

# 铁砧撞击合成

借助大型电磁铁的力量，搭建一套环形加速器。让铁砧以高速撞击一些特定的方块，以制造全新的物质

> 运用原版的堆叠TNT加速，水流防爆等机制，配合精妙的红石时序，可以制作不需要电的铁砧加速器，但较有挑战性

<GameScene zoom="1" interactive={true}>
    <ImportStructure src="../ac_assets/structure/accelerate_machine.snbt" />
</GameScene>

## 撞击室

- 撞击会产生一场大爆炸，一个由防爆方块组成的撞击室是必需的

<GameScene zoom="2" interactive={true}>
    <ImportStructure src="../ac_assets/structure/collision_room.snbt" />
</GameScene>

## 控制速度

- <ItemLink id="minecraft:comparator" />可以从<ItemLink id="anvilcraft:deflection_ring" />读取经过的铁砧的速度(单位: m/tick)并输出红石信号
- 输出公式： 红石信号 = 2*[(以2为底,速度的对数) - 1] 向上取整，最后取值约束在0-15之间

> 32 < V ≤ 45.25 : 强度 9
>
> 64 < V ≤ 90.51 : 强度 11
>
> 128 < V ≤ 181.02 : 强度 13
>
> V > 256 : 强度 15

> 铁砧移动30s后会变为物品，注意运行时间

1. 检测铁砧达到一定速度后，对<ItemLink id="anvilcraft:deflection_ring" />施加红石信号使其失效
2. 铁砧就可以从此处飞出加速装置，进入撞击室
3. 别忘了提前通过铁砧砸击<ItemLink id="anvilcraft:block_placer" />，使其隔着墙壁放置被撞击方块
4. 使用<ItemLink id="anvilcraft:item_collector" />隔墙收集

## 合成细节

- 撞击配方需要消耗被撞击的方块，需要铁砧的速度达到一定标注，部分撞击不消耗铁砧
- 详细配方会在介绍新材料的合成方式时提及

## 相关物品

- <ItemLink id="anvilcraft:uranium_ingot" />
- <ItemLink id="anvilcraft:negative_matter" />
- <ItemLink id="anvilcraft:multiphase_matter" />
- [超温的余烬金属块](../feature/overheated_block.md)