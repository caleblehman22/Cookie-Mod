package com.lemon.cookieextras.item.custom;

import com.lemon.cookieextras.item.ModItems;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Predicate;

public class CookieBow extends BowItem {
    public static final Predicate<ItemStack> COOKIE_ARROWS = ARROWS.or((stack) -> {
        return stack.getItem() == ModItems.COOKIE_ARROW.get();
    });

    public CookieBow(Properties builder) {
        super(builder);
    }

    @Override
    public Predicate<ItemStack> getInventoryAmmoPredicate() {
        return COOKIE_ARROWS;
    }
}
