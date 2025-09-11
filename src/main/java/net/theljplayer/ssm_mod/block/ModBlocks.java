package net.theljplayer.ssm_mod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;

import java.util.function.Function;

public class ModBlocks {

    //Blocks
    public static final Block STEEL_BLOCK = blockRegister("steel_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.IRON).strength(5.0f, 1200.0f).mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.XYLOPHONE).requiresTool(), true);
    public static final Block RAW_STEEL_BLOCK = blockRegister("raw_steel_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE_GRAY).strength(5.0f, 12.0f).requiresTool(), true);
    public static final Block STEEL_DOOR = blockRegister("steel_door", properties -> new DoorBlock(BlockSetType.IRON, properties.requiresTool()), AbstractBlock.Settings.create().requiresTool().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DEEPSLATE_GRAY).strength(5.0f, 12.0f), true);
    public static final Block STEEL_TRAPDOOR = blockRegister("steel_trapdoor", properties -> new TrapdoorBlock(BlockSetType.IRON, properties.requiresTool().nonOpaque()), AbstractBlock.Settings.create().requiresTool().nonOpaque().mapColor(MapColor.DEEPSLATE_GRAY).strength(5.0f, 12.0f).allowsSpawning(Blocks::never), true);

    //Block Registry
    private static Block blockRegister(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name));
    }

    public static void registerModBlocks() {
        SandstoneItemsAndProgression.LOGGER.info("Registering Modded Blocks For" + SandstoneItemsAndProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_BLOCK);
            fabricItemGroupEntries.add(RAW_STEEL_BLOCK);
            fabricItemGroupEntries.add(STEEL_DOOR);
            fabricItemGroupEntries.add(STEEL_TRAPDOOR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_DOOR);
            fabricItemGroupEntries.add(STEEL_TRAPDOOR);
        });
    }
}
