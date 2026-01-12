---
navigation:
  title: "§d超温的方块"
  icon: "anvilcraft:overheated_ember_metal_block"
  position: 301
  parent: anvilcraft_guideme:feature.md
item_ids:
  - anvilcraft:overheated_ember_metal_block
---

# 超温的方块

<Row>
<ItemImage id="anvilcraft:ember_metal_block" scale="3"> </ItemImage>
<ItemImage id="anvilcraft:overheated_ember_metal_block" scale="3"> </ItemImage>
</Row>

---

# 前情提要：

- [热能系统](../feature/heated_block.md)
- [铁砧撞击合成](../block/large_electromagnet.md#铁砧撞击合成)

---

# <ItemLink id="anvilcraft:ember_metal_block" />

- <ItemLink id="anvilcraft:ember_metal_block" />也属于*可加热方块*，具有2个温度等级：
    - <NeoColor id="666666">普通</NeoColor>
    - <NeoColor id="6688cc">超温</NeoColor>
- 不能被常规方法加热，但可以被后文介绍的方式加热
- 非常不稳定，往往只能维持一小段时间。且在冷却后，有 5% 的概率变为<ItemLink id="minecraft:netherite_block" />
- 可以为<ItemLink id="anvilcraft:heat_collector" />提供1024kW能量
- 烫伤踩在上面的生物、蒸发一定距离内的水

# 超温加热

<Row>
<Recipe id="anvilcraft:anvil_collision/anvil_tier_2_and_uranium_block_256"></Recipe>
<Recipe id="anvilcraft:anvil_collision/anvil_tier_2_and_plutonium_block_256"></Recipe>
</Row>

- 消耗 <ItemLink id="anvilcraft:uranium_block" />撞击，最多加热16个余烬金属块，最多持续 20s
- 消耗 <ItemLink id="anvilcraft:plutonium_block" />撞击，最多加热16个余烬金属块，最多持续 60s