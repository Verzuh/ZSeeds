package com.zseeds.zseedsmod.entity;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieCoal extends EntityZombie {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/coal_zombie");

    public EntityZombieCoal(World worldIn) {
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