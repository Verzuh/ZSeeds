package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.entity.RenderEntityZombie;
import com.zseeds.zseedsmod.entity.zombies.*;
import com.zseeds.zseedsmod.Reference;
import com.zseeds.zseedsmod.ZSeeds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModEntities {

    public static void init() {
        int id = 1;   
        
        //Tier 1
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "base_zombie"), EntityZombieBase.class, "BaseZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        //Tier 2
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "dirt_zombie"), EntityZombieDirt.class, "DirtZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "gravel_zombie"), EntityZombieGravel.class, "GravelZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "sand_zombie"), EntityZombieSand.class, "SandZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "clay_zombie"), EntityZombieClay.class, "ClayZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "white_zombie"), EntityZombieWhite.class, "WhiteZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "snow_zombie"), EntityZombieSnow.class, "SnowZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        //Tier 3
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "cobblestone_zombie"), EntityZombieCobblestone.class, "CobblestoneZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
       
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "stone_zombie"), EntityZombieStone.class, "StoneZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "oak_zombie"), EntityZombieOak.class, "OakZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "iron_zombie"), EntityZombieIron.class, "IronZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "coal_zombie"), EntityZombieCoal.class, "CoalZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "gold_zombie"), EntityZombieGold.class, "GoldZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "lapis_zombie"), EntityZombieLapis.class, "LapisZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "redstone_zombie"), EntityZombieRedstone.class, "RedstoneZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "emerald_zombie"), EntityZombieEmerald.class, "EmeraldZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "diamond_zombie"), EntityZombieDiamond.class, "DiamondZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);

        //Tier 1
        LootTableList.register(EntityZombieBase.LOOT);
        
        //Tier 2
        LootTableList.register(EntityZombieDirt.LOOT);
        LootTableList.register(EntityZombieGravel.LOOT);
        LootTableList.register(EntityZombieSand.LOOT);
        LootTableList.register(EntityZombieClay.LOOT);
        LootTableList.register(EntityZombieWhite.LOOT);
        LootTableList.register(EntityZombieSnow.LOOT);
        
        //Tier 3
        LootTableList.register(EntityZombieCobblestone.LOOT);
        
        LootTableList.register(EntityZombieStone.LOOT);
        LootTableList.register(EntityZombieOak.LOOT);
        
        LootTableList.register(EntityZombieIron.LOOT);
        LootTableList.register(EntityZombieCoal.LOOT);
        LootTableList.register(EntityZombieGold.LOOT);
        LootTableList.register(EntityZombieLapis.LOOT);
        LootTableList.register(EntityZombieRedstone.LOOT);
        LootTableList.register(EntityZombieEmerald.LOOT);
        LootTableList.register(EntityZombieDiamond.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	
    	//Tier 1
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieBase.class, RenderEntityZombie.FACTORY);
    	
    	//Tier 2
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieDirt.class, RenderEntityZombie.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieGravel.class, RenderEntityZombie.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieSand.class, RenderEntityZombie.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieClay.class, RenderEntityZombie.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieWhite.class, RenderEntityZombie.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieSnow.class, RenderEntityZombie.FACTORY);
    	
    	//Tier 3
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieCobblestone.class, RenderEntityZombie.FACTORY);

    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieStone.class, RenderEntityZombie.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieOak.class, RenderEntityZombie.FACTORY);
    	
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieIron.class, RenderEntityZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieCoal.class, RenderEntityZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieGold.class, RenderEntityZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieLapis.class, RenderEntityZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieRedstone.class, RenderEntityZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieEmerald.class, RenderEntityZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieDiamond.class, RenderEntityZombie.FACTORY);
    }
}