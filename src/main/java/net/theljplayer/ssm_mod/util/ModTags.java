package net.theljplayer.ssm_mod.util;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;

public class ModTags {
    public static class Blocks{

        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> STEEL_TOOL_MATERIAL = createTag("steel_tool_material");
        public static final TagKey<Item> REPAIRS_STEEL_ARMOR = createTag("repairs_steel_armor");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name));
        }
    }

    public static void registerModTags() {
        SandstoneItemsAndProgression.LOGGER.info("Registering Modded Tags For" + SandstoneItemsAndProgression.MOD_ID);
    }
}
