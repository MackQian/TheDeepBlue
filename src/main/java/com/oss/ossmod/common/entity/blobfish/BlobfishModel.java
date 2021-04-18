package com.oss.ossmod.common.entity.blobfish;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Created using BlocbBench
// To fix:
// 1. replace textureWidth and textureHeight with bb_main.setTexSize(textureWidth, textureHeight);
// 2. replace setrotationpoint with setPos
// 3. replace settextureoffset with texOffs
// 4. replace setrotationangle by accessing the public xRot, yRot, and zRot of the modelrenderer

// USE https://replit.com/@JimJimmy/Blockbench-Converter#main.py

public class BlobfishModel extends EntityModel<BlobfishEntity> {
    private final ModelRenderer bb_main;
    private final ModelRenderer Tail4_r1;
    private final ModelRenderer RightFin_r1;
    private final ModelRenderer Tail3_r1;

    public BlobfishModel() {

        bb_main = new ModelRenderer(this);
        bb_main.setTexSize(32, 32);

        bb_main.setPos(0.0F, 24.0F, 0.0F);
        bb_main.texOffs(0, 0).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
        bb_main.texOffs(14, 12).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
        bb_main.texOffs(0, 0).addBox(-1.0F, -5.0F, 3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bb_main.texOffs(0, 19).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bb_main.texOffs(8, 19).addBox(-1.0F, -5.0F, -6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        Tail4_r1 = new ModelRenderer(this);
        Tail4_r1.setPos(0.0F, -4.0F, -3.0F);
        bb_main.addChild(Tail4_r1);
        Tail4_r1.xRot = 0.2269F;
        Tail4_r1.yRot = 0.0F;
        Tail4_r1.zRot = 0.0F;
        Tail4_r1.texOffs(0, 12).addBox(-0.499F, 0.6723F, 0.9733F, 1.0F, 3.0F, 8.0F, -0.4F, false);

        RightFin_r1 = new ModelRenderer(this);
        RightFin_r1.setPos(0.0F, -4.0F, -3.0F);
        bb_main.addChild(RightFin_r1);
        RightFin_r1.xRot = 0.6981F;
        RightFin_r1.yRot = 0.0F;
        RightFin_r1.zRot = 0.0F;
        RightFin_r1.texOffs(0, 16).addBox(-4.5F, -1.0075F, -2.273F, 2.0F, 1.0F, 5.0F, -0.4F, false);
        RightFin_r1.texOffs(18, 0).addBox(2.5F, -1.0075F, -2.273F, 2.0F, 1.0F, 5.0F, -0.4F, false);

        Tail3_r1 = new ModelRenderer(this);
        Tail3_r1.setPos(0.0F, -4.0F, -3.0F);
        bb_main.addChild(Tail3_r1);
        Tail3_r1.xRot = -0.5236F;
        Tail3_r1.yRot = 0.0F;
        Tail3_r1.zRot = 0.0F;
        Tail3_r1.texOffs(18, 3).addBox(-0.5F, -5.4359F, 2.3981F, 1.0F, 2.0F, 5.0F, -0.4F, false);
    }

    @Override
    public void setupAnim(BlobfishEntity blobfishEntity, float v, float v1, float v2, float v3, float v4) {
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bb_main.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

}
