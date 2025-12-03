---
navigation:
  title: "Basic Item Processing"
  icon: "minecraft:iron_ingot"
  position: 1002
  parent: anvilcraft:basic_gameplay.md
item_ids:
  - anvilcraft:stamping_platform
---

# Basic Item Processing

Let *Anvil* fall on the specific blocks to process the items inside or on. Different specific blocks have different processing. The flowing pages of this entry will introduce relevant content in sequence. This mod adds a block that prevents hit items from flying around due to hitbox squeezing: *Stamping Platform*.

The iron pressure plate can be replaced with an iron plate from any mod.

<Recipe id="anvilcraft:stamping_platform" />

## Item Stamping

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="anvilcraft:stamping_platform" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="anvilcraft:stamping_platform" />
</GameScene>

When the stamping platform is below, the item stamping is performed, and both materials and products are on the stamping platform. Detailed instructions on the right.

Items can be stamped into slices, such as Iron Ingot→Iron Pressure Plate; Gold Ingot→Gold Pressure Plate; Snowball→Snow; Cherry Leaves→Pink Petals.
It is also possible to separate the different components of some items, such as Sugar Cane→Paper+Sugar; Wheat→Wheat Flour+Wheat Seeds; Log→Wood Fiber+Resin.
Some equipment can also be recycled. Chains, gold, iron and diamond tools, weapons and armors can be broken down into much more materials than they are smelted.

## Item Compression

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:cauldron" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:cauldron" />
</GameScene>

When the cauldron is below, the item compression is performed, and both materials and products are in the cauldron. Detailed instructions on the right.

If the item as a 2 x 2 or 3 x 3 crafting recipe, it will be executed, e.g. 9 Iron Nuggets→1 Iron Ingot; 9 Iron Ingots→1 Iron Block; 4 Strings→1 White Wool. If an item can be crafted both 2 x 2 and 3 x 3, 3 x 3 crafting will be performed.
In addition to the vanilla recipes: 3 Bones→1 Bone block.

## Item Decomposition

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:iron_trapdoor"p:half="top" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:iron_trapdoor"p:half="top" />
</GameScene>

When the iron trapdoor is below, the item decomposition is performed. The materials are on the iron trapdoor and products are under theiron trapdoor. Detailed instructions on the right.

If the item has a 1→n crafting recipe, it will be executed, e.g. 1 Iron Ingot→9 Iron Nuggets.
In addition, the vanilla decomposition by breaking blocks can also be performed here, and the amount is the largest. For example, 1 Melon→9 Melon Slices; 1 Snow Block→4 Snowballs; 1 Glowstone→ 4 Glowstone Dust, Clay→4 Clay Balls.
Some building blocks that vanilla cannot disassemble can also be broken down in this way. For example, 1 Quartz Block→4 Quartzs; 1 Amethyst Block→4 Amethyst Sharts; 1 Dripstone Block→4 Pointed Dripstone; 1 Honeycomb Block→4 Honeycomb; 1 Prismarine→4 Prismarine Shards; 1 Prismarine Bricks→9 Prismarine Shards.

## Items Sifting

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:scaffolding" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:scaffolding" />
</GameScene>

When the scaffolding is below, the items sifting is performed. The materials are on the scaffolding and products are under the scaffolding. Detailed instructions on the right.

About half of the additional material is produced through sifting, which can be recycled. The conversion table is as follows (probability of existence):
Gravel→Flint+Iron Nugget
Sand→Clay+Gold Nugget
Red Sand→Glowstone Dust+Copper Nugget
Cinerite→Lapis Lazuli+Zinc Nugget
Quartz Sand→Quartz+Tin Nugget
Deepslate Chips→Lime Powder+Lead Nugget
Nether Dust→Redstone Dust+Tungsten Nugget
Black Sand→Gunpowder+Silver Nugget
End Dust→Chorus Flowers+Titanium Nugget
Soul Sand→Nether Wart
Leaves→Corresponding Sapling

## Item Bulging

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:water_cauldron"p:level="2" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:water_cauldron"p:level="3" />
</GameScene>

When the water cauldron is below, the item bulging is performed, and both materials and products are in the cauldron. Detailed instructions on the right.

Dirt→Clay
Crimson Fungus→Nether Wart Block
Warped Fungus→Warped Wart Block
Spider Eye→ Fermented Spider Eye
Coral→Corresponding Coral Block.

## Cooking

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:cauldron" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:cauldron" />
  <Block x="0" y="3" z="1" id="minecraft:campfire" />
  <Block x="2" y="3" z="1" id="minecraft:campfire" />
</GameScene>

When the cauldron and the campfire is below, the cooking is performed, and both materials and products are in the cauldron.  A few recipes require water and consume a layer of water. Detailed instructions on the right.

Auto-compatible with all smoker recipes and campfire recipes, no water required.
In the presence of water, the following transformations can occur: Resin→Slime Ball.

