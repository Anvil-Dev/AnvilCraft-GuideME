---
navigation:
  title: "铁砧挖掘"
  icon: "minecraft:anvil"
  position: 0
  parent: anvilcraft_guideme:feature.md
---

# 铁砧挖掘

# 定义

铁砧挖掘是一种概念。下述几种行为都实现了这个概念，因此拥有共同的性质

# 实现

- 通过[切石机配合铁砧](../struct/block_processing.md)破坏单个方块
- 通过[铁砧触发方块吞噬器](../block/block_devourer.md)破坏范围内方块
- 通过$(l:struct/giant_anvil_shocking#break)巨型铁砧撼地$(/l)破坏大范围内方块

# 效果

使用不同的铁砧参与破坏方块的行为，具有不同的破坏效果：

- <ItemLink id="minecraft:anvil" />：常规挖掘
- <ItemLink id="anvilcraft:spectral_anvil" />：常规挖掘
- <ItemLink id="anvilcraft:royal_anvil" />：精准采集
- <ItemLink id="anvilcraft:ember_anvil" />：熔炼
- <ItemLink id="anvilcraft:transcendence_anvil" />：时运V