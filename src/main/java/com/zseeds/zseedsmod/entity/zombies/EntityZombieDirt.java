package com.zseeds.zseedsmod.entity.zombies;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieDirt extends EntityZombieBase {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/dirt_zombie");
	
    public EntityZombieDirt(World worldIn) {
        super(worldIn);
        mobTexture = new ResourceLocation("zseeds:textures/entity/dirt_zombie.png");
    }
 
    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}