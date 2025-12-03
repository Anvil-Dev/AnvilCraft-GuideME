---
navigation:
  title: "高级发电-热能收集"
  icon: "anvilcraft:heat_collector"
  position: 2005
  parent: anvilcraft:power_system.md
item_ids:
  - anvilcraft:heat_collector
---

# 高级发电-热能收集

使用集热器来收集*可集热方块*的热能。可集热方块是*高温方块*和一些特殊的方块，如*铀块*、*钚块*。

*集热器*是发热设施的核心部件，发电功率上限为4096KW。工作范围是以自己为中心5x5x5，在集热器范围内的可集热方块决定了它的发电功率，不同的可集热方块能产出不等量的热能。周期默认为1秒。

<Recipe id="anvilcraft:heat_collector" />

有些可集热方块在被集热后会冷却并变化。以下是符合描述的方块：
- *岩浆块*->*下界岩*
- *点亮的任意篝火*->*熄灭的任意篝火*
- *熔岩（炼药锅）*->*黑曜石（炼药锅）*
有些可集热方块在被集热后不会变化。以下是符合描述的方块：
- *任意高温方块*（会自行冷却，不受集热影响）
- *任意铀块*
- *余烬金属块*
- *任意钚块*

## 可加热方块

*可加热方块*是一系列方块的统称，每种方块一般有5个等级，分别为*普通*、*高温*、*红热*、*炽热*和*白炽*。目前仅有*下界合金*和*钨*系列支持加热。可加热方块有持续时间。当持续时间归零，则温度等级-1。若-1后仍为高温方块，则将持续时间设为10秒。挖掘方块时不保留持续时间且温度等级-1。若工具有精准采集/使用自动熔炼采集，则温度等级不变。

<ItemImage id="anvilcraft:heater" />

*加热器*可用于加热可加热方块。它能将顶部方块加热至高温，并每秒增加1秒持续时间。若顶部方块温度等级高于高温，则不操作。

<ItemImage id="anvilcraft:mineral_fountain" />

当*矿物涌泉*四角为*熔岩*时可用于加热可加热方块。它能将顶部方块加热至红热，并每秒增加1秒持续时间。若顶部方块温度等级高于红热，则不操作。

<ItemImage id="anvilcraft:heliostats" />

*定日镜*照射至可加热方块时可加热它。方块被定日镜照射时，根据定日镜数量决定温度等级。数量与温度等级的关联曲线为4、12、32、80。当方块的温度等级低于或等于提供的温度等级时，提升至提供的等级并每秒增加4秒持续时间。若方块温度等级高于提供的等级，则不操作。

## 激光

<ItemImage id="anvilcraft:ruby_laser" />
<ItemImage id="anvilcraft:ruby_prism" />

*激光*照射至可加热方块时可加热它。方块被激光照射时，根据激光等级决定温度等级。激光等级与温度等级和增加持续时间的关联曲线见下页。当方块的温度等级低于提供的温度等级时，提升至提供的等级。若方块温度等级高于提供的等级，则不操作。

1级：达到高温且增加1秒持续时间
2级：达到高温且增加3秒持续时间
3-4级：达到红热且增加1秒持续时间
5-8级：达到红热且增加3秒持续时间
9-16级：达到炽热且增加1秒持续时间
17-32级：达到炽热且增加3秒持续时间
33-64级：达到白炽且增加1秒持续时间
65级+：达到白炽且增加3秒持续时间

## 等离子喷流

当*燃烧的炼药锅*底部有工作中的*加热器*、正上方宽度1x1，高度8格以内都没有方块时，生成一个*等离子喷流*。该方块水平相邻四面都有方块时（被当做管壁），自身抬升一格，最高抬升四次。

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="0" id="anvilcraft:magnet_block" />
  <Block x="0" y="0" z="1" id="anvilcraft:incandescent_tungsten_block" />
  <Block x="2" y="0" z="1" id="anvilcraft:incandescent_netherite_block" />
  <Block x="1" y="0" z="2" id="anvilcraft:magnet_block" />
  <Block x="1" y="1" z="0" id="minecraft:stone" />
  <Block x="0" y="1" z="1" id="minecraft:stone" />
  <Block x="2" y="1" z="1" id="minecraft:stone" />
  <Block x="1" y="1" z="2" id="anvilcraft:glowing_tungsten_block" />
  <Block x="1" y="2" z="0" id="anvilcraft:incandescent_netherite_block" />
  <Block x="0" y="2" z="1" id="anvilcraft:magnet_block" />
  <Block x="2" y="2" z="1" id="anvilcraft:magnet_block" />
  <Block x="1" y="2" z="2" id="anvilcraft:incandescent_tungsten_block" />
  <Block x="1" y="3" z="0" id="anvilcraft:glowing_tungsten_block" />
  <Block x="0" y="3" z="1" id="minecraft:stone" />
  <Block x="2" y="3" z="1" id="anvilcraft:glowing_netherite_block" />
  <Block x="1" y="3" z="2" id="minecraft:stone" />
  <Block x="1" y="4" z="1" id="anvilcraft:fire_cauldron"p:level="4" />
  <Block x="1" y="5" z="1" id="anvilcraft:heater" />
</GameScene>

此示意图为一个有效的结构

每个电网刻它会尝试：
- 将作为管壁的*下界合金块*和*钨块*加热至炽热并增加一秒持续时间。
- 若某层管壁符合对侧为*磁铁块*、另一对侧为*下界合金块*或*钨块*时，将该层的*下界合金块*或*钨块*加热至白炽并增加一秒持续时间，同时在*下界合金块*或*钨块*上产生512电荷。

喷流需要消耗锅中原油维持。每消耗一层，喷流为自身维持时间增加5分钟，维持时间最多为10分钟，超过则不继续消耗原油来增加持续时间。在喷流中和喷流与锅之间的实体会受到等同于熔岩中4倍的火焰类型伤害。

