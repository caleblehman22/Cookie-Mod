package com.lemon.cookieextras.item.custom;

import com.lemon.cookieextras.item.ModItems;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class CookieBow extends BowItem {
    public static final Predicate<ItemStack> STEEL_ARROWS = (stack) -> {
        return stack.getItem() == ModItems.STEEL_ARROW.get();
    };

    public CookieBow(Properties builder) {
        super(builder);
    }

    @Override
    public Predicate<ItemStack> getInventoryAmmoPredicate() {
        return ARROWS.or(STEEL_ARROWS);
    }
}
