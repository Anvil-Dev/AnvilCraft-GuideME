---
navigation:
  title: "§6激光采矿"
  icon: "anvilcraft:ruby_laser"
  position: 201
  parent: anvilcraft_guideme:struct.md
---

# 激光采矿

<Row>
<ItemImage id="anvilcraft:ruby_laser" scale="3"></ItemImage>
<ItemImage id="anvilcraft:ruby_prism" scale="3"></ItemImage>
<ItemImage id="anvilcraft:mineral_fountain" scale="3"></ItemImage>
</Row>

# 搭建结构

<GameScene zoom="2" interactive={true}>
    <ImportStructure src="../ac_assets/structure/laser_mining.snbt" />
</GameScene>

- 这种结构可以自动提取粗矿，并存放至上方容器内
- 激光可以射128格，所以可以将激光提取结构放在地表，更方便

# 参考文献

- [矿物涌泉](mineral_fountain.md)
- [激光采矿](../block/basic_laser.md)