package com.zseeds.zseedsmod.entity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderZombieCoal extends RenderLiving<EntityZombieCoal> {

    private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/coal_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieCoal(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieCoal entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieCoal> {

        @Override
        public Render<? super EntityZombieCoal> createRenderFor(RenderManager manager) {
            return new RenderZombieCoal(manager);
        }

    }

}