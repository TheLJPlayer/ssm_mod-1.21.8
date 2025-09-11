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

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(STEEL_TOOL_MATERIAL)
                .add(ModItems.STEEL_INGOT);
        valueLookupBuilder(REPAIRS_STEEL_ARMOR)
                .add(ModItems.STEEL_INGOT);
        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.STEEL_SWORD);
        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.STEEL_AXE)
                .add(ModItems.STEEL_BATTLE_AXE);
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
    }
}
