package net.theljplayer.ssm_mod.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.world.World;
import net.theljplayer.ssm_mod.entity.ModEntityAttributes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = LivingEntity.class,priority = 1200)

public abstract class LivingEntityMixin extends Entity {
    @Final
    @Shadow
    private AttributeContainer attributes;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @ModifyReturnValue(method = "createLivingAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder inti(DefaultAttributeContainer.Builder optional) {
        return optional.add(ModEntityAttributes.AIR_JUMP);
    }
}
