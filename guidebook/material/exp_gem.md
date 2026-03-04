---
navigation:
  title: "经验宝石"
  icon: "anvilcraft:exp_gem"
  position: 5
  parent: anvilcraft_guideme:material.md
item_ids:
  - anvilcraft:exp_bucket
  - anvilcraft:exp_gem
  - anvilcraft:exp_gem_block
---

# 经验宝石

<Row>
<ItemImage id="anvilcraft:exp_bucket" scale="3"></ItemImage>
<ItemImage id="anvilcraft:exp_gem" scale="3"></ItemImage>
<ItemImage id="anvilcraft:exp_gem_block" scale="3"></ItemImage>
<ItemImage id="minecraft:experience_bottle" scale="3"></ItemImage>
</Row>

# 特性

- 玩家使用宝石/接触液态经验源头/接触液态锅，可以获得经验值
- 对有职业的村民使用<ItemLink id="anvilcraft:exp_gem" />，获得 20 点的交易经验值
- 对有幼年村民使用<ItemLink id="anvilcraft:exp_gem" />，减少 2 分钟成长所需时间

> 虽然名字带有“宝石”，但设计为不携带“#gem”标签，无法参与通用宝石合成

# 等价关系

1*<ItemLink id="anvilcraft:exp_gem" /> = 1*<ItemLink id="anvilcraft:exp_bucket" /> = 50*玩家经验值

1*<ItemLink id="anvilcraft:exp_gem_block" /> = 9*<ItemLink id="anvilcraft:exp_gem" />

# 转换配方

<Row>
<Recipe id="anvilcraft:bulging/exp_gem"></Recipe>
<Recipe id="anvilcraft:bulging/exp_fluid_cauldron"></Recipe>
</Row>

# 获取配方

- 对<ItemLink id="minecraft:sculk" />执行[方块压榨](../struct/block_processing.md)，有 10% 概率增加250mB（一层）经验流体。
  如果铁砧是<ItemLink id="anvilcraft:frost_anvil" />，则该概率提升为 40%
- 对<ItemLink id="minecraft:cauldron" />使用<ItemLink id="minecraft:experience_bottle" />，50%概率增加一层经验流体
- 相对的，经验流体锅使用<ItemLink id="minecraft:glass_bottle" />右键，消耗一层流体，获得一个<ItemLink id="minecraft:experience_bottle" />
  （是的，亏了）