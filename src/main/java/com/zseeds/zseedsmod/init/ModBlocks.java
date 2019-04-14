package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.blocks.MutationBlock;
import com.zseeds.zseedsmod.items.ZombieCrop;
import com.zseeds.zseedsmod.items.ZombieSeeds;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModBlocks {

	public static Block MutationBlock;
	
	//Tier 1
	public static ZombieCrop ZombieBaseCrop;
	
	//Tier 2
	public static ZombieCrop ZombieClayCrop;
	public static ZombieCrop ZombieGravelCrop;
	public static ZombieCrop ZombieSandCrop;
	public static ZombieCrop ZombieDirtCrop;
	public static ZombieCrop ZombieStoneCrop;
	public static ZombieCrop ZombieOakCrop;
	public static ZombieCrop ZombieClothCrop;
	public static ZombieCrop ZombieSnowCrop;
	
	public static ZombieCrop ZombieIronCrop;
	public static ZombieCrop ZombieCoalCrop;
	public static ZombieCrop ZombieGoldCrop;
	public static ZombieCrop ZombieLapisCrop;
	public static ZombieCrop ZombieRedstoneCrop;
	public static ZombieCrop ZombieEmeraldCrop;
	public static ZombieCrop ZombieDiamondCrop;
	
	public static void initSeeds() {
	}
	
	public static void init() {
		MutationBlock = new MutationBlock("mutation_block", Material.GROUND).setHardness(1.0F).setCreativeTab(ModItems.tabExampleMod);
		MutationBlock.setHarvestLevel("pickaxe", 2);
		
		//Tier 1
		ZombieBaseCrop = new ZombieCrop("zombie_base_crop", new ResourceLocation("zseeds:base_zombie"), ModItems.ZombieBaseSeeds);
		//ZombieBaseCrop.setCurrentZombie(new ResourceLocation("zseeds:base_zombie"));
		ZombieBaseCrop.addMutation(Blocks.IRON_BLOCK, new ResourceLocation("zseeds:iron_zombie"), 19);
		ZombieBaseCrop.addMutation(Blocks.COAL_BLOCK, new ResourceLocation("zseeds:coal_zombie"), 19);
		
		//Tier 2
		ZombieClayCrop = new ZombieCrop("zombie_clay_crop", new ResourceLocation("zseeds:clay_zombie"), ModItems.ZombieClaySeeds);
		//ZombieClayCrop.setCurrentZombie(new ResourceLocation("zseeds:clay_zombie"));
		ZombieGravelCrop = new ZombieCrop("zombie_gravel_crop", new ResourceLocation("zseeds:gravel_zombie"), ModItems.ZombieGravelSeeds);
		//ZombieGravelCrop.setCurrentZombie(new ResourceLocation("zseeds:gravel_zombie"));
		ZombieSandCrop = new ZombieCrop("zombie_sand_crop", new ResourceLocation("zseeds:sand_zombie"), ModItems.ZombieSandSeeds);
		//ZombieSandCrop.setCurrentZombie(new ResourceLocation("zseeds:sand_zombie"));
		ZombieDirtCrop = new ZombieCrop("zombie_dirt_crop", new ResourceLocation("zseeds:dirt_zombie"), ModItems.ZombieDirtSeeds);
		//ZombieDirtCrop.setCurrentZombie(new ResourceLocation("zseeds:dirt_zombie"));
		ZombieStoneCrop = new ZombieCrop("zombie_stone_crop", new ResourceLocation("zseeds:stone_zombie"), ModItems.ZombieStoneSeeds);
		//ZombieStoneCrop.setCurrentZombie(new ResourceLocation("zseeds:stone_zombie"));
		ZombieOakCrop = new ZombieCrop("zombie_oak_crop", new ResourceLocation("zseeds:oak_zombie"), ModItems.ZombieOakSeeds);
		//ZombieOakCrop.setCurrentZombie(new ResourceLocation("zseeds:oak_zombie"));
		ZombieClothCrop = new ZombieCrop("zombie_cloth_crop", new ResourceLocation("zseeds:cloth_zombie"), ModItems.ZombieClothSeeds);
		//ZombieClothCrop.setCurrentZombie(new ResourceLocation("zseeds:cloth_zombie"));
		ZombieSnowCrop = new ZombieCrop("zombie_snow_crop", new ResourceLocation("zseeds:snow_zombie"), ModItems.ZombieSnowSeeds);
		//ZombieSnowCrop.setCurrentZombie(new ResourceLocation("zseeds:snow_zombie"));
		
		ModBlocks.ZombieIronCrop = new ZombieCrop("zombie_iron_crop", new ResourceLocation("zseeds:iron_zombie"), ModItems.ZombieIronSeeds);
		//ModBlocks.ZombieIronCrop.setCurrentZombie(new ResourceLocation("zseeds:iron_zombie"));
		ModBlocks.ZombieCoalCrop = new ZombieCrop("zombie_coal_crop", new ResourceLocation("zseeds:coal_zombie"), ModItems.ZombieCoalSeeds);
		//ModBlocks.ZombieCoalCrop.setCurrentZombie(new ResourceLocation("zseeds:coal_zombie"));
		ModBlocks.ZombieGoldCrop = new ZombieCrop("zombie_gold_crop", new ResourceLocation("zseeds:gold_zombie"), ModItems.ZombieGoldSeeds);
		//ModBlocks.ZombieGoldCrop.setCurrentZombie(new ResourceLocation("zseeds:gold_zombie"));
		ModBlocks.ZombieLapisCrop = new ZombieCrop("zombie_lapis_crop", new ResourceLocation("zseeds:lapis_zombie"), ModItems.ZombieLapisSeeds);
		//ModBlocks.ZombieLapisCrop.setCurrentZombie(new ResourceLocation("zseeds:lapis_zombie"));
		ModBlocks.ZombieRedstoneCrop = new ZombieCrop("zombie_redstone_crop", new ResourceLocation("zseeds:redstone_zombie"), ModItems.ZombieRedstoneSeeds);
		//ModBlocks.ZombieRedstoneCrop.setCurrentZombie(new ResourceLocation("zseeds:redstone_zombie"));
		ModBlocks.ZombieEmeraldCrop = new ZombieCrop("zombie_emerald_crop", new ResourceLocation("zseeds:emerald_zombie"), ModItems.ZombieEmeraldSeeds);
		//ModBlocks.ZombieEmeraldCrop.setCurrentZombie(new ResourceLocation("zseeds:emerald_zombie"));
		ModBlocks.ZombieDiamondCrop = new ZombieCrop("zombie_diamond_crop", new ResourceLocation("zseeds:diamond_zombie"), ModItems.ZombieDiamondSeeds);
		//ModBlocks.ZombieDiamondCrop.setCurrentZombie(new ResourceLocation("zseeds:diamond_zombie"));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(ModBlocks.MutationBlock);
		event.getRegistry().register(ModBlocks.ZombieBaseCrop);
		event.getRegistry().register(ModBlocks.ZombieClayCrop);
		event.getRegistry().register(ModBlocks.ZombieGravelCrop);
		event.getRegistry().register(ModBlocks.ZombieSandCrop);
		event.getRegistry().register(ModBlocks.ZombieDirtCrop);
		event.getRegistry().register(ModBlocks.ZombieStoneCrop);
		event.getRegistry().register(ModBlocks.ZombieOakCrop);
		event.getRegistry().register(ModBlocks.ZombieClothCrop);
		event.getRegistry().register(ModBlocks.ZombieSnowCrop);
		event.getRegistry().register(ModBlocks.ZombieIronCrop);
		event.getRegistry().register(ModBlocks.ZombieCoalCrop);
		event.getRegistry().register(ModBlocks.ZombieGoldCrop);
		event.getRegistry().register(ModBlocks.ZombieLapisCrop);
		event.getRegistry().register(ModBlocks.ZombieRedstoneCrop);
		event.getRegistry().register(ModBlocks.ZombieEmeraldCrop);
		event.getRegistry().register(ModBlocks.ZombieDiamondCrop);
	
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(MutationBlock).setRegistryName(MutationBlock.getRegistryName()));
		
		//Tier 1
		ModItems.ZombieBaseSeeds = new ZombieSeeds(ModBlocks.ZombieBaseCrop, Blocks.GRASS, "zombie_base_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieBaseSeeds);
		
		//Tier 2
		ModItems.ZombieClaySeeds = new ZombieSeeds(ModBlocks.ZombieClayCrop, Blocks.GRASS, "zombie_clay_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieClaySeeds);
		ModItems.ZombieGravelSeeds = new ZombieSeeds(ModBlocks.ZombieGravelCrop, Blocks.GRASS, "zombie_gravel_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieGravelSeeds);
		ModItems.ZombieSandSeeds = new ZombieSeeds(ModBlocks.ZombieSandCrop, Blocks.GRASS, "zombie_sand_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieSandSeeds);
		ModItems.ZombieDirtSeeds = new ZombieSeeds(ModBlocks.ZombieDirtCrop, Blocks.GRASS, "zombie_dirt_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieDirtSeeds);
		ModItems.ZombieStoneSeeds = new ZombieSeeds(ModBlocks.ZombieStoneCrop, Blocks.GRASS, "zombie_stone_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieStoneSeeds);
		ModItems.ZombieOakSeeds = new ZombieSeeds(ModBlocks.ZombieOakCrop, Blocks.GRASS, "zombie_oak_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieOakSeeds);
		ModItems.ZombieClothSeeds = new ZombieSeeds(ModBlocks.ZombieClothCrop, Blocks.GRASS, "zombie_cloth_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieClothSeeds);
		ModItems.ZombieSnowSeeds = new ZombieSeeds(ModBlocks.ZombieSnowCrop, Blocks.GRASS, "zombie_snow_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieSnowSeeds);
		
		ModItems.ZombieIronSeeds = new ZombieSeeds(ModBlocks.ZombieIronCrop, Blocks.GRASS, "zombie_iron_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieIronSeeds);
		ModItems.ZombieCoalSeeds = new ZombieSeeds(ModBlocks.ZombieCoalCrop, Blocks.GRASS, "zombie_coal_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieCoalSeeds);
		ModItems.ZombieGoldSeeds = new ZombieSeeds(ModBlocks.ZombieGoldCrop, Blocks.GRASS, "zombie_gold_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieGoldSeeds);
		ModItems.ZombieLapisSeeds = new ZombieSeeds(ModBlocks.ZombieLapisCrop, Blocks.GRASS, "zombie_lapis_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieLapisSeeds);
		ModItems.ZombieRedstoneSeeds = new ZombieSeeds(ModBlocks.ZombieRedstoneCrop, Blocks.GRASS, "zombie_redstone_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieRedstoneSeeds);
		ModItems.ZombieEmeraldSeeds = new ZombieSeeds(ModBlocks.ZombieEmeraldCrop, Blocks.GRASS, "zombie_emerald_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieEmeraldSeeds);
		ModItems.ZombieDiamondSeeds = new ZombieSeeds(ModBlocks.ZombieDiamondCrop, Blocks.GRASS, "zombie_diamond_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieDiamondSeeds);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(MutationBlock));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}