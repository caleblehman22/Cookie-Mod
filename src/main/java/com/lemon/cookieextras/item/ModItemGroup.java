package com.lemon.cookieextras.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup MORE_COOKIES_GROUP = new ItemGroup("cookieExtrasTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COOKIEGEM.get());
        }
    };
}
