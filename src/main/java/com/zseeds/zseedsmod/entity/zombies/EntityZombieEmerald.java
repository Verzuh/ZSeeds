package com.zseeds.zseedsmod.entity.zombies;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieEmerald extends EntityZombieBase {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/emerald_zombie");
	
    public EntityZombieEmerald(World worldIn) {
        super(worldIn);
        mobTexture = new ResourceLocation("zseeds:textures/entity/emerald_zombie.png");
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}