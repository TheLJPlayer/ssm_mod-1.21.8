package net.theljplayer.ssm_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public static final TagKey<Item> STEEL_TOOL_MATERIAL = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "steel_tool_material"));
    public static final TagKey<Item> REPAIRS_STEEL_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "repairs_steel_armor"));
    public static final TagKey<Item> STEEL_BATTLE_AXES = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "steel_battle_axes"));
    public static final TagKey<Item> REPAIRS_CLOTH_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "repairs_cloth_armor"));
    public static final TagKey<Item> ATTUNED_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "attuned_items"));
    public static final TagKey<Item> CLOTH = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "cloth"));
    public static final TagKey<Item> RABBIT_MASKS = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "rabbit_masks"));
    public static final TagKey<Item> MASKS = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "masks"));
    public static final TagKey<Item> BANDANAS = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "bandanas"));
    public static final TagKey<Item> AIR_JUMP_ENCHANTABLE = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "enchantable/air_jumps"));
    public static final TagKey<Item> RESILIENT_ENCHANTABLE = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "enchantable/resilient"));

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(STEEL_TOOL_MATERIAL)
                .add(ModItems.STEEL_INGOT);

        valueLookupBuilder(REPAIRS_STEEL_ARMOR)
                .add(ModItems.STEEL_INGOT);

        valueLookupBuilder(REPAIRS_CLOTH_ARMOR)
                .forceAddTag(CLOTH);

        valueLookupBuilder(STEEL_BATTLE_AXES)
                .add(ModItems.STEEL_BATTLE_AXE)
                .add(ModItems.ATTUNED_STEEL_BATTLE_AXE);

        valueLookupBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .forceAddTag(STEEL_BATTLE_AXES);

        valueLookupBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .forceAddTag(BANDANAS);

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.STEEL_SWORD);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.STEEL_AXE)
                .forceAddTag(STEEL_BATTLE_AXES);

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.STEEL_PICKAXE);

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.STEEL_SHOVEL);

        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.STEEL_HOE);

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.STEEL_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.STEEL_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.STEEL_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.STEEL_BOOTS);

        valueLookupBuilder(ATTUNED_ITEMS)
                .add(ModItems.ATTUNED_BANDANA)

                .add(ModItems.ATTUNED_RABBIT_MASK)
                .add(ModItems.ATTUNED_STEEL_BATTLE_AXE);

        valueLookupBuilder(CLOTH)
                .add(ModItems.CLOTH);

        valueLookupBuilder(RABBIT_MASKS)
                .add(ModItems.RABBIT_MASK_SPEED)
                .add(ModItems.RABBIT_MASK_DEFENCE)
                .add(ModItems.ATTUNED_RABBIT_MASK);

        valueLookupBuilder(MASKS)
                .add(ModItems.BLANK_MASK)
                .add(ModItems.HAPPY_MASK)
                .add(ModItems.ANGRY_MASK)
                .forceAddTag(RABBIT_MASKS);

        valueLookupBuilder(BANDANAS)
                .add(ModItems.BANDANA)

                .add(ModItems.ATTUNED_BANDANA);

        valueLookupBuilder(AIR_JUMP_ENCHANTABLE)
                .forceAddTag(BANDANAS)
                .forceAddTag(ItemTags.FOOT_ARMOR);

        valueLookupBuilder(RESILIENT_ENCHANTABLE)
                .add(Items.ELYTRA)
                .forceAddTag(BANDANAS)
                .forceAddTag(MASKS);
    }
}
