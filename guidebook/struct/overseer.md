---
navigation:
  title: "监督者"
  icon: "anvilcraft:overseer"
  position: 111
  parent: anvilcraft_guideme:struct.md
item_ids:
  - anvilcraft:overseer
---

# 监督者

<Row>
<ItemImage id="anvilcraft:overseer" scale="2"></ItemImage>
</Row>

# 合成

<Recipe id="anvilcraft:overseer"></Recipe>

# 功能

- 玩家离开基地时，区块卸载很容易导致机器损坏
- <ItemLink id="anvilcraft:overseer" />可以维持一定范围内的区块加载
- 使用它需要搭建多方块结构：
  - 底座需用1-3层3*3的<ItemLink id="anvilcraft:royal_steel_ingot" />制作的建筑方块或<ItemLink id="anvilcraft:frost_metal_block" />填充
  - 搭建1层底座加载所处区块
  - 搭建2层底座加载3*3的区块
  - 搭建3层底座加载5*5的区块
  - 底座中存在至少4个含水方块时，可以产生*随机刻*

<GameScene zoom="3" interactive={true}>
    <ImportStructure src="../ac_assets/structure/overseer.snbt" />
</GameScene>