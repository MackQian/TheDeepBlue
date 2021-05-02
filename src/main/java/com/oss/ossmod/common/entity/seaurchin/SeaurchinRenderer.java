package com.oss.ossmod.common.entity.seaurchin;


import com.oss.ossmod.OssMod;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;


public class SeaurchinRenderer extends MobRenderer<SeaurchinEntity, SeaurchinModel> {
	// textures are stored in the respectively named directory.
    private static final ResourceLocation TEXTURE = new ResourceLocation(OssMod.MODID, "textures/entity/seaurchin.png");

    public SeaurchinRenderer(EntityRendererManager manager) {
        // The float at the end is the shadow size
        super(manager, new SeaurchinModel(), 0.2f);
    }

    @Nullable
    @Override
    public ResourceLocation getTextureLocation(SeaurchinEntity entity) {
        return TEXTURE;
    }
}
