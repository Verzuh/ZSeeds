package com.zseeds.zseedsmod.entity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

import com.zseeds.zseedsmod.entity.zombies.EntityZombieBase;

@SideOnly(Side.CLIENT)
public class RenderEntityZombie extends RenderLiving<EntityZombieBase> {

    public static final Factory FACTORY = new Factory();
    
    public RenderEntityZombie(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieBase entity) {
        return entity.getTexture();
    	//return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieBase> {

        @Override
        public Render<? super EntityZombieBase> createRenderFor(RenderManager manager) {
            return new RenderEntityZombie(manager);
        }
    }
}