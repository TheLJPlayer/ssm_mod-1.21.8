package net.theljplayer.ssm_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.WeaponComponent;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.BlocksAttacksComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.datagen.ModBlockTagProvider;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;
import net.theljplayer.ssm_mod.item.TerrashaperItem;

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
    public static final Item STEEL_INGOT = itemRegister("steel_ingot", Item::new, new Item.Settings());
    public static final Item STEEL_NUGGET = itemRegister("steel_nugget", Item::new, new Item.Settings());
    public static final Item RAW_STEEL_SCRAP = itemRegister("raw_steel_scrap", Item::new, new Item.Settings());
    public static final Item RAW_STEEL = itemRegister("raw_steel", Item::new, new Item.Settings());

    public static final Item STEEL_SWORD = itemRegister("steel_sword", Item::new,new Item.Settings().sword(STEEL_TOOL_MATERIAL,3f, -2.6f));
    public static final Item STEEL_AXE = itemRegister("steel_axe", settings -> new AxeItem(STEEL_TOOL_MATERIAL, 5f, -3.2f, settings),new Item.Settings());
    public static final Item STEEL_PICKAXE = itemRegister("steel_pickaxe", Item::new,new Item.Settings().pickaxe(STEEL_TOOL_MATERIAL,1f,-3f));
    public static final Item STEEL_SHOVEL = itemRegister("steel_shovel", settings -> new ShovelItem(STEEL_TOOL_MATERIAL, 1f, -3f, settings),new Item.Settings());
    public static final Item STEEL_HOE = itemRegister("steel_hoe", settings -> new HoeItem(STEEL_TOOL_MATERIAL, -3f, -3f, settings),new Item.Settings());

    public static final Item STEEL_HELMET = itemRegister("steel_helmet", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterial.BASE_DURABILITY)));
    public static final Item STEEL_CHESTPLATE = itemRegister("steel_chestplate", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterial.BASE_DURABILITY)));
    public static final Item STEEL_LEGGINGS = itemRegister("steel_leggings", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterial.BASE_DURABILITY)));
    public static final Item STEEL_BOOTS = itemRegister("steel_boots", Item::new,new Item.Settings().armor(ModArmorMaterial.STEEL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterial.BASE_DURABILITY)));

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

    public static final Item TERRASHAPER = itemRegister("terrashaper", 
        settings -> new TerrashaperItem(ToolMaterial.IRON, 3f, -1f, settings),
        new Item.Settings()
            // .rarity(Rarity.RARE)
            .maxDamage(250)
            .attributeModifiers(TerrashaperItem.createAttributeModifiers())
            .component(DataComponentTypes.TOOL, TerrashaperItem.createToolComponent())
            .enchantable(1)
            .component(DataComponentTypes.WEAPON, new WeaponComponent(1))
    );

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
            fabricItemGroupEntries.add(STEEL_INGOT);
            fabricItemGroupEntries.add(STEEL_NUGGET);
            fabricItemGroupEntries.add(RAW_STEEL_SCRAP);
            fabricItemGroupEntries.add(RAW_STEEL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_AXE);
            fabricItemGroupEntries.add(STEEL_PICKAXE);
            fabricItemGroupEntries.add(STEEL_SHOVEL);
            fabricItemGroupEntries.add(STEEL_HOE);
            fabricItemGroupEntries.add(TERRASHAPER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_SWORD);
            fabricItemGroupEntries.add(STEEL_AXE);
            fabricItemGroupEntries.add(STEEL_HELMET);
            fabricItemGroupEntries.add(STEEL_CHESTPLATE);
            fabricItemGroupEntries.add(STEEL_LEGGINGS);
            fabricItemGroupEntries.add(STEEL_BOOTS);
            fabricItemGroupEntries.add(STEEL_BATTLE_AXE);
        });
    }
}
