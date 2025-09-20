package net.theljplayer.ssm_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.BlocksAttacksComponent;
import net.minecraft.component.type.EquippableComponent;
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
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.datagen.ModBlockTagProvider;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;

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

    public static final Item WHITE_CLOTH = itemRegister("white_cloth", Item::new, new Item.Settings());
    public static final Item YELLOW_CLOTH = itemRegister("yellow_cloth", Item::new, new Item.Settings());
    public static final Item RED_CLOTH = itemRegister("red_cloth", Item::new, new Item.Settings());
    public static final Item PURPLE_CLOTH = itemRegister("purple_cloth", Item::new, new Item.Settings());
    public static final Item PINK_CLOTH = itemRegister("pink_cloth", Item::new, new Item.Settings());
    public static final Item ORANGE_CLOTH = itemRegister("orange_cloth", Item::new, new Item.Settings());
    public static final Item MAGENTA_CLOTH = itemRegister("magenta_cloth", Item::new, new Item.Settings());
    public static final Item LIME_CLOTH = itemRegister("lime_cloth", Item::new, new Item.Settings());
    public static final Item LIGHT_GRAY_CLOTH = itemRegister("light_gray_cloth", Item::new, new Item.Settings());
    public static final Item LIGHT_BLUE_CLOTH = itemRegister("light_blue_cloth", Item::new, new Item.Settings());
    public static final Item GREEN_CLOTH = itemRegister("green_cloth", Item::new, new Item.Settings());
    public static final Item GRAY_CLOTH = itemRegister("gray_cloth", Item::new, new Item.Settings());
    public static final Item CYAN_CLOTH = itemRegister("cyan_cloth", Item::new, new Item.Settings());
    public static final Item BROWN_CLOTH = itemRegister("brown_cloth", Item::new, new Item.Settings());
    public static final Item BLUE_CLOTH = itemRegister("blue_cloth", Item::new, new Item.Settings());
    public static final Item BLACK_CLOTH = itemRegister("black_cloth", Item::new, new Item.Settings());

    public static final Item WHITE_BANDANA = itemRegister("white_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/white_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item YELLOW_BANDANA = itemRegister("yellow_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/yellow_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item RED_BANDANA = itemRegister("red_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/red_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item PURPLE_BANDANA = itemRegister("purple_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/purple_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item PINK_BANDANA = itemRegister("pink_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/pink_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item ORANGE_BANDANA = itemRegister("orange_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/orange_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item MAGENTA_BANDANA = itemRegister("magenta_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/magenta_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item LIME_BANDANA = itemRegister("lime_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/lime_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item LIGHT_GRAY_BANDANA = itemRegister("light_gray_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/light_gray_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item LIGHT_BLUE_BANDANA = itemRegister("light_blue_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/light_blue_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item GREEN_BANDANA = itemRegister("green_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/green_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item GRAY_BANDANA = itemRegister("gray_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/gray_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item CYAN_BANDANA = itemRegister("cyan_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/cyan_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BROWN_BANDANA = itemRegister("brown_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/brown_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BLUE_BANDANA = itemRegister("blue_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/blue_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BLACK_BANDANA = itemRegister("black_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/black_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item SAMUELS_BANDANA = itemRegister("samuels_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/samuels_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));

    public static final Item WHITE_ATTUNED_BANDANA = itemRegister("white_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/white_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item YELLOW_ATTUNED_BANDANA = itemRegister("yellow_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/yellow_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item RED_ATTUNED_BANDANA = itemRegister("red_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/red_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item PURPLE_ATTUNED_BANDANA = itemRegister("purple_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/purple_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item PINK_ATTUNED_BANDANA = itemRegister("pink_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/pink_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item ORANGE_ATTUNED_BANDANA = itemRegister("orange_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/orange_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item MAGENTA_ATTUNED_BANDANA = itemRegister("magenta_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/magenta_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item LIME_ATTUNED_BANDANA = itemRegister("lime_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/lime_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item LIGHT_GRAY_ATTUNED_BANDANA = itemRegister("light_gray_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/light_gray_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item LIGHT_BLUE_ATTUNED_BANDANA = itemRegister("light_blue_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/light_blue_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item GREEN_ATTUNED_BANDANA = itemRegister("green_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/green_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item GRAY_ATTUNED_BANDANA = itemRegister("gray_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/gray_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item CYAN_ATTUNED_BANDANA = itemRegister("cyan_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/cyan_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BROWN_ATTUNED_BANDANA = itemRegister("brown_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/brown_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BLUE_ATTUNED_BANDANA = itemRegister("blue_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/blue_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item BLACK_ATTUNED_BANDANA = itemRegister("black_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.UNCOMMON).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/black_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));
    public static final Item SAMUELS_ATTUNED_BANDANA = itemRegister("samuels_attuned_bandana", Item::new, new Item.Settings().maxCount(1).enchantable(22).rarity(Rarity.RARE).attributeModifiers(AttributeModifiersComponent.builder().add(
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
            Optional.of(EquipmentAssetKeys.register("bandanas/samuels_attuned_bandana")),
            Optional.empty(),
            Optional.empty(),
            true,
            true,
            false,
            true,
            false,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    )));

    public static final Item STEEL_INGOT = itemRegister("steel_ingot", Item::new, new Item.Settings());
    public static final Item STEEL_NUGGET = itemRegister("steel_nugget", Item::new, new Item.Settings());
    public static final Item RAW_STEEL_SCRAP = itemRegister("raw_steel_scrap", Item::new, new Item.Settings());
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
            fabricItemGroupEntries.add(STEEL_INGOT);
            fabricItemGroupEntries.add(STEEL_NUGGET);
            fabricItemGroupEntries.add(RAW_STEEL_SCRAP);
            fabricItemGroupEntries.add(RAW_STEEL);
            fabricItemGroupEntries.add(ATTUNEMENT_UPGRADE);

            fabricItemGroupEntries.add(WHITE_CLOTH);
            fabricItemGroupEntries.add(YELLOW_CLOTH);
            fabricItemGroupEntries.add(RED_CLOTH);
            fabricItemGroupEntries.add(PURPLE_CLOTH);
            fabricItemGroupEntries.add(PINK_CLOTH);
            fabricItemGroupEntries.add(ORANGE_CLOTH);
            fabricItemGroupEntries.add(MAGENTA_CLOTH);
            fabricItemGroupEntries.add(LIME_CLOTH);
            fabricItemGroupEntries.add(LIGHT_GRAY_CLOTH);
            fabricItemGroupEntries.add(LIGHT_BLUE_CLOTH);
            fabricItemGroupEntries.add(GREEN_CLOTH);
            fabricItemGroupEntries.add(GRAY_CLOTH);
            fabricItemGroupEntries.add(CYAN_CLOTH);
            fabricItemGroupEntries.add(BROWN_CLOTH);
            fabricItemGroupEntries.add(BLUE_CLOTH);
            fabricItemGroupEntries.add(BLACK_CLOTH);
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

            fabricItemGroupEntries.add(WHITE_BANDANA);
            fabricItemGroupEntries.add(YELLOW_BANDANA);
            fabricItemGroupEntries.add(RED_BANDANA);
            fabricItemGroupEntries.add(PURPLE_BANDANA);
            fabricItemGroupEntries.add(PINK_BANDANA);
            fabricItemGroupEntries.add(ORANGE_BANDANA);
            fabricItemGroupEntries.add(MAGENTA_BANDANA);
            fabricItemGroupEntries.add(LIME_BANDANA);
            fabricItemGroupEntries.add(LIGHT_GRAY_BANDANA);
            fabricItemGroupEntries.add(LIGHT_BLUE_BANDANA);
            fabricItemGroupEntries.add(GREEN_BANDANA);
            fabricItemGroupEntries.add(GRAY_BANDANA);
            fabricItemGroupEntries.add(CYAN_BANDANA);
            fabricItemGroupEntries.add(BROWN_BANDANA);
            fabricItemGroupEntries.add(BLUE_BANDANA);
            fabricItemGroupEntries.add(BLACK_BANDANA);
            fabricItemGroupEntries.add(SAMUELS_BANDANA);

            fabricItemGroupEntries.add(WHITE_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(YELLOW_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(RED_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(PURPLE_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(PINK_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(ORANGE_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(MAGENTA_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(LIME_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(LIGHT_GRAY_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(LIGHT_BLUE_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(GREEN_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(GRAY_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(CYAN_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(BROWN_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(BLUE_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(BLACK_ATTUNED_BANDANA);
            fabricItemGroupEntries.add(SAMUELS_ATTUNED_BANDANA);
        });
    }
}
