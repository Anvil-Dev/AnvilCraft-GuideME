---
navigation:
  title: "更多实用设备"
  icon: "anvilcraft:block_placer"
  position: 1005
  parent: anvilcraft:basic_gameplay.md
item_ids:
  - anvilcraft:magnet
  - anvilcraft:crab_trap
  - anvilcraft:block_placer
  - anvilcraft:block_devourer
  - anvilcraft:chute
---

# 更多实用设备

本页面的设备可以帮助你在初期实现自动化。

*手持磁铁*右键使用将附近物品吸引到脚下。

<Recipe id="anvilcraft:magnet" />

*蟹笼*放置在水面，可以自动产出鱼获，四面紧邻的方块至少三个为水源或含水方块时正常工作。右键或铁砧砸之使其吐出产物。不同生物群系产出略有不同，但都会产出*蟹钳*。

<Recipe id="anvilcraft:crab_trap" />

<ItemImage id="anvilcraft:crab_claw" />

主手或副手手持时增加3格触及距离，从*蟹笼*产出。

*方块放置器*有红石信号或被铁砧砸时放置方块，方块物品从其背后的容器方块、实体库存、掉落物中取。红石信号使其放置在面前，铁砧根据下落高度n使其间隔n格放置。可以被活塞推拉。

<Recipe id="anvilcraft:block_placer" />

*方块吞噬器*有红石信号或被铁砧砸时破坏前方方块，红石激活范围3x3，铁砧激活根据高度1和2分别为5x5和7x7，掉落物会尝试进入吞噬器后方的方块、实体内，无法进入则原地掉落。世界基质方块如石头、下界岩等只有极少概率掉落。

<Recipe id="anvilcraft:block_devourer" />

*溜槽*是一种特殊的漏斗，有9格容量，一次性输送一组物品，可以将物品丢出至世界上。打开gui可以查看库存、改变输出方向和设置过滤。

<Recipe id="anvilcraft:chute" />

## 溜槽自动连接

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="anvilcraft:chute" />
  <Block x="2" y="0" z="0" id="anvilcraft:chute" />
  <Block x="0" y="1" z="0" id="anvilcraft:simple_chute"p:tall="true" />
  <Block x="2" y="1" z="0" id="anvilcraft:chute" />
  <Block x="0" y="1" z="1" id="anvilcraft:simple_chute"p:facing="west" />
  <Block x="2" y="1" z="1" id="anvilcraft:chute"p:facing="west" />
  <Block x="0" y="1" z="2" id="anvilcraft:chute"p:facing="west" />
  <Block x="2" y="1" z="2" id="anvilcraft:chute"p:facing="west" />
  <Block x="0" y="2" z="0" id="anvilcraft:simple_chute"p:tall="true" />
  <Block x="2" y="2" z="0" id="anvilcraft:chute" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
</GameScene>

溜槽成链时，被指向的溜槽变为简化溜槽，不再从世界吸取物品，不能过滤。

