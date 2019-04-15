package com.zseeds.zseedsmod.entity;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieSnow extends EntityZombieBase {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/snow_zombie");
	private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/snow_zombie.png");
	
    public EntityZombieSnow(World worldIn) {
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
    
    public ResourceLocation getTexture() {
    	return mobTexture;
    }
}