package com.lemon.cookieextras.events;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.entity.ModEntityTypes;
import com.lemon.cookieextras.entity.custom.CookieMonsterEntity;
import com.lemon.cookieextras.item.custom.ModSpawnEgg;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CookieExtras.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.COOKIE_MONSTER.get(), CookieMonsterEntity.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEgg.initSpawnEggs();
    }
}
