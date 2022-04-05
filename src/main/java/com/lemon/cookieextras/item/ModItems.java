package com.lemon.cookieextras.item;

import com.lemon.cookieextras.CookieExtras;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CookieExtras.MOD_ID);

    public static final RegistryObject<Item> COOKIEGEM = ITEMS.register("cookiegem",
            () -> new Item(new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_SWORD = ITEMS.register("cookiegem_sword",
            () -> new SwordItem(ModItemTier.COOKIEGEM, 3, 1f,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_PICKAXE = ITEMS.register("cookiegem_pickaxe",
            () -> new PickaxeItem(ModItemTier.COOKIEGEM, 0, -1f,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_SHOVEL = ITEMS.register("cookiegem_shovel",
            () -> new ShovelItem(ModItemTier.COOKIEGEM, 0, -1f,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_AXE = ITEMS.register("cookiegem_axe",
            () -> new AxeItem(ModItemTier.COOKIEGEM, 4, -3f,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_HOE = ITEMS.register("cookiegem_hoe",
            () -> new HoeItem(ModItemTier.COOKIEGEM, 0, 0f,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
