package com.lemon.cookieextras.item;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.block.ModBlocks;
import com.lemon.cookieextras.entity.ModEntityTypes;
import com.lemon.cookieextras.item.custom.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CookieExtras.MOD_ID);

    public static final RegistryObject<Item> COOKIEGEM = ITEMS.register("cookiegem",
            () -> new Item(new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> IRON_COOKIE = ITEMS.register("iron_cookie",
            () -> new Item(new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> HARDENED_IRON_INGOT = ITEMS.register("hardened_iron_ingot",
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

    public static final RegistryObject<Item> COOKIEGEM_BOOTS = ITEMS.register("cookiegem_boots",
            () -> new CookieArmor(ModArmorMaterial.COOKIEGEM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_LEGGINGS = ITEMS.register("cookiegem_leggings",
            () -> new CookieArmor(ModArmorMaterial.COOKIEGEM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_CHESTPLATE = ITEMS.register("cookiegem_chestplate",
            () -> new CookieArmor(ModArmorMaterial.COOKIEGEM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_HELMET = ITEMS.register("cookiegem_helmet",
            () -> new CookieArmor(ModArmorMaterial.COOKIEGEM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_SUPER_HELMET = ITEMS.register("cookiegem_super_helmet",
            () -> new SuperArmor(ModArmorMaterial.COOKIEGEM_SUPER, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_SUPER_CHESTPLATE = ITEMS.register("cookiegem_super_chestplate",
            () -> new SuperArmor(ModArmorMaterial.COOKIEGEM_SUPER, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_SUPER_LEGGINGS = ITEMS.register("cookiegem_super_leggings",
            () -> new SuperArmor(ModArmorMaterial.COOKIEGEM_SUPER, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIEGEM_SUPER_BOOTS = ITEMS.register("cookiegem_super_boots",
            () -> new SuperArmor(ModArmorMaterial.COOKIEGEM_SUPER, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<ModSpawnEgg> COOKIE_MONSTER_SPAWN_EGG = ITEMS.register("cookie_monster_spawn_egg",
            () -> new ModSpawnEgg(ModEntityTypes.COOKIE_MONSTER, 0x464F56, 0x1D6336,
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIE_SEED = ITEMS.register("cookie_seed",
            () -> new BlockItem(ModBlocks.COOKIE_PLANT.get(),
                    new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP)));

    public static final RegistryObject<Item> COOKIE_ARROW = ITEMS.register("cookie_arrow",
            () -> new CookieArrowItem(new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP), 1.5f));

    public static final RegistryObject<Item> COOKIE_BOW = ITEMS.register("cookie_bow",
            () -> new CookieBow(new Item.Properties().group(ModItemGroup.MORE_COOKIES_GROUP).maxStackSize(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
