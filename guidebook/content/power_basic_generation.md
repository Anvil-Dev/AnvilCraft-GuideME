---
navigation:
  title: "Basic Power Generation"
  icon: "anvilcraft:charge_collector"
  position: 2002
  parent: anvilcraft:power_system.md
item_ids:
  - anvilcraft:charge_collector
  - anvilcraft:piezoelectric_crystal
---

# Basic Power Generation

Use a charge collector to collect electrical charge to generate power. Some block behaviors generate charges: an anvil hits a piezoelectric crystal, a piston pushes and pulls a magnet next to a copper block, and a copper block is struck by lightning.

The *Charge Collector* is the core component of the power generation facility, with a power upper limit of 32KW. The scope of work is 5x5x5 centered on itself. The number of charges received by the charge collector in one cycle will become its power generation in the next cycle (piece → KW). The cycle is 2 seconds by default.

<Recipe id="anvilcraft:charge_collector" />



<Recipe id="anvilcraft:piezoelectric_crystal" />

<Recipe id="anvilcraft:piezoelectric_crystal_amethyst" />

When the anvil hits the *Piezoelectric Crystal*, there are charges generated. The higher the anvil drops, the more charges it generates. Heights from 1 to 4 grids correspond to generating 1, 2, 4, and 8 charges respectively. Vertically stacked piezoelectric crystals can also increase the amount of charge generated. Each piezoelectric crystal generates half the charges of the piezoelectric crystal above it, rounded down.

When the *Magnet Block* is pushed and pulled by the piston, the copper block next to it can generate charges. That can generate 1/8 charge per move. Waxed copper blocks cannot generate the charge. Rusting of copper blocks will reduce charge generation. Charge generation in four stages: 1/8, 1/16, 1/32, 0. The number of charges is rounded down by the charge collector.

The *Lightning Rod* can generate 32 charges when struck by lightning each time.

