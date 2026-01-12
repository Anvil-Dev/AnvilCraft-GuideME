---
navigation:
  title: "巨型蛋糕"
  icon: "anvilcraft:large_cake"
  position: 8
  parent: anvilcraft_guideme:prop.md
item_ids:
  - anvilcraft:large_cake
  - anvilcraft:cake_base_block
  - anvilcraft:cream_block
  - anvilcraft:berry_cream_block
  - anvilcraft:chocolate_cream_block
  - anvilcraft:cake_block
  - anvilcraft:berry_cake_block
  - anvilcraft:chocolate_cake_block
---

# 巨型蛋糕

<Row>
<ItemImage id="anvilcraft:cake_base_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:cream_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:berry_cream_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:chocolate_cream_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:cake_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:berry_cake_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:chocolate_cake_block" scale="2"> </ItemImage>
<ItemImage id="anvilcraft:large_cake" scale="2"> </ItemImage>
</Row>

<NeoColor id="cccc88">巨型蛋糕是个弥天大谎!</NeoColor>

# 食用

|                         方块                         | 饱食度 | 饱和度 |
|:--------------------------------------------------:|:---:|:---:|
|    <ItemLink id="anvilcraft:cake_base_block" />    |  5  |  4  |
|      <ItemLink id="anvilcraft:cream_block" />      |  5  |  2  |
|   <ItemLink id="anvilcraft:berry_cream_block" />   |  8  | 3.2 |
| <ItemLink id="anvilcraft:chocolate_cream_block" /> | 12  | 4.8 |
|      <ItemLink id="anvilcraft:cake_block" />       | 10  |  6  |
|   <ItemLink id="anvilcraft:berry_cake_block" />    | 14  | 8.4 |
| <ItemLink id="anvilcraft:chocolate_cake_block" />  | 20  | 12  |
|      <ItemLink id="anvilcraft:large_cake" />       | 15  | 12  |

> 原料方块适用铲子挖掘
> 
> 使用铲子右键将其整块吃掉

# 制造

<Recipe id="anvilcraft:cooking/cake_base_block"> </Recipe>
<Row>
<Recipe id="anvilcraft:item_compress/cream_block"> </Recipe>
<Recipe id="anvilcraft:block_compress/cake_block"> </Recipe>
</Row>
<Row>
<Recipe id="anvilcraft:item_compress/berry_cream_block"> </Recipe>
<Recipe id="anvilcraft:block_compress/berry_cake_block"> </Recipe>
</Row>
<Row>
<Recipe id="anvilcraft:item_compress/chocolate_cream_block"> </Recipe>
<Recipe id="anvilcraft:block_compress/chocolate_cake_block"> </Recipe>
</Row>

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/large_cake.snbt" />
</GameScene>
- 使用[多方块转化](../block/giant_anvil.md#功能)配方制作

> 来试试巨型蛋糕自动化，成为自动化“糕”手