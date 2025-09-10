package net.theljplayer.ssm_mod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.theljplayer.ssm_mod.datagen.ModBlockTagProvider;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;
import net.theljplayer.ssm_mod.datagen.ModModelProvider;

public class SandstoneItemsAndProgressionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModModelProvider::new);
    }
}
