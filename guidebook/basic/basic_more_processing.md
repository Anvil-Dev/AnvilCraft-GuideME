---
navigation:
  title: "更多铁砧处理"
  icon: "minecraft:spawner"
  position: 1003
  parent: anvilcraft_guideme:basic_gameplay_index.md
---

# 更多铁砧处理

* 让*铁砧*落在生物脚下、刷怪笼上、红石块上会引起相应变化，本条目的后续页面依次介绍。

获得更多生物战利品：
生物被铁砧砸到而伤害时，会按照原战利品表掉落物品，生物必须一次性受到足够伤害：一次40%血量→1倍掉落物；一次60%血量→2倍掉落物；一次80%血量→3倍掉落物。
这种方式只能获得生物的一般掉落物，不会产出需要玩家手动击杀而产生的掉落物如烈焰棒。
有一些生物可以自行或借助外力恢复血量，你可以借此制造不杀死生物的掉落物农场。

## 刷怪笼：强制刷怪

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/spawner.snbt" />
  <Entity id="minecraft:mooshroom" x="1.5" z="1.5" rotationY="180" rotationX="-10" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

被砸中的刷怪笼会尝试刷怪，详细说明见右侧。

铁砧下落高度越高刷怪概率越大。这种刷怪方式不需要周围有玩家，但需要满足刷怪笼刷怪的光照条件、周围怪物数量也会影响刷怪，将附近怪物快速运走或击杀能大大提高效率。

## 红石块：红石EMP

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/redstone_emp.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

被砸中的红石块会产生红石EMP，详细说明见右侧。

铁砧砸到红石块，会让与红石块同层的距离为r内的红石火把熄灭1gt，紧贴红石块的铁活版门阻止这个方向的EMP。
r的计算方法：距离与掉落高度成正比，1格掉落高度传播6格，极限距离24格。

