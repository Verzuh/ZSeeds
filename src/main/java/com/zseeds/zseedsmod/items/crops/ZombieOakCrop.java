package com.zseeds.zseedsmod.items.crops;

import java.util.Random;

import com.zseeds.zseedsmod.init.ModBlocks;
import com.zseeds.zseedsmod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ZombieOakCrop extends ZombieBaseCrop {

	public ZombieOakCrop(String name) {
		super(name);
	}
	
	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		this.updateTick(worldIn, pos, state, random);
		if(this.getAge(state) == 4) {
			
			ResourceLocation name = new ResourceLocation("zseeds:oak_zombie");
			Entity mob = EntityList.createEntityByIDFromName(name, worldIn);
			mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
			worldIn.spawnEntity(mob);
			worldIn.destroyBlock(pos, false);
		}
	}

	@Override
	protected Item getSeed()
	{
		return ModItems.ZombieOakSeeds;
	}
}