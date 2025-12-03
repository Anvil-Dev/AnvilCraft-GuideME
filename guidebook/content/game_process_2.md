---
navigation:
  title: "Process 2-Get Magnets"
  icon: "anvilcraft:magnet_ingot"
  position: 2
  parent: anvilcraft:process.md
item_ids:
  - anvilcraft:ferrite_core_magnet_block
  - anvilcraft:hollow_magnet_block
  - anvilcraft:magnet_block
---

# Process 2-Get Magnets

The *Magnet Block* will help you simply lift the anvil up and down it. There are three types of magnet blocks, which have basically the same function, and can invert into each other. How to get the first batch of magnet blocks: *Iron block* is converted into a hollow magnet block by lightning strike. You can change the impact range of lightning in config profile. The default is 3 x 3 blocks horizontally and 2 blocks high.

## Lightning Convert Magnets

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="1" id="minecraft:lightning_rod" />
  <Block x="0" y="1" z="0" id="minecraft:iron_block" />
  <Block x="1" y="1" z="0" id="minecraft:iron_block" />
  <Block x="2" y="1" z="0" id="minecraft:iron_block" />
  <Block x="0" y="1" z="1" id="minecraft:iron_block" />
  <Block x="1" y="1" z="1" id="minecraft:iron_block" />
  <Block x="2" y="1" z="1" id="minecraft:iron_block" />
  <Block x="0" y="1" z="2" id="minecraft:iron_block" />
  <Block x="1" y="1" z="2" id="minecraft:iron_block" />
  <Block x="2" y="1" z="2" id="minecraft:iron_block" />
  <Block x="0" y="2" z="0" id="minecraft:iron_block" />
  <Block x="1" y="2" z="0" id="minecraft:iron_block" />
  <Block x="2" y="2" z="0" id="minecraft:iron_block" />
  <Block x="0" y="2" z="1" id="minecraft:iron_block" />
  <Block x="1" y="2" z="1" id="minecraft:iron_block" />
  <Block x="2" y="2" z="1" id="minecraft:iron_block" />
  <Block x="0" y="2" z="2" id="minecraft:iron_block" />
  <Block x="1" y="2" z="2" id="minecraft:iron_block" />
  <Block x="2" y="2" z="2" id="minecraft:iron_block" />
</GameScene>

Default lightning conversion magnet block range. After a lightning strike, the iron blocks in the picture will be converted into hollow magnet blocks.

## Artificial Channeling

<ItemImage id="anvilcraft:topaz" />
<ItemImage id="minecraft:lightning_rod" />

If you can't wait for a thunderstorm, right-clicking a lightning rod with *Topaz* will consume it to summon a lightning bolt. Topaz can be obtained from *Geode*. If you don't have enough geodes at this point, you can dig up more budding amethyst or trade with *Jeweler* villagers. If a thunderstorm has arrived, you can skip this page.

## Smash Geode

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="minecraft:anvil" />
  <Block x="0" y="2" z="0" id="anvilcraft:stamping_platform" />
</GameScene>

Place the geode on the *Stamping Platform*, and the anvil will smash the geode when it falls. There is a chance to obtain topaz.



<Recipe id="anvilcraft:craft/magnet_ingot_8" />

<Recipe id="anvilcraft:ferrite_core_magnet_block" />

The *Hollow Magnet Block* obtained by lightning strike can be decomposed into 8 *Magnet Ingots*. Magnet ingots can be combined with iron ingots to form *Ferrite Core Magnet Block*. The ferrite core magnet block will gradually transform into *Magnet Block* when placed in the world. And the magnet block can be decomposed into 9 magnet ingots. This is a method of magnet regeneration.

<Recipe id="anvilcraft:craft/magnet_ingot_9" />

<ItemImage id="anvilcraft:hollow_magnet_block" />

**Manually** throw the iron ingots into the hole of the hollow magnet block **One by One**, and the iron ingots are likely to be converted into magnet ingots, which is another method of magnet regeneration. Other magnet blocks can also be crafted.



<Recipe id="anvilcraft:hollow_magnet_block" />

<Recipe id="anvilcraft:magnet_block" />

