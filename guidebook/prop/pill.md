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
<ItemImage id="anvilcraft:pill" scale="3"></ItemImage>
<ItemImage id="anvilcraft:pill_box" scale="3"></ItemImage>
</Row>

# 药片

## 合成

<Recipe id="anvilcraft:stamping/pill"> </Recipe>

- 将空白<ItemLink id="anvilcraft:pill" />和药水在合成栏合成，得到对应药水效果的药片

## 作用

- 可以堆叠
- 右键，快速消耗并使用

---

# 药盒

## 合成

<Recipe id="anvilcraft:pill_box"> </Recipe>

## 存取

- 左键拿起<ItemLink id="anvilcraft:pill" />后，再左键点击<ItemLink id="anvilcraft:pill_box" />可以存放
- 光标悬浮于<ItemLink id="anvilcraft:pill_box" />上，通过滚轮选取<ItemLink id="anvilcraft:pill" />，右键拿出

## 使用

- 右键可以一次性吃掉里面每种不同的<ItemLink id="anvilcraft:pill" />各一片，冷却2秒
- 可以设置快捷键:<Key id="key.anvilcraft.use_pill_box"></Key>在背包中使用（背包中有多个<ItemLink id="anvilcraft:pill" />时，用快捷键只使用更靠前的）
