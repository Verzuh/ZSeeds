package com.zseeds.zseedsmod.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

import com.zseeds.zseedsmod.entity.EntityZombieGravel;

public class RenderZombieGravel extends RenderLiving<EntityZombieGravel> {

    private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/gravel_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieGravel(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieGravel entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieGravel> {

        @Override
        public Render<? super EntityZombieGravel> createRenderFor(RenderManager manager) {
            return new RenderZombieGravel(manager);
        }

    }

}