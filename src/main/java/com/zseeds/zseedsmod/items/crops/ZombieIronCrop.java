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

public class ZombieIronCrop extends ZombieBaseCrop {

	public ZombieIronCrop(String name) {
		super(name);
	}
	
	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		this.updateTick(worldIn, pos, state, random);
		if(this.getAge(state) == 4) {
			
			int maxRand = 19;
			
			IBlockState down = worldIn.getBlockState(pos.down().down());
			IBlockState north = worldIn.getBlockState(pos.down().north());
			IBlockState east = worldIn.getBlockState(pos.down().east());
			IBlockState west = worldIn.getBlockState(pos.down().west());
			IBlockState south = worldIn.getBlockState(pos.down().south());
			
			boolean mutation_block_present = (down.getBlock() == ModBlocks.MutationBlock || north.getBlock() == ModBlocks.MutationBlock || east.getBlock() == ModBlocks.MutationBlock || south.getBlock() == ModBlocks.MutationBlock || west.getBlock() == ModBlocks.MutationBlock);
			
			if(mutation_block_present) {
				maxRand = 14;
			}
			
			if(down.getBlock() == Blocks.GOLD_BLOCK || north.getBlock() == Blocks.GOLD_BLOCK || east.getBlock() == Blocks.GOLD_BLOCK || south.getBlock() == Blocks.GOLD_BLOCK || west.getBlock() == Blocks.GOLD_BLOCK) {
				if(random.nextInt(maxRand) < 2) {
					ResourceLocation name = new ResourceLocation("zseeds:gold_zombie");
					Entity mob = EntityList.createEntityByIDFromName(name, worldIn);
					mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(mob);
					worldIn.destroyBlock(pos, false);
					return;
				} 
			} 
			if(down.getBlock() == Blocks.LAPIS_BLOCK || north.getBlock() == Blocks.LAPIS_BLOCK || east.getBlock() == Blocks.LAPIS_BLOCK || south.getBlock() == Blocks.LAPIS_BLOCK || west.getBlock() == Blocks.LAPIS_BLOCK) {
				if(random.nextInt(maxRand) < 2) {
					ResourceLocation name = new ResourceLocation("zseeds:lapis_zombie");
					Entity mob = EntityList.createEntityByIDFromName(name, worldIn);
					mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(mob);
					worldIn.destroyBlock(pos, false);
					return;
				} 
			}
			if(down.getBlock() == Blocks.REDSTONE_BLOCK || north.getBlock() == Blocks.REDSTONE_BLOCK || east.getBlock() == Blocks.REDSTONE_BLOCK || south.getBlock() == Blocks.REDSTONE_BLOCK || west.getBlock() == Blocks.REDSTONE_BLOCK) {
				if(random.nextInt(maxRand) < 2) {
					ResourceLocation name = new ResourceLocation("zseeds:redstone_zombie");
					Entity mob = EntityList.createEntityByIDFromName(name, worldIn);
					mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(mob);
					worldIn.destroyBlock(pos, false);
					return;
				} 
			}
			
			ResourceLocation name = new ResourceLocation("zseeds:iron_zombie");
			Entity mob = EntityList.createEntityByIDFromName(name, worldIn);
			mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
			worldIn.spawnEntity(mob);
			worldIn.destroyBlock(pos, false);
		}
	}
	
	@Override
	protected Item getSeed()
	{
		return ModItems.ZombieIronSeeds;
	}
}