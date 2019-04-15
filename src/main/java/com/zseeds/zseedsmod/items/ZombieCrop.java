package com.zseeds.zseedsmod.items;

import java.util.ArrayList;
import java.util.Random;

import com.zseeds.zseedsmod.init.ModBlocks;
import com.zseeds.zseedsmod.init.ModItems;

import net.minecraft.block.Block;
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

public class ZombieCrop extends BlockCrops {

	public static final PropertyInteger CROP_AGE = PropertyInteger.create("age", 0, 4);
	private static final AxisAlignedBB[] CROP_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.35D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.40D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D)};
	private final ArrayList<Block> mutationBlocks = new ArrayList<Block>();
	private final ArrayList<ResourceLocation> zombies = new ArrayList<ResourceLocation>();
	private final ArrayList<Integer> chances = new ArrayList<Integer>();
	private final ResourceLocation curr_zombie;
	private final String seedName;
	
	public ZombieCrop(String name, ResourceLocation rl, String sn) {
		super();
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setSoundType(SoundType.STONE);
		this.curr_zombie = rl;
		seedName = sn;
	}
	
	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
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
			
			IBlockState north = worldIn.getBlockState(pos.down().north());
			IBlockState east = worldIn.getBlockState(pos.down().east());
			IBlockState west = worldIn.getBlockState(pos.down().west());
			IBlockState south = worldIn.getBlockState(pos.down().south());
			IBlockState northeast = worldIn.getBlockState(pos.down().north().east());
			IBlockState northwest = worldIn.getBlockState(pos.down().north().west());
			IBlockState southeast = worldIn.getBlockState(pos.down().south().east());
			IBlockState southwest = worldIn.getBlockState(pos.down().south().west());
			
			Block m = ModBlocks.MutationBlock;
			boolean mutate = (north.getBlock() == m || east.getBlock() == m || south.getBlock() == m || west.getBlock() == m 
					|| northeast.getBlock() == m || northwest.getBlock() == m || southeast.getBlock() == m || southwest.getBlock() == m);
			
			for(int i = 0; i < mutationBlocks.size(); i++) {
				int maxRand = chances.get(i);
				
				if(mutate) {
					maxRand = chances.get(i) - 5;
				}
			
				Block b = mutationBlocks.get(i);
				if(north.getBlock() == b || east.getBlock() == b || south.getBlock() == b || west.getBlock() == b
						|| northeast.getBlock() == b || northwest.getBlock() == b || southeast.getBlock() == b || southwest.getBlock() == b) {
					if(random.nextInt(maxRand) < 3) {
						Entity mob = EntityList.createEntityByIDFromName(zombies.get(i), worldIn);
						mob.setPosition(pos.getX() - 0.5, pos.getY(), pos.getZ() - 0.5);
						worldIn.spawnEntity(mob);
						worldIn.destroyBlock(pos, false);
						return;
					} 
				} 
			}
			
			Entity mob = EntityList.createEntityByIDFromName(curr_zombie, worldIn);
			mob.setPosition(pos.getX() - 0.5, pos.getY(), pos.getZ() - 0.5);
			worldIn.spawnEntity(mob);
			worldIn.destroyBlock(pos, false);
		}
	}
	
	public void addMutation(Block block, ResourceLocation zombie, int chance) {
		mutationBlocks.add(block);
		zombies.add(zombie);
		chances.add(chance);
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
		//return ModItems.ZombieBaseSeeds;
		return Item.getByNameOrId("zseeds:" + seedName);
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

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {CROP_AGE});
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CROP_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
}