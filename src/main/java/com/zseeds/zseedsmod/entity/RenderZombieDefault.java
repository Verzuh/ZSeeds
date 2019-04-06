package com.zseeds.zseedsmod.entity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderZombieDefault extends RenderLiving<ZombieDefault> {

    private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/default_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieDefault(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ZombieDefault entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ZombieDefault> {

        @Override
        public Render<? super ZombieDefault> createRenderFor(RenderManager manager) {
            return new RenderZombieDefault(manager);
        }

    }

}