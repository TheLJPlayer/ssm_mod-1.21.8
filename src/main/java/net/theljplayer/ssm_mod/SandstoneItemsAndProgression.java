package net.theljplayer.ssm_mod;

import io.netty.buffer.Unpooled;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.block.ModBlocks;
import net.theljplayer.ssm_mod.effect.ModEffects;
import net.theljplayer.ssm_mod.entity.ModEntityAttributes;
import net.theljplayer.ssm_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SandstoneItemsAndProgression implements ModInitializer {
	public static final String MOD_ID = "ssm_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEffects.registerEffects();
        ModEntityAttributes.registerEntityAttributes();

    }
    public static Identifier identifier(String path) {
        return Identifier.of(MOD_ID, path);
    }
}