package net.theljplayer.ssm_mod.mixin;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.Vec3d;
import net.theljplayer.ssm_mod.entity.ModEntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)

public abstract class AirJumpMixin {

    private int airJumps = 0;
    private boolean jumpedLastTick = false;

    @Inject(method = "tickMovement", at = @At("HEAD"))
    private void tickMovement(CallbackInfo info) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        if (player.isOnGround() || player.isClimbing()) {
            airJumps = (int) ((ClientPlayerEntity) (Object) this).getAttributeInstance(ModEntityAttributes.AIR_JUMP).getValue();
        } else if (!jumpedLastTick && airJumps > 0 && player.getVelocity().y < 0) {
            if (player.input.playerInput.jump() && !player.getAbilities().flying) {
                if (canJump(player)) {
                    --airJumps;
                    player.jump();
                    PacketByteBuf passedData = new PacketByteBuf(Unpooled.buffer());
                    passedData.writeUuid(player.getUuid());
                }
            }
        }
        jumpedLastTick = player.input.playerInput.jump();
    }

    private boolean wearingUsableElytra(ClientPlayerEntity player) {
        ItemStack chestItemStack = player.getEquippedStack(EquipmentSlot.CHEST);
        return chestItemStack.getItem() == Items.ELYTRA;
    }

    private boolean canJump(ClientPlayerEntity player) {
        return !wearingUsableElytra(player)
                && !player.isTouchingWater() && !player.hasStatusEffect(StatusEffects.LEVITATION);
    }
}
