package com.zseeds.zseedsmod.entity.zombies;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieBase extends EntityZombie {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/base_zombie");
	protected ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/base_zombie.png");
	
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
    
    public ResourceLocation getTexture() {
    	return mobTexture;
    }
}