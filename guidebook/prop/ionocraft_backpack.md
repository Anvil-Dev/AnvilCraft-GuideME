---
navigation:
  title: "飘升机背包"
  icon: "anvilcraft:ionocraft_backpack"
  position: 11
  parent: anvilcraft_guideme:prop.md
categories:
  - tools
item_ids:
  - anvilcraft:ionocraft_backpack
---

# 飘升机背包

<Row>
<ItemImage id="anvilcraft:ionocraft_backpack" scale="2"></ItemImage>
</Row>

## 飘升机背包

- <NeoColor id="00e3ff"> ~~小小鸟 飞飞飞~~ </NeoColor>
- 可以穿在胸甲栏位
- 飞行行为不会消耗耐久
- 装备着时，拥有创造飞行能力
- 穿戴飘升机背包时不免疫摔落伤害

## 充电

- 在电网中对电网增加64kw的负载，自身每秒补充10秒的飞行时间值
- 电网外时
    - 能量小于等于56MJ时，尝试使用背包的[电容器](../material/capacitor.md)充能，每个电容器补充4MJ（飞行时间+80秒）
    - 能量小于等于1MJ时，尝试使用[超级电容器](../material/capacitor.md)直接充满（飞行时间变为1200秒）

## 合成

<Row>
<Recipe id="anvilcraft:ionocraft_backpack"></Recipe>
</Row>

### 相关

- [飘升机](ionocraft.md)