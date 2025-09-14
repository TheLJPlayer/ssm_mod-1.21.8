package net.theljplayer.ssm_mod;

import net.fabricmc.api.ModInitializer;

import net.theljplayer.ssm_mod.block.ModBlocks;
import net.theljplayer.ssm_mod.effect.ModEffects;
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
	}
}