package net.theljplayer.ssm_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import net.theljplayer.ssm_mod.block.ModBlocks;

public class SandstoneItemsAndProgressionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.STEEL_DOOR, BlockRenderLayer.CUTOUT);
    }
}
