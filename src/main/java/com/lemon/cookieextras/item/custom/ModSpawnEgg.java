package com.lemon.cookieextras.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;

public class ModSpawnEgg extends SpawnEggItem {
    /**
     * @param typeIn
     * @param primaryColorIn
     * @param secondaryColorIn
     * @param builder
     * @deprecated Forge: Use {@link ForgeSpawnEggItem} instead for suppliers
     */
    public ModSpawnEgg(EntityType<?> typeIn, int primaryColorIn, int secondaryColorIn, Properties builder) {
        super(typeIn, primaryColorIn, secondaryColorIn, builder);
    }
}
