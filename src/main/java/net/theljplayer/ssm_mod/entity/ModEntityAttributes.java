package net.theljplayer.ssm_mod.entity;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;

public class ModEntityAttributes {
    public static final RegistryEntry<EntityAttribute> AIR_JUMP = entityAttributeRegister("air_jump", new ClampedEntityAttribute("air_jump",0, 0, 1024).setCategory(EntityAttribute.Category.POSITIVE).setTracked(true));

    public static float getAirJumps(LivingEntity entity) {
        return (int) entity.getAttributeInstance(AIR_JUMP).getValue();
    }

    private static RegistryEntry<EntityAttribute> entityAttributeRegister(String name, EntityAttribute entityAttribute) {
        return Registry.registerReference(Registries.ATTRIBUTE, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name), entityAttribute);
    }

    public static void registerEntityAttributes() {
        SandstoneItemsAndProgression.LOGGER.info("Registering Modded Entity Attributes for " + SandstoneItemsAndProgression.MOD_ID);
    }
}
