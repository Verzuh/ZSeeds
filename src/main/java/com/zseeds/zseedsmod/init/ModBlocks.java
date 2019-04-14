package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.blocks.MutationBlock;
import com.zseeds.zseedsmod.items.ZombieSeeds;
import com.zseeds.zseedsmod.items.crops.*;

import com.zseeds.zseedsmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModBlocks {

	public static Block MutationBlock;
	
	//Tier 1
	static Block ZombieBaseCrop;
	
	//Tier 2
	static Block ZombieClayCrop;
	static Block ZombieGravelCrop;
	static Block ZombieSandCrop;
	static Block ZombieDirtCrop;
	static Block ZombieStoneCrop;
	static Block ZombieOakCrop;
	static Block ZombieClothCrop;
	static Block ZombieSnowCrop;
	
	static Block ZombieIronCrop;
	static Block ZombieCoalCrop;
	static Block ZombieGoldCrop;
	static Block ZombieLapisCrop;
	static Block ZombieRedstoneCrop;
	static Block ZombieEmeraldCrop;
	static Block ZombieDiamondCrop;
	
	public static void initSeeds() {
		
	}
	
	public static void init() {
		MutationBlock = new MutationBlock("mutation_block", Material.GROUND).setHardness(1.0F).setCreativeTab(ModItems.tabExampleMod);
		MutationBlock.setHarvestLevel("pickaxe", 2);
		
		//Tier 1
		ZombieBaseCrop = new ZombieBaseCrop("zombie_base_crop");
		
		//Tier 2
		ZombieClayCrop = new ZombieClayCrop("zombie_clay_crop");
		ZombieGravelCrop = new ZombieGravelCrop("zombie_gravel_crop");
		ZombieSandCrop = new ZombieSandCrop("zombie_sand_crop");
		ZombieDirtCrop = new ZombieDirtCrop("zombie_dirt_crop");
		ZombieStoneCrop = new ZombieStoneCrop("zombie_stone_crop");
		ZombieOakCrop = new ZombieOakCrop("zombie_oak_crop");
		ZombieClothCrop = new ZombieClothCrop("zombie_cloth_crop");
		ZombieSnowCrop = new ZombieSnowCrop("zombie_snow_crop");
		
		ZombieIronCrop = new ZombieIronCrop("zombie_iron_crop");
		ZombieCoalCrop = new ZombieCoalCrop("zombie_coal_crop");
		ZombieGoldCrop = new ZombieGoldCrop("zombie_gold_crop");
		ZombieLapisCrop = new ZombieLapisCrop("zombie_lapis_crop");
		ZombieRedstoneCrop = new ZombieRedstoneCrop("zombie_redstone_crop");
		ZombieEmeraldCrop = new ZombieEmeraldCrop("zombie_emerald_crop");
		ZombieDiamondCrop = new ZombieDiamondCrop("zombie_diamond_crop");
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(MutationBlock, ZombieBaseCrop, ZombieClayCrop, ZombieGravelCrop, ZombieSandCrop, ZombieDirtCrop, ZombieStoneCrop, ZombieOakCrop, ZombieClothCrop, ZombieSnowCrop, ZombieIronCrop, ZombieCoalCrop, ZombieGoldCrop, ZombieLapisCrop, ZombieRedstoneCrop, ZombieEmeraldCrop, ZombieDiamondCrop);
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