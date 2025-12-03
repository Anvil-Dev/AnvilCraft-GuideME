---
navigation:
  title: "More Practical Device"
  icon: "anvilcraft:block_placer"
  position: 1005
  parent: anvilcraft:basic_gameplay.md
item_ids:
  - anvilcraft:magnet
  - anvilcraft:crab_trap
  - anvilcraft:block_placer
  - anvilcraft:block_devourer
  - anvilcraft:chute
---

# More Practical Device

The equipments in this entry can help you automate at an early stage.

*手持磁铁*右键使用将附近物品吸引到脚下。

<Recipe id="anvilcraft:magnet" />

*Crab Trab* should be placed on the water surface and can automatically produce fishing catch items. It will only work if there are at least three blocks around it that are water sources or waterlogged blocks. Right-click or hit it with an anvil to make it spit out the products. The output of different biomes is slightly different, but they will all produce *Crab Claw*.

<Recipe id="anvilcraft:crab_trap" />

<ItemImage id="anvilcraft:crab_claw" />

When held in the hand or off-hand, the reach distance is increased by 3 blocks. It is produced from *Crab Trab*.

*Block Placer* will place a block when there is a redstone signal or when hit by an anvil. Placed block items are taken from the container or drops behind it. The redstone signal causes it to place a block closely in front of it. Hit by an anvil, it will place the block n blocks away based on the height n of the anvil's fall. It can be pushed and pulled by pistons.

<Recipe id="anvilcraft:block_placer" />

*方块吞噬器*有红石信号或被铁砧砸时破坏前方方块，红石激活范围3x3，铁砧激活根据高度1和2分别为5x5和7x7，掉落物会尝试进入吞噬器后方的方块、实体内，无法进入则原地掉落。世界基质方块如石头、下界岩等只有极少概率掉落。

<Recipe id="anvilcraft:block_devourer" />

*Chute* is a special kind of hopper. It has 9 slots, transporting a group of items at a time, and can throw items out into the world. Open the GUI to view inventory, change output direction, and set filtration.

<Recipe id="anvilcraft:chute" />

## Chute Auto-Connection

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="anvilcraft:chute" />
  <Block x="2" y="0" z="0" id="anvilcraft:chute" />
  <Block x="0" y="1" z="0" id="anvilcraft:simple_chute"p:tall="true" />
  <Block x="2" y="1" z="0" id="anvilcraft:chute" />
  <Block x="0" y="1" z="1" id="anvilcraft:simple_chute"p:facing="west" />
  <Block x="2" y="1" z="1" id="anvilcraft:chute"p:facing="west" />
  <Block x="0" y="1" z="2" id="anvilcraft:chute"p:facing="west" />
  <Block x="2" y="1" z="2" id="anvilcraft:chute"p:facing="west" />
  <Block x="0" y="2" z="0" id="anvilcraft:simple_chute"p:tall="true" />
  <Block x="2" y="2" z="0" id="anvilcraft:chute" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
</GameScene>

When chute are chained, the pointed chute will become a simple chute and no longer draw items from the world. It can not be set filtration, too.

