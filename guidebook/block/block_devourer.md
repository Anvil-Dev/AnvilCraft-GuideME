---
navigation:
  title: "§a方块吞噬器"
  icon: "anvilcraft:block_devourer"
  position: 101
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:block_devourer
---

# 方块吞噬器

<ItemImage id="anvilcraft:block_devourer" scale="3"></ItemImage>

# 获取

<Recipe id="anvilcraft:block_devourer"></Recipe>

> 通过斩首III附魔砍末影龙，100%获得龙头

# 功能

- <ItemLink id="anvilcraft:block_devourer" />受到红石信号或被铁砧砸时，破坏前方一定范围内的方块
- 掉落物会尝试进入吞噬器后方的容器方块、实体库存内，无法进入则原地掉落
- 红石激活时，破坏范围3x3
- 被铁砧砸时，根据铁砧下落高度 1，2,3分别为5x5，7x7到9x9
- 被铁砧砸时，属于[铁砧挖掘](../feature/anvil_destroy.md)的一种实现

# 特性

- 可以被活塞推拉
- 世界基质方块如 <ItemLink id="minecraft:stone" /> 、 <ItemLink id="minecraft:netherrack" /> 等只有极少概率掉落
- 更廉价的方块破坏器可以使用[铁砧+切石机](../struct/block_processing.md)