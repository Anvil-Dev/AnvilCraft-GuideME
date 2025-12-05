---
navigation:
  title: "流程3-开始铁砧加工"
  icon: "minecraft:anvil"
  position: 3
  parent: anvilcraft_guideme:process_index.md
---

# 流程3-开始铁砧加工

让*铁砧*落在需要被加工的方块上就可以加工该方块；  
铁砧落在*冲压平台*、*炼药锅*、*铁活版门*、*脚手架*等方块上时，会加工其中或其上的物品。  
使用*磁铁块*帮助你完成半自动：磁铁块自动吸起下方五格以内的铁砧，磁铁块被红石激活失去磁性使铁砧下落。
如果没有磁铁块，你也可以手动拆除铁砧再将其放置或者设计红石机器。  

## 使用磁铁升降铁砧

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="../ac_assets/sturcture/magnets_control_anvils.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

磁铁被红石信号激活而消磁，铁砧落下可以执行操作。  


### *铁砧*造价太高？
本模组为原版*开裂的铁砧*和*损坏的铁砧*增加了合成表。  
别担心，一格高的高度不会使铁砧继续受到损害。  



<Recipe id="anvilcraft:chipped_anvil" />

<Recipe id="anvilcraft:damaged_anvil" />

## 方便的铁砧工作站

<GameScene interactive={true} zoom={3}>
  <ImportStructure src="../ac_assets/sturcture/anvil_workstation.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

再也不用抬头点拉杆或按钮了，敲击音符盒就会让铁砧落下一次。  
左图中，冲压平台可以换成别的方块，下方还可以增加营火等方块。  
详细处理类别见铁砧处理相关章节。  

## 相关章节

- [基本方块处理](../basic/basic_block_processing.md)
- [基本物品处理](../basic/basic_item_processing.md)

