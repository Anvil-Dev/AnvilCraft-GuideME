---
navigation:
  title: "高级发电-虚空能量收集"
  icon: "anvilcraft:void_energy_collector"
  position: 2004
  parent: anvilcraft_guideme:power.md
item_ids:
  - anvilcraft:void_energy_collector
---

# 高级发电-虚空能量收集

使用*虚空能收集器*来收集*非物质方块*的虚空能。*非物质方块*包括*空气方块*、*虚空*、[虚空物质块](../basic/basic_minerals.md#void_matter_block)、*虚空能收集器*和*负物质块*

<a name="void_energy_collector"></a>
*虚空能收集器*的默认发电功率为512KW。检测范围是以自己为中心5x5x5，范围内的*物质数*决定了它的发电功率。周期默认为1秒。

<Recipe id="anvilcraft:void_energy_collector" />

*虚空能收集器*的检测范围不可重叠。其*发电量*由*物质数*决定。*物质数*由检测范围内每一个*方块*决定:
*物质方块*使*物质数*+1
*负物质块*使*物质数*-1

## 发电量-物质数关系

*发电量*和*物质数n*关系如下:
n≥21：0kW
20≥n≥11：128kW
10≥n≥3：256kW
2≥n≥-10：512kW
-11≥n≥-20：1024kW
-21≥n≥-40：2048kW
n<-40：4096kW

## 产生物质方块

每隔一段时间，*虚空能收集器*将检测范围内的一个*空气方块*转化为*物质方块*，可能出现的方块与*虚空衰变*一致。这些*物质方块*会影响*虚空能收集器*发电。
可以采取以下手段：
1.及时清理*物质方块*
2.使用其他*非物质方块*取代*空气方块*，需要注意[虚空物质块](../basic/basic_minerals.md#void_matter_block)的[虚空衰变](../basic/basic_minerals.md#void_decay)特性

## 产生物质方块

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="1" id="minecraft:andesite" />
  <Block x="0" y="0" z="4" id="anvilcraft:end_dust" />
  <Block x="1" y="1" z="2" id="anvilcraft:void_matter_block" />
  <Block x="2" y="1" z="2" id="anvilcraft:void_matter_block" />
  <Block x="3" y="1" z="2" id="anvilcraft:void_matter_block" />
  <Block x="2" y="2" z="0" id="anvilcraft:end_dust" />
  <Block x="1" y="2" z="2" id="anvilcraft:void_matter_block" />
  <Block x="2" y="2" z="2" id="anvilcraft:void_energy_collector" />
  <Block x="3" y="2" z="2" id="anvilcraft:void_matter_block" />
  <Block x="4" y="2" z="3" id="anvilcraft:cursed_gold_block" />
  <Block x="1" y="3" z="2" id="anvilcraft:negative_matter_block" />
  <Block x="2" y="3" z="2" id="anvilcraft:negative_matter_block" />
  <Block x="3" y="3" z="2" id="anvilcraft:negative_matter_block" />
</GameScene>

如图：通过*非物质方块*避免*物质方块*生成在内圈，用任意自动挖掘手段破坏外圈的*物质方块*，维护*虚空能收集器*的运行。

