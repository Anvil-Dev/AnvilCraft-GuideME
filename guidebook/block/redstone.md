---
navigation:
  title: "额外红石元件"
  icon: "minecraft:redstone"
  position: 1
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:block_comparator
  - anvilcraft:pulse_generator
  - anvilcraft:item_detector
  - anvilcraft:advanced_comparator
---

# 额外红石元件

<Row>
<ItemImage id="anvilcraft:block_comparator" scale="2"></ItemImage>
<ItemImage id="anvilcraft:pulse_generator" scale="2"></ItemImage>
<ItemImage id="anvilcraft:item_detector" scale="2"></ItemImage>
<ItemImage id="anvilcraft:advanced_comparator" scale="2"></ItemImage>
</Row>

# <ItemLink id="anvilcraft:block_comparator" />

<Recipe id="anvilcraft:block_comparator"></Recipe>

- 两侧的方块相同时，向前方发出红石信号
- 默认为**普通模式**右键切换为**精准模式**
- <NeoColor id="cccc44">普通模式</NeoColor>下，仅检查方块是否相同
- <NeoColor id="cccc44">精准模式</NeoColor>下，会检查方块的状态是否完全相同

# <ItemLink id="anvilcraft:pulse_generator" />

<Recipe id="anvilcraft:pulse_generator"></Recipe>

- 根据背后的信号，向前发出设定的红石脉冲

## GUI

在GUI中可以设置发出脉冲的**条件**、**延迟**和**持续时长**

- <NeoColor id="cccc44">左上角</NeoColor>的按钮控制三个模式：收到红石信号时工作/信号消失时工作/不受到信号时循环工作
- 在<NeoColor id="cccc44">中间</NeoColor>设置延时多久发出信号
- 在<NeoColor id="cccc44">右边</NeoColor>设置发出信号的持续时间
- <NeoColor id="cccc44">左下角</NeoColor>的按钮控制输出信号为正常模式/反转模式

# <ItemLink id="anvilcraft:item_detector" />

<Recipe id="anvilcraft:item_detector"></Recipe>

- 可检测身后最多8格的**掉落物**

## GUI

在GUI中可以设置范围和过滤

- <NeoColor id="cccc44">不设置过滤</NeoColor>时，输出红石信号强度随掉落物的数量**线性变化**。数量达到64个时输出满信号强度15
- <NeoColor id="cccc44">设置过滤</NeoColor>时，若过滤的掉落物都不存在，则不输出信号。否则，对**每个**
  检测到物品的过滤格，分别根据对应掉落物数量计算红石信号(数量达到[64*过滤数量]时计算满信号强度)。最终输出选择所有红石信号的**最小值**输出

# <ItemLink id="anvilcraft:advanced_comparator" />

<Recipe id="anvilcraft:advanced_comparator"></Recipe>

- 根据从背部放置容器检测到的信号或输入的信号，决定是否输出满信号
- 默认在信号低于下阈值后无信号；在信号高于上阈值后开始输出信号

## GUI

在GUI中可以设置阈值与其他模式

- 从上往下<NeoColor id="cccc44">第一个按钮</NeoColor>可启用窗口模式：在信号位于一定区间时输出信号
- 从上往下<NeoColor id="cccc44">第二个按钮</NeoColor>可启用反转模式：在原来不输出信号的时候输出信号，反之亦然
- 从上往下<NeoColor id="cccc44">第三个按钮</NeoColor>启用后，将两侧收到的红石信号作为阈值(不分左右，高者为上阈值)






