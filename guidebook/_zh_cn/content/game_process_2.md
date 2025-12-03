---
navigation:
  title: "流程2-获得磁铁"
  icon: "anvilcraft:magnet_ingot"
  position: 2
  parent: anvilcraft:process.md
item_ids:
  - anvilcraft:ferrite_core_magnet_block
  - anvilcraft:hollow_magnet_block
  - anvilcraft:magnet_block
---

# 流程2-获得磁铁

*磁铁块*帮助你简单地将铁砧抬起再砸下。有三种磁铁块，功能基本相同，有些可以互相转化。第一批磁铁块的获取方式：*铁块*被雷击转化为空心磁铁块，雷击的影响范围可以通过配置文件更改，默认是水平3x3格，高2格

## 雷击转化磁铁块

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="1" id="minecraft:lightning_rod" />
  <Block x="0" y="1" z="0" id="minecraft:iron_block" />
  <Block x="1" y="1" z="0" id="minecraft:iron_block" />
  <Block x="2" y="1" z="0" id="minecraft:iron_block" />
  <Block x="0" y="1" z="1" id="minecraft:iron_block" />
  <Block x="1" y="1" z="1" id="minecraft:iron_block" />
  <Block x="2" y="1" z="1" id="minecraft:iron_block" />
  <Block x="0" y="1" z="2" id="minecraft:iron_block" />
  <Block x="1" y="1" z="2" id="minecraft:iron_block" />
  <Block x="2" y="1" z="2" id="minecraft:iron_block" />
  <Block x="0" y="2" z="0" id="minecraft:iron_block" />
  <Block x="1" y="2" z="0" id="minecraft:iron_block" />
  <Block x="2" y="2" z="0" id="minecraft:iron_block" />
  <Block x="0" y="2" z="1" id="minecraft:iron_block" />
  <Block x="1" y="2" z="1" id="minecraft:iron_block" />
  <Block x="2" y="2" z="1" id="minecraft:iron_block" />
  <Block x="0" y="2" z="2" id="minecraft:iron_block" />
  <Block x="1" y="2" z="2" id="minecraft:iron_block" />
  <Block x="2" y="2" z="2" id="minecraft:iron_block" />
</GameScene>

默认的雷击转化磁铁块范围，雷击后，图中铁块都将转化为空心磁铁块。

## 人工引雷

<ItemImage id="anvilcraft:topaz" />
<ItemImage id="minecraft:lightning_rod" />

如果你等不到雷雨天，使用*黄玉*右键避雷针会消耗黄玉制造一道闪电，黄玉可以从*晶洞*获得。如果你此时没有足够多的晶洞，可以多挖掘一些水晶母岩或与*珠宝匠*村民交易。如果雷雨天已经到来，可以跳过这一页。

## 砸碎晶洞

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="minecraft:anvil" />
  <Block x="0" y="2" z="0" id="anvilcraft:stamping_platform" />
</GameScene>

将晶洞置于*冲压平台*上，铁砧落下会砸碎晶洞，有概率获得黄玉。



<Recipe id="anvilcraft:craft/magnet_ingot_8" />

<Recipe id="anvilcraft:ferrite_core_magnet_block" />

雷击得到的*空心磁铁块*可以分解为8个*磁铁锭*，磁铁锭可以与铁锭合成*铁芯磁铁块*，铁芯磁铁块置于世界中逐渐转变为*磁铁块*，磁铁块可以拆解为9个磁铁锭，这是磁铁再生的一种方法。

<Recipe id="anvilcraft:craft/magnet_ingot_9" />

<ItemImage id="anvilcraft:hollow_magnet_block" />

**人工**将铁锭**逐个**丢入空心磁铁块中央的洞，铁锭有概率转化为磁铁锭，这是磁铁再生的另一个方法。其他磁铁块也可再合成。



<Recipe id="anvilcraft:hollow_magnet_block" />

<Recipe id="anvilcraft:magnet_block" />

