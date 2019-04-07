package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.entity.EntityZombieIron;
import com.zseeds.zseedsmod.entity.EntityZombieLapis;
import com.zseeds.zseedsmod.entity.EntityZombieRedstone;
import com.zseeds.zseedsmod.entity.render.RenderZombieBase;
import com.zseeds.zseedsmod.entity.render.RenderZombieCoal;
import com.zseeds.zseedsmod.entity.render.RenderZombieDiamond;
import com.zseeds.zseedsmod.entity.render.RenderZombieEmerald;
import com.zseeds.zseedsmod.entity.render.RenderZombieGold;
import com.zseeds.zseedsmod.entity.render.RenderZombieIron;
import com.zseeds.zseedsmod.entity.render.RenderZombieLapis;
import com.zseeds.zseedsmod.entity.render.RenderZombieRedstone;
import com.zseeds.zseedsmod.Reference;
import com.zseeds.zseedsmod.ZSeeds;
import com.zseeds.zseedsmod.entity.EntityZombieCoal;
import com.zseeds.zseedsmod.entity.EntityZombieDiamond;
import com.zseeds.zseedsmod.entity.EntityZombieEmerald;
import com.zseeds.zseedsmod.entity.EntityZombieGold;
import com.zseeds.zseedsmod.entity.EntityZombieBase;

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
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "base_zombie"), EntityZombieBase.class, "BaseZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
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
        LootTableList.register(EntityZombieBase.LOOT);
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
    	RenderingRegistry.registerEntityRenderingHandler(EntityZombieBase.class, RenderZombieBase.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieIron.class, RenderZombieIron.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieCoal.class, RenderZombieCoal.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieGold.class, RenderZombieGold.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieLapis.class, RenderZombieLapis.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieRedstone.class, RenderZombieRedstone.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieEmerald.class, RenderZombieEmerald.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieDiamond.class, RenderZombieDiamond.FACTORY);
    }
}