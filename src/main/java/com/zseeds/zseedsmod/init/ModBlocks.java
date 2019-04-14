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
	
	public static void init() {
		MutationBlock = new MutationBlock("mutation_block", Material.GROUND).setHardness(1.0F).setCreativeTab(ModItems.tabExampleMod);
		MutationBlock.setHarvestLevel("pickaxe", 2);
		
		//Tier 1
		ZombieBaseCrop = new ZombieCrop("zombie_base_crop", new ResourceLocation("zseeds:base_zombie"), "zombie_base_seeds");
		ZombieBaseCrop.addMutation(Blocks.IRON_BLOCK, new ResourceLocation("zseeds:iron_zombie"), 19);
		ZombieBaseCrop.addMutation(Blocks.COAL_BLOCK, new ResourceLocation("zseeds:coal_zombie"), 19);
		
		//Tier 2
		ZombieClayCrop = new ZombieCrop("zombie_clay_crop", new ResourceLocation("zseeds:clay_zombie"), "zombie_clay_seeds");
		ZombieGravelCrop = new ZombieCrop("zombie_gravel_crop", new ResourceLocation("zseeds:gravel_zombie"), "zombie_gravel_seeds");
		ZombieSandCrop = new ZombieCrop("zombie_sand_crop", new ResourceLocation("zseeds:sand_zombie"), "zombie_sand_seeds");
		ZombieDirtCrop = new ZombieCrop("zombie_dirt_crop", new ResourceLocation("zseeds:dirt_zombie"), "zombie_dirt_seeds");
		ZombieStoneCrop = new ZombieCrop("zombie_stone_crop", new ResourceLocation("zseeds:stone_zombie"), "zombie_stone_seeds");
		ZombieOakCrop = new ZombieCrop("zombie_oak_crop", new ResourceLocation("zseeds:oak_zombie"), "zombie_oak_seeds");
		ZombieClothCrop = new ZombieCrop("zombie_cloth_crop", new ResourceLocation("zseeds:cloth_zombie"), "zombie_cloth_seeds");
		ZombieSnowCrop = new ZombieCrop("zombie_snow_crop", new ResourceLocation("zseeds:snow_zombie"), "zombie_snow_seeds");
		
		ZombieIronCrop = new ZombieCrop("zombie_iron_crop", new ResourceLocation("zseeds:iron_zombie"), "zombie_iron_seeds");
		ZombieCoalCrop = new ZombieCrop("zombie_coal_crop", new ResourceLocation("zseeds:coal_zombie"), "zombie_coal_seeds");
		ZombieGoldCrop = new ZombieCrop("zombie_gold_crop", new ResourceLocation("zseeds:gold_zombie"), "zombie_gold_seeds");
		ZombieLapisCrop = new ZombieCrop("zombie_lapis_crop", new ResourceLocation("zseeds:lapis_zombie"), "zombie_lapis_seeds");
		ZombieRedstoneCrop = new ZombieCrop("zombie_redstone_crop", new ResourceLocation("zseeds:redstone_zombie"), "zombie_redstone_seeds");
		ZombieEmeraldCrop = new ZombieCrop("zombie_emerald_crop", new ResourceLocation("zseeds:emerald_zombie"), "zombie_emerald_seeds");
		ZombieDiamondCrop = new ZombieCrop("zombie_diamond_crop", new ResourceLocation("zseeds:diamond_zombie"), "zombie_diamond_seeds");
	
		initSeeds();
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(MutationBlock);
		event.getRegistry().register(ZombieBaseCrop);
		event.getRegistry().register(ZombieClayCrop);
		event.getRegistry().register(ZombieGravelCrop);
		event.getRegistry().register(ZombieSandCrop);
		event.getRegistry().register(ZombieDirtCrop);
		event.getRegistry().register(ZombieStoneCrop);
		event.getRegistry().register(ZombieOakCrop);
		event.getRegistry().register(ZombieClothCrop);
		event.getRegistry().register(ZombieSnowCrop);
		event.getRegistry().register(ZombieIronCrop);
		event.getRegistry().register(ZombieCoalCrop);
		event.getRegistry().register(ZombieGoldCrop);
		event.getRegistry().register(ZombieLapisCrop);
		event.getRegistry().register(ZombieRedstoneCrop);
		event.getRegistry().register(ZombieEmeraldCrop);
		event.getRegistry().register(ZombieDiamondCrop);
	
	}
	
	public static void initSeeds() {
		//Tier 1
		ModItems.ZombieBaseSeeds = new ZombieSeeds(ModBlocks.ZombieBaseCrop, Blocks.GRASS, "zombie_base_seeds").setCreativeTab(ModItems.tabExampleMod);
		
		//Tier 2
		ModItems.ZombieClaySeeds = new ZombieSeeds(ModBlocks.ZombieClayCrop, Blocks.GRASS, "zombie_clay_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieGravelSeeds = new ZombieSeeds(ModBlocks.ZombieGravelCrop, Blocks.GRASS, "zombie_gravel_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieSandSeeds = new ZombieSeeds(ModBlocks.ZombieSandCrop, Blocks.GRASS, "zombie_sand_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieDirtSeeds = new ZombieSeeds(ModBlocks.ZombieDirtCrop, Blocks.GRASS, "zombie_dirt_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieStoneSeeds = new ZombieSeeds(ModBlocks.ZombieStoneCrop, Blocks.GRASS, "zombie_stone_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieOakSeeds = new ZombieSeeds(ModBlocks.ZombieOakCrop, Blocks.GRASS, "zombie_oak_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieClothSeeds = new ZombieSeeds(ModBlocks.ZombieClothCrop, Blocks.GRASS, "zombie_cloth_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieSnowSeeds = new ZombieSeeds(ModBlocks.ZombieSnowCrop, Blocks.GRASS, "zombie_snow_seeds").setCreativeTab(ModItems.tabExampleMod);
		
		ModItems.ZombieIronSeeds = new ZombieSeeds(ModBlocks.ZombieIronCrop, Blocks.GRASS, "zombie_iron_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieCoalSeeds = new ZombieSeeds(ModBlocks.ZombieCoalCrop, Blocks.GRASS, "zombie_coal_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieGoldSeeds = new ZombieSeeds(ModBlocks.ZombieGoldCrop, Blocks.GRASS, "zombie_gold_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieLapisSeeds = new ZombieSeeds(ModBlocks.ZombieLapisCrop, Blocks.GRASS, "zombie_lapis_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieRedstoneSeeds = new ZombieSeeds(ModBlocks.ZombieRedstoneCrop, Blocks.GRASS, "zombie_redstone_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieEmeraldSeeds = new ZombieSeeds(ModBlocks.ZombieEmeraldCrop, Blocks.GRASS, "zombie_emerald_seeds").setCreativeTab(ModItems.tabExampleMod);
		ModItems.ZombieDiamondSeeds = new ZombieSeeds(ModBlocks.ZombieDiamondCrop, Blocks.GRASS, "zombie_diamond_seeds").setCreativeTab(ModItems.tabExampleMod);
		
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(MutationBlock).setRegistryName(MutationBlock.getRegistryName()));
		
		//Tier 1
		event.getRegistry().register(ModItems.ZombieBaseSeeds);
		
		//Tier 2
		event.getRegistry().register(ModItems.ZombieClaySeeds);
		event.getRegistry().register(ModItems.ZombieGravelSeeds);
		event.getRegistry().register(ModItems.ZombieSandSeeds);
		event.getRegistry().register(ModItems.ZombieDirtSeeds);
		event.getRegistry().register(ModItems.ZombieStoneSeeds);
		event.getRegistry().register(ModItems.ZombieOakSeeds);
		event.getRegistry().register(ModItems.ZombieClothSeeds);
		event.getRegistry().register(ModItems.ZombieSnowSeeds);
		
		event.getRegistry().register(ModItems.ZombieIronSeeds);
		event.getRegistry().register(ModItems.ZombieCoalSeeds);
		event.getRegistry().register(ModItems.ZombieGoldSeeds);
		event.getRegistry().register(ModItems.ZombieLapisSeeds);
		event.getRegistry().register(ModItems.ZombieRedstoneSeeds);
		event.getRegistry().register(ModItems.ZombieEmeraldSeeds);
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