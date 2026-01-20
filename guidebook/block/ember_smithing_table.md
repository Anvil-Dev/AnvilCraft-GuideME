---
navigation:
  title: "§6余烬锻造台"
  icon: "anvilcraft:ember_smithing_table"
  position: 221
  parent: anvilcraft_guideme:block.md
item_ids:
  - anvilcraft:ember_smithing_table
  - anvilcraft:two_to_one_smithing_template
  - anvilcraft:four_to_one_smithing_template
  - anvilcraft:eight_to_one_smithing_template
---

# 余烬锻造台

<Row>
<ItemImage id="anvilcraft:ember_smithing_table" scale="3"></ItemImage>
<ItemImage id="anvilcraft:two_to_one_smithing_template" scale="3"></ItemImage>
<ItemImage id="anvilcraft:four_to_one_smithing_template" scale="3"></ItemImage>
<ItemImage id="anvilcraft:eight_to_one_smithing_template" scale="3"></ItemImage>
</Row>

# 余烬锻造台

<Recipe id="anvilcraft:smithing/ember_smithing_table"></Recipe>

- 不消耗任何锻造模板的特殊锻造台
- 只能用于多合一配方
- 通常需要配合<ItemLink id="anvilcraft:four_to_one_smithing_template" />等多合一模板使用


# 多合一锻造模板

- 使用对应数量的任意不同锻造模板，在<ItemLink id="anvilcraft:stamping_platform" />砸合而成

> 包括升级装备用的锻造模板和盔甲纹饰的锻造模板皆可，多合一锻造模板也算一种锻造模板
>
> eg:下界合金锻造模板+皇家钢锻造模板→二合一锻造模板
>
> eg:猪鼻锻造模板+肋骨锻造模板+余烬锻造模板+二合一锻造模板→四合一锻造模板


# 模板解离

1. 将有附魔的<ItemLink id="anvilcraft:eight_to_one_smithing_template" />物品实体用任意方式摧毁
2. 随机取一条附魔(选择有可能重复)，按如下列表生成新物品
3. 最多选择4次(即最多通过这种方式产生4个新模板)

|                                                                                                                                                                               模板                                                                                                                                                                                |         对应附魔          |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:---------------------:|
|                                                                                                      <ItemLink id="minecraft:snout_armor_trim_smithing_template" /> <ItemImage id="minecraft:snout_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                       |         灵魂疾行          |
|                                                                                                        <ItemLink id="minecraft:rib_armor_trim_smithing_template" /> <ItemImage id="minecraft:rib_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                         |     火焰保护、火焰附加、火矢      |
|                                                                                                       <ItemLink id="minecraft:dune_armor_trim_smithing_template" /> <ItemImage id="minecraft:dune_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                        |         爆炸保护          |
|                                                                                                    <ItemLink id="minecraft:silence_armor_trim_smithing_template" /> <ItemImage id="minecraft:silence_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                     |         迅捷潜行          |
|                                                                                                       <ItemLink id="minecraft:ward_armor_trim_smithing_template" /> <ItemImage id="minecraft:ward_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                        |          保护           |
|                                                                                                        <ItemLink id="minecraft:vex_armor_trim_smithing_template" /> <ItemImage id="minecraft:vex_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                         |         经验修补          |
|                                                                                                     <ItemLink id="minecraft:sentry_armor_trim_smithing_template" /> <ItemImage id="minecraft:sentry_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                      |          无限           |
|                                                                                                       <ItemLink id="minecraft:bolt_armor_trim_smithing_template" /> <ItemImage id="minecraft:bolt_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                        |         致密、破甲         |
|                                                                                                       <ItemLink id="minecraft:flow_armor_trim_smithing_template" /> <ItemImage id="minecraft:flow_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                        |          风暴           |
|                                                                                                       <ItemLink id="minecraft:wild_armor_trim_smithing_template" /> <ItemImage id="minecraft:wild_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                        |         弹射物保护         |
|                                                                                                      <ItemLink id="minecraft:spire_armor_trim_smithing_template" /> <ItemImage id="minecraft:spire_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                       |          时运           |
|                                                                                                        <ItemLink id="minecraft:eye_armor_trim_smithing_template" /> <ItemImage id="minecraft:eye_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                         |          抢夺           |
|                                                                                                      <ItemLink id="minecraft:coast_armor_trim_smithing_template" /> <ItemImage id="minecraft:coast_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                       |        海之眷顾、饵钓        |
|                                                                                                       <ItemLink id="minecraft:tide_armor_trim_smithing_template" /> <ItemImage id="minecraft:tide_armor_trim_smithing_template" scale="0.6"></ItemImage>                                                                                                        | 深海探索者、水下呼吸、水下速掘、穿刺、激流 |
| <ItemImage id="minecraft:host_armor_trim_smithing_template" scale="0.6"></ItemImage>  <ItemImage id="minecraft:wayfinder_armor_trim_smithing_template" scale="0.6"></ItemImage>  <ItemImage id="minecraft:raiser_armor_trim_smithing_template" scale="0.6"></ItemImage>  <ItemImage id="minecraft:shaper_armor_trim_smithing_template" scale="0.6"></ItemImage> |         其他附魔          |

> 如果选择了4次，且4次的结果（指生成的新模板）都不同，则额外生成一个超限<ItemLink id="anvilcraft:transcendium_upgrade_smithing_template" />
