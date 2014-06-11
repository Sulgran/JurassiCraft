package com.ilexiconn.jurassicraft.data.entity.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelHerrerasaur extends ModelBase
{
    ModelRenderer Left_Upper_Foot;
    ModelRenderer Right_Upper_Foot;
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
    ModelRenderer Tail_6;
    ModelRenderer Upper_Arm_Right;
    ModelRenderer Upper_Arm_Left;
    ModelRenderer Lower_Arm_Left;
    ModelRenderer Lower_Arm_Right;
    ModelRenderer Hand_Left;
    ModelRenderer Hand_Right;
    ModelRenderer Hand_Left_Claw_Left;
    ModelRenderer Hand_Left_Claw_Right;
    ModelRenderer Hand_Left_Claw_Middle;
    ModelRenderer Hand_Right_Claw_Right;
    ModelRenderer Hand_Right_Claw_Left;
    ModelRenderer Hand_Right_Claw_Middle;
    ModelRenderer Foot_Left;
    ModelRenderer Foot_Right;

    public ModelHerrerasaur()
    {
        textureWidth = 256;
        textureHeight = 256;

        Left_Upper_Foot = new ModelRenderer(this, 81, 0);
        Left_Upper_Foot.addBox(0F, 0F, -1F, 7, 2, 2);
        Left_Upper_Foot.setRotationPoint(6F, 17.2F, 9F);
        Left_Upper_Foot.setTextureSize(256, 256);
        Left_Upper_Foot.mirror = true;
        setRotation(Left_Upper_Foot, 0F, 1.581233F, 0.9666439F);
        Right_Upper_Foot = new ModelRenderer(this, 81, 0);
        Right_Upper_Foot.addBox(0F, 0F, -1F, 7, 2, 2);
        Right_Upper_Foot.setRotationPoint(-6.1F, 17F, 9.1F);
        Right_Upper_Foot.setTextureSize(256, 256);
        Right_Upper_Foot.mirror = true;
        setRotation(Right_Upper_Foot, 0F, 1.581233F, 0.9666439F);
        Left_Calf_1 = new ModelRenderer(this, 65, 0);
        Left_Calf_1.addBox(-1.5F, 0F, 0F, 3, 10, 3);
        Left_Calf_1.setRotationPoint(6F, 12.5F, 2F);
        Left_Calf_1.setTextureSize(256, 256);
        Left_Calf_1.mirror = true;
        setRotation(Left_Calf_1, 0.7063936F, 0F, 0F);
        Right_Calf_1 = new ModelRenderer(this, 65, 0);
        Right_Calf_1.addBox(-1.5F, 0F, 0F, 3, 10, 3);
        Right_Calf_1.setRotationPoint(-6F, 12.5F, 2F);
        Right_Calf_1.setTextureSize(256, 256);
        Right_Calf_1.mirror = true;
        setRotation(Right_Calf_1, 0.7238469F, 0F, 0.0174533F);
        Left_Thigh = new ModelRenderer(this, 27, 57);
        Left_Thigh.addBox(0F, 0F, -12F, 5, 5, 12);
        Left_Thigh.setRotationPoint(3.5F, 3F, 8.9F);
        Left_Thigh.setTextureSize(256, 256);
        Left_Thigh.mirror = true;
        setRotation(Left_Thigh, 0.8231159F, 0F, 0F);
        Right_Thigh = new ModelRenderer(this, 27, 57);
        Right_Thigh.addBox(-5F, 0F, -12F, 5, 5, 12);
        Right_Thigh.setRotationPoint(-3.5F, 3F, 8.9F);
        Right_Thigh.setTextureSize(256, 256);
        Right_Thigh.mirror = true;
        setRotation(Right_Thigh, 0.8231159F, 0F, 0F);
        Body_1 = new ModelRenderer(this, 118, 0);
        Body_1.addBox(-4.5F, 0F, 0F, 9, 10, 21);
        Body_1.setRotationPoint(0F, 0.5F, -7F);
        Body_1.setTextureSize(256, 256);
        Body_1.mirror = true;
        setRotation(Body_1, -0.0248833F, 0F, 0F);
        Body_2 = new ModelRenderer(this, 182, 0);
        Body_2.addBox(-4F, 0F, 0F, 8, 9, 4);
        Body_2.setRotationPoint(0F, 1.3F, -10F);
        Body_2.setTextureSize(256, 256);
        Body_2.mirror = true;
        setRotation(Body_2, 0.1458569F, 0F, 0F);
        Neck = new ModelRenderer(this, 217, 0);
        Neck.addBox(-2.5F, 0F, 0F, 5, 6, 13);
        Neck.setRotationPoint(0F, 3F, -17F);
        Neck.setTextureSize(256, 256);
        Neck.mirror = true;
        setRotation(Neck, 0.0589777F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 92);
        Head.addBox(-3.5F, 0F, -6F, 7, 7, 6);
        Head.setRotationPoint(0F, 2F, -16F);
        Head.setTextureSize(256, 256);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Upper_Jaw = new ModelRenderer(this, 11, 26);
        Upper_Jaw.addBox(-2.5F, 0F, -8F, 5, 4, 8);
        Upper_Jaw.setRotationPoint(0F, 3.5F, -20F);
        Upper_Jaw.setTextureSize(256, 256);
        Upper_Jaw.mirror = true;
        setRotation(Upper_Jaw, 0.0174533F, 0F, 0F);
        Lower_Jaw = new ModelRenderer(this, 71, 27);
        Lower_Jaw.addBox(-1.5F, 0F, 0F, 3, 1, 7);
        Lower_Jaw.setRotationPoint(0F, 8.5F, -20F);
        Lower_Jaw.setTextureSize(256, 256);
        Lower_Jaw.mirror = true;
        setRotation(Lower_Jaw, -3.141593F, 0F, 0F);
        Tail_1 = new ModelRenderer(this, 118, 39);
        Tail_1.addBox(-4F, 0F, 0F, 8, 8, 10);
        Tail_1.setRotationPoint(0F, 1.1F, 11F);
        Tail_1.setTextureSize(256, 256);
        Tail_1.mirror = true;
        setRotation(Tail_1, -0.1797784F, 0F, 0F);
        Tail_2 = new ModelRenderer(this, 118, 61);
        Tail_2.addBox(-3.5F, 0F, 0F, 7, 7, 8);
        Tail_2.setRotationPoint(0F, 3.3F, 19F);
        Tail_2.setTextureSize(256, 256);
        Tail_2.mirror = true;
        setRotation(Tail_2, -0.1627677F, 0F, 0F);
        Tail_3 = new ModelRenderer(this, 118, 119);
        Tail_3.addBox(-3F, 0F, 0F, 6, 6, 8);
        Tail_3.setRotationPoint(0F, 5.1F, 24F);
        Tail_3.setTextureSize(256, 256);
        Tail_3.mirror = true;
        setRotation(Tail_3, -0.0640412F, 0F, 0F);
        Tail_4 = new ModelRenderer(this, 118, 80);
        Tail_4.addBox(-2F, 0F, 0F, 4, 5, 9);
        Tail_4.setRotationPoint(0F, 6F, 29F);
        Tail_4.setTextureSize(256, 256);
        Tail_4.mirror = true;
        setRotation(Tail_4, -0.0122953F, 0F, 0F);
        Tail_5 = new ModelRenderer(this, 118, 101);
        Tail_5.addBox(-1.5F, 0F, 0F, 3, 4, 10);
        Tail_5.setRotationPoint(0F, 6.5F, 35F);
        Tail_5.setTextureSize(256, 256);
        Tail_5.mirror = true;
        setRotation(Tail_5, -0.0122953F, 0F, 0F);
        Tail_6 = new ModelRenderer(this, 118, 134);
        Tail_6.addBox(-1F, 0F, 0F, 2, 3, 8);
        Tail_6.setRotationPoint(0F, 7F, 44F);
        Tail_6.setTextureSize(256, 256);
        Tail_6.mirror = true;
        setRotation(Tail_6, 0.0494739F, 0F, 0F);
        Upper_Arm_Right = new ModelRenderer(this, 0, 56);
        Upper_Arm_Right.addBox(-3F, 0F, 0F, 3, 3, 7);
        Upper_Arm_Right.setRotationPoint(-3.5F, 7F, -5F);
        Upper_Arm_Right.setTextureSize(256, 256);
        Upper_Arm_Right.mirror = true;
        setRotation(Upper_Arm_Right, -0.8512869F, 0F, 0F);
        Upper_Arm_Left = new ModelRenderer(this, 0, 56);
        Upper_Arm_Left.addBox(0F, 0F, 0F, 3, 3, 7);
        Upper_Arm_Left.setRotationPoint(3.5F, 7F, -5F);
        Upper_Arm_Left.setTextureSize(256, 256);
        Upper_Arm_Left.mirror = true;
        setRotation(Upper_Arm_Left, -0.8512869F, 0F, 0F);
        Lower_Arm_Left = new ModelRenderer(this, 0, 68);
        Lower_Arm_Left.addBox(-1F, 0F, 0F, 2, 5, 2);
        Lower_Arm_Left.setRotationPoint(5F, 12F, -3.5F);
        Lower_Arm_Left.setTextureSize(256, 256);
        Lower_Arm_Left.mirror = true;
        setRotation(Lower_Arm_Left, -0.6320364F, 0F, 0F);
        Lower_Arm_Right = new ModelRenderer(this, 0, 68);
        Lower_Arm_Right.addBox(-1F, 0F, 0F, 2, 5, 2);
        Lower_Arm_Right.setRotationPoint(-5F, 12F, -3.5F);
        Lower_Arm_Right.setTextureSize(256, 256);
        Lower_Arm_Right.mirror = true;
        setRotation(Lower_Arm_Right, -0.6320364F, 0F, 0F);
        Hand_Left = new ModelRenderer(this, 81, 54);
        Hand_Left.addBox(0F, 0F, 0F, 2, 1, 2);
        Hand_Left.setRotationPoint(4.5F, 16F, -6.8F);
        Hand_Left.setTextureSize(256, 256);
        Hand_Left.mirror = true;
        setRotation(Hand_Left, 0F, 1.169274F, 1.673038F);
        Hand_Right = new ModelRenderer(this, 81, 54);
        Hand_Right.addBox(0F, 0F, 0F, 2, 1, 2);
        Hand_Right.setRotationPoint(-4F, 16F, -5.8F);
        Hand_Right.setTextureSize(256, 256);
        Hand_Right.mirror = true;
        setRotation(Hand_Right, 0F, -1.169266F, 1.673038F);
        Hand_Left_Claw_Left = new ModelRenderer(this, 81, 45);
        Hand_Left_Claw_Left.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Left_Claw_Left.setRotationPoint(5F, 17F, -5.4F);
        Hand_Left_Claw_Left.setTextureSize(256, 256);
        Hand_Left_Claw_Left.mirror = true;
        setRotation(Hand_Left_Claw_Left, 0F, 2.648053F, 2.042552F);
        Hand_Left_Claw_Right = new ModelRenderer(this, 81, 45);
        Hand_Left_Claw_Right.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Left_Claw_Right.setRotationPoint(4F, 16.5F, -5.8F);
        Hand_Left_Claw_Right.setTextureSize(256, 256);
        Hand_Left_Claw_Right.mirror = true;
        setRotation(Hand_Left_Claw_Right, 0F, 2.636693F, 1.224622F);
        Hand_Left_Claw_Middle = new ModelRenderer(this, 81, 45);
        Hand_Left_Claw_Middle.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Left_Claw_Middle.setRotationPoint(5F, 17F, -6.6F);
        Hand_Left_Claw_Middle.setTextureSize(256, 256);
        Hand_Left_Claw_Middle.mirror = true;
        setRotation(Hand_Left_Claw_Middle, 0F, 1.169274F, 1.673038F);
        Hand_Right_Claw_Right = new ModelRenderer(this, 81, 45);
        Hand_Right_Claw_Right.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Right_Claw_Right.setRotationPoint(-5.8F, 16.4F, -5F);
        Hand_Right_Claw_Right.setTextureSize(256, 256);
        Hand_Right_Claw_Right.mirror = true;
        setRotation(Hand_Right_Claw_Right, 0F, -2.711044F, 1.224628F);
        Hand_Right_Claw_Left = new ModelRenderer(this, 81, 45);
        Hand_Right_Claw_Left.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Right_Claw_Left.setRotationPoint(-5F, 16.9F, -5.3F);
        Hand_Right_Claw_Left.setTextureSize(256, 256);
        Hand_Right_Claw_Left.mirror = true;
        setRotation(Hand_Right_Claw_Left, 0F, -2.648048F, 2.042552F);
        Hand_Right_Claw_Middle = new ModelRenderer(this, 81, 45);
        Hand_Right_Claw_Middle.addBox(0F, 0F, 0F, 2, 1, 1);
        Hand_Right_Claw_Middle.setRotationPoint(-4.6F, 16.8F, -5.8F);
        Hand_Right_Claw_Middle.setTextureSize(256, 256);
        Hand_Right_Claw_Middle.mirror = true;
        setRotation(Hand_Right_Claw_Middle, 0F, -1.169266F, 1.673038F);
        Foot_Left = new ModelRenderer(this, 0, 0);
        Foot_Left.addBox(-1.5F, 0F, -4F, 3, 2, 6);
        Foot_Left.setRotationPoint(6F, 22F, 6.5F);
        Foot_Left.setTextureSize(256, 256);
        Foot_Left.mirror = true;
        setRotation(Foot_Left, 0F, 0F, 0F);
        Foot_Right = new ModelRenderer(this, 0, 0);
        Foot_Right.addBox(-1.5F, 0F, -4F, 3, 2, 6);
        Foot_Right.setRotationPoint(-6F, 22F, 6.5F);
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
            Left_Upper_Foot.render(f5);
            Right_Upper_Foot.render(f5);
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
            Tail_6.render(f5);
            Upper_Arm_Right.render(f5);
            Upper_Arm_Left.render(f5);
            Lower_Arm_Left.render(f5);
            Lower_Arm_Right.render(f5);
            Hand_Left.render(f5);
            Hand_Right.render(f5);
            Hand_Left_Claw_Left.render(f5);
            Hand_Left_Claw_Right.render(f5);
            Hand_Left_Claw_Middle.render(f5);
            Hand_Right_Claw_Right.render(f5);
            Hand_Right_Claw_Left.render(f5);
            Hand_Right_Claw_Middle.render(f5);
            Foot_Left.render(f5);
            Foot_Right.render(f5);
            GL11.glPopMatrix();
        }
        else
        {
            Left_Upper_Foot.render(f5);
            Right_Upper_Foot.render(f5);
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
            Tail_6.render(f5);
            Upper_Arm_Right.render(f5);
            Upper_Arm_Left.render(f5);
            Lower_Arm_Left.render(f5);
            Lower_Arm_Right.render(f5);
            Hand_Left.render(f5);
            Hand_Right.render(f5);
            Hand_Left_Claw_Left.render(f5);
            Hand_Left_Claw_Right.render(f5);
            Hand_Left_Claw_Middle.render(f5);
            Hand_Right_Claw_Right.render(f5);
            Hand_Right_Claw_Left.render(f5);
            Hand_Right_Claw_Middle.render(f5);
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
