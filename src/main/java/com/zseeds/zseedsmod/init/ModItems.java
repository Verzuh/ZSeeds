package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.Reference;
import com.zseeds.zseedsmod.items.ZombieSeeds;

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
	
	//Tier 1
	public static Item ZombieBaseSeeds;
	
	//Tier 2
	public static Item ZombieDirtSeeds;
	public static Item ZombieGravelSeeds;
	public static Item ZombieSandSeeds;
	public static Item ZombieClaySeeds;
	public static Item ZombieWhiteSeeds;
	public static Item ZombieSnowSeeds;
	
	//Tier 3
	public static Item ZombieCobblestoneSeeds;
	
	public static Item ZombieStoneSeeds;
	public static Item ZombieOakSeeds;
	
	public static Item ZombieIronSeeds;
	public static Item ZombieCoalSeeds;
	public static Item ZombieGoldSeeds;
	public static Item ZombieLapisSeeds;
	public static Item ZombieRedstoneSeeds;
	public static Item ZombieEmeraldSeeds;
	public static Item ZombieDiamondSeeds;
	
	public static final CreativeTabs tabExampleMod = new CreativeTabs("tabExampleMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ZombieBaseSeeds);
		}
		
	};
	
	public static void init() {
		
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		//Tier 1
		registerRender(ZombieBaseSeeds);
		
		//Tier 2
		registerRender(ZombieDirtSeeds);
		registerRender(ZombieGravelSeeds);
		registerRender(ZombieSandSeeds);
		registerRender(ZombieClaySeeds);
		registerRender(ZombieWhiteSeeds);
		registerRender(ZombieSnowSeeds);
		
		//Tier 3
		registerRender(ZombieCobblestoneSeeds);
		
		registerRender(ZombieStoneSeeds);
		registerRender(ZombieOakSeeds);	
		
		registerRender(ZombieIronSeeds);
		registerRender(ZombieCoalSeeds);
		registerRender(ZombieGoldSeeds);
		registerRender(ZombieLapisSeeds);
		registerRender(ZombieRedstoneSeeds);
		registerRender(ZombieEmeraldSeeds);
		registerRender(ZombieDiamondSeeds);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}