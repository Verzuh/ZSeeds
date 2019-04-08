package com.zseeds.zseedsmod.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

import com.zseeds.zseedsmod.entity.EntityZombieStone;

public class RenderZombieStone extends RenderLiving<EntityZombieStone> {

    private ResourceLocation mobTexture = new ResourceLocation("zseeds:textures/entity/stone_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieStone(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieStone entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityZombieStone> {

        @Override
        public Render<? super EntityZombieStone> createRenderFor(RenderManager manager) {
            return new RenderZombieStone(manager);
        }

    }

}