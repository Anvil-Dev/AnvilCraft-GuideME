---
navigation:
  title: "基本物品处理"
  icon: "minecraft:iron_ingot"
  position: 1002
  parent: anvilcraft_guideme:basic_gameplay_index.md
item_ids:
  - anvilcraft:stamping_platform
---

# 基本物品处理

让*铁砧*落在特定方块上就可以加工该方块顶部或内部的物品，不同的特定方块有不同的处理，本条目的后续页面依次介绍。本模组增加了一种方块可以让直接被砸的物品不因碰撞箱挤压而乱飞：*冲压平台*。

铁压力板可以替换成任意模组的铁板。

<Recipe id="anvilcraft:stamping_platform" />

## 物品冲压

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/item_stamping.snbt" />
  <ItemEntity id="minecraft:iron_ingot" count="1" pos="0 0.75 0" />
  <ItemEntity id="minecraft:heavy_weighted_pressure_plate" count="1" pos="2 0.25 -0.75" />
  <BlockAnnotation x="2" y="0" z="-1">
    重质测重压力板 <ItemImage id="minecraft:heavy_weighted_pressure_plate" />
  </BlockAnnotation>
  <BlockAnnotation x="0" y="1" z="0">
    铁锭 <ItemImage id="minecraft:iron_ingot" />
  </BlockAnnotation>
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

下方是冲压平台时执行物品冲压操作，原料和产物都在平台中，具体描述见右侧。

可以将物品砸成对应的薄片，例如铁锭→铁压力板；金锭→金压力板；雪球→雪片；樱花树叶→粉色花瓣。
还可以分离一些物品的不同组分，例如甘蔗→纸+糖；小麦→面粉+小麦种子；原木→木质纤维+树脂。
还可以回收一些装备，锁链、金质、铁质和钻石工具武器盔甲可以分解出原料，远远多于熔炼得到的。

## 物品压缩

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/item_compress.snbt" />
  <ItemEntity id="minecraft:iron_ingot" count="9" pos="0 0.75 0" />
  <BlockAnnotation x="2" y="0" z="0">
    铁块 <ItemImage id="minecraft:iron_block" />
  </BlockAnnotation>
  <BlockAnnotation x="0" y="1" z="0">
    铁锭 <ItemImage id="minecraft:iron_ingot" />
  </BlockAnnotation>
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

下方是炼药锅时执行物品压缩操作，原料和产物都在锅中，具体描述见右侧。

如果物品有2x2或3x3的合成配方则会被执行，例如9铁粒→铁锭；9铁锭→铁块；4线→羊毛。如果一个物品既可以2x2合成又可以3x3合成，则执行3x3合成。
除了原版的配方外，增加了3骨头→1骨块的配方也可以在此合成。

## 物品分解

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/unpack.snbt" />
  <ItemEntity id="minecraft:iron_ingot" count="9" pos="0 0.75 0" />
  <BlockAnnotation x="2" y="0" z="0">
    铁块 <ItemImage id="minecraft:iron_block" />
  </BlockAnnotation>
  <BlockAnnotation x="0" y="1" z="0">
    铁锭 <ItemImage id="minecraft:iron_ingot" />
  </BlockAnnotation>
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

下方是铁活版门时执行物品分解操作，原料置于铁活版门上，产物出现在铁活版门下，具体描述见右侧。

如果物品有1→n的合成配方则会被执行，例如1铁锭→9铁粒。
额外地，原版可以通过打破方块来分解的也可执行，数量按最大来：例如西瓜→9西瓜片；雪块→4雪球；荧石→4荧石粉，黏土→4黏土球。
一些原版无法分解的建筑方块也可以通过此方法分解：例如石英块→4石英；紫水晶块→4紫水晶碎片；滴水石块→4滴水石锥；蜜脾块→4蜜脾；海晶石→4海晶碎片；海晶石砖→9海晶碎片。

## 物品过筛

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/mesh.snbt" />
  <ItemEntity id="minecraft:gravel" count="64" pos="0 0.8 0" />
  <ItemEntity id="minecraft:iron_nugget" count="10" pos="2 0 0" />
  <ItemEntity id="minecraft:flint" count="10" pos="2 0 0" />
  <ItemEntity id="minecraft:gravel" count="10" pos="2 0 0" />
  <BlockAnnotation x="0" y="1" z="0">
    沙砾 <ItemImage id="minecraft:gravel" />
  </BlockAnnotation>
  <BlockAnnotation x="2" y="0" z="0">
    沙砾 燧石 铁粒
  </BlockAnnotation>
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

下方是脚手架时执行物品过筛操作，原料置于脚手架上，产物出现在脚手架下，具体描述见右侧。

过筛额外产出约一半原料，可循环利用。转化表如下（存在概率）：
砂砾→燧石+铁粒
沙子→黏土+金粒
红沙→荧石粉+铜粒
火山灰→青金石+锌粒
石英砂→石英+锡粒
深板岩碎→石灰粉+铅粒
下界尘→红石粉+钨粒
黑沙→火药+银粒
末地尘→紫颂花+钛粒
灵魂沙→下界疣
树叶→对应的树苗

## 物品膨发

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/bulging.snbt" />
  <BlockAnnotation x="0" y="0" z="0">
    3层水 <ItemImage id="minecraft:water_bucket" />
  </BlockAnnotation>
  <BlockAnnotation x="2" y="0" z="0">
    2层水 <ItemImage id="minecraft:water_bucket" />
  </BlockAnnotation>
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

下方是装水炼药锅时执行物品膨发操作，原料和产物都在锅中，消耗一层水，转化表见右侧。

泥土→黏土
绯红菌→下界疣块
诡异菌→诡异疣块
蜘蛛眼→发酵蜘蛛眼
珊瑚→对应珊瑚块。

## 烹饪

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="/ac_assets/sturcture/cooking.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

下方是炼药锅和营火时执行烹饪操作，原料和产物都在锅中，有的配方需要水且消耗一层水，具体描述见右侧。

自动兼容所有烟熏炉配方和营火配方，不需要水。
有水时，可以发生如下转化：树脂→粘液球。

