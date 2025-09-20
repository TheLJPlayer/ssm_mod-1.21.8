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
            .addAttributeModifier(EntityAttributes.MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ATTACK_SPEED, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ENTITY_INTERACTION_RANGE, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.BLOCK_INTERACTION_RANGE, Identifier.ofVanilla("effects.stunned"), -0.6f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.JUMP_STRENGTH, Identifier.ofVanilla("effects.stunned"), -1f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    public static final RegistryEntry<StatusEffect> SLOW_MO = statusEffectRegister("slow_mo", new SlowMoEffect(StatusEffectCategory.NEUTRAL,0x2c6628)
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.ofVanilla("effects.slow_mo"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.slow_mo"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.slow_mo"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ATTACK_SPEED, Identifier.ofVanilla("effects.slow_mo"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.GRAVITY, Identifier.ofVanilla("effects.slow_mo"), -0.1875f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.JUMP_STRENGTH, Identifier.ofVanilla("effects.slow_mo"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    public static final RegistryEntry<StatusEffect> FAST_FORWARD = statusEffectRegister("fast_forward", new FastForwardEffect(StatusEffectCategory.NEUTRAL,0x85c1ea)
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.ofVanilla("effects.fast_forward"), 0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.fast_forward"), 0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.fast_forward"), 0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ATTACK_SPEED, Identifier.ofVanilla("effects.fast_forward"), 0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.GRAVITY, Identifier.ofVanilla("effects.fast_forward"), 0.1875f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.JUMP_STRENGTH, Identifier.ofVanilla("effects.fast_forward"), 0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    public static final RegistryEntry<StatusEffect> SHRUNKEN = statusEffectRegister("shrunken", new ShrunkenEffect(StatusEffectCategory.HARMFUL,0x115444)
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.ofVanilla("effects.shrunken"), -0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.shrunken"), -0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.shrunken"), -0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.SCALE, Identifier.ofVanilla("effects.shrunken"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ENTITY_INTERACTION_RANGE, Identifier.ofVanilla("effects.shrunken"), -0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.BLOCK_INTERACTION_RANGE, Identifier.ofVanilla("effects.shrunken"), -0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.JUMP_STRENGTH, Identifier.ofVanilla("effects.shrunken"), -0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.GRAVITY, Identifier.ofVanilla("effects.shrunken"), -0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.STEP_HEIGHT, Identifier.ofVanilla("effects.shrunken"), -0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    public static final RegistryEntry<StatusEffect> EXPANSION = statusEffectRegister("expansion", new ExpansionEffect(StatusEffectCategory.HARMFUL,0x9d190f)
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.ofVanilla("effects.expansion"), 0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.expansion"), 0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, Identifier.ofVanilla("effects.expansion"), 0.0625f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.SCALE, Identifier.ofVanilla("effects.expansion"), 0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.ENTITY_INTERACTION_RANGE, Identifier.ofVanilla("effects.expansion"), 0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.BLOCK_INTERACTION_RANGE, Identifier.ofVanilla("effects.expansion"), 0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.JUMP_STRENGTH, Identifier.ofVanilla("effects.expansion"), 0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.GRAVITY, Identifier.ofVanilla("effects.expansion"), 0.03125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(EntityAttributes.STEP_HEIGHT, Identifier.ofVanilla("effects.expansion"), 0.125f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    private static RegistryEntry<StatusEffect> statusEffectRegister(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        SandstoneItemsAndProgression.LOGGER.info("Registering Modded Effects for " + SandstoneItemsAndProgression.MOD_ID);
    }
}
