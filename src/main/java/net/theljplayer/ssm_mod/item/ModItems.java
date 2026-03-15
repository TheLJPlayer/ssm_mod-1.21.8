package net.theljplayer.ssm_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Unit;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.datagen.ModBlockTagProvider;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;
import net.theljplayer.ssm_mod.entity.ModEntityAttributes;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ModItems {

    //Materials
    public static final ToolMaterial STEEL_TOOL_MATERIAL = new ToolMaterial(
            ModBlockTagProvider.INCORRECT_FOR_STEEL_TOOL,
            821,
            7,
            3,
            12,
            ModItemTagProvider.STEEL_TOOL_MATERIAL
    );

    //Items

    //New Progression Stuff
    public static final Item DIAMOND_SHARD = itemRegister("diamond_shard", Item::new, new Item.Settings());
    public static final Item JADE_STONE = itemRegister("jade_stone", Item::new, new Item.Settings());
    public static final Item VEILSTONE = itemRegister("veilstone", Item::new, new Item.Settings());

    public static final Item CLOTH = itemRegister("cloth", Item::new, new Item.Settings());
    public static final Item BANDANA = itemRegister("bandana", Item::new, new Item.Settings().maxCount(1).maxDamage(218).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
            EntityAttributes.ARMOR,
            new EntityAttributeModifier(
                    Identifier.ofVanilla("armor"),
                    2f, EntityAttributeModifier.Operation.ADD_VALUE),
            AttributeModifierSlot.CHEST)
                    .add(
                            EntityAttributes.ATTACK_SPEED,
                            new EntityAttributeModifier(
                                    Identifier.ofVanilla("attack_speed"),
                                    0.5f, EntityAttributeModifier.Operation.ADD_VALUE),
                            AttributeModifierSlot.CHEST)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
                    EquipmentSlot.CHEST,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            Optional.of(EquipmentAssetKeys.register("bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item ATTUNED_BANDANA = itemRegister("attuned_bandana", Item::new, new Item.Settings().maxCount(1).maxDamage(306).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
                    EntityAttributes.ARMOR,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor"),
                            4f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.CHEST)
            .add(
                    EntityAttributes.ATTACK_SPEED,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("attack_speed"),
                            1f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.CHEST)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.CHEST,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            Optional.of(EquipmentAssetKeys.register("attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BLANK_MASK = itemRegister("blank_mask", Item::new, new Item.Settings().maxCount(1).maxDamage(408).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(10).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.HEAD,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Optional.empty(),
            Optional.of(Identifier.of("ssm_mod:overlay/mask_obscured")),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE
    )));
    public static final Item HAPPY_MASK = itemRegister("happy_mask", Item::new, new Item.Settings().maxCount(1).maxDamage(462).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(10).attributeModifiers(AttributeModifiersComponent.builder().add(
                    EntityAttributes.MAX_HEALTH,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.max_health"),
                            2f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.HEAD,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Optional.empty(),
            Optional.of(Identifier.of("ssm_mod:overlay/mask_obscured")),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE
    )));
    public static final Item ANGRY_MASK = itemRegister("angry_mask", Item::new, new Item.Settings().maxCount(1).maxDamage(408).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(10).attributeModifiers(AttributeModifiersComponent.builder().add(
                    EntityAttributes.ATTACK_DAMAGE,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.attack_damage"),
                            3f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.HEAD,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Optional.empty(),
            Optional.of(Identifier.of("ssm_mod:overlay/mask_obscured")),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE
    )));
    public static final Item RABBIT_MASK_SPEED = itemRegister("rabbit_mask_speed", Item::new, new Item.Settings().maxCount(1).maxDamage(408).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(16).attributeModifiers(AttributeModifiersComponent.builder().add(
                    EntityAttributes.MOVEMENT_SPEED,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.movement_speed"),
                            0.15f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                    AttributeModifierSlot.HEAD)
            .add(
                    EntityAttributes.MOVEMENT_EFFICIENCY,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.movement_efficiency"),
                            0.15f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                    AttributeModifierSlot.HEAD)
            .add(
                    EntityAttributes.WATER_MOVEMENT_EFFICIENCY,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.water_movement_efficiency"),
                            0.15f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                    AttributeModifierSlot.HEAD)
            .add(
                    ModEntityAttributes.AIR_JUMP,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.air_jump"),
                            1f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.HEAD,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Optional.empty(),
            Optional.of(Identifier.of("ssm_mod:overlay/mask_obscured")),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE
    )).component(DataComponentTypes.LORE, new LoreComponent(List.of(Text.literal("Speed Form")))));
    public static final Item RABBIT_MASK_DEFENCE = itemRegister("rabbit_mask_defence", Item::new, new Item.Settings().maxCount(1).maxDamage(524).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(16).attributeModifiers(AttributeModifiersComponent.builder().add(
                    EntityAttributes.ARMOR,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.armor"),
                            3f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .add(
                    ModEntityAttributes.AIR_JUMP,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.air_jump"),
                            1f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.HEAD,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Optional.empty(),
            Optional.of(Identifier.of("ssm_mod:overlay/mask_obscured")),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE
    )).component(DataComponentTypes.LORE, new LoreComponent(List.of(Text.literal("Defence Form")))));
    public static final Item ATTUNED_RABBIT_MASK = itemRegister("attuned_rabbit_mask", Item::new, new Item.Settings().maxCount(1).maxDamage(602).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE).enchantable(16).rarity(Rarity.RARE).attributeModifiers(AttributeModifiersComponent.builder().add(
                    EntityAttributes.MOVEMENT_SPEED,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.movement_speed"),
                            0.25f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                    AttributeModifierSlot.HEAD)
            .add(
                    EntityAttributes.MOVEMENT_EFFICIENCY,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.movement_efficiency"),
                            0.25f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                    AttributeModifierSlot.HEAD)
            .add(
                    EntityAttributes.WATER_MOVEMENT_EFFICIENCY,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.water_movement_efficiency"),
                            0.25f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                    AttributeModifierSlot.HEAD)
            .add(
                    EntityAttributes.ARMOR,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.armor"),
                            5f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .add(
                    ModEntityAttributes.AIR_JUMP,
                    new EntityAttributeModifier(
                            Identifier.ofVanilla("armor.air_jump"),
                            1f, EntityAttributeModifier.Operation.ADD_VALUE),
                    AttributeModifierSlot.HEAD)
            .build()).component(DataComponentTypes.EQUIPPABLE, new EquippableComponent(
            EquipmentSlot.HEAD,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Optional.empty(),
            Optional.of(Identifier.of("ssm_mod:overlay/mask_obscured")),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE
    )));

    public static final Item STEEL_INGOT = itemRegister("steel_ingot", Item::new, new Item.Settings());
    public static final Item STEEL_NUGGET = itemRegister("steel_nugget", Item::new, new Item.Settings());
    public static final Item RAW_STEEL_NUGGET = itemRegister("raw_steel_nugget", Item::new, new Item.Settings());
    public static final Item RAW_STEEL = itemRegister("raw_steel", Item::new, new Item.Settings());

    public static final Item STEEL_SWORD = itemRegister("steel_sword", Item::new,new Item.Settings().sword(STEEL_TOOL_MATERIAL,3f, -2.6f));
    public static final Item STEEL_AXE = itemRegister("steel_axe", settings -> new AxeItem(STEEL_TOOL_MATERIAL, 5f, -3.2f, settings),new Item.Settings());
    public static final Item STEEL_PICKAXE = itemRegister("steel_pickaxe", Item::new,new Item.Settings().pickaxe(STEEL_TOOL_MATERIAL,1f,-3f));
    public static final Item STEEL_SHOVEL = itemRegister("steel_shovel", settings -> new ShovelItem(STEEL_TOOL_MATERIAL, 1f, -3f, settings),new Item.Settings());
    public static final Item STEEL_HOE = itemRegister("steel_hoe", settings -> new HoeItem(STEEL_TOOL_MATERIAL, -3f, -3f, settings),new Item.Settings());

    public static final Item STEEL_HELMET = itemRegister("steel_helmet", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterial.STEEL_DURABILITY)));
    public static final Item STEEL_CHESTPLATE = itemRegister("steel_chestplate", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterial.STEEL_DURABILITY)));
    public static final Item STEEL_LEGGINGS = itemRegister("steel_leggings", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterial.STEEL_DURABILITY)));
    public static final Item STEEL_BOOTS = itemRegister("steel_boots", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterial.STEEL_DURABILITY)));

    public static final Item STEEL_BATTLE_AXE = itemRegister("steel_battle_axe", Item::new,
            new Item.Settings()
                    .axe(ModItems.STEEL_TOOL_MATERIAL, 8f, -3.4f)
                    .maxDamage(999)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
                            AttributeModifiersComponent.builder().add(
                                    EntityAttributes.MOVEMENT_SPEED,
                                    new EntityAttributeModifier(
                                            Identifier.ofVanilla("movement_speed"),
                                            -0.2f,EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                                    AttributeModifierSlot.HAND)
                                    .add(
                                            EntityAttributes.ATTACK_DAMAGE,
                                            new EntityAttributeModifier(
                                                    Identifier.ofVanilla("attack_damage"),
                                                    11f,
                                                    EntityAttributeModifier.Operation.ADD_VALUE),
                                            AttributeModifierSlot.MAINHAND)
                                    .add(
                                            EntityAttributes.ATTACK_SPEED,
                                            new EntityAttributeModifier(
                                                    Identifier.ofVanilla("attack_speed"),
                                                    -3.4f,
                                                    EntityAttributeModifier.Operation.ADD_VALUE),
                                            AttributeModifierSlot.MAINHAND)
                                    .build())
                    .component(
                            DataComponentTypes.BLOCKS_ATTACKS,
                            new BlocksAttacksComponent(
                                    0,
                                    1.0F,
                                    List.of(new BlocksAttacksComponent.DamageReduction(30.0F, Optional.empty(), 1.0F, 3.0F)),
                                    new BlocksAttacksComponent.ItemDamage(9.0F, 1.0F, 1.0F),
                                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                                    Optional.of(SoundEvents.ITEM_SHIELD_BLOCK),
                                    Optional.of(SoundEvents.ITEM_SHIELD_BREAK)
                            )
                    )
                    .component(DataComponentTypes.BREAK_SOUND, SoundEvents.ITEM_SHIELD_BREAK)
    );
    public static final Item ATTUNED_STEEL_BATTLE_AXE = itemRegister("attuned_steel_battle_axe", Item::new,
            new Item.Settings()
                    .axe(ModItems.STEEL_TOOL_MATERIAL, 12f, -3.4f)
                    .maxDamage(1205)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
                            AttributeModifiersComponent.builder().add(
                                            EntityAttributes.MOVEMENT_SPEED,
                                            new EntityAttributeModifier(
                                                    Identifier.ofVanilla("movement_speed"),
                                                    -0.1f,EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                                            AttributeModifierSlot.HAND)
                                    .add(
                                            EntityAttributes.ATTACK_DAMAGE,
                                            new EntityAttributeModifier(
                                                    Identifier.ofVanilla("attack_damage"),
                                                    15f,
                                                    EntityAttributeModifier.Operation.ADD_VALUE),
                                            AttributeModifierSlot.MAINHAND)
                                    .add(
                                            EntityAttributes.ATTACK_SPEED,
                                            new EntityAttributeModifier(
                                                    Identifier.ofVanilla("attack_speed"),
                                                    -3f,
                                                    EntityAttributeModifier.Operation.ADD_VALUE),
                                            AttributeModifierSlot.MAINHAND)
                                    .build())
                    .component(
                            DataComponentTypes.BLOCKS_ATTACKS,
                            new BlocksAttacksComponent(
                                    0,
                                    1.0F,
                                    List.of(new BlocksAttacksComponent.DamageReduction(30.0F, Optional.empty(), 1.0F, 3.0F)),
                                    new BlocksAttacksComponent.ItemDamage(9.0F, 1.0F, 1.0F),
                                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                                    Optional.of(SoundEvents.ITEM_SHIELD_BLOCK),
                                    Optional.of(SoundEvents.ITEM_SHIELD_BREAK)
                            )
                    )
                    .component(DataComponentTypes.BREAK_SOUND, SoundEvents.ITEM_SHIELD_BREAK)
                    .component(DataComponentTypes.RARITY, Rarity.RARE)
    );

    public static final Item ATTUNEMENT_UPGRADE = itemRegister("attunement_upgrade", Item::new, new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON));

    //Item Registries
    private static Item itemRegister(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    public  static void registerModItems() {
        SandstoneItemsAndProgression.LOGGER.info("Registering Modded Items For" + SandstoneItemsAndProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DIAMOND_SHARD);
            fabricItemGroupEntries.add(JADE_STONE);
            fabricItemGroupEntries.add(VEILSTONE);
            fabricItemGroupEntries.add(STEEL_INGOT);
            fabricItemGroupEntries.add(STEEL_NUGGET);
            fabricItemGroupEntries.add(RAW_STEEL_NUGGET);
            fabricItemGroupEntries.add(RAW_STEEL);
            fabricItemGroupEntries.add(ATTUNEMENT_UPGRADE);

            fabricItemGroupEntries.add(CLOTH);
        });


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_AXE);
            fabricItemGroupEntries.add(STEEL_PICKAXE);
            fabricItemGroupEntries.add(STEEL_SHOVEL);
            fabricItemGroupEntries.add(STEEL_HOE);
        });


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_SWORD);
            fabricItemGroupEntries.add(STEEL_AXE);
            fabricItemGroupEntries.add(STEEL_HELMET);
            fabricItemGroupEntries.add(STEEL_CHESTPLATE);
            fabricItemGroupEntries.add(STEEL_LEGGINGS);
            fabricItemGroupEntries.add(STEEL_BOOTS);
            fabricItemGroupEntries.add(STEEL_BATTLE_AXE);
            fabricItemGroupEntries.add(ATTUNED_STEEL_BATTLE_AXE);

            fabricItemGroupEntries.add(BLANK_MASK);
            fabricItemGroupEntries.add(HAPPY_MASK);
            fabricItemGroupEntries.add(ANGRY_MASK);
            fabricItemGroupEntries.add(RABBIT_MASK_SPEED);
            fabricItemGroupEntries.add(RABBIT_MASK_DEFENCE);
            fabricItemGroupEntries.add(ATTUNED_RABBIT_MASK);

            fabricItemGroupEntries.add(BANDANA);

            fabricItemGroupEntries.add(ATTUNED_BANDANA);
        });
    }
}
