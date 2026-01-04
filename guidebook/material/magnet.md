---
navigation:
  title: "磁铁"
  icon: "anvilcraft:magnet_ingot"
  position: 0
  parent: anvilcraft_guideme:material.md
item_ids:
  - anvilcraft:magnet_ingot
  - anvilcraft:magnet_block
  - anvilcraft:hollow_magnet_block
  - anvilcraft:ferrite_core_magnet_block
---

# 磁铁
<Row>
<ItemImage id="anvilcraft:magnet_ingot" scale="2"></ItemImage>
<ItemImage id="anvilcraft:magnet_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:hollow_magnet_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:ferrite_core_magnet_block" scale="2"></ItemImage>
</Row>

# 首次获取
需要使用<ItemLink id="minecraft:lightning_rod" />吸引雷电，
将<ItemLink id="minecraft:iron_block" />雷击转化为<ItemLink id="anvilcraft:hollow_magnet_block" />

默认的雷击转化磁铁块范围如下

> 使用<ItemLink id="anvilcraft:topaz" />右键<ItemLink id="minecraft:lightning_rod" />，
会消耗<ItemLink id="anvilcraft:topaz" />并制造一道闪电

<Row>
<GameScene><ImportStructure src="../ac_assets/structure/lightning_convert_magnets.snbt" /></GameScene>
<Recipe id="anvilcraft:magnet_ingot_from_hollow_block"></Recipe>
<Recipe id="anvilcraft:hollow_magnet_block"></Recipe>
</Row>

# 磁化
- 使用<ItemLink id="minecraft:iron_ingot" />右键<ItemLink id="anvilcraft:hollow_magnet_block" />，
或者合成，获得<ItemLink id="anvilcraft:ferrite_core_magnet_block" />
- 将<ItemLink id="anvilcraft:ferrite_core_magnet_block" />放置在世界中，
其会慢慢转变为<ItemLink id="anvilcraft:magnet_block" />，
将<ItemLink id="minecraft:iron_ingot" />转化为<ItemLink id="anvilcraft:magnet_ingot" />
- 可以合成，或是空手右键取出<ItemLink id="anvilcraft:magnet_ingot" />

<Row>
<Recipe id="anvilcraft:ferrite_core_magnet_block"></Recipe>
<Recipe id="anvilcraft:magnet_ingot_from_block"></Recipe>
<Recipe id="anvilcraft:magnet_block"></Recipe>
</Row>

# 磁效应
- <ItemLink id="anvilcraft:magnet_block" />、
<ItemLink id="anvilcraft:ferrite_core_magnet_block" />、
<ItemLink id="anvilcraft:hollow_magnet_block" />可以吸引正下方5格内的各种铁砧
- 收到红石信号消磁 
- 反复激活，可以将铁砧抬起再砸下

# 电磁效应
具有发电能力后，可利用<ItemLink id="anvilcraft:charger" />，
将<ItemLink id="minecraft:iron_ingot" />充能为<ItemLink id="anvilcraft:magnet_ingot" />

<Recipe id="anvilcraft:charger_charging/magnet_ingot"></Recipe>