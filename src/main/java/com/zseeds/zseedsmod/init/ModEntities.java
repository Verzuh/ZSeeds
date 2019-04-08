package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.entity.*;
import com.zseeds.zseedsmod.entity.render.*;
import com.zseeds.zseedsmod.Reference;
import com.zseeds.zseedsmod.ZSeeds;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        
        //Tier 1
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "base_zombie"), EntityZombieBase.class, "BaseZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        //Tier 2
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "clay_zombie"), EntityZombieClay.class, "ClayZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "gravel_zombie"), EntityZombieGravel.class, "GravelZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "sand_zombie"), EntityZombieSand.class, "SandZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "dirt_zombie"), EntityZombieDirt.class, "DirtZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "stone_zombie"), EntityZombieStone.class, "StoneZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "oak_zombie"), EntityZombieOak.class, "OakZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "cloth_zombie"), EntityZombieCloth.class, "ClothZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "snow_zombie"), EntityZombieSnow.class, "SnowZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "iron_zombie"), EntityZombieIron.class, "IronZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "coal_zombie"), EntityZombieCoal.class, "CoalZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "gold_zombie"), EntityZombieGold.class, "GoldZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "lapis_zombie"), EntityZombieLapis.class, "LapisZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "redstone_zombie"), EntityZombieRedstone.class, "RedstoneZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "emerald_zombie"), EntityZombieEmerald.class, "EmeraldZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "diamond_zombie"), EntityZombieDiamond.class, "DiamondZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        //EntityRegistry.addSpawn(ZombieIron.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);

        // This is the loot table for our mob
        //Tier 1
        LootTableList.register(EntityZombieBase.LOOT);
        
        //Tier 2
        LootTableList.register(EntityZombieClay.LOOT);
        LootTableList.register(EntityZombieGravel.LOOT);
        LootTableList.register(EntityZombieSand.LOOT);
        LootTableList.register(EntityZombieDirt.LOOT);
        LootTableList.register(EntityZombieStone.LOOT);
        LootTableList.register(EntityZombieOak.LOOT);
        LootTableList.register(EntityZombieCloth.LOOT);
        LootTableList.register(EntityZombieSnow.LOOT);
        
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
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieBase.class, RenderZombieBase.FACTORY);
    	
    	//Tier 2
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieClay.class, RenderZombieClay.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieGravel.class, RenderZombieGravel.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieSand.class, RenderZombieSand.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieDirt.class, RenderZombieDirt.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieStone.class, RenderZombieStone.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieOak.class, RenderZombieOak.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieCloth.class, RenderZombieCloth.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieSnow.class, RenderZombieSnow.FACTORY);
    	
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieIron.class, RenderZombieIron.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieCoal.class, RenderZombieCoal.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieGold.class, RenderZombieGold.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieLapis.class, RenderZombieLapis.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieRedstone.class, RenderZombieRedstone.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieEmerald.class, RenderZombieEmerald.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieDiamond.class, RenderZombieDiamond.FACTORY);
    }
}