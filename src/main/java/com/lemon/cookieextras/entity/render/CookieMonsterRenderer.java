package com.lemon.cookieextras.entity.render;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.entity.custom.CookieMonsterEntity;
import com.lemon.cookieextras.entity.model.CookieMonsterModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.util.ResourceLocation;

public class CookieMonsterRenderer extends MobRenderer<CookieMonsterEntity, CookieMonsterModel<CookieMonsterEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(CookieExtras.MOD_ID, "textures/entity/cookie_monster.png");

    public CookieMonsterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CookieMonsterModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(CookieMonsterEntity entity) {
        return TEXTURE;
    }
}
