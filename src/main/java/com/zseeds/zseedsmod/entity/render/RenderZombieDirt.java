package com.zseeds.zseedsmod.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

import com.zseeds.zseedsmod.entity.EntityZombieDirt;

public class RenderZombieDirt extends RenderLiving<EntityZombieDirt> {

    private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/dirt_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieDirt(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieDirt entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieDirt> {

        @Override
        public Render<? super EntityZombieDirt> createRenderFor(RenderManager manager) {
            return new RenderZombieDirt(manager);
        }

    }

}