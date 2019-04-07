package com.zseeds.zseedsmod.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

import com.zseeds.zseedsmod.entity.EntityZombieIron;

public class RenderZombieIron extends RenderLiving<EntityZombieIron> {

    private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/iron_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieIron(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieIron entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieIron> {

        @Override
        public Render<? super EntityZombieIron> createRenderFor(RenderManager manager) {
            return new RenderZombieIron(manager);
        }

    }

}