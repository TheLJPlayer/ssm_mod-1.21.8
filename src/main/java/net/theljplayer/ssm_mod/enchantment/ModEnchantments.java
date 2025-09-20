package net.theljplayer.ssm_mod.enchantment;

import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;
import net.theljplayer.ssm_mod.entity.ModEntityAttributes;

public class ModEnchantments {

    public static final RegistryKey<Enchantment> AIR_JUMPS =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "air_jumps"));

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
                3,
                AttributeModifierSlot.ARMOR
        ))
                .addEffect(EnchantmentEffectComponentTypes.ATTRIBUTES,
                        new AttributeEnchantmentEffect(
                                Identifier.ofVanilla("enchantment.air_jumps"),
                                ModEntityAttributes.AIR_JUMP,
                                EnchantmentLevelBasedValue.linear(1, 1),
                                EntityAttributeModifier.Operation.ADD_VALUE
                        )));
    }

    public static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}
