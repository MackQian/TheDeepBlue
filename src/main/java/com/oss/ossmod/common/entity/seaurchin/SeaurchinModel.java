package com.oss.ossmod.common.entity.seaurchin;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Created using BlockBench

public class SeaurchinModel extends EntityModel<SeaurchinEntity> {
    private final ModelRenderer bb_main;
    private final ModelRenderer spike_r1;
    private final ModelRenderer spike_r2;
    private final ModelRenderer spike_r3;
    private final ModelRenderer spike_r4;
    private final ModelRenderer spike_r5;
    private final ModelRenderer spike_r6;
    private final ModelRenderer spike_r7;
    private final ModelRenderer spike_r8;
    private final ModelRenderer spike_r9;
    private final ModelRenderer spike_r10;
    private final ModelRenderer spike_r11;
    private final ModelRenderer spike_r12;
    private final ModelRenderer spike_r13;
    private final ModelRenderer spike_r14;
    private final ModelRenderer spike_r15;
    private final ModelRenderer spike_r16;
    private final ModelRenderer spike_r17;
    private final ModelRenderer spike_r18;
    private final ModelRenderer spike_r19;
    private final ModelRenderer spike_r20;
    private final ModelRenderer spike_r21;
    private final ModelRenderer spike_r22;
    private final ModelRenderer spike_r23;
    private final ModelRenderer spike_r24;
    private final ModelRenderer spike_r25;
    private final ModelRenderer spike_r26;
    private final ModelRenderer spike_r27;
    private final ModelRenderer spike_r28;
    private final ModelRenderer spike_r29;
    private final ModelRenderer spike_r30;
    private final ModelRenderer spike_r31;
    private final ModelRenderer spike_r32;
    private final ModelRenderer spike_r33;
    private final ModelRenderer spike_r34;
    private final ModelRenderer spike_r35;
    private final ModelRenderer spike_r36;
    private final ModelRenderer spike_r37;
    private final ModelRenderer spike_r38;
    private final ModelRenderer spike_r39;
    private final ModelRenderer spike_r40;
    private final ModelRenderer spike_r41;
    private final ModelRenderer spike_r42;
    private final ModelRenderer spike_r43;
    private final ModelRenderer spike_r44;
    private final ModelRenderer spike_r45;
    private final ModelRenderer spike_r46;
    private final ModelRenderer spike_r47;
    private final ModelRenderer spike_r48;
    private final ModelRenderer spike_r49;
    private final ModelRenderer spike_r50;
    private final ModelRenderer spike_r51;
    private final ModelRenderer spike_r52;

    public SeaurchinModel() {

        bb_main = new ModelRenderer(this);
        bb_main.setTexSize(64,64);
        bb_main.setPos(0.0F, 24.0F, 0.0F);
        bb_main.texOffs(0, 0).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        spike_r1 = new ModelRenderer(this);
        spike_r1.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r1);
        spike_r1.xRot = 2.3562F;
        spike_r1.yRot = 0.0F;
        spike_r1.zRot = -1.5708F;
        spike_r1.texOffs(0, 8).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r2 = new ModelRenderer(this);
        spike_r2.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r2);
        spike_r2.xRot = -2.7338F;
        spike_r2.yRot = -0.2409F;
        spike_r2.zRot = -2.2483F;
        spike_r2.texOffs(4, 8).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r3 = new ModelRenderer(this);
        spike_r3.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r3);
        spike_r3.xRot = 2.6018F;
        spike_r3.yRot = -0.3042F;
        spike_r3.zRot = -1.6623F;
        spike_r3.texOffs(8, 8).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r4 = new ModelRenderer(this);
        spike_r4.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r4);
        spike_r4.xRot = 2.7068F;
        spike_r4.yRot = -0.276F;
        spike_r4.zRot = -2.0256F;
        spike_r4.texOffs(12, 8).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r5 = new ModelRenderer(this);
        spike_r5.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r5);
        spike_r5.xRot = 2.5642F;
        spike_r5.yRot = -0.028F;
        spike_r5.zRot = -2.4439F;
        spike_r5.texOffs(16, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r6 = new ModelRenderer(this);
        spike_r6.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r6);
        spike_r6.xRot = 2.9671F;
        spike_r6.yRot = 0.0F;
        spike_r6.zRot = -2.9671F;
        spike_r6.texOffs(16, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r7 = new ModelRenderer(this);
        spike_r7.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r7);
        spike_r7.xRot = -2.9234F;
        spike_r7.yRot = 0.0F;
        spike_r7.zRot = -2.6616F;
        spike_r7.texOffs(0, 18).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r8 = new ModelRenderer(this);
        spike_r8.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r8);
        spike_r8.xRot = 2.9671F;
        spike_r8.yRot = 0.0F;
        spike_r8.zRot = -2.6616F;
        spike_r8.texOffs(4, 18).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r9 = new ModelRenderer(this);
        spike_r9.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r9);
        spike_r9.xRot = -3.1416F;
        spike_r9.yRot = 0.0F;
        spike_r9.zRot = -2.4435F;
        spike_r9.texOffs(8, 18).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r10 = new ModelRenderer(this);
        spike_r10.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r10);
        spike_r10.xRot = -2.7904F;
        spike_r10.yRot = 0.3829F;
        spike_r10.zRot = -1.3353F;
        spike_r10.texOffs(12, 18).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r11 = new ModelRenderer(this);
        spike_r11.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r11);
        spike_r11.xRot = 2.7745F;
        spike_r11.yRot = 0.3923F;
        spike_r11.zRot = -1.618F;
        spike_r11.texOffs(19, 19).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r12 = new ModelRenderer(this);
        spike_r12.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r12);
        spike_r12.xRot = -3.1416F;
        spike_r12.yRot = 0.0F;
        spike_r12.zRot = -2.0508F;
        spike_r12.texOffs(20, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r13 = new ModelRenderer(this);
        spike_r13.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r13);
        spike_r13.xRot = -3.1416F;
        spike_r13.yRot = 0.0F;
        spike_r13.zRot = -1.7017F;
        spike_r13.texOffs(22, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r14 = new ModelRenderer(this);
        spike_r14.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r14);
        spike_r14.xRot = -2.3562F;
        spike_r14.yRot = 0.0F;
        spike_r14.zRot = -1.5708F;
        spike_r14.texOffs(23, 20).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r15 = new ModelRenderer(this);
        spike_r15.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r15);
        spike_r15.xRot = -1.3526F;
        spike_r15.yRot = 0.6545F;
        spike_r15.zRot = -1.8762F;
        spike_r15.texOffs(24, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r16 = new ModelRenderer(this);
        spike_r16.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r16);
        spike_r16.xRot = -2.138F;
        spike_r16.yRot = 0.0873F;
        spike_r16.zRot = -1.8762F;
        spike_r16.texOffs(26, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r17 = new ModelRenderer(this);
        spike_r17.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r17);
        spike_r17.xRot = -2.138F;
        spike_r17.yRot = 0.4363F;
        spike_r17.zRot = -1.8762F;
        spike_r17.texOffs(15, 27).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r18 = new ModelRenderer(this);
        spike_r18.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r18);
        spike_r18.xRot = -2.1817F;
        spike_r18.yRot = 0.8727F;
        spike_r18.zRot = -1.6144F;
        spike_r18.texOffs(27, 20).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r19 = new ModelRenderer(this);
        spike_r19.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r19);
        spike_r19.xRot = -1.7453F;
        spike_r19.yRot = 1.3963F;
        spike_r19.zRot = -1.5708F;
        spike_r19.texOffs(0, 28).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r20 = new ModelRenderer(this);
        spike_r20.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r20);
        spike_r20.xRot = -1.3526F;
        spike_r20.yRot = 1.0908F;
        spike_r20.zRot = -1.5708F;
        spike_r20.texOffs(28, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r21 = new ModelRenderer(this);
        spike_r21.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r21);
        spike_r21.xRot = -1.7453F;
        spike_r21.yRot = 1.0908F;
        spike_r21.zRot = -1.5708F;
        spike_r21.texOffs(4, 28).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r22 = new ModelRenderer(this);
        spike_r22.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r22);
        spike_r22.xRot = -1.5708F;
        spike_r22.yRot = 0.8727F;
        spike_r22.zRot = -1.5708F;
        spike_r22.texOffs(8, 28).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r23 = new ModelRenderer(this);
        spike_r23.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r23);
        spike_r23.xRot = -1.309F;
        spike_r23.yRot = -0.2182F;
        spike_r23.zRot = -1.1781F;
        spike_r23.texOffs(19, 29).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r24 = new ModelRenderer(this);
        spike_r24.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r24);
        spike_r24.xRot = -1.9199F;
        spike_r24.yRot = 0.0436F;
        spike_r24.zRot = -1.1781F;
        spike_r24.texOffs(30, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r25 = new ModelRenderer(this);
        spike_r25.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r25);
        spike_r25.xRot = -1.5708F;
        spike_r25.yRot = 0.48F;
        spike_r25.zRot = -1.5708F;
        spike_r25.texOffs(23, 30).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r26 = new ModelRenderer(this);
        spike_r26.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r26);
        spike_r26.xRot = -1.5708F;
        spike_r26.yRot = 0.1309F;
        spike_r26.zRot = -1.5708F;
        spike_r26.texOffs(27, 30).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r27 = new ModelRenderer(this);
        spike_r27.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r27);
        spike_r27.xRot = 0.7854F;
        spike_r27.yRot = 0.0F;
        spike_r27.zRot = -1.5708F;
        spike_r27.texOffs(31, 20).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r28 = new ModelRenderer(this);
        spike_r28.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r28);
        spike_r28.xRot = 1.789F;
        spike_r28.yRot = -0.6545F;
        spike_r28.zRot = -1.2654F;
        spike_r28.texOffs(31, 30).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r29 = new ModelRenderer(this);
        spike_r29.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r29);
        spike_r29.xRot = 1.0036F;
        spike_r29.yRot = -0.0873F;
        spike_r29.zRot = -1.2654F;
        spike_r29.texOffs(32, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r30 = new ModelRenderer(this);
        spike_r30.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r30);
        spike_r30.xRot = 1.0036F;
        spike_r30.yRot = -0.4363F;
        spike_r30.zRot = -1.2654F;
        spike_r30.texOffs(34, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r31 = new ModelRenderer(this);
        spike_r31.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r31);
        spike_r31.xRot = 0.9599F;
        spike_r31.yRot = -0.8727F;
        spike_r31.zRot = -1.5272F;
        spike_r31.texOffs(35, 20).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r32 = new ModelRenderer(this);
        spike_r32.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r32);
        spike_r32.xRot = 1.3963F;
        spike_r32.yRot = -1.3963F;
        spike_r32.zRot = -1.5708F;
        spike_r32.texOffs(35, 30).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r33 = new ModelRenderer(this);
        spike_r33.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r33);
        spike_r33.xRot = 1.789F;
        spike_r33.yRot = -1.0908F;
        spike_r33.zRot = -1.5708F;
        spike_r33.texOffs(36, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r34 = new ModelRenderer(this);
        spike_r34.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r34);
        spike_r34.xRot = 1.3963F;
        spike_r34.yRot = -1.0908F;
        spike_r34.zRot = -1.5708F;
        spike_r34.texOffs(12, 36).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r35 = new ModelRenderer(this);
        spike_r35.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r35);
        spike_r35.xRot = 1.5708F;
        spike_r35.yRot = -0.8727F;
        spike_r35.zRot = -1.5708F;
        spike_r35.texOffs(0, 38).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r36 = new ModelRenderer(this);
        spike_r36.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r36);
        spike_r36.xRot = 1.8326F;
        spike_r36.yRot = 0.2182F;
        spike_r36.zRot = -1.9635F;
        spike_r36.texOffs(4, 38).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r37 = new ModelRenderer(this);
        spike_r37.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r37);
        spike_r37.xRot = 1.2217F;
        spike_r37.yRot = -0.0436F;
        spike_r37.zRot = -1.9635F;
        spike_r37.texOffs(8, 38).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r38 = new ModelRenderer(this);
        spike_r38.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r38);
        spike_r38.xRot = 1.5708F;
        spike_r38.yRot = -0.48F;
        spike_r38.zRot = -1.5708F;
        spike_r38.texOffs(38, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r39 = new ModelRenderer(this);
        spike_r39.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r39);
        spike_r39.xRot = 1.5708F;
        spike_r39.yRot = -0.1309F;
        spike_r39.zRot = -1.5708F;
        spike_r39.texOffs(16, 38).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r40 = new ModelRenderer(this);
        spike_r40.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r40);
        spike_r40.xRot = -0.7854F;
        spike_r40.yRot = 0.0F;
        spike_r40.zRot = -1.5708F;
        spike_r40.texOffs(20, 39).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r41 = new ModelRenderer(this);
        spike_r41.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r41);
        spike_r41.xRot = 0.4078F;
        spike_r41.yRot = 0.2409F;
        spike_r41.zRot = -0.8933F;
        spike_r41.texOffs(39, 20).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r42 = new ModelRenderer(this);
        spike_r42.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r42);
        spike_r42.xRot = -0.5398F;
        spike_r42.yRot = 0.3042F;
        spike_r42.zRot = -1.4793F;
        spike_r42.texOffs(39, 30).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r43 = new ModelRenderer(this);
        spike_r43.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r43);
        spike_r43.xRot = -0.4348F;
        spike_r43.yRot = 0.276F;
        spike_r43.zRot = -1.116F;
        spike_r43.texOffs(40, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r44 = new ModelRenderer(this);
        spike_r44.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r44);
        spike_r44.xRot = -0.5774F;
        spike_r44.yRot = 0.028F;
        spike_r44.zRot = -0.6977F;
        spike_r44.texOffs(24, 40).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r45 = new ModelRenderer(this);
        spike_r45.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r45);
        spike_r45.xRot = -0.1745F;
        spike_r45.yRot = 0.0F;
        spike_r45.zRot = -0.1745F;
        spike_r45.texOffs(28, 40).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r46 = new ModelRenderer(this);
        spike_r46.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r46);
        spike_r46.xRot = 0.2182F;
        spike_r46.yRot = 0.0F;
        spike_r46.zRot = -0.48F;
        spike_r46.texOffs(32, 40).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r47 = new ModelRenderer(this);
        spike_r47.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r47);
        spike_r47.xRot = -0.1745F;
        spike_r47.yRot = 0.0F;
        spike_r47.zRot = -0.48F;
        spike_r47.texOffs(36, 40).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r48 = new ModelRenderer(this);
        spike_r48.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r48);
        spike_r48.xRot = 0.0F;
        spike_r48.yRot = 0.0F;
        spike_r48.zRot = -0.6981F;
        spike_r48.texOffs(40, 40).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r49 = new ModelRenderer(this);
        spike_r49.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r49);
        spike_r49.xRot = 0.3512F;
        spike_r49.yRot = -0.3829F;
        spike_r49.zRot = -1.8063F;
        spike_r49.texOffs(42, 10).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r50 = new ModelRenderer(this);
        spike_r50.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r50);
        spike_r50.xRot = -0.3671F;
        spike_r50.yRot = -0.3923F;
        spike_r50.zRot = -1.5236F;
        spike_r50.texOffs(43, 20).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r51 = new ModelRenderer(this);
        spike_r51.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r51);
        spike_r51.xRot = 0.0F;
        spike_r51.yRot = 0.0F;
        spike_r51.zRot = -1.0908F;
        spike_r51.texOffs(43, 30).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

        spike_r52 = new ModelRenderer(this);
        spike_r52.setPos(0.0F, -2.0F, 0.0F);
        bb_main.addChild(spike_r52);
        spike_r52.xRot = 0.0F;
        spike_r52.yRot = 0.0F;
        spike_r52.zRot = -1.4399F;
        spike_r52.texOffs(44, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.7F, false);

    }

    @Override
    public void setupAnim(SeaurchinEntity seaurchinEntity, float v, float v1, float v2, float v3, float v4) {
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

        bb_main.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

}
