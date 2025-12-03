---
navigation:
  title: "基本方块处理"
  icon: "minecraft:stone"
  position: 1001
  parent: anvilcraft:basic_gameplay.md
---

# 基本方块处理

让*铁砧*落在需要被加工的方块上就可以加工该方块。单个方块、多个方块、方块和炼药锅、方块和切石机都会触发不同的效果，本条目的后续页面将会依次介绍。
在此之前，了解磁铁对铁砧加工的帮助会让你更方便地上手。

## 使用磁铁升降铁砧

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="1" id="anvilcraft:magnet_block"p:lit="true" />
  <Block x="2" y="0" z="1" id="anvilcraft:magnet_block" />
  <Block x="0" y="0" z="2" id="minecraft:lever"p:facing="east" p:powered="true" />
  <Block x="2" y="0" z="2" id="minecraft:lever"p:facing="east" p:powered="false" />
  <Block x="2" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:anvil" />
  <Block x="0" y="3" z="1" id="minecraft:gravel" />
  <Block x="2" y="3" z="1" id="minecraft:cobblestone" />
</GameScene>

磁铁被红石信号激活而消磁，铁砧落下可以执行操作。

## 单方块处理：粉碎

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:sand" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:gravel" />
</GameScene>

右侧列表给出了更多可以发生此种转化的例子，有些可连续发生转化。

*圆石*→*沙砾*→*沙子*
*磨制花岗岩*→*花岗岩*→*红沙*
*磨制安山岩*→*安山岩*→*火山灰*
*磨制闪长岩*→*闪长岩*→*石英砂*
*有裂纹变种的方块*→*对应的裂纹变种*
*下界岩*→*下界尘*
*末地石*→*末地尘*
*灵魂土*→*灵魂沙*
*深板岩*→*深板岩碎*
*黑石*→*黑沙*

## 双方块处理：压合

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:anvil" />
  <Block x="2" y="2" z="1" id="minecraft:moss_block" />
  <Block x="0" y="3" z="1" id="minecraft:grass_block" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:dirt" />
</GameScene>

右侧列表给出了更多可以发生此种转化的例子。

*苔藓块*+*泥土*→*草方块*
*任意树叶*+*泥土*→*灰化土*
*任意蘑菇块*+*泥土*→*菌丝体*
*下界疣块*+*下界岩*→*绯红菌岩*
*诡异疣块*+*下界岩*→*诡异菌岩*
*石头*+*石头*→*深板岩*
*冰*+*冰*→*浮冰*
*浮冰*+*浮冰*→*蓝冰*
*玄武岩*+*玄武岩*→*黑石*

## 双方块处理：涂抹

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:moss_block" />
  <Block x="2" y="2" z="1" id="minecraft:moss_block" />
  <Block x="0" y="3" z="1" id="minecraft:mossy_cobblestone" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:cobblestone" />
</GameScene>

与压合不同的是上方的方块不会消耗。右侧列表给出了更多可以发生此种转化的例子。

*苔藓块*+*圆石*→*苔石*
*苔藓块*+*石砖*→*苔石砖*
*蜜脾块*+*任意铜制方块*→*对应的涂蜡铜制方块*

## 方块+炼药锅：压榨

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:sponge" />
  <Block x="2" y="2" z="1" id="minecraft:wet_sponge" />
  <Block x="0" y="3" z="1" id="minecraft:water_cauldron"p:level="1" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:cauldron" />
</GameScene>

使炼药锅中出现对应的单层液体。右侧列表给出了更多可以发生此种转化的例子。

*湿海绵*→*海绵*+*水*
*苔藓块*→*覆地苔藓*+*水*
*岩浆块*→*下界岩*+*熔岩*
*雪块*→*冰*+*细雪*
*满蜂巢*→*空蜂巢*+*蜂蜜*（特殊地，当下方是三层*蜂蜜*时，继续砸*满蜂巢*会将所有*蜂蜜*压成一个*蜂蜜块*。上述*蜂巢*皆可换成*蜂箱*）

## 方块+切石机：破坏

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="2" y="2" z="1" id="minecraft:cobblestone" />
  <Block x="0" y="3" z="1" id="minecraft:stonecutter" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:stonecutter" />
</GameScene>

使方块变为掉落物。右边详细说明。

使用普通*铁砧*执行时，方块破坏遵循TNT破坏的掉落物表，即没有*时运*或*精准采集*效果。使用*皇家铁砧*执行则附带时运效果，*余烬铁砧*则为精准采集效果。如果方块无法被普通TNT爆炸破坏如*黑曜石*，仍然可以破坏，但是铁砧将固定损坏一个耐久等级。为了防止方块破坏后铁砧掉在切石机上变为掉落物，你需要控制电路的时序。

