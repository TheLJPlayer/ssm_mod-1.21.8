package net.theljplayer.ssm_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "incorrect_for_steel_tool"));
    public static final TagKey<Block> NEEDS_STEEL_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "needs_steel_tool"));

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(INCORRECT_FOR_STEEL_TOOL)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.ANCIENT_DEBRIS);
        valueLookupBuilder(NEEDS_STEEL_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN);
    }
}
