---
navigation:
  title: "基本矿石"
  icon: "anvilcraft:earth_core_shard_ore"
  position: 1006
  parent: anvilcraft_guideme:basic_gameplay_index.md
item_ids:
  - anvilcraft:void_matter_block
---

# 基本矿石
#### 不同于大多数mod，正常情况下本模组的矿石不会自然生成，只能通过矿物涌泉得到。  

## 物品过筛

### 为了在前期获得本模组的金属，你需要使用类似于“无中生有”的方式—— **物品过筛**。  

##### **铅粒**、**锡粒**、**锌粒**和**银粒**都可通过过筛**火山灰**概率获得。

<Row>
  <ItemImage id="anvilcraft:lead_nugget" scale="2" />
  <ItemImage id="anvilcraft:tin_nugget" scale="2" />
  <ItemImage id="anvilcraft:zinc_nugget" scale="2" />
  <ItemImage id="anvilcraft:silver_nugget" scale="2" />
  <ItemImage id="anvilcraft:tungsten_nugget" scale="2" />
</Row>

##### **钨粒** 通过筛选 **下界尘** 概率获得。

<ItemImage id="anvilcraft:tungsten_nugget" scale="2" />

##### **钛粒** 通过筛选**末地尘** 概率获得。
<ItemImage id="anvilcraft:titanium_nugget" scale="2" />

---

## 矿物涌泉
在获得一定量的金属后，你可以通过 **时移** 将金属块转化为粗矿，  
并用粗矿块配合 **矿脉涌泉** 再生矿物。  
这要求你现阶段有能力制造 **腐化信标** 和 **冲击桩**  

### 矿物涌泉产矿

<GameScene interactive={true} zoom={2}>
  <ImportStructure src="../ac_assets/sturcture/mineral_fountain.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

*这种结构下的 **矿物涌泉** 可以生成矿石*  

**矿物涌泉** 每秒检测四个面相邻方块，如果它们都是某一种粗矿块，则将 **深板岩** 转化为对应的深层矿。  
在主世界生成时，有1%概率生成 **地核碎片矿石**，有1%概率生成 **虚空石** 。  
在下界生成时，有20%概率生成 **地核碎片矿石** 。  
在末地生成时，有20%概率生成 **虚空石** 。  

<Color id="red">注意</Color>：宝石不能以这种方式再生，仅接受粗矿块。  
<Color id="red">注意</Color>：矿物涌泉仅在y=-54及以下位置工作  

**地核碎片矿石** 只能通过 **矿物涌泉产矿** 伴生
受到 **时运** 与 **精准采集** 影响
需要钻石镐及以上等级镐挖掘
挖掘获得 **地核碎片**

<ItemImage id="anvilcraft:earth_core_shard_ore" scale="2" />

**地核碎片** 及其块状物、矿石防火，不受 **熔岩** 和 **火焰** 损害  
可参与[余烬金属锭]的制作  

<ItemImage id="anvilcraft:earth_core_shard" scale="2" />

**虚空石** 只能通过 **矿物涌泉产矿** 伴生  
受到 **时运** 与 **精准采集** 影响  
需要钻石镐及以上等级镐挖掘  
挖掘获得 **虚空物质**  
**虚空物质** 及其块状物、矿石防虚空，在 **虚空** 中会上升  

<Row>
  <ItemImage id="anvilcraft:void_matter" scale="2" />
  <ItemImage id="anvilcraft:void_matter_block" scale="2" />
  <ItemImage id="anvilcraft:void_stone" scale="2" />
  <Recipe id="anvilcraft:void_matter_block" />
</Row>

**虚空物质块** 防虚空  
可用于制作[虚空能收集器]  
自身具有 **虚空衰变** 的特性  

<a name="void_decay"></a>
## 虚空衰变

*虚空物质块*周围6个面有至少5个面接触到*虚空物质块*时可以发生*虚空衰变*：接收到*随机刻*时，自身随机转化为以下方块：
石头、深板岩、安山岩、花岗岩、闪长岩、下界岩、黑石、末地石、冰、粗铁块、氧化的铜块、铁矿石、深层铁矿石、铜矿石、深层铜矿石、金矿石、深层金矿石、虚空石、末地尘、[诅咒金块](../smithing_system/smithing_tier_1_materials.md#cursed_gold_block)、深层锡矿石、深层锌矿石、深层铅矿石、深层铀矿石

人工挖掘矿物并替换深板岩低效且劳累
使用*激光采矿系统*可以自动采集。

## 激光采矿系统

<GameScene interactive={true} zoom={2}>
  <ImportStructure src="../ac_assets/sturcture/laser_miner.snbt" />
  <IsometricCamera yaw="195" pitch="30" />
</GameScene>

这种结构可以自动提取粗矿并存放至上方容器内,更多结构可以参考*5.5激光采矿机*

*棱镜*和*矿石*的高度差不能超过128
提取到的物品会从*棱镜*上方弹出，或存入*棱镜*上方相邻的*容器*
提取效率=*激光等级*/4(向下取整),*提取效率*与*提取时间*的关系如下：
效率=1：24s/次
效率=2：6s/次
效率=3：2s/次
效率=4：1s/次

