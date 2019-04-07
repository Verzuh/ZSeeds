package com.zseeds.zseedsmod.init;

import com.zseeds.zseedsmod.entity.ZombieIron;
import com.zseeds.zseedsmod.Reference;
import com.zseeds.zseedsmod.ZSeeds;
import com.zseeds.zseedsmod.entity.RenderZombieDefault;
import com.zseeds.zseedsmod.entity.RenderZombieIron;
import com.zseeds.zseedsmod.entity.ZombieDefault;

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
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "iron_zombie"), ZombieIron.class, "IronZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "default_zombie"), ZombieDefault.class, "DefaultZombie", id++, ZSeeds.instance, 64, 3, true, 0x996600, 0x00ff00);
       
        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        //EntityRegistry.addSpawn(ZombieIron.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);

        // This is the loot table for our mob
        LootTableList.register(ZombieDefault.LOOT);
        LootTableList.register(ZombieIron.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(ZombieIron.class, RenderZombieIron.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(ZombieDefault.class, RenderZombieDefault.FACTORY);
    }
}