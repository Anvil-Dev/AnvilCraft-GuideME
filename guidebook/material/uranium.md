---
navigation:
  title: "§d铀"
  icon: "anvilcraft:uranium_ingot"
  position: 301
  parent: anvilcraft_guideme:material.md
item_ids:
  - anvilcraft:uranium_block
  - anvilcraft:uranium_ingot
  - anvilcraft:uranium_nugget
  - anvilcraft:raw_uranium
  - anvilcraft:raw_uranium_block
  - anvilcraft:deepslate_uranium_ore
---

# 铀

<Row>
<ItemImage id="anvilcraft:uranium_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:uranium_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:uranium_nugget" scale="2"></ItemImage>
<ItemImage id="anvilcraft:raw_uranium" scale="2"></ItemImage>
<ItemImage id="anvilcraft:raw_uranium_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:deepslate_uranium_ore" scale="2"></ItemImage>
</Row>

# 获得

- 首次获得通过[铁砧撞击合成](../block/large_electromagnet.md#铁砧撞击合成)
- 后续通过[矿物涌泉](../struct/mineral_fountain.md)量产

<Row>
<Recipe id="anvilcraft:anvil_collision/anvil_tier_1_and_redstone_block_32"></Recipe>
<Recipe id="anvilcraft:time_warp/raw_uranium_from_uranium_block"></Recipe>
</Row>

---

# 用途

## 发电

- 每个<ItemLink id="anvilcraft:uranium_block" />为<ItemLink id="anvilcraft:heat_collector" />提供 2kW 的发电量
- 时移<ItemLink id="anvilcraft:uranium_block" />会在一瞬间爆发出通常需要数万年才能释放的能量,
  将与锅水平相邻的[可加热方块](../feature/heated_block.md#可加热方块)加热为<NeoColor id="ffccaa">白炽</NeoColor>并持续5min，合计 1024kW
- 通过铁砧撞击<ItemLink id="anvilcraft:uranium_block" />，加热至多16个<ItemLink id="anvilcraft:overheated_ember_metal_block" />并持续20s，合计
  16384kW."

<Row>
<Recipe id="anvilcraft:time_warp/raw_uranium_from_uranium_block"></Recipe>
<Recipe id="anvilcraft:anvil_collision/anvil_tier_2_and_uranium_block_256"></Recipe>
</Row>

# 特性

- 核辐射：携带18组任意铀物品会受到凋零效果

