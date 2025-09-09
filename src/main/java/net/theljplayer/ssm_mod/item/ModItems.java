package net.theljplayer.ssm_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.util.ModTags;

import java.util.function.Function;

public class ModItems {

    //Materials
    public static final ToolMaterial STEEL_TOOL_MATERIAL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            1021,
            7,
            3,
            12,
            ModTags.Items.STEEL_TOOL_MATERIAL
    );

    //Items

    //New Progression Stuff
    public static final Item DIAMOND_SHARD = itemRegister("diamond_shard", Item::new, new Item.Settings());
    public static final Item STEEL_INGOT = itemRegister("steel_ingot", Item::new, new Item.Settings());
    public static final Item STEEL_NUGGET = itemRegister("steel_nugget", Item::new, new Item.Settings());
    public static final Item RAW_STEEL_SCRAP = itemRegister("raw_steel_scrap", Item::new, new Item.Settings());
    public static final Item RAW_STEEL = itemRegister("raw_steel", Item::new, new Item.Settings());
    public static final Item STEEL_SWORD = itemRegister("steel_sword", Item::new,new Item.Settings().sword(STEEL_TOOL_MATERIAL,4f, 1.4f));
    public static final Item STEEL_AXE = itemRegister("steel_axe", Item::new,new Item.Settings().axe(STEEL_TOOL_MATERIAL, 6f,0.8f));
    public static final Item STEEL_PICKAXE = itemRegister("steel_pickaxe", Item::new,new Item.Settings().pickaxe(STEEL_TOOL_MATERIAL,2f,1f));
    public static final Item STEEL_SHOVEL = itemRegister("steel_shovel", Item::new,new Item.Settings().shovel(STEEL_TOOL_MATERIAL, 2f, 1f));
    public static final Item STEEL_HOE = itemRegister("steel_hoe", Item::new,new Item.Settings().shovel(STEEL_TOOL_MATERIAL, 3f, 2f));

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
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_SWORD);
            fabricItemGroupEntries.add(STEEL_AXE);
        });
    }
}
