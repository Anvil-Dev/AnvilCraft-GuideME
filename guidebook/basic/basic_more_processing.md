---
navigation:
  title: "More Processing"
  icon: "minecraft:spawner"
  position: 1003
  parent: anvilcraft_guideme:basic_gameplay.md
---

# More Processing

Let *Anvil* fall on the mob's feet, on the spawner or on the redstone block causes the change. The following pages of this entry are introduced in sequence.

Get more mob loot:
When mobs are hit and damaged by an anvil, they will drop items according to the mob loot table. The mobs must be taken enough damage at once: 40% HP→1x drops; 60% HP→2x drops; 80% HP→3x drops.
This method only yields normal mob drops, and does not produce drops such as blaze rod that require the player to manually kill.
There are mobs that can regenerate health on their own or with the help of external forces, which you can use to create drop farms that don't kill mobs.

## Spawner: Forced Spawn

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:spawner" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:spawner" />
</GameScene>

Spawners that are hit will attempt to spawn. Detailed instructions on the right.

The higher the drop height of the anvil, the greater the chance of spawning. This method of farming does not require players to be around, but it needs to meet the lighting conditions of the spawner and the number of mobs around it will also affect the spawning, and quickly transporting or killing nearby mobs can greatly improve efficiency.

## Redstone Block: Redstone EMP

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="1" id="minecraft:anvil" />
  <Block x="0" y="1" z="1" id="minecraft:anvil" />
  <Block x="0" y="2" z="1" id="minecraft:redstone_block" />
  <Block x="1" y="2" z="1" id="anvilcraft:arrow" />
  <Block x="2" y="2" z="1" id="minecraft:redstone_block" />
</GameScene>

A hit Redstone Block will produce redstone EMP. Detailed instructions on the right.

When an anvil hits a redstone block, the redstone block torches within a distance of r on the same layer as the redstone block will be extinguished by 1gt. An iron trapdoor clinging to redstone block can prevent EMP from spreading in this direction.
R is calculated: the distance is proportional to the drop height, the drop height of 1 block spreads 6 blocks, and the limit distance is 24 blocks.

