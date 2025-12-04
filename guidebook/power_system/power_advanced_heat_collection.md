---
navigation:
  title: "Advanced Power Generation - Heat Collection"
  icon: "anvilcraft:heat_collector"
  position: 2005
  parent: anvilcraft_guideme:power_system_index.md
item_ids:
  - anvilcraft:heat_collector
---

# Advanced Power Generation - Heat Collection

Use heat collector to collect heat power from *heat-collectable blocks*. Heat-collectable block is heated blocks and some special blocks. For example, *Uranium Block*、*Plutonium Block*.

*Heat Collector* is the core component of the power generation facility, with a power upper limit of 4096KW. The scope of work is 5x5x5 centered on itself. The heat-collectable blocks in scope decided the power generation of the heat collector. Different heat-collectable block can produce different count of heat power. The cycle is 1 seconds by default.

<Recipe id="anvilcraft:heat_collector" />

Some heat-collectable block will cooldown and change itself after heat-collecting. Here are these blocks: 
- *Magma Block*->*Netherrack*
- *Lit Campfire*->*Unlit Campfire*
- *Lava (Cauldron)*->*Obsidian (Cauldron)*
Some heat-collectable blocks will not change after heat-collecting. Here are these blocks: 
- *Any Heated Block* (Will cooldown by itself. Not affected by the collector.)
- *Any Uranium Block*
- *Ember Metal Block*
- *Any Plutonium Block*

## Heatable Block

*Heatable Block* is a collective term for a series of blocks. Every type of blocks has 5 tiers normally, they are *Normal*、*Heated*、*Redhot*、*Glowing* and *Incandescent*. For now, there are only *Netherite* and *Tungsten* series support heating. Heatable blocks have a duration. When the duration becomes 0, the heat tier will -1. After that, if the block is still heated, set the duration to 10 seconds. Mining the block will not keep the duration and let heat tier -1. If the tool has *Silk Touch* or uses Auto Smelting to collect, the heat tier will be maintained.

<ItemImage id="anvilcraft:heater" />

*Heater* can be used to heat heatable blocks. It can heat block on top to Heated Tier and add 1 second every seconds. If the Heat Tier of the block on top is higher than Heated Tier, then do nothing.

<ItemImage id="anvilcraft:mineral_fountain" />

When the corners of *Mineral Fountain* is full of lava, it can be used to heat heatable blocks. It can heat block on top to Redhot Tier and add 1 second every seconds. If the Heat Tier of the block on top is higher than Redhot Tier, then do nothing.

<ItemImage id="anvilcraft:heliostats" />

When *Heliostats* irradiates to heatable blocks can heat it. When block has been irradiated by heliostats, determine Heat Tier based on the number of heliostats. The curve of association of count and Heat Tier is 4, 12, 32, 80. If the Heat Tier of the block is lower or equal than provided Heat Tier, raise the Tier to the provided Tier and add 4 seconds to duration every seconds. If the Heat Tier of the block is higher than the provided Tier, then do nothing.

## Laser

<ItemImage id="anvilcraft:ruby_laser" />
<ItemImage id="anvilcraft:ruby_prism" />

When *Laser* irradiates to heatable blocks can heat it. When block has been irradiated by laser, determine Heat Tier based on the level of laser. See the curve of association of laser level and Heat Tier on the next page. If the Heat Tier of the block is lower than provided Heat Tier, raise the Tier to the provided Tier and add 4 seconds to duration every seconds. If the Heat Tier of the block is higher than the provided Tier, then do nothing.

Level 1: to Heated Tier and add 1 seconds to duration.
Level 2: to Heated Tier and add 3 seconds to duration.
Level 3-4: to Redhot Tier and add 1 seconds to duration.
Level 5-8: to Redhot Tier and add 3 seconds to duration.
Level 9-16: to Glowing Tier and add 1 seconds to duration.
Level 17-32: to Glowing Tier and add 3 seconds to duration.
Level 33-64: to Incandescent Tier and add 1 seconds to duration.
Level 65+: to Incandescent Tier and add 3 seconds to duration.

## Plasma Jets

When the bottom of *Fire Cauldron* is working *Heater* and width 1x1 height 8 above is air, create a *Plasma Jets*. If the horizontal sides of this block all have a block (as tube wall,) raise itself 1 block. The highest raising is four times.

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="0" id="anvilcraft:magnet_block" />
  <Block x="0" y="0" z="1" id="anvilcraft:incandescent_tungsten_block" />
  <Block x="2" y="0" z="1" id="anvilcraft:incandescent_netherite_block" />
  <Block x="1" y="0" z="2" id="anvilcraft:magnet_block" />
  <Block x="1" y="1" z="0" id="minecraft:stone" />
  <Block x="0" y="1" z="1" id="minecraft:stone" />
  <Block x="2" y="1" z="1" id="minecraft:stone" />
  <Block x="1" y="1" z="2" id="anvilcraft:glowing_tungsten_block" />
  <Block x="1" y="2" z="0" id="anvilcraft:incandescent_netherite_block" />
  <Block x="0" y="2" z="1" id="anvilcraft:magnet_block" />
  <Block x="2" y="2" z="1" id="anvilcraft:magnet_block" />
  <Block x="1" y="2" z="2" id="anvilcraft:incandescent_tungsten_block" />
  <Block x="1" y="3" z="0" id="anvilcraft:glowing_tungsten_block" />
  <Block x="0" y="3" z="1" id="minecraft:stone" />
  <Block x="2" y="3" z="1" id="anvilcraft:glowing_netherite_block" />
  <Block x="1" y="3" z="2" id="minecraft:stone" />
  <Block x="1" y="4" z="1" id="anvilcraft:fire_cauldron"p:level="4" />
  <Block x="1" y="5" z="1" id="anvilcraft:heater" />
</GameScene>

This diagram is a valid structure.

It will try these every gird tick: 
- Heat *Netherite Blocks* and *Tungsten Blocks* to Glowing Tier and add 1 seconds to duration. 
- If any layer of tube wall accord with two sides in a same axis is *Magnet Block* and two sides in another axis is *Netherite Blocks* or *Tungsten Blocks*, heat the *Netherite Blocks* or *Tungsten Blocks* in this layer to Incandescent Tier and add 1 seconds to duration. At the same time, produce 512 charges on the *Netherite Blocks* or *Tungsten Blocks*. 

Plasma Jets need to consume the oil in the fire cauldron to maintain. It will add 5 minutes to duration time every level consumed. The maximum duration time is 10 minutes. If the consuming will let duration time over than the maximum, it will be skip. The entities in the jets or in the middle of the jets and the cauldron will get fire damage as 4 times that of lava.

