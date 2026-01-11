---
navigation:
  title: "龙杖"
  icon: "anvilcraft:dragon_rod"
  position: 10
  parent: anvilcraft_guideme:tool.md
categories:
  - tools
item_ids:
  - anvilcraft:dragon_rod
  - anvilcraft:royal_dragon_rod
  - anvilcraft:ember_dragon_rod
  - anvilcraft:transcendence_dragon_rod
---

# 龙杖

<Row>
<ItemImage id="anvilcraft:dragon_rod" scale="2"></ItemImage>
<ItemImage id="anvilcraft:royal_dragon_rod" scale="2"></ItemImage>
<ItemImage id="anvilcraft:ember_dragon_rod" scale="2"></ItemImage>
<ItemImage id="anvilcraft:transcendence_dragon_rod" scale="2"></ItemImage>
</Row>

## 龙杖

**龙杖** 本质上是为了将 <Colour firstColor="ff00ff" lastColor="00e3ff"> "放下**方块吞噬器**→**铁砧锤**敲击→收回方块吞噬器" </Colour> 的流程简化至一个工具内  
所有龙杖的功能是相同的，只是耐久不同和属性不同

## 合成

龙杖可以在工作台中合成

<Recipe id="anvilcraft:dragon_rod"></Recipe>

此外，你还能合成皇家钢、余烬金属版本和超限金属版本的龙杖，这些龙杖有着对应金属工具的属性

<Row>
<Recipe id="anvilcraft:smithing/royal_dragon_rod"></Recipe>
<Recipe id="anvilcraft:smithing/ember_dragon_rod"></Recipe>
<Recipe id="anvilcraft:smithing/transcendence_dragon_rod"></Recipe>
<Recipe id="anvilcraft:royal_dragon_rod"></Recipe>
<Recipe id="anvilcraft:ember_dragon_rod"></Recipe>
<Recipe id="anvilcraft:transcendence_dragon_rod"></Recipe>
</Row>

## 使用

- 龙杖的操作十分简单
    1. 左键破坏一定范围内的方块
    2. 右键切换范围大小，有3x3、5x5、7x7、9x9四个范围
    3. 当手持龙杖准星指向方块时会显示范围框。
- 3x3范围不消耗耐久，往后依次消耗1、2、4点耐久。
- 当龙杖耐久消耗殆尽时不会完全损坏，而是失去所有功能，类似于 **鞘翅**

## 破坏时

龙杖遵循方块吞噬器的规则，当挖掘世界基底方块（**石头**、**下界岩**、**末地石**）时，只有5%的概率掉落。但是它无法连锁顶部的可下落方块   
龙杖在挖掘一次后会有一段冷却时间，默认为1秒。这段冷却时长只受*急迫*效果和*挖掘疲劳*效果影响，每级急迫会减少4tick，每级挖掘疲劳会增加1秒

# 相关

- [皇家钢工具](../material/royal_steel.md)
- [余烬金属工具](../material/ember_metal.md)
- [超限金属工具](../material/transcendium.md)