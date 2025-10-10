package net.theljplayer.ssm_mod.enchantment;

import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.enchantment.effect.entity.ApplyMobEffectEnchantmentEffect;
import net.minecraft.enchantment.effect.entity.IgniteEnchantmentEffect;
import net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;
import net.theljplayer.ssm_mod.effect.ModEffects;
import net.theljplayer.ssm_mod.entity.ModEntityAttributes;

public class ModEnchantments {

    public static final RegistryKey<Enchantment> AIR_JUMPS =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "air_jumps"));
    public static final RegistryKey<Enchantment> ADRENALINE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "adrenaline"));
    public static final RegistryKey<Enchantment> BURNT =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "burnt"));
    public static final RegistryKey<Enchantment> IRON_FIST =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "iron_fist"));
    public static final RegistryKey<Enchantment> SPARK =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "spark"));

    public static final RegistryKey<Enchantment> BLUDGEONING =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "bludgeoning"));
    public static final RegistryKey<Enchantment> IGNITE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "ignite"));

    public static final RegistryKey<Enchantment> RESILIENT =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "resilient"));

    public static final RegistryKey<Enchantment> CLEARING =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "clearing"));
    public static final RegistryKey<Enchantment> UNDETECTABLE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "undetectable"));
    public static final RegistryKey<Enchantment> HYPERREFLEXIA =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "hyperreflexia"));
    public static final RegistryKey<Enchantment> HEADSTRONG =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "headstrong"));
    public static final RegistryKey<Enchantment> SCUBA =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "scuba"));
    public static final RegistryKey<Enchantment> MIMIC =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "mimic"));
    public static final RegistryKey<Enchantment> AFFINITY =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "affinity"));

    public static void bootstrap(Registerable<Enchantment> registerable) {
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable,AIR_JUMPS,Enchantment.builder(Enchantment.definition(
                items.getOrThrow(ModItemTagProvider.AIR_JUMP_ENCHANTABLE),
                items.getOrThrow(ModItemTagProvider.BANDANAS),
                5,
                3,
                Enchantment.leveledCost(10,7),
                Enchantment.leveledCost(24,10),
                1,
                AttributeModifierSlot.ARMOR
        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.air_jumps"),
                                ModEntityAttributes.AIR_JUMP,
                                EnchantmentLevelBasedValue.linear(1, 1),
                                EntityAttributeModifier.Operation.ADD_VALUE
                        )));

        register(registerable,ADRENALINE,Enchantment.builder(Enchantment.definition(
                                items.getOrThrow(ModItemTagProvider.BANDANAS),
                                items.getOrThrow(ModItemTagProvider.BANDANAS),
                                2,
                                1,
                                Enchantment.leveledCost(12,0),
                                Enchantment.leveledCost(24,0),
                                2,
                                AttributeModifierSlot.CHEST
                        ))
                        .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(IRON_FIST)))
                        .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(SPARK)))
                        .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,EnchantmentEffectTarget.VICTIM,EnchantmentEffectTarget.VICTIM, new ApplyMobEffectEnchantmentEffect(
                                RegistryEntryList.of(ModEffects.ADRENALINE),
                                EnchantmentLevelBasedValue.constant(3f),
                                EnchantmentLevelBasedValue.constant(3f),
                                EnchantmentLevelBasedValue.constant(0f),
                                EnchantmentLevelBasedValue.constant(1f)
                        ))
        );

        register(registerable,BURNT,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.BANDANAS),
                        items.getOrThrow(ModItemTagProvider.BANDANAS),
                        4,
                        3,
                        Enchantment.leveledCost(0,12),
                        Enchantment.leveledCost(18,10),
                        1,
                        AttributeModifierSlot.CHEST
                ))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK, EnchantmentEffectTarget.VICTIM,EnchantmentEffectTarget.ATTACKER, new IgniteEnchantmentEffect(EnchantmentLevelBasedValue.linear(3))));

        register(registerable,IRON_FIST,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.BANDANAS),
                        items.getOrThrow(ModItemTagProvider.BANDANAS),
                        2,
                        3,
                        Enchantment.leveledCost(18,10),
                        Enchantment.leveledCost(24,10),
                        3,
                        AttributeModifierSlot.CHEST
                ))
                .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(SPARK)))
                .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(ADRENALINE)))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.iron_fist"),
                                EntityAttributes.ATTACK_DAMAGE,
                                EnchantmentLevelBasedValue.linear(0.1f, 0.1f),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        )));

        register(registerable,SPARK,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.BANDANAS),
                        items.getOrThrow(ModItemTagProvider.BANDANAS),
                        4,
                        1,
                        Enchantment.leveledCost(12,0),
                        Enchantment.leveledCost(30,0),
                        2,
                        AttributeModifierSlot.CHEST
                ))
                .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(IRON_FIST)))
                .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(ADRENALINE)))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,EnchantmentEffectTarget.VICTIM,EnchantmentEffectTarget.ATTACKER, new ApplyMobEffectEnchantmentEffect(
                        RegistryEntryList.of(ModEffects.STUNNED),
                        EnchantmentLevelBasedValue.constant(1.5f),
                        EnchantmentLevelBasedValue.constant(1.5f),
                        EnchantmentLevelBasedValue.constant(0f),
                        EnchantmentLevelBasedValue.constant(1f)))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,EnchantmentEffectTarget.ATTACKER,EnchantmentEffectTarget.VICTIM, new ApplyMobEffectEnchantmentEffect(
                        RegistryEntryList.of(StatusEffects.SLOWNESS,StatusEffects.MINING_FATIGUE, StatusEffects.WEAKNESS),
                        EnchantmentLevelBasedValue.constant(2f),
                        EnchantmentLevelBasedValue.constant(2f),
                        EnchantmentLevelBasedValue.constant(1f),
                        EnchantmentLevelBasedValue.constant(2f)
                ))
        );



        register(registerable,BLUDGEONING,Enchantment.builder(Enchantment.definition(
                                items.getOrThrow(ModItemTagProvider.STEEL_BATTLE_AXES),
                                items.getOrThrow(ModItemTagProvider.STEEL_BATTLE_AXES),
                                5,
                                3,
                                Enchantment.leveledCost(6,10),
                                Enchantment.leveledCost(30,10),
                                1,
                                AttributeModifierSlot.MAINHAND
                        ))
                        .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,EnchantmentEffectTarget.ATTACKER,EnchantmentEffectTarget.VICTIM, new ApplyMobEffectEnchantmentEffect(
                                RegistryEntryList.of(StatusEffects.SLOWNESS),
                                EnchantmentLevelBasedValue.linear(4f, 4),
                                EnchantmentLevelBasedValue.linear(4f, 4),
                                EnchantmentLevelBasedValue.linear(1f, 1),
                                EnchantmentLevelBasedValue.linear(2f, 1)))
        );

        register(registerable,IGNITE,Enchantment.builder(Enchantment.definition(
                                items.getOrThrow(ModItemTagProvider.STEEL_BATTLE_AXES),
                                items.getOrThrow(ModItemTagProvider.STEEL_BATTLE_AXES),
                                3,
                                1,
                                Enchantment.leveledCost(10,0),
                                Enchantment.leveledCost(30,0),
                                1,
                                AttributeModifierSlot.MAINHAND
                        ))
                        .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK, EnchantmentEffectTarget.ATTACKER,EnchantmentEffectTarget.VICTIM, new IgniteEnchantmentEffect(EnchantmentLevelBasedValue.constant(8f)))
        );



        register(registerable,RESILIENT,Enchantment.builder(Enchantment.definition(
                items.getOrThrow(ModItemTagProvider.RESILIENT_ENCHANTABLE),
                items.getOrThrow(ModItemTagProvider.RESILIENT_ENCHANTABLE),
                1,
                5,
                Enchantment.leveledCost(7,10),
                Enchantment.leveledCost(28,20),
                1,
                AttributeModifierSlot.ARMOR,
                AttributeModifierSlot.BODY
        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.resilient"),
                                EntityAttributes.ARMOR,
                                EnchantmentLevelBasedValue.linear(1, 1),
                                EntityAttributeModifier.Operation.ADD_VALUE
                        )));



        register(
                registerable,
                CLEARING,
                Enchantment.builder(
                        Enchantment.definition(
                                items.getOrThrow(ModItemTagProvider.MASKS),
                                items.getOrThrow(ModItemTagProvider.MASKS),
                                3,
                                1,
                                Enchantment.leveledCost(20,0),
                                Enchantment.leveledCost(41,0),
                                1,
                                AttributeModifierSlot.HEAD
                        )
                )
                        .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(UNDETECTABLE)))
        );

        register(
                registerable,
                UNDETECTABLE,
                Enchantment.builder(
                        Enchantment.definition(
                                items.getOrThrow(ModItemTagProvider.MASKS),
                                items.getOrThrow(ModItemTagProvider.MASKS),
                                3,
                                1,
                                Enchantment.leveledCost(20,0),
                                Enchantment.leveledCost(41,0),
                                1,
                                AttributeModifierSlot.HEAD
                        )
                )
                        .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(CLEARING)))
        );

        register(registerable,HYPERREFLEXIA,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.RABBIT_MASKS),
                        items.getOrThrow(ModItemTagProvider.RABBIT_MASKS),
                        5,
                        3,
                        Enchantment.leveledCost(0,10),
                        Enchantment.leveledCost(30,0),
                        1,
                        AttributeModifierSlot.HEAD
                ))
                .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(HEADSTRONG)))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.hyperreflexia"),
                                EntityAttributes.MOVEMENT_SPEED,
                                EnchantmentLevelBasedValue.linear(0.2f, 0.1f),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.hyperreflexia"),
                                EntityAttributes.MOVEMENT_EFFICIENCY,
                                EnchantmentLevelBasedValue.linear(0.2f, 0.1f),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.hyperreflexia"),
                                EntityAttributes.WATER_MOVEMENT_EFFICIENCY,
                                EnchantmentLevelBasedValue.linear(0.2f, 0.1f),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.hyperreflexia"),
                                EntityAttributes.ATTACK_SPEED,
                                EnchantmentLevelBasedValue.linear(0.6f, 0.4f),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        )));

        register(registerable,HEADSTRONG,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.RABBIT_MASKS),
                        items.getOrThrow(ModItemTagProvider.RABBIT_MASKS),
                        5,
                        3,
                        Enchantment.leveledCost(0,10),
                        Enchantment.leveledCost(30,0),
                        1,
                        AttributeModifierSlot.HEAD
                ))
                .exclusiveSet(RegistryEntryList.of(enchantments.getOrThrow(HYPERREFLEXIA)))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.headstrong"),
                                EntityAttributes.ATTACK_DAMAGE,
                                EnchantmentLevelBasedValue.linear(1, 1),
                                EntityAttributeModifier.Operation.ADD_VALUE
                        )));

        register(registerable,MIMIC,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.RABBIT_MASKS),
                        items.getOrThrow(ModItemTagProvider.RABBIT_MASKS),
                        4,
                        3,
                        Enchantment.leveledCost(15,10),
                        Enchantment.leveledCost(45,20),
                        2,
                        AttributeModifierSlot.HEAD
                ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.mimic"),
                                EntityAttributes.SAFE_FALL_DISTANCE,
                                EnchantmentLevelBasedValue.linear(1, 1),
                                EntityAttributeModifier.Operation.ADD_VALUE
                        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.mimic"),
                                EntityAttributes.JUMP_STRENGTH,
                                EnchantmentLevelBasedValue.linear(0.2f, 0.2f),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        )));

        register(registerable,SCUBA,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.MASKS),
                        items.getOrThrow(ModItemTagProvider.MASKS),
                        4,
                        1,
                        Enchantment.leveledCost(15,0),
                        Enchantment.leveledCost(30,0),
                        1,
                        AttributeModifierSlot.HEAD
                ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.scuba"),
                                EntityAttributes.SUBMERGED_MINING_SPEED,
                                EnchantmentLevelBasedValue.constant(5),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.scuba"),
                                EntityAttributes.OXYGEN_BONUS,
                                EnchantmentLevelBasedValue.constant(6),
                                EntityAttributeModifier.Operation.ADD_VALUE
                        )));

        register(registerable,AFFINITY,Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModItemTagProvider.MASKS),
                        items.getOrThrow(ModItemTagProvider.MASKS),
                        4,
                        3,
                        Enchantment.leveledCost(24,6),
                        Enchantment.leveledCost(30,0),
                        1,
                        AttributeModifierSlot.HEAD
                ))
                .addEffect(EnchantmentEffectComponentTypes.MOB_EXPERIENCE, new MultiplyEnchantmentEffect(EnchantmentLevelBasedValue.linear(0.5f)))
                .addEffect(EnchantmentEffectComponentTypes.BLOCK_EXPERIENCE, new MultiplyEnchantmentEffect(EnchantmentLevelBasedValue.linear(0.5f)))
        );
    }

    public static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}
