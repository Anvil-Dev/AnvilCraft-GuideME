---
navigation:
  title: "Process 3-Anvil Processing"
  icon: "minecraft:anvil"
  position: 3
  parent: anvilcraft_guideme:base_gameplay_index.md
---

# Process 3-Anvil Processing

The *Anvil* can be processed by landing on the block to be processed. When the anvil falls on the block such as *Stamping Platform*, *Cauldron*, *Iron Trapdoor*, *Scaffolding*, etc., it will process items in or on it. Use the *Magnet Block* to help you with semi-automatic: The magnet block automatically picks up an anvil within five blocks below, and the magnet block is activated by redstone and loses its magnetism, causing the anvil to fall. If you don't have a magnet block, you can also manually remove the anvil and place it, or design a redstone machine.

## Magnets Control Anvils

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="1" id="anvilcraft:magnet_block"p:lit="true" />
  <Block x="2" y="0" z="1" id="anvilcraft:magnet_block" />
  <Block x="0" y="0" z="2" id="minecraft:lever"p:facing="east" p:powered="true" />
  <Block x="2" y="0" z="2" id="minecraft:lever"p:facing="east" p:powered="false" />
  <Block x="2" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:anvil" />
  <Block x="0" y="3" z="1" id="minecraft:gravel" />
  <Block x="2" y="3" z="1" id="minecraft:cobblestone" />
</GameScene>

The magnet is demagnetized by the redstone signal. The anvil is dropped to perform actions.

*Anvil* costs too much? This mod adds recipes for vanilla *Chipped Anvil* and *Damaged Anvil*. Don't worry, the height of one block will not cause the anvil to be damaged.



<Recipe id="anvilcraft:chipped_anvil" />

<Recipe id="anvilcraft:damaged_anvil" />

## Simple Anvil Workstation

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="1" y="0" z="0" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="0" y="1" z="0" id="minecraft:observer"p:facing="down" />
  <Block x="1" y="1" z="0" id="minecraft:smooth_stone" />
  <Block x="2" y="1" z="0" id="anvilcraft:magnet_block" />
  <Block x="0" y="2" z="0" id="minecraft:observer"p:facing="south" />
  <Block x="1" y="2" z="0" id="minecraft:observer"p:facing="down" />
  <Block x="2" y="2" z="0" id="minecraft:anvil" />
  <Block x="1" y="3" z="0" id="minecraft:note_block" />
  <Block x="2" y="4" z="0" id="anvilcraft:stamping_platform" />
</GameScene>

No more looking up to click a lever or button. Hitting the note block causes the anvil to drop once.

## Related Chapters

- [TODO](basic_block_processing.md)
- [TODO](basic_item_processing.md)

In the picture on the left, the stamping platform can be replaced with other blocks. Block such as campfire can also be added below. For detailed processing categories, see the relevant chapters on anvil processing.

