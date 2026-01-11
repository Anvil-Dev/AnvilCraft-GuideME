---
navigation:
  title: "超限合金"
  icon: "anvilcraft:transcendium_ingot"
  position: 312
  parent: anvilcraft_guideme:material.md
categories:
  - misc ingredients blocks
item_ids:
  - anvilcraft:transcendium_block
  - anvilcraft:transcendium_ingot
  - anvilcraft:transcendium_nugget
  - anvilcraft:transcendence_anvil_hammer
  - anvilcraft:transcendence_dragon_rod
  - anvilcraft:multiphase_transcendium
  - anvilcraft:transcendence_heavy_halberd
  - anvilcraft:transcendence_resonator
---

# 超限合金

<Row>
<ItemImage id="anvilcraft:transcendium_block" scale="3"></ItemImage>
<ItemImage id="anvilcraft:transcendium_ingot" scale="3"></ItemImage>
<ItemImage id="anvilcraft:transcendium_nugget" scale="3"></ItemImage>
<ItemImage id="anvilcraft:multiphase_transcendium" scale="3"></ItemImage>
</Row>

---

<Row>
<ItemImage id="anvilcraft:transcendence_anvil_hammer" scale="2"></ItemImage>
<ItemImage id="anvilcraft:transcendence_dragon_rod" scale="2"></ItemImage>
<ItemImage id="anvilcraft:transcendence_heavy_halberd" scale="2"></ItemImage>
<ItemImage id="anvilcraft:transcendence_resonator" scale="2"></ItemImage>
</Row>

<NeoColor id="cc00ff"> 这么强?! </NeoColor>  

# 合成

将<ItemLink id="anvilcraft:neutron_irradiator" />用铁砧压入<ItemLink id="anvilcraft:overheated_ember_metal_block" />，
根据<ItemLink id="anvilcraft:neutron_irradiator" />上的附魔数量，决定输出超限合金的产量

|  附魔数量 n  | 返还<ItemLink id="anvilcraft:neutronium_ingot" />概率 |   超限合金的产量   |
|:--------:|:-------------------------------------------------:|:-----------:|
| [0, 10]  |                      n * 10%                      | 4 锭 + 3*n 粒 |
| [11, 14] |                       100%                        | 4 锭 + 3*n 粒 |
|    15    |                       100%                        |     1 块     |
| [16, +∞) |                       100%                        |  1 块 + n 粒  |

> 锭和粒以掉落物形式产生；块生成于原方块的位置

# 功能

- 用于合成机器
- 与<ItemLink id="anvilcraft:transcendium_upgrade_smithing_template" />配合，升级工具

# 超限合金工具

- 无限耐久
- 拥有[属性: 永恒](../feature/properties.md#永恒)
- 拥有[属性: 强运](../feature/properties.md#强运)

<Row>
<Recipe id="anvilcraft:multiphase_transcendium"></Recipe>
<Recipe id="anvilcraft:smithing/transcendence_anvil_hammer"></Recipe>
<Recipe id="anvilcraft:smithing/transcendence_dragon_rod"></Recipe>
<Recipe id="anvilcraft:transcendence_dragon_rod"></Recipe>
</Row>


<Row>
<Recipe id="anvilcraft:two_to_one_smithing/transcendence_heavy_halberd"></Recipe>
<Recipe id="anvilcraft:two_to_one_smithing/transcendence_resonator"></Recipe>
</Row>

# 相关

- [铁砧锤](../tool/anvil_hammer.md)
- [龙杖](../tool/dragon_rod.md)
- [余烬工具](ember_metal.md)
- [共振器](../tool/resonator.md)