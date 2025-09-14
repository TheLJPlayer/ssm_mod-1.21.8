package net.theljplayer.ssm_mod.item;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.theljplayer.ssm_mod.SandstoneItemsAndProgression;
import net.theljplayer.ssm_mod.datagen.ModItemTagProvider;

import java.util.EnumMap;
import java.util.Map;

public class ModArmorMaterial {

    public static final int STEEL_DURABILITY = 24;
    public static final int CLOTH_DURABILITY = 24;

    public static final RegistryKey<EquipmentAsset> STEEL_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "steel"));

    public static final ArmorMaterial STEEL = new ArmorMaterial(
            STEEL_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.LEGGINGS, 5,
                    EquipmentType.BOOTS, 3,
                    EquipmentType.BODY, 7
            ),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0F,
            1.0F,
            ModItemTagProvider.REPAIRS_STEEL_ARMOR,
            STEEL_ARMOR_MATERIAL_KEY
    );

    public static final RegistryKey<EquipmentAsset> CLOTH_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(SandstoneItemsAndProgression.MOD_ID, "cloth"));

    public static final ArmorMaterial CLOTH = new ArmorMaterial(
            CLOTH_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.LEGGINGS, 5,
                    EquipmentType.BOOTS, 3,
                    EquipmentType.BODY, 7
            ),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            1.0F,
            1.0F,
            ModItemTagProvider.REPAIRS_STEEL_ARMOR,
            CLOTH_ARMOR_MATERIAL_KEY
    );
}
