package com.lemon.cookieextras.entity;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.entity.custom.CookieMonsterEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, CookieExtras.MOD_ID);

    public static final RegistryObject<EntityType<CookieMonsterEntity>> COOKIE_MONSTER =
            ENTITY_TYPES.register("cookie_monster",
                    () -> EntityType.Builder.create(CookieMonsterEntity::new,
                            EntityClassification.MONSTER).size(1f, 3f)
                            .build(new ResourceLocation(CookieExtras.MOD_ID, "cookie_monster").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
