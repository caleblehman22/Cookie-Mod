package com.lemon.cookieextras.entity;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.entity.custom.CookieMonsterEntity;
import com.lemon.cookieextras.entity.projectile.CookieArrowEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ArrowEntity;
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

    // public static final EntityType<ArrowEntity> ARROW = register("arrow", EntityType.Builder.<ArrowEntity>create(ArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).updateInterval(20));

    public static final RegistryObject<EntityType<CookieArrowEntity>> COOKIE_ARROW =
            ENTITY_TYPES.register("cookie_arrow",
                    () -> EntityType.Builder.<CookieArrowEntity>create(CookieArrowEntity::new,
                            EntityClassification.MISC).size(0.5f, 0.5f).trackingRange(4)
                            .updateInterval(20).build(new ResourceLocation(CookieExtras.MOD_ID, "cookie_arrow")
                                    .toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
