---
navigation:
  title: "原版改进"
  icon: "minecraft:dispenser"
  position: 1004
  parent: anvilcraft_guideme:basic_gameplay_index.md
---

# 原版改进

为了让铁砧处理过程更丝滑，本模组补全了一些原版本应该就有的功能。

## 炼药锅补全

<GameScene interactive={true} zoom={4}>
  <Block x="0" y="1" z="0" id="anvilcraft:lava_cauldron"p:level="1" />
  <Block x="1" y="1" z="1" id="anvilcraft:lava_cauldron"p:level="2" />
  <Block x="2" y="1" z="2" id="minecraft:lava_cauldron" />
</GameScene>

补全原版缺失的炼药锅层数。

## 发射器操作炼药锅

<GameScene interactive={true} zoom={4}>
  <ImportStructure src="../ac_assets/sturcture/dispenser.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

发射器使用水瓶、空瓶、熔岩桶、细雪桶、水桶、空桶交互炼药锅。

发射器交互生物：
发射器可以用铁锭修铁傀儡，发射器可以用桶交互牛接奶。

