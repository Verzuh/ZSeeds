package com.zseeds.zseedsmod.entity.zombies;

import javax.annotation.Nullable;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityZombieCobblestone extends EntityZombieBase {
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/cobblestone_zombie");
	
    public EntityZombieCobblestone(World worldIn) {
        super(worldIn);
        mobTexture = new ResourceLocation("zseeds:textures/entity/cobblestone_zombie.png");
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}