package net.theljplayer.ssm_mod.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.theljplayer.ssm_mod.enchantment.ModEnchantments;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin (InGameHud.class)
public abstract class ClearingMixin {

    @Shadow
    @Final
    private MinecraftClient client;
    @Unique
    private static final Identifier CLEARING_OVERLAY = Identifier.of("ssm_mod:textures/overlay/clearing.png");

    @Unique
    private void renderClearingOverlay( DrawContext context) {
        float f = Math.min(context.getScaledWindowWidth(), context.getScaledWindowHeight());
        float h = Math.min(context.getScaledWindowWidth() / f, context.getScaledWindowHeight() / f);
        int i = MathHelper.floor(f * 1.85 * h);
        int j = MathHelper.floor(f * 1.85 * h);
        int k = (context.getScaledWindowWidth() - i) / 2;
        int l = (context.getScaledWindowHeight() - j) / 2;
        int m = k + i;
        int n = l + j;
        context.drawTexture(RenderPipelines.GUI_TEXTURED, CLEARING_OVERLAY, k, l, 0.0F, 0.0F, i, j, i, j);
        context.fill(RenderPipelines.GUI, 0, n, context.getScaledWindowWidth(), context.getScaledWindowHeight(), -16777216);
        context.fill(RenderPipelines.GUI, 0, 0, context.getScaledWindowWidth(), l, -16777216);
        context.fill(RenderPipelines.GUI, 0, l, k, n, -16777216);
        context.fill(RenderPipelines.GUI, m, l, context.getScaledWindowWidth(), n, -16777216);
    }

    @Inject(method = "renderMiscOverlays", at = @At(value = "INVOKE", target = "Lnet/minecraft/component/type/EquippableComponent;cameraOverlay()Ljava/util/Optional;", shift = At.Shift.BEFORE), cancellable = true)
    public void renderSpyglassOverlay(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (this.client.player.getEquippedStack(EquipmentSlot.HEAD).getEnchantments().getEnchantments().contains(RegistryEntry.of(ModEnchantments.CLEARING))) {
            ci.cancel();
            this.renderClearingOverlay(context);
        }
    }
}
