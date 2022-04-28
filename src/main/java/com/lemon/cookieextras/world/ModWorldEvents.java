package com.lemon.cookieextras.world;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.world.gen.ModEntityGeneration;
import com.lemon.cookieextras.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CookieExtras.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModEntityGeneration.onEntitySpawn(event);
    }
}
