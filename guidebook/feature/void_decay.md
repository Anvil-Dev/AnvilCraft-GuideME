---
navigation:
  title: "虚空衰变"
  icon: "anvilcraft:void_matter_block"
  position: 101
  parent: anvilcraft_guideme:feature.md
---

# 虚空衰变

<Row>
<ItemImage id="anvilcraft:void_matter_block" scale="3"> </ItemImage>
</Row>

# 定义

- <ItemLink id="anvilcraft:void_matter_block" />会自发地转化为随机方块

# 详细

1. <ItemLink id="anvilcraft:void_matter_block" />相邻至少5个面接触到<ItemLink id="anvilcraft:void_matter_block" />
2. 接收到随机刻时，自身随机转化为以下方块:
   - 三界的各种岩石、砂岩
   - 泥土、砂土、缠根泥土
   - 泥巴、黏土、冰
   - 铁、铜、金矿石
   - 粗铁块，氧化铜块
   - 燧石块、苔藓块、幽匿块
   - 石英矿、虚空石、末地尘
   - 锌、锡、铅矿石
   - 各种虫蚀石

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/void_decay.snbt" />
</GameScene>

