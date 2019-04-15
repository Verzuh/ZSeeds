package com.zseeds.zseedsmod.entity.zombies;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieSand extends EntityZombieBase {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/sand_zombie");
	
    public EntityZombieSand(World worldIn) {
        super(worldIn);
        mobTexture = new ResourceLocation("zseeds:textures/entity/sand_zombie.png");
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}