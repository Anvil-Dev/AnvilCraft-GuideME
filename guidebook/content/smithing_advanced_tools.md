---
navigation:
  title: "Advanced Tools"
  icon: "anvilcraft:jewelcrafting_table"
  position: 3005
  parent: anvilcraft:smithing_system.md
item_ids:
  - anvilcraft:dragon_rod
  - anvilcraft:royal_dragon_rod
  - anvilcraft:ember_dragon_rod
  - anvilcraft:heavy_halberd_core
  - anvilcraft:resonator_core
---

# Advanced Tools

This page shows all available *Advanced Tools*.

<ItemImage id="tag:anvilcraft:tools/dragon_rod" />

*Dragon Rod* is basically simplified "Put down *Block Devourer*→Punch it with *Anvil Hammer*→Take the devourer back" to a tool.



<Recipe id="anvilcraft:dragon_rod" />

<Recipe id="anvilcraft:royal_dragon_rod" />

The three dragon rods are the same, only except the durability.
They can also upgrade by smithing.

<Recipe id="anvilcraft:ember_dragon_rod" />

**TODO:** Unsupported Patchouli page type **patchouli:smithing**

```
{"type":"patchouli:smithing","recipe":"anvilcraft:smithing/royal_dragon_rod","recipe2":"anvilcraft:smithing/ember_dragon_rod"}
```

The ability of dragon rods is very simple. Left click to devour blocks in the range, and right click to change the range size. There are four range sizes: 3x3, 5x5, 7x7, and 9x9. When targeting a block while holding dragon rods, the range box will display. The 3x3 size will not damage the dragon rods, but 5x5 will damage 1, 7x7 will damage 2, and 9x9 will damage 4. The dragon rod will not be fully broken; instead, it will lose all its abilities, similar to *Elytra*.

The devouring of dragon rods is similar to the Block Devourer. When devouring the base blocks of worlds (like *Stone*, *Netherrack*, *End Stone*), there is a 5% chance to drop. But it cannot chain devour the fallible blocks. 
There will be a cooldown after mining; the default is 1 second. The length of the cooldown is only affected by *Haste* and *Mining Fatigue* effects. Haste will reduce 4 ticks, and Mining Fatigue will increase 1 second.

<ItemImage id="tag:anvilcraft:tools/heavy_halberd" />

*Heavy Halberd* fused the attacking abilities from Sword, Axe, Mace and Trident. It's a powerful weapon.

*Heavy Halberd Core* is the core ingredient of crafting Heavy Halberd.

<Recipe id="anvilcraft:heavy_halberd_core" />

**TODO:** Unsupported Patchouli page type **anvilcraft:multiple_to_one_smithing**

```
{"type":"anvilcraft:multiple_to_one_smithing","recipe":"anvilcraft:four_to_one_smithing/frost_metal_heavy_halberd","recipe2":"anvilcraft:four_to_one_smithing/ember_metal_heavy_halberd"}
```

Heavy Halberd can be used with any one of the four weapons consumed while crafting. It can compat with all enchantments for Sword, Mace, and Trident. Its attack damage is the same as Axe's, its attack speed is the same as Sword's, and it can mine all they can. Falling from a height can trigger the smash. It can also be thrown when holding right click like Tridents, but the damage will be calculated by the speed, similar to Arrows. When it has the Royalty enchantment and it touches the void, it will come back to the player.

Heavy Halberd will not be fully broken too; similar to Dragon Rods, it will lose all bonuses, abilities, attack damage will become 0, most enchantments will lose efficacy, and the [Merciless](advanced_tool_properties.md#merciless) only in Frost Heavy Halberd will also lose efficacy.

<ItemImage id="tag:anvilcraft:tools/resonator" />

*Resonator* fused the mining abilities from Axe, Pickaxe, Shovel and Hoe. It's a powerful tool.

*Resonator Core* is the core ingredient of crafting Resonator.

<Recipe id="anvilcraft:resonator_core" />

**TODO:** Unsupported Patchouli page type **anvilcraft:multiple_to_one_smithing**

```
{"type":"anvilcraft:multiple_to_one_smithing","recipe":"anvilcraft:four_to_one_smithing/frost_metal_resonator","recipe2":"anvilcraft:four_to_one_smithing/ember_metal_resonator"}
```

Resonators have five modes: Auto and four tool modes. Different modes have different models. You can mine any minable blocks in Auto mode, but you don't have any special abilities when right-clicking. In tool-specific modes, you can only mine what the tool can, but you can also get their special abilities when right-clicking. For example, Axe mode can strip logs, remove one layer of oxidization or wax.

Hold [<KeyBind id="key.anvilcraft.switch_resonate_mode" />] while holding resonators to open a wheel; it contains five modes of resonators. You can switch the resonator's mode by scrolling the mouse or dragging the cursor to a mode.

Resonator will not be fully broken too; similar to Dragon Rods, it will lose all bonuses, abilities, attack damage will become 0, most enchantments will lose efficacy, and the [Merciless](advanced_tool_properties.mderciless) only in Frost Resonator will also lose efficacy.

