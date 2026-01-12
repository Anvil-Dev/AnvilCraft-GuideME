---
navigation:
  title: "§6巨型铁砧"
  icon: "anvilcraft:giant_anvil"
  position: 210
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:giant_anvil
  - anvilcraft:transparent_crafting_table
---

# 巨型铁砧

<Row>
<ItemImage id="anvilcraft:giant_anvil" scale="3"></ItemImage>
<ItemImage id="anvilcraft:transparent_crafting_table" scale="3"></ItemImage>
</Row>

# 首次获得

- 手持<ItemLink id="minecraft:anvil" />右键僵尸，将铁砧塞到它手上
- 使得持有铁砧的僵尸被<ItemLink id="anvilcraft:corrupted_beacon" />照射
- 僵尸有 [手持铁砧数量*5%] 的概率变为拿着<ItemLink id="anvilcraft:giant_anvil" />的**巨人僵尸**
- 击杀**巨人僵尸**，就可以<ItemLink id="anvilcraft:giant_anvil" />

> 可以使用<ItemLink id="anvilcraft:resin_block" />抓捕僵尸

> **巨人僵尸**被本模组添加了AI，极其强大，请确保周围提前围好方块困住它，或是作为PVE高手战胜它

# 合成

获得第一个<ItemLink id="anvilcraft:giant_anvil" />之后，
就可以通过**多方块转化**这一方式生产<ItemLink id="anvilcraft:giant_anvil" />

# 功能

## 1.多方块转换

<ItemLink id="anvilcraft:giant_anvil" />砸中<ItemLink id="minecraft:crafting_table" />时，对下方多方块结构进行转化，生成新的方块

<GameScene zoom="1" interactive={true}>
    <ImportStructure src="../ac_assets/structure/mutiblock_convert.snbt" />
</GameScene>

> 如果觉得<ItemLink id="minecraft:crafting_table" />不好看，可以试试<ItemLink id="anvilcraft:transparent_crafting_table" />

<Recipe id="anvilcraft:transparent_crafting_table"></Recipe>

## 2.多方块合成

- 将正中间的<ItemLink id="minecraft:crafting_table" />替换为<ItemLink id="anvilcraft:space_overcompressor" />，就能执行**多方块合成**
- 生产的结果为**掉落物**形式
- 兼容转换出一个方块的**多方块转换**配方
- 处理额外特殊配方

> 比多方块转化方便得多

## 3.撼地

- <ItemLink id="anvilcraft:giant_anvil" />的正中心砸中<ItemLink id="anvilcraft:heavy_iron_block" />时，执行**撼地**操作
- 此时，其可以影响同一水平面上的方块或实体。根据<ItemLink id="anvilcraft:heavy_iron_block" />周围方块的不同，撼地产生的效果也不尽相同
- 坠落高度提高 1 格，影响范围扩大 1 圈

### 定义

- 方便起见，我们将与<ItemLink id="anvilcraft:heavy_iron_block" />
  相邻的方块称为“邻块”，多方块结构中不与<ItemLink id="anvilcraft:heavy_iron_block" />相邻的方块称为“角块”
- **邻块**决定撼地的工作模式
- **角块**决定模式的工作类型

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/giant_anvil_shocking.snbt" />
    <DiamondAnnotation pos="0.5 0.5 0.5" color="#ff0000">
        角块
    </DiamondAnnotation>
    <DiamondAnnotation pos="1.5 0.5 0.5" color="#ffff00">
        邻块
    </DiamondAnnotation>
</GameScene>

### 工作模式：默认

- **邻块**和**角块**不符合任意工作模式时启用
- **撼地**仅造成极少的伤害，穿有靴子既可避免

### 工作模式：震起

- **邻块**和**角块**均为<ItemLink id="anvilcraft:resin_block" />时启用
- **撼地**可以使周围的，任意种类的小型铁砧震起 1 格

### 工作模式：伤害

- **邻块**为<ItemLink id="anvilcraft:cursed_gold_block" />时启用
- <ItemLink id="anvilcraft:giant_anvil" />落点高度越高，**撼地**造成的伤害越高
- **角块**决定伤害类型，对应关系如下：

|                       角块                       |     伤害类型      |
|:----------------------------------------------:|:-------------:|
|    <ItemLink id="anvilcraft:ruby_block" />     |     火焰伤害      |
|  <ItemLink id="anvilcraft:sapphire_block" />   |     冰冻伤害      |
|    <ItemLink id="anvilcraft:topaz_block" />    |     雷电伤害      |
| <ItemLink id="anvilcraft:void_matter_block" /> |     虚空伤害      |
|                       其他                       | 摔落伤害(可以穿靴子避免) |

### 工作模式：破坏

- **邻块**为铁砧时启用
- 属于[铁砧挖掘](../feature/anvil_destroy.md)，铁砧类型会决定不同的破坏效果
- **角块**决定破坏哪类方块：

|                      角块                      | 方块类型                                             |
|:--------------------------------------------:|:-------------------------------------------------|
|     <ItemLink id="minecraft:obsidian" />     | 任意方块                                             |
|   <ItemLink id="minecraft:grass_block" />    | 花、草、菌、灌木、藤蔓、农作物和雪片                               |
|    <ItemLink id="minecraft:hay_block" />     | 收割并补种包括小麦、南瓜、浆果、可可豆与下界疣等农作物。可以操作高于工作平面的相连原木上的可可豆 |
| <ItemLink id="minecraft:oak_log" />等任意**原木** | 原木、树叶、菌柄、疣块、仙人掌、紫颂植株与甘蔗。可以破坏高于工作平面的相连方面          |
|  <ItemLink id="minecraft:amethyst_block" />  | 紫水晶簇                                             |
