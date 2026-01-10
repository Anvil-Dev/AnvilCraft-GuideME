---
navigation:
  title: "矿物涌泉"
  icon: "anvilcraft:mineral_fountain"
  position: 100
  parent: anvilcraft_guideme:struct.md
item_ids:
  - anvilcraft:impact_pile
  - anvilcraft:mineral_fountain
  - anvilcraft:sturdy_deepslate
---

# 矿物涌泉

<Row>
<ItemImage id="anvilcraft:impact_pile" scale="3"></ItemImage>
<ItemImage id="anvilcraft:mineral_fountain" scale="3"></ItemImage>
<ItemImage id="anvilcraft:sturdy_deepslate" scale="3"></ItemImage>
</Row>

# 获得

<Recipe id="anvilcraft:impact_pile"></Recipe>

1. 制作<ItemLink id="anvilcraft:impact_pile" />
2. 将<ItemLink id="anvilcraft:impact_pile" />放置在<ItemLink id="minecraft:bedrock" />或<ItemLink id="minecraft:bedrock" />上，
   并确保其位置**不高于**世界底部 8 格
3. 用至少 20 格的高度下落的**完好的**<ItemLink id="minecraft:anvil" />砸击它
4. 最终<ItemLink id="anvilcraft:impact_pile" />和<ItemLink id="minecraft:anvil" />都会消失，
   并生成一个包含<ItemLink id="anvilcraft:mineral_fountain" />、<ItemLink id="anvilcraft:sturdy_deepslate" />和熔岩的结构

> 生成<ItemLink id="anvilcraft:mineral_fountain" />的高度固定为世界最低高度+5
>
> 生成的结构会将除<ItemLink id="minecraft:bedrock" />外的方块替换

## <ItemLink id="anvilcraft:sturdy_deepslate" />

很硬的石头，没什么用

# 特性

- 坚硬抗爆
- 极难挖掘
- 破坏没有掉落物

# 功能

- 矿物涌泉仅在**不高于**世界底部 8 格的位置工作 （其他结构方块不参与工作，可随意破坏）

---

## 产矿

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/mineral_fountain/raw_mineral.snbt" />
</GameScene>

- 如果<ItemLink id="anvilcraft:mineral_fountain" />的四面都是**同种粗矿块**，
  则将上方<ItemLink id="minecraft:deepslate" />转化为对应的**深层矿**
- 有概率转而生成<ItemLink id="anvilcraft:earth_core_shard_ore" />或<ItemLink id="anvilcraft:void_stone" />

> 粗矿通过<ItemLink id="anvilcraft:corrupted_beacon" />获得

| 世界  | 生成<ItemLink id="anvilcraft:earth_core_shard_ore" />概率 | 生成<ItemLink id="anvilcraft:void_stone" />概率 | 
|:---:|:-----------------------------------------------------:|:-------------------------------------------:|
| 主世界 |                          1%                           |                     1%                      |
| 下界  |                          10%                          |                      0                      |
| 末地  |                           0                           |                     10%                     |

---

## 产熔岩

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/mineral_fountain/lava.snbt" />
</GameScene>

- 四周被**熔岩**环绕的<ItemLink id="anvilcraft:mineral_fountain" />可以生成**熔岩**

---

## 加热

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/mineral_fountain/heat.snbt" />
</GameScene>

- 四周被**熔岩**环绕的<ItemLink id="anvilcraft:mineral_fountain" />可以将 [可加热方块](../feature/heated_block.md)
  加热到<NeoColor id="aa2222">红热等级</NeoColor>

---

## 产火山灰

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/mineral_fountain/cinerite.snbt" />
</GameScene>

- 其他结构都不满足时，<ItemLink id="anvilcraft:mineral_fountain" />在上方生成<ItemLink id="anvilcraft:cinerite" />
  ，可将其用于[筛矿](../recipe/basic_minerals.md)

---