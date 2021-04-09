package com.oss.ossmod.common.entity;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

//public class BlobfishModel extends EntityModel<BlobfishEntity>  {
//
//
//
//    private final ModelRenderer body;
//
//    public BlobfishModel() {
//
//        body = new ModelRenderer(this, 0, 0);
//        body.addBox(-3, 16, -3, 6, 6, 6);
////        body.addbox();
//    }
//
//    @Override
//    public void setupAnim(BlobfishEntity blobfishEntity, float v, float v1, float v2, float v3, float v4) {
//
//    }
//
//    @Override
//    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
//        body.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
//    }
//}


public class BlobfishModel extends EntityModel<BlobfishEntity> {
    private final ModelRenderer bb_main;

    public BlobfishModel() {
//        textureWidth = 32;
//        textureHeight = 32;
        bb_main = new ModelRenderer(this);
        bb_main.setTexSize(32, 32);
        bb_main.setPos(0.0F, 24.0F, 0.0F);
        bb_main.texOffs(0, 0).addBox(-7.0F, -9.0F, 0.0F, 7.0F, 6.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(BlobfishEntity blobfishEntity, float v, float v1, float v2, float v3, float v4) {
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bb_main.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

}
