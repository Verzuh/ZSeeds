package com.zseeds.zseedsmod.entity;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieBase extends EntityZombie {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/base_zombie");

    public EntityZombieBase(World worldIn) {
        super(worldIn);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}