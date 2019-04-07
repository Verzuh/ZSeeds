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

public class ZombieIronCrop extends BlockCrops {

	public static final PropertyInteger CROP_AGE = PropertyInteger.create("age", 0, 4);
	private static final AxisAlignedBB[] CROP_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.35D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.40D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D)};

	public ZombieIronCrop(String name) {
		super();
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setSoundType(SoundType.STONE);
	}

	protected boolean canSustainBush(IBlockState state)
	{
		return state.getBlock() == Blocks.GRASS;
	}

	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	{
		IBlockState soil = worldIn.getBlockState(pos.down());

		return (soil.getBlock() == Blocks.GRASS);
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
		return ModItems.ZombieIronSeeds;
	}
	
	@Override
	protected Item getCrop() {
		return null;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (!worldIn.isAreaLoaded(pos, 1)) return;
		if (rand.nextInt(10) == 0)
		{
			this.checkAndDropBlock(worldIn, pos, state);
		}
		else
		{
			super.updateTick(worldIn, pos, state, rand);
			
			int i = this.getAge(state);

            if (i < this.getMaxAge())
            {
                float f = getGrowthChance(this, worldIn, pos);

                if(net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, rand.nextInt((int)(25.0F / f) + 1) == 0))
                {
                    worldIn.setBlockState(pos, this.withAge(i + 1), 2);
                    net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state, worldIn.getBlockState(pos));
                }
            }
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