---
navigation:
  title: "手持磁铁"
  icon: "anvilcraft:magnet"
  position: 1
  parent: anvilcraft_guideme:prop.md
item_ids:
  - anvilcraft:magnet
---

# 手持磁铁

<ItemImage id="anvilcraft:magnet" scale="3"></ItemImage>

# 获取

<Recipe id="anvilcraft:magnet"></Recipe>

# 功能

- 右键使用，将附近的**掉落物**和**经验球**吸引到脚下
- shift+右键，在方块上表面生成/删除**磁化节点**

> 能够被附魔上 经验修补、耐久和消失诅咒

# 磁化节点

<GameScene zoom="4">
    <Entity id="anvilcraft:magnetized_node" />
</GameScene>

- 只能附着在方块上
- 物品一接触到**附着方块**，就会被吸引至**磁化节点**的位置
- 不会再次吸引加工后的产物，方便进行[物品处理](../struct/item_processing.md)
- 手持物品对着**附着方块**使用，会将物品置于**磁化节点**上。"