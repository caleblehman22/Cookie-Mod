package com.lemon.cookieextras.item.custom;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class SuperArmor extends ModArmorItem {

    public SuperArmor(IArmorMaterial armorMaterial, EquipmentSlotType slotType, Properties properties) {
        super(armorMaterial, slotType, properties);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (super.getEquipmentSlot() == EquipmentSlotType.HEAD) {
            tooltip.add(new TranslationTextComponent("tooltip.cookieextras.cookiegem_super_helmet"));
        } else if (super.getEquipmentSlot() == EquipmentSlotType.CHEST) {
            tooltip.add(new TranslationTextComponent("tooltip.cookieextras.cookiegem_super_chestplate"));
        } else if (super.getEquipmentSlot() == EquipmentSlotType.LEGS) {
            tooltip.add(new TranslationTextComponent("tooltip.cookieextras.cookiegem_super_leggings"));
        } else if (super.getEquipmentSlot() == EquipmentSlotType.FEET) {
            tooltip.add(new TranslationTextComponent("tooltip.cookieextras.cookiegem_super_boots"));
        }

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
