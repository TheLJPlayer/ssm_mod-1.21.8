package net.theljplayer.ssm_mod.effect;

import net.minecraft.client.render.fog.FogRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class FastForwardEffect extends StatusEffect {
    protected FastForwardEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return super.canApplyUpdateEffect(duration, amplifier);
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity) {
            FogRenderer.toggleFog();
        }
        return super.applyUpdateEffect(world, entity, amplifier);
    }
}
