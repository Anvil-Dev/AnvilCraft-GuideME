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
  - anvilcraft:transcendence_heavy_halberd
  - anvilcraft:transcendence_resonator
  - anvilcraft:multiphase_transcendium
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

将充能中子锭用铁砧压入超温余烬金属块，根据充能中子锭上的附魔数量决定输出超限合金锭数量

- 0个附魔：方块消失，中子锭消失，得到4个超限合金锭
- 1到10个附魔：方块消失，中子锭有 (100-(10x附魔数))/100 概率消失，(10x附魔数)/100 概率变为普通中子锭输出，得到4个超限合金锭+3*附魔数个超限合金粒
- 11到14个附魔：方块消失，中子锭 100% 变为普通中子锭输出，得到得到 4个超限合金锭 和 3*附魔数个超限合金粒
- 15个附魔：方块转化为超限合金块，中子锭100%变为普通中子锭输出
- 16个以及以上附魔：方块转化为超限合金块，中子锭100%变为普通中子锭输出，额外产生1*附魔数个超限合金粒


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

- [铁砧锤](../prop/anvil_hammer.md)
- [龙杖](../prop/dragon_rod.md)
- [余烬工具](ember_metal.md)
- [共振器](../prop/resonator.md)