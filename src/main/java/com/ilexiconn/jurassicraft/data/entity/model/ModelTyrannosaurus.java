package com.ilexiconn.jurassicraft.data.entity.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelTyrannosaurus extends ModelBase
{
    ModelRenderer Left_Calf_1;
    ModelRenderer Right_Calf_1;
    ModelRenderer Left_Thigh;
    ModelRenderer Right_Thigh;
    ModelRenderer Body_1;
    ModelRenderer Body_2;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Upper_Jaw;
    ModelRenderer Lower_Jaw;
    ModelRenderer Tail_1;
    ModelRenderer Tail_2;
    ModelRenderer Tail_3;
    ModelRenderer Tail_4;
    ModelRenderer Tail_5;
    ModelRenderer Lower_Arm_Left;
    ModelRenderer Lower_Arm_Right;
    ModelRenderer Hand_Left;
    ModelRenderer Hand_Right;
    ModelRenderer Hand_Left_Claw_Left;
    ModelRenderer Hand_Left_Claw_Right;
    ModelRenderer Hand_Right_Claw_Right;
    ModelRenderer Hand_Right_Claw_Left;
    ModelRenderer Left_Calf_2;
    ModelRenderer Right_Calf_2;
    ModelRenderer Foot_Left;
    ModelRenderer Foot_Right;

    public ModelTyrannosaurus()
    {
        textureWidth = 256;
        textureHeight = 256;

        Left_Calf_1 = new ModelRenderer(this, 65, 80);
        Left_Calf_1.addBox(-2F, 0F, 0F, 4, 8, 4);
        Left_Calf_1.setRotationPoint(7F, 13F, 3F);
        Left_Calf_1.setTextureSize(256, 256);
        Left_Calf_1.mirror = true;
        setRotation(Left_Calf_1, 0.7063936F, 0F, 0F);
        Right_Calf_1 = new ModelRenderer(this, 65, 80);
        Right_Calf_1.addBox(-2F, 0F, 0F, 4, 8, 4);
        Right_Calf_1.setRotationPoint(-7F, 13.5F, 3F);
        Right_Calf_1.setTextureSize(256, 256);
        Right_Calf_1.mirror = true;
        setRotation(Right_Calf_1, 0.7063936F, 0F, 0F);
        Left_Thigh = new ModelRenderer(this, 28, 58);
        Left_Thigh.addBox(0F, 0F, -11F, 5, 6, 11);
        Left_Thigh.setRotationPoint(4.5F, 3F, 8F);
        Left_Thigh.setTextureSize(256, 256);
        Left_Thigh.mirror = true;
        setRotation(Left_Thigh, 0.8179294F, 0F, 0F);
        Right_Thigh = new ModelRenderer(this, 28, 75);
        Right_Thigh.addBox(-5F, 0F, -11F, 5, 6, 11);
        Right_Thigh.setRotationPoint(-4.5F, 3F, 7.6F);
        Right_Thigh.setTextureSize(256, 256);
        Right_Thigh.mirror = true;
        setRotation(Right_Thigh, 0.8179294F, 0F, 0F);
        Body_1 = new ModelRenderer(this, 118, 0);
        Body_1.addBox(-5F, 0F, 0F, 10, 12, 21);
        Body_1.setRotationPoint(0F, -1F, -7F);
        Body_1.setTextureSize(256, 256);
        Body_1.mirror = true;
        setRotation(Body_1, -0.0371786F, 0F, 0F);
        Body_2 = new ModelRenderer(this, 183, 1);
        Body_2.addBox(-4F, 0F, 0F, 8, 12, 7);
        Body_2.setRotationPoint(0F, -2F, -9F);
        Body_2.setTextureSize(256, 256);
        Body_2.mirror = true;
        setRotation(Body_2, -0.1858931F, 0F, 0F);
        Neck = new ModelRenderer(this, 218, 1);
        Neck.addBox(-3.5F, 0.5F, 0F, 7, 9, 11);
        Neck.setRotationPoint(0F, -5F, -14F);
        Neck.setTextureSize(256, 256);
        Neck.mirror = true;
        setRotation(Neck, -0.5576792F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 92);
        Head.addBox(-4F, 0F, -8F, 8, 9, 8);
        Head.setRotationPoint(0F, -5F, -13.5F);
        Head.setTextureSize(256, 256);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Upper_Jaw = new ModelRenderer(this, 0, 120);
        Upper_Jaw.addBox(-3.5F, 0F, 0F, 7, 6, 9);
        Upper_Jaw.setRotationPoint(0F, 1.8F, -20F);
        Upper_Jaw.setTextureSize(256, 256);
        Upper_Jaw.mirror = true;
        setRotation(Upper_Jaw, -3.141593F, 0F, 0F);
        Lower_Jaw = new ModelRenderer(this, 71, 27);
        Lower_Jaw.addBox(-2.5F, 0F, 0F, 5, 2, 8);
        Lower_Jaw.setRotationPoint(0F, 3.5F, -20F);
        Lower_Jaw.setTextureSize(256, 256);
        Lower_Jaw.mirror = true;
        setRotation(Lower_Jaw, -2.881342F, 0F, 0F);
        Tail_1 = new ModelRenderer(this, 118, 39);
        Tail_1.addBox(-4.5F, 0F, 0F, 9, 9, 10);
        Tail_1.setRotationPoint(0F, -0.2F, 11F);
        Tail_1.setTextureSize(256, 256);
        Tail_1.mirror = true;
        setRotation(Tail_1, -0.1115358F, 0F, 0F);
        Tail_2 = new ModelRenderer(this, 118, 61);
        Tail_2.addBox(-4F, 0F, 0F, 8, 7, 8);
        Tail_2.setRotationPoint(0F, 1.5F, 19F);
        Tail_2.setTextureSize(256, 256);
        Tail_2.mirror = true;
        setRotation(Tail_2, -0.0743572F, 0F, 0F);
        Tail_3 = new ModelRenderer(this, 118, 122);
        Tail_3.addBox(-3F, 0F, 0F, 6, 6, 8);
        Tail_3.setRotationPoint(0F, 2.5F, 24F);
        Tail_3.setTextureSize(256, 256);
        Tail_3.mirror = true;
        setRotation(Tail_3, -0.0371786F, 0F, 0F);
        Tail_4 = new ModelRenderer(this, 118, 80);
        Tail_4.addBox(-2F, 0F, 0F, 4, 5, 9);
        Tail_4.setRotationPoint(0F, 3.3F, 29F);
        Tail_4.setTextureSize(256, 256);
        Tail_4.mirror = true;
        setRotation(Tail_4, 0F, 0F, 0F);
        Tail_5 = new ModelRenderer(this, 118, 100);
        Tail_5.addBox(-1.5F, 0F, 0F, 3, 4, 11);
        Tail_5.setRotationPoint(0F, 3.8F, 35F);
        Tail_5.setTextureSize(256, 256);
        Tail_5.mirror = true;
        setRotation(Tail_5, 0.0371786F, 0F, 0F);
        Lower_Arm_Left = new ModelRenderer(this, 0, 68);
        Lower_Arm_Left.addBox(0F, 0F, 0F, 2, 5, 2);
        Lower_Arm_Left.setRotationPoint(5F, 8F, -6F);
        Lower_Arm_Left.setTextureSize(256, 256);
        Lower_Arm_Left.mirror = true;
        setRotation(Lower_Arm_Left, -0.6320364F, 0F, 0F);
        Lower_Arm_Right = new ModelRenderer(this, 0, 68);
        Lower_Arm_Right.addBox(-2F, 0F, 0F, 2, 5, 2);
        Lower_Arm_Right.setRotationPoint(-5F, 8F, -6F);
        Lower_Arm_Right.setTextureSize(256, 256);
        Lower_Arm_Right.mirror = true;
        setRotation(Lower_Arm_Right, -0.6320364F, 0F, 0F);
        Hand_Left = new ModelRenderer(this, 81, 54);
        Hand_Left.addBox(0F, 0F, 0F, 2, 1, 2);
        Hand_Left.setRotationPoint(5.5F, 12F, -9.8F);
        Hand_Left.setTextureSize(256, 256);
        Hand_Left.mirror = true;
        setRotation(Hand_Left, 0F, 1.169274F, 1.673038F);
        Hand_Right = new ModelRenderer(this, 81, 54);
        Hand_Right.addBox(0F, 0F, 0F, 2, 1, 2);
        Hand_Right.setRotationPoint(-5F, 12F, -8.8F);
        Hand_Right.setTextureSize(256, 256);
        Hand_Right.mirror = true;
        setRotation(Hand_Right, 0F, -1.169266F, 1.673038F);
        Hand_Left_Claw_Left = new ModelRenderer(this, 81, 45);
        Hand_Left_Claw_Left.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Left_Claw_Left.setRotationPoint(6F, 12.9F, -8.2F);
        Hand_Left_Claw_Left.setTextureSize(256, 256);
        Hand_Left_Claw_Left.mirror = true;
        setRotation(Hand_Left_Claw_Left, 0.2230717F, 2.499338F, 1.968194F);
        Hand_Left_Claw_Right = new ModelRenderer(this, 81, 45);
        Hand_Left_Claw_Right.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Left_Claw_Right.setRotationPoint(5F, 12.5F, -8.7F);
        Hand_Left_Claw_Right.setTextureSize(256, 256);
        Hand_Left_Claw_Right.mirror = true;
        setRotation(Hand_Left_Claw_Right, -0.0371786F, 2.748229F, 1.261801F);
        Hand_Right_Claw_Right = new ModelRenderer(this, 81, 45);
        Hand_Right_Claw_Right.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Right_Claw_Right.setRotationPoint(-6.8F, 12.4F, -8F);
        Hand_Right_Claw_Right.setTextureSize(256, 256);
        Hand_Right_Claw_Right.mirror = true;
        setRotation(Hand_Right_Claw_Right, 0F, -2.711044F, 1.224628F);
        Hand_Right_Claw_Left = new ModelRenderer(this, 81, 45);
        Hand_Right_Claw_Left.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Right_Claw_Left.setRotationPoint(-6F, 12.9F, -8.3F);
        Hand_Right_Claw_Left.setTextureSize(256, 256);
        Hand_Right_Claw_Left.mirror = true;
        setRotation(Hand_Right_Claw_Left, 0F, -2.648048F, 2.042552F);
        Left_Calf_2 = new ModelRenderer(this, 65, 0);
        Left_Calf_2.addBox(-2F, 0F, 0F, 3, 9, 3);
        Left_Calf_2.setRotationPoint(7.5F, 15.2F, 8.4F);
        Left_Calf_2.setTextureSize(256, 256);
        Left_Calf_2.mirror = true;
        setRotation(Left_Calf_2, -0.5576792F, 0F, 0F);
        Right_Calf_2 = new ModelRenderer(this, 65, 0);
        Right_Calf_2.addBox(-1F, 0F, 0F, 3, 8, 3);
        Right_Calf_2.setRotationPoint(-7.5F, 15.2F, 8.4F);
        Right_Calf_2.setTextureSize(256, 256);
        Right_Calf_2.mirror = true;
        setRotation(Right_Calf_2, -0.5576792F, 0F, 0F);
        Foot_Left = new ModelRenderer(this, 0, 0);
        Foot_Left.addBox(-2.5F, 0F, -4F, 5, 2, 7);
        Foot_Left.setRotationPoint(7F, 22F, 5F);
        Foot_Left.setTextureSize(256, 256);
        Foot_Left.mirror = true;
        setRotation(Foot_Left, 0F, 0F, 0F);
        Foot_Right = new ModelRenderer(this, 0, 0);
        Foot_Right.addBox(-2.5F, 0F, -4F, 5, 2, 7);
        Foot_Right.setRotationPoint(-7F, 22F, 5F);
        Foot_Right.setTextureSize(256, 256);
        Foot_Right.mirror = true;
        setRotation(Foot_Right, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        if (isChild)
        {
            float var8 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            Left_Calf_1.render(f5);
            Right_Calf_1.render(f5);
            Left_Thigh.render(f5);
            Right_Thigh.render(f5);
            Body_1.render(f5);
            Body_2.render(f5);
            Neck.render(f5);
            Head.render(f5);
            Upper_Jaw.render(f5);
            Lower_Jaw.render(f5);
            Tail_1.render(f5);
            Tail_2.render(f5);
            Tail_3.render(f5);
            Tail_4.render(f5);
            Tail_5.render(f5);
            Lower_Arm_Left.render(f5);
            Lower_Arm_Right.render(f5);
            Hand_Left.render(f5);
            Hand_Right.render(f5);
            Hand_Left_Claw_Left.render(f5);
            Hand_Left_Claw_Right.render(f5);
            Hand_Right_Claw_Right.render(f5);
            Hand_Right_Claw_Left.render(f5);
            Left_Calf_2.render(f5);
            Right_Calf_2.render(f5);
            Foot_Left.render(f5);
            Foot_Right.render(f5);
            GL11.glPopMatrix();
        }
        else
        {
            Left_Calf_1.render(f5);
            Right_Calf_1.render(f5);
            Left_Thigh.render(f5);
            Right_Thigh.render(f5);
            Body_1.render(f5);
            Body_2.render(f5);
            Neck.render(f5);
            Head.render(f5);
            Upper_Jaw.render(f5);
            Lower_Jaw.render(f5);
            Tail_1.render(f5);
            Tail_2.render(f5);
            Tail_3.render(f5);
            Tail_4.render(f5);
            Tail_5.render(f5);
            Lower_Arm_Left.render(f5);
            Lower_Arm_Right.render(f5);
            Hand_Left.render(f5);
            Hand_Right.render(f5);
            Hand_Left_Claw_Left.render(f5);
            Hand_Left_Claw_Right.render(f5);
            Hand_Right_Claw_Right.render(f5);
            Hand_Right_Claw_Left.render(f5);
            Left_Calf_2.render(f5);
            Right_Calf_2.render(f5);
            Foot_Left.render(f5);
            Foot_Right.render(f5);
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
