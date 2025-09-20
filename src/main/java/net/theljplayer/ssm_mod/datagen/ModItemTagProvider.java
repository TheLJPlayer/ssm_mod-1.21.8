package net.theljplayer.ssm_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
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
    public static final TagKey<Item> BANDANAS = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "bandanas"));
    public static final TagKey<Item> AIR_JUMP_ENCHANTABLE = TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "enchantable/air_jumps"));

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
                .forceAddTag(BANDANAS)
                .add(ModItems.STEEL_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.STEEL_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.STEEL_BOOTS);

        valueLookupBuilder(ATTUNED_ITEMS)
                .add(ModItems.ATTUNED_STEEL_BATTLE_AXE);

        valueLookupBuilder(CLOTH)
                .add(ModItems.WHITE_CLOTH)
                .add(ModItems.YELLOW_CLOTH)
                .add(ModItems.RED_CLOTH )
                .add(ModItems.PURPLE_CLOTH)
                .add(ModItems.PINK_CLOTH)
                .add(ModItems.ORANGE_CLOTH)
                .add(ModItems.MAGENTA_CLOTH)
                .add(ModItems.LIME_CLOTH)
                .add(ModItems.LIGHT_GRAY_CLOTH)
                .add(ModItems.LIGHT_BLUE_CLOTH)
                .add(ModItems.GREEN_CLOTH)
                .add(ModItems.GRAY_CLOTH)
                .add(ModItems.CYAN_CLOTH)
                .add(ModItems.BROWN_CLOTH)
                .add(ModItems.BLUE_CLOTH)
                .add(ModItems.BLACK_CLOTH);

        valueLookupBuilder(BANDANAS)
                .add(ModItems.WHITE_BANDANA)
                .add(ModItems.YELLOW_BANDANA)
                .add(ModItems.RED_BANDANA )
                .add(ModItems.PURPLE_BANDANA)
                .add(ModItems.PINK_BANDANA)
                .add(ModItems.ORANGE_BANDANA)
                .add(ModItems.MAGENTA_BANDANA)
                .add(ModItems.LIME_BANDANA)
                .add(ModItems.LIGHT_GRAY_BANDANA)
                .add(ModItems.LIGHT_BLUE_BANDANA)
                .add(ModItems.GREEN_BANDANA)
                .add(ModItems.GRAY_BANDANA)
                .add(ModItems.CYAN_BANDANA)
                .add(ModItems.BROWN_BANDANA)
                .add(ModItems.BLUE_BANDANA)
                .add(ModItems.BLACK_BANDANA)
                .add(ModItems.SAMUELS_BANDANA)

                .add(ModItems.WHITE_ATTUNED_BANDANA)
                .add(ModItems.YELLOW_ATTUNED_BANDANA)
                .add(ModItems.RED_ATTUNED_BANDANA )
                .add(ModItems.PURPLE_ATTUNED_BANDANA)
                .add(ModItems.PINK_ATTUNED_BANDANA)
                .add(ModItems.ORANGE_ATTUNED_BANDANA)
                .add(ModItems.MAGENTA_ATTUNED_BANDANA)
                .add(ModItems.LIME_ATTUNED_BANDANA)
                .add(ModItems.LIGHT_GRAY_ATTUNED_BANDANA)
                .add(ModItems.LIGHT_BLUE_ATTUNED_BANDANA)
                .add(ModItems.GREEN_ATTUNED_BANDANA)
                .add(ModItems.GRAY_ATTUNED_BANDANA)
                .add(ModItems.CYAN_ATTUNED_BANDANA)
                .add(ModItems.BROWN_ATTUNED_BANDANA)
                .add(ModItems.BLUE_ATTUNED_BANDANA)
                .add(ModItems.BLACK_ATTUNED_BANDANA)
                .add(ModItems.SAMUELS_ATTUNED_BANDANA);

        valueLookupBuilder(AIR_JUMP_ENCHANTABLE)
                .forceAddTag(BANDANAS)
                .forceAddTag(ItemTags.FOOT_ARMOR);
    }
}
