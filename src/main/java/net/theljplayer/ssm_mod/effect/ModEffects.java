package net.theljplayer.ssm_mod.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;

public class ModEffects{

    public static final RegistryEntry<StatusEffect> STUNNED = statusEffectRegister("stunned", new StunnedEffect(StatusEffectCategory.HARMFUL,0xba6529)
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ATTACK_SPEED, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ENTITY_INTERACTION_RANGE, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.BLOCK_INTERACTION_RANGE, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.JUMP_STRENGTH, Identifier.ofVanilla("effects.stunned"), -1f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    private static RegistryEntry<StatusEffect> statusEffectRegister(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        SandstoneItemsAndProgression.LOGGER.info("Registering Modded Effects for " + SandstoneItemsAndProgression.MOD_ID);
    }
}
