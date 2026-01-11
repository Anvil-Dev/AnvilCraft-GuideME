---
navigation:
  title: "药片与药盒"
  icon: "anvilcraft:pill"
  position: 11
  parent: anvilcraft_guideme:prop.md
item_ids:
  - anvilcraft:pill
  - anvilcraft:pill_box
---

# 药片与药盒

<Row>
<ItemImage id="anvilcraft:pill" scale="2"></ItemImage>
<ItemImage id="anvilcraft:pill_box" scale="2"></ItemImage>
</Row>

## 药片

- 没有效果的药片和任意药水（无视其是否为喷溅以及滞留）在合成栏合成时，将药水转化为空瓶，将药水的效果赋予药片，得到对应药水效果的药片
- 药片可以右键使用，使用时消耗一个

<Recipe id="anvilcraft:stamping/pill"> </Recipe>

---

## 药盒

- 配置方式类似[护符盒](amulet_box.md)，但是更简单没有大小格子之分
- 鼠标放上去有高2宽4的悬浮gui
    - 光标持有药片时可以往里放入，滚轮选择里面的位置，可以取出药片
- 拿在手上时右键可以一次性吃掉里面每种不同的药片各一片,冷却2秒
- 可以设置快捷键:<Key id="key.anvilcraft.use_pill_box"></Key>在背包中使用，背包中有多个药盒时，用快捷键只使用更靠前的

<Recipe id="anvilcraft:pill_box"> </Recipe>