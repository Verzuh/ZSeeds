package com.zseeds.zseedsmod.items;

import java.util.Random;

import com.zseeds.zseedsmod.init.ModBlocks;
import com.zseeds.zseedsmod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ZombieCrop extends BlockCrops {

	public static final PropertyInteger CROP_AGE = PropertyInteger.create("age", 0, 4);
	private static final AxisAlignedBB[] CROP_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.35D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.40D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D)};

	public ZombieCrop(String name) {
		super();
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	protected boolean canSustainBush(IBlockState state)
	{
		return state.getBlock() == Blocks.DIRT;
	}

	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	{
		IBlockState soil = worldIn.getBlockState(pos.down());

		return (worldIn.canSeeSky(pos) && soil.getBlock() == Blocks.DIRT);
	}
	
	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		if(this.getAge(state) == 4) {
			Entity mob = EntityList.createEntityByID(54, worldIn);
			mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
			worldIn.spawnEntity(mob);
			
			worldIn.destroyBlock(pos, true);
		}
	}

	protected PropertyInteger getAgeProperty()
	{
		return CROP_AGE;
	}

	public int getMaxAge()
	{
		return 4;
	}

	@Override
	protected Item getSeed()
	{
		return ModItems.exampleSeeds;
	}

	@Override
	protected Item getCrop()
	{
		return ModItems.exampleItem;
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (rand.nextInt(3) == 0)
		{
			this.checkAndDropBlock(worldIn, pos, state);
			//Entity mob = EntityList.createEntityByID(54, worldIn);
			//mob.setPosition(pos.getX(), pos.getY(), pos.getZ());
			//worldIn.spawnEntity(mob);
		}
		else
		{
			super.updateTick(worldIn, pos, state, rand);
		}
	}

	protected int getBonemealAgeIncrease(World worldIn)
	{
		return MathHelper.getInt(worldIn.rand, 1, 3);
	}

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {CROP_AGE});
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CROP_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
}