package com.lemon.cookieextras.item.custom;

import com.lemon.cookieextras.entity.projectile.CookieArrowEntity;
import com.lemon.cookieextras.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CookieArrowItem extends ArrowItem {
    public final float damage;

    public CookieArrowItem(Properties builder, float damage) {
        super(builder);
        this.damage = damage;
    }

    @Override
    public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
        CookieArrowEntity arrowentity = new CookieArrowEntity(shooter, worldIn, ModItems.COOKIE_ARROW.get());
        arrowentity.setDamage(this.damage);
        return arrowentity;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
        return enchant <= 0 ? false : this.getClass() == CookieArrowItem.class;
    }
}
