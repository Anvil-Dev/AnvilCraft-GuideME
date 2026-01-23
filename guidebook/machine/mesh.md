---
navigation:
  title: "加工：自动过筛"
  icon: "minecraft:scaffolding"
  position: 22
  parent: machine.md
---

# 加工：自动过筛

# 前言

- 阅读[矿物获取](../recipe/basic_minerals.md)可知，*过筛*可以从闪长岩粉碎而成的石英砂中筛选出石英
- 但每次*过筛*只有一部分原料能被使用，手动反复过筛费时又费力
- 下面给出一个自动过筛的示例机器

# 图示

<Row>
<GameScene zoom="3" background="#888888" interactive={true}>
    <ImportStructure src="../ac_assets/structure/machine/mesh.snbt" />
    <BlockAnnotation x="3" y="4" z="0" color="#ff0000">
        设置为循环模式：每间隔 5gt 发出长度 3gt 的信号；驱动活塞运行
    </BlockAnnotation>
    <BlockAnnotation x="1" y="1" z="0" color="#ffffff">
        设置过滤：过筛原料
    </BlockAnnotation>
</GameScene>

<Column>

- 所有 <ItemLink id="minecraft:smooth_stone" /> 可替换为 任意完整不透明方块
- 所有 <ItemLink id="minecraft:smooth_stone_slab" /> 可替换为 任意台阶
- 所有 <ItemLink id="minecraft:anvil" /> 可替换为 任意铁砧

> 右键调整位置
> 
> 左键调整角度
> 
> 结构右上角的眼睛按钮可以隐藏图示

</Column>
</Row>