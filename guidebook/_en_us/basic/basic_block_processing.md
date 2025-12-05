---
navigation:
  title: "Basic Block Processing"
  icon: "minecraft:stone"
  position: 1001
  parent: anvilcraft_guideme:basic_gameplay_index.md
---

# Basic Block Processing

Let *anvil* fall on the block to process the block. A single block, multiple blocks, a block and a cauldron, a block and a stonecutter will all trigger different effects. The flowing pages of this entry will introduce relevant content in sequence. 
Before that, understanding how magnets help anvil machining will make it easier for you to get started.

## Magnets Control Anvils

<GameScene interactive={true} zoom={2}>
    <ImportStructure src="../ac_assets/sturcture/smash_geode.snbt"></ImportStructure>

</GameScene>

The magnet is demagnetized when activated by a redstone signal, and the anvil is dropped to perform the operation.

## Crush

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:sand" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:gravel" />
</GameScene>

The list on the right gives more examples of where such transformation can occur, some of which can occur consecutively.

*Cobblestone* → *Gravel* → *Sand*;
*Polished Granite* → *Granite* → *Red Sand*;
*Polished Andesite* → *Andesite* → *Cinerite*;
*Polished Diorite* → *Diorite* → *Quartz Sand*;
*Blocks with cracked variants* → *Their cracked variants*;
*Netherrack* → *Nether Dust*;
*End Stone* → *End Dust*;
*Soul Soil* → *Soul Sand*;
*Deepslate* → *Deepslate Chips*;
*Blackstone* → *Black Sand*

## Press

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:anvil" />
  <Block x="2" y="2" z="1" id="minecraft:moss_block" />
  <Block x="0" y="3" z="1" id="minecraft:grass_block" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:dirt" />
</GameScene>

The list on the right gives more examples of where such transformation can occur.

*Moss Block* + *Dirt* → *Grass Block*;
*Any Leaves* + *Dirt* → *Podzol*;
*Any Mushroom Block* + *Dirt* → *Mycelium*;
*Nether Wart Block* + *Netherrack* → *Crimson Nylium*;
*Warped Wart Block* + *Netherrack* → *Warped Nylium*;
*Stone* + *Stone* → *Deepslate*;
*Ice* + *Ice* → *Packed Ice*;
*Packed Ice* + *Packed Ice* → *Blue Ice*;
*Basalt* + *Basalt* → *Blackstone*

## Daub

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:moss_block" />
  <Block x="2" y="2" z="1" id="minecraft:moss_block" />
  <Block x="0" y="3" z="1" id="minecraft:mossy_cobblestone" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:cobblestone" />
</GameScene>

Unlike pressing, the block above will not be consumed. The list on the right gives more examples of where such transformation can occur.

*Moss Block* + *Cobblestone* → *Mossy Stone*;
*Moss Block* + *Stone Bricks* → *Moss Stone Bricks*;
*Honeycomb Block* + *Any Copper Block* → *Their Waxed variants*

## Squeeze

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:sponge" />
  <Block x="2" y="2" z="1" id="minecraft:wet_sponge" />
  <Block x="0" y="3" z="1" id="minecraft:water_cauldron"p:level="1" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:cauldron" />
</GameScene>

A single layer of liquid will appear in the cauldron. The list on the right gives more examples of where such transformation can occur, some of which can occur consecutively.

*Wet Sponge* → *Sponge* + *Water*;
*Moss blocks* → *Moss Carpet* + *Water*;
*Magma Block* → *Netherrack* + *Lava*;
*Snow Block* → *Ice* + *Powder Snow*;
*Full Bee Nest* → *Empty Bee Nest* + *Honey*(Specially, when there are three layers of *Honey* below, if you continue to squeeze the *Full Bee Nest*, it will be crushed into a *Honey Block*. The above *Bee Nest* can be replaced with *Beehive*)

## break

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="2" y="2" z="1" id="minecraft:cobblestone" />
  <Block x="0" y="3" z="1" id="minecraft:stonecutter" />
  <Block x="1" y="3" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="3" z="1" id="minecraft:stonecutter" />
</GameScene>

Block becomes dropped item. Detailed instructions on the right.

When use normal *Anvil* to trigger this, the block destruction will follows the drop table of TNT destruction, i.e. it has no *Fortune* or *Silk Touch* enchantment. Use *Royal Anvil* will contain fortune affection, and *Ember Anvil* will contain silk touch affection. If the block can not be break by normal TNT explosion, such as obsidian, it can still be broken, but the anvil will be damaged by one durability level. In order to prevent the anvil from falling on the stonecutter and becoming the drop after the block is broken, you need to control the timing of the redstone circuit.

