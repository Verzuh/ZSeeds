package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.blocks.MutationBlock;
import com.zseeds.zseedsmod.items.crops.ZombieBaseCrop;
import com.zseeds.zseedsmod.items.crops.ZombieIronCrop;
import com.zseeds.zseedsmod.items.crops.ZombieCoalCrop;
import com.zseeds.zseedsmod.items.crops.ZombieGoldCrop;
import com.zseeds.zseedsmod.items.crops.ZombieLapisCrop;
import com.zseeds.zseedsmod.items.crops.ZombieRedstoneCrop;
import com.zseeds.zseedsmod.items.crops.ZombieEmeraldCrop;
import com.zseeds.zseedsmod.items.crops.ZombieDiamondCrop;
import com.zseeds.zseedsmod.items.seeds.ZombieCoalSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieBaseSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieIronSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieGoldSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieLapisSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieRedstoneSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieEmeraldSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieDiamondSeeds;
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
	static Block ZombieBaseCrop;
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
		ZombieBaseCrop = new ZombieBaseCrop("zombie_base_crop");
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
		event.getRegistry().registerAll(MutationBlock, ZombieBaseCrop, ZombieIronCrop, ZombieCoalCrop, ZombieGoldCrop, ZombieLapisCrop, ZombieRedstoneCrop, ZombieEmeraldCrop, ZombieDiamondCrop);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(MutationBlock).setRegistryName(MutationBlock.getRegistryName()));
		ModItems.ZombieBaseSeeds = new ZombieBaseSeeds(ModBlocks.ZombieBaseCrop, Blocks.DIRT, "zombie_base_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieBaseSeeds);
		ModItems.ZombieIronSeeds = new ZombieIronSeeds(ModBlocks.ZombieIronCrop, Blocks.DIRT, "zombie_iron_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieIronSeeds);
		ModItems.ZombieCoalSeeds = new ZombieCoalSeeds(ModBlocks.ZombieCoalCrop, Blocks.DIRT, "zombie_coal_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieCoalSeeds);
		ModItems.ZombieGoldSeeds = new ZombieGoldSeeds(ModBlocks.ZombieGoldCrop, Blocks.DIRT, "zombie_gold_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieGoldSeeds);
	
		ModItems.ZombieLapisSeeds = new ZombieLapisSeeds(ModBlocks.ZombieLapisCrop, Blocks.DIRT, "zombie_lapis_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieLapisSeeds);
		ModItems.ZombieRedstoneSeeds = new ZombieRedstoneSeeds(ModBlocks.ZombieRedstoneCrop, Blocks.DIRT, "zombie_redstone_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieRedstoneSeeds);
		ModItems.ZombieEmeraldSeeds = new ZombieEmeraldSeeds(ModBlocks.ZombieEmeraldCrop, Blocks.DIRT, "zombie_emerald_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieEmeraldSeeds);
		ModItems.ZombieDiamondSeeds = new ZombieDiamondSeeds(ModBlocks.ZombieDiamondCrop, Blocks.DIRT, "zombie_diamond_seeds").setCreativeTab(ModItems.tabExampleMod);
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