---
navigation:
  title: "Vanilla Improve"
  icon: "minecraft:dispenser"
  position: 1004
  parent: anvilcraft:basic_gameplay.md
---

# Vanilla Improve

In order to make the anvil process smoother, this mod has completed some of the features that the vanilla should have.

## Completion of Cauldrons

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="1" z="0" id="anvilcraft:lava_cauldron"p:level="1" />
  <Block x="1" y="1" z="1" id="anvilcraft:lava_cauldron"p:level="2" />
  <Block x="2" y="1" z="2" id="minecraft:lava_cauldron" />
</GameScene>

Complete the missing cauldron layers in the vanilla.

## Dispensers Operate Cauldrons

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="1" z="0" id="minecraft:cauldron" />
  <Block x="1" y="1" z="0" id="minecraft:dispenser" />
  <Block x="0" y="1" z="2" id="minecraft:water_cauldron"p:level="3" />
  <Block x="1" y="1" z="2" id="minecraft:dispenser" />
</GameScene>

The dispenser uses water bottles, empty bottles, lava buckets, powder snow buckets, water buckets and empty buckets to interact with the cauldron.

Dispensers Interact with Mobs:
The dispenser can use iron ingots to repair iron golem, and can use buckets to interact with cow to receive milk.

