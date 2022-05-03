package com.lemon.cookieextras.entity.projectile;

import com.lemon.cookieextras.entity.ModEntityTypes;
import com.lemon.cookieextras.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class SteelArrowEntity extends AbstractArrowEntity {
    private final Item referenceItem;

    public SteelArrowEntity(EntityType<? extends AbstractArrowEntity> type, World worldIn) {
        super(type, worldIn);
        this.referenceItem = ModItems.STEEL_ARROW.get();
    }

    public SteelArrowEntity(LivingEntity shooter, World worldIn, Item referenceItem) {
        super(ModEntityTypes.STEEL_ARROW.get(), shooter, worldIn);
        this.referenceItem = referenceItem;
    }

    @Override
    public ItemStack getArrowStack() {
        return new ItemStack(this.referenceItem);
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
