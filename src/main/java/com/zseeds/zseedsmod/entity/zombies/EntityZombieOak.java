package com.zseeds.zseedsmod.entity.zombies;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieOak extends EntityZombieBase {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/oak_zombie");
	
    public EntityZombieOak(World worldIn) {
        super(worldIn);
        mobTexture = new ResourceLocation("zseeds:textures/entity/oak_zombie.png");
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}