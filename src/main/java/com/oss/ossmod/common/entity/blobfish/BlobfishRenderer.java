package com.oss.ossmod.common.entity.blobfish;


import com.oss.ossmod.OssMod;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;


public class BlobfishRenderer extends MobRenderer<BlobfishEntity, BlobfishModel> {
	// store the texture location for easier referencing in the future.
    private static final ResourceLocation TEXTURE = new ResourceLocation(OssMod.MODID, "textures/entity/blobfish.png");

    public BlobfishRenderer(EntityRendererManager manager) {
        // The float at the end is the shadow size
        super(manager, new BlobfishModel(), 0.2f);
    }

    @Nullable
    @Override
    public ResourceLocation getTextureLocation(BlobfishEntity entity) {
        return TEXTURE;
    }
}
