package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.items.ExampleItem;
import com.zseeds.zseedsmod.items.ZombieSeeds;
import com.zseeds.zseedsmod.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
	
	public static Item exampleItem;
	public static Item exampleSeeds;
	
	public static final CreativeTabs tabExampleMod = new CreativeTabs("tabExampleMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(exampleItem);
		}
		
		@Override
		public boolean hasSearchBar() {
			return true;
		}
		
	}.setBackgroundImageName("item_search.png");
	
	public static void init() {
		exampleItem = new ExampleItem("example_item").setCreativeTab(tabExampleMod).setMaxStackSize(64);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(exampleItem);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(exampleItem);
		registerRender(exampleSeeds);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}