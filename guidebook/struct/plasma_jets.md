---
navigation:
  title: "§6等离子喷流"
  icon: "anvilcraft:oil_bucket"
  position: 201
  parent: anvilcraft_guideme:struct.md
---

# 等离子喷流

<Row>
<ItemImage id="anvilcraft:heater" scale="2"></ItemImage>
<ItemImage id="anvilcraft:magnet_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:tungsten_block" scale="2"></ItemImage>
<ItemImage id="anvilcraft:charge_collector" scale="2"></ItemImage>
<ItemImage id="anvilcraft:heat_collector" scale="2"></ItemImage>
</Row>

# 结构

<GameScene zoom="2" interactive={true}>
    <ImportStructure src="../ac_assets/structure/plasma_jets.snbt" />
</GameScene>

- 需要[燃烧的炼药锅](../material/oil.md)
- 炼药锅底部有工作的<ItemLink id="anvilcraft:heater" />
- 炼药锅正上方 1x8x1 的空间没有方块
- 管壁最高可为四格

# 功能

- 将作为管壁的[常规可加热方块](../feature/heated_block.md)加热至<NeoColor id="cc8844">炽热</NeoColor>并增加0.1秒持续时间
- 若某层管壁符合对侧为<ItemLink id="anvilcraft:magnet_block" />、另一对侧为[常规可加热方块](../feature/heated_block.md)时：
    - 将该层的[常规可加热方块](../feature/heated_block.md)加热至<NeoColor id="cc8844">炽热</NeoColor>并增加1秒持续时间
    - 在[常规可加热方块](../feature/heated_block.md)上产生256电荷

# 特性

- 喷流需要消耗锅中原油维持
    - 每层(250mb)原油为维持时间 +5min
    - 维持时间最多为 10min
- 在喷流中的实体会受到等同于熔岩中 4 倍的火焰类型伤害

# 相关

- [热能系统](../feature/heated_block.md)