---
navigation:
  title: "§d钚"
  icon: "anvilcraft:plutonium_ingot"
  position: 321
  parent: anvilcraft_guideme:material.md
item_ids:
  - anvilcraft:plutonium_block
  - anvilcraft:plutonium_ingot
  - anvilcraft:plutonium_nugget
---

# 钚

<Row>
<ItemImage id="anvilcraft:plutonium_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:plutonium_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:plutonium_nugget" scale="2"></ItemImage>
</Row>

# 获得

- 通过<ItemLink id="anvilcraft:neutron_irradiator" />生产
- 过于活跃而没有粗矿形式，无法通过[矿物涌泉](../struct/mineral_fountain.md)量产

<Row>
<Recipe id="anvilcraft:neutron_irradiation/plutonium_nugget"></Recipe>
<Recipe id="anvilcraft:time_warp/raw_uranium_from_plutonium_block"></Recipe>
</Row>

---

# 用途

## 发电

- 每个<ItemLink id="anvilcraft:plutonium_block" />为<ItemLink id="anvilcraft:heat_collector" />提供 8kW 的发电量
- 时移<ItemLink id="anvilcraft:plutonium_block" />会在一瞬间爆发出通常需要数万年才能释放的能量,
  将与锅水平相邻的[可加热方块](../feature/heated_block.md#可加热方块)加热为<NeoColor id="ffccaa">白炽</NeoColor>并持续10min，合计 1024kW
- 通过铁砧撞击<ItemLink id="anvilcraft:plutonium_block" />，加热至多16个<ItemLink id="anvilcraft:overheated_ember_metal_block" />并持续60s，合计
  16384kW."

<Row>
<Recipe id="anvilcraft:time_warp/raw_uranium_from_plutonium_block"></Recipe>
<Recipe id="anvilcraft:anvil_collision/anvil_tier_2_and_plutonium_block_256"></Recipe>
</Row>

# 特性

- 核辐射：携带18组任意钚物品会受到凋零效果