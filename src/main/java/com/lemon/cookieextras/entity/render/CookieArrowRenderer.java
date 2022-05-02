package com.lemon.cookieextras.entity.render;

import com.lemon.cookieextras.CookieExtras;
import com.lemon.cookieextras.entity.projectile.CookieArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CookieArrowRenderer extends ArrowRenderer<CookieArrowEntity> {


    public CookieArrowRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    public ResourceLocation getEntityTexture(CookieArrowEntity entity) {
        Item referenceItem = entity.getArrowStack().getItem();
        return new ResourceLocation(CookieExtras.MOD_ID, "textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
    }
}
