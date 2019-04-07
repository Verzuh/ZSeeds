package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.blocks.MutationBlock;
import com.zseeds.zseedsmod.items.crops.ZombieDefaultCrop;
import com.zseeds.zseedsmod.items.crops.ZombieIronCrop;
import com.zseeds.zseedsmod.items.crops.ZombieCoalCrop;
import com.zseeds.zseedsmod.items.seeds.ZombieCoalSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieDefaultSeeds;
import com.zseeds.zseedsmod.items.seeds.ZombieIronSeeds;
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
	static Block exampleCrop;
	static Block ZombieIronCrop;
	static Block ZombieCoalCrop;
	
	public static void initSeeds() {
		
	}
	
	public static void init() {
		MutationBlock = new MutationBlock("mutation_block", Material.GROUND).setHardness(1.0F).setCreativeTab(ModItems.tabExampleMod);
		MutationBlock.setHarvestLevel("pickaxe", 2);
		exampleCrop = new ZombieDefaultCrop("example_crop");
		ZombieIronCrop = new ZombieIronCrop("zombie_iron_crop");
		ZombieCoalCrop = new ZombieCoalCrop("zombie_coal_crop");
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(MutationBlock, exampleCrop, ZombieIronCrop, ZombieCoalCrop);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(MutationBlock).setRegistryName(MutationBlock.getRegistryName()));
		ModItems.defaultSeeds = new ZombieDefaultSeeds(ModBlocks.exampleCrop, Blocks.DIRT, "example_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.defaultSeeds);
		ModItems.ZombieIronSeeds = new ZombieIronSeeds(ModBlocks.ZombieIronCrop, Blocks.DIRT, "zombie_iron_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieIronSeeds);
		ModItems.ZombieCoalSeeds = new ZombieCoalSeeds(ModBlocks.ZombieCoalCrop, Blocks.DIRT, "zombie_coal_seeds").setCreativeTab(ModItems.tabExampleMod);
		event.getRegistry().register(ModItems.ZombieCoalSeeds);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(MutationBlock));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}