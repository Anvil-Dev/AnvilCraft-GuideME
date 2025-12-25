---
navigation:
  title: "高级工具"
  icon: "anvilcraft:jewelcrafting_table"
  position: 3005
  parent: anvilcraft_guideme:smithing_system_index.md
item_ids:
  - anvilcraft:dragon_rod
  - anvilcraft:royal_dragon_rod
  - anvilcraft:ember_dragon_rod
  - anvilcraft:heavy_halberd_core
  - anvilcraft:resonator_core
---

# 高级工具

本页面展示了目前所有可用的*高级工具*。

<ItemImage id="tag:anvilcraft:tools/dragon_rod" />

*龙杖*本质上是为了将你“放下*方块吞噬器*→*铁砧锤*敲击→收回方块吞噬器”的流程简化至一个工具内。



<Recipe id="anvilcraft:dragon_rod" />

<Recipe id="anvilcraft:royal_dragon_rod" />

三种龙杖的功能是相同的，只是耐久不同。
同样可以通过锻造升级。

<Recipe id="anvilcraft:ember_dragon_rod" />

**TODO:** Unsupported Patchouli page type **patchouli:smithing**

```
{"type":"patchouli:smithing","recipe":"anvilcraft:smithing/royal_dragon_rod","recipe2":"anvilcraft:smithing/ember_dragon_rod"}
```

龙杖的操作十分简单。左键破坏一定范围内的方块，右键切换范围大小。有3x3、5x5、7x7、9x9四个范围，当手持龙杖准星指向方块时会显示范围框。3x3范围不消耗耐久，往后依次消耗1、2、4点耐久。当龙杖耐久消耗殆尽时不会完全损坏，而是失去所有功能，类似于
*鞘翅*。

龙杖遵循方块吞噬器的规则，当挖掘世界基底方块（*石头*、*下界岩*、*末地石*）时，只有5%的概率掉落。但是它无法连锁顶部的可下落方块。
龙杖在挖掘一次后会有一段冷却时间，默认为1秒。这段冷却时长只受*急迫*效果和*挖掘疲劳*效果影响，每级急迫会减少4tick，每级挖掘疲劳会增加1秒。

<ItemImage id="tag:anvilcraft:tools/heavy_halberd" />

*重戟*融合了剑、斧、重锤和三叉戟的特性，是一个强力的武器。

*重戟核心*是合成重戟的核心材料。

<Recipe id="anvilcraft:heavy_halberd_core" />

**TODO:** Unsupported Patchouli page type **anvilcraft:multiple_to_one_smithing**

```
{"type":"anvilcraft:multiple_to_one_smithing","recipe":"anvilcraft:four_to_one_smithing/frost_metal_heavy_halberd","recipe2":"anvilcraft:four_to_one_smithing/ember_metal_heavy_halberd"}
```

重戟可以作为合成它所需的四件武器中的任意一件使用。它能兼容剑、重锤和三叉戟的所有附魔。它的攻击伤害值与斧相同，攻击速度与剑相同，还具有它们的挖掘特性。从高处落下可以触发重锤的猛击。长按右键也可以像三叉戟一样投掷，但是投掷伤害根据速度计算，与箭类似。当它拥有忠诚魔咒时，掷入虚空会回到玩家处。

重戟同样不会完全损坏，类似于鞘翅，它会失去所有增益、功能等效果，攻击伤害变为0，附魔大部分失效，浮霜带来的[无情](../advanced_features/advanced_tool_properties.md#merciless)
也会失效。

<ItemImage id="tag:anvilcraft:tools/resonator" />

*共振器*融合了斧、镐、锹、锄的特性，是一个强力的工具。

*共振器核心*是合成共振器的核心材料。

<Recipe id="anvilcraft:resonator_core" />

**TODO:** Unsupported Patchouli page type **anvilcraft:multiple_to_one_smithing**

```
{"type":"anvilcraft:multiple_to_one_smithing","recipe":"anvilcraft:four_to_one_smithing/frost_metal_resonator","recipe2":"anvilcraft:four_to_one_smithing/ember_metal_resonator"}
```

共振器有五个模式：自动，和四种工具对应的模式。不同的模式有不同的模型。在自动模式下可以快速挖掘任意可挖掘方块，但是没有右键功能。在每种工具对应的模式下只能快速挖掘该工具允许的方块，但是拥有它们对应的右键功能，如斧模式可以去皮、脱蜡、除锈等。

手持共振器按住[<KeyBind id="key.anvilcraft.switch_resonate_mode" />]可以打开一个轮盘选择界面，包含共振器的五个模式，将鼠标拖到对应的位置就可以选中该模式并切换。

共振器同样不会完全损坏，类似于鞘翅，它会失去所有增益、功能等效果，攻击伤害变为0，附魔大部分失效，浮霜带来的[无情](../advanced_features/advanced_tool_properties.md#merciless)
也会失效。

