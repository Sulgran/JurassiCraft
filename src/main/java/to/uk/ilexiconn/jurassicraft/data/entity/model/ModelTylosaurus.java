// Date: 26/07/2014 3:26:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package to.uk.ilexiconn.jurassicraft.data.entity.model;

import net.minecraft.entity.Entity;

public class ModelTylosaurus extends MowzieModelBase
{
    //fields
    MowzieModelRenderer Head;
    MowzieModelRenderer Upper_Jaw;
    MowzieModelRenderer Lower_Jaw;
    MowzieModelRenderer Neck_;
    MowzieModelRenderer Body;
    MowzieModelRenderer Tail_1;
    MowzieModelRenderer Tail_2;
    MowzieModelRenderer Tail_3;
    MowzieModelRenderer Tail_4;
    MowzieModelRenderer Fin_1;
    MowzieModelRenderer Fin_2;
    MowzieModelRenderer Fin_3;
    MowzieModelRenderer Fin_4;
    MowzieModelRenderer Fin_5;
    MowzieModelRenderer Fin_6;
    MowzieModelRenderer Right_Front_Flipper;
    MowzieModelRenderer Left_Front_Flipper;
    MowzieModelRenderer Right_Back_Flipper;
    MowzieModelRenderer Left_Back_Flipper;
    MowzieModelRenderer Knob_1;
    MowzieModelRenderer Knob_2;
    MowzieModelRenderer Knob_3;
    MowzieModelRenderer Knob_4;
    MowzieModelRenderer Knob_5;
    MowzieModelRenderer Knob_6;
    MowzieModelRenderer Knob_7;
    MowzieModelRenderer Knob_8;
    MowzieModelRenderer Knob_9;
    MowzieModelRenderer Knob_10;
    MowzieModelRenderer Knob_11;
    MowzieModelRenderer Knob_12;
    MowzieModelRenderer Knob_13;
    MowzieModelRenderer Knob_14;
    MowzieModelRenderer Knob_15;
    MowzieModelRenderer Knob_16;
    MowzieModelRenderer Knob_17;
    MowzieModelRenderer Knob_18;
    MowzieModelRenderer Knob_19;
    MowzieModelRenderer Knob_20;
    MowzieModelRenderer Knob_21;
    MowzieModelRenderer Knob_22;
    MowzieModelRenderer Knob_23;
    MowzieModelRenderer Knob_24;
    MowzieModelRenderer Knob_25;
    MowzieModelRenderer Knob_26;
    MowzieModelRenderer Knob_27;
    MowzieModelRenderer Knob_28;
    MowzieModelRenderer Knob_29;
    MowzieModelRenderer Knob_30;
    MowzieModelRenderer Teeth;

    public ModelTylosaurus()
    {
        textureWidth = 256;
        textureHeight = 128;

        Head = new MowzieModelRenderer(this, 0, 0);
        Head.addBox(-4F, 0F, -8F, 8, 8, 8);
        Head.setRotationPoint(0F, 12.5F, -25F);
        Head.setTextureSize(256, 128);
        setRotation(Head, 0F, 0F, 0F);
        Upper_Jaw = new MowzieModelRenderer(this, 0, 23);
        Upper_Jaw.addBox(-2.5F, 0F, -10F, 5, 4, 10);
        Upper_Jaw.setRotationPoint(0F, 13.38F, -32F);
        Upper_Jaw.setTextureSize(256, 128);
        setRotation(Upper_Jaw, 0F, 0F, 0F);
        Lower_Jaw = new MowzieModelRenderer(this, 0, 42);
        Lower_Jaw.addBox(-2F, 0F, -10F, 4, 2, 10);
        Lower_Jaw.setRotationPoint(0F, 17.6F, -31F);
        Lower_Jaw.setTextureSize(256, 128);
        setRotation(Lower_Jaw, 0F, 0F, 0F);
        Neck_ = new MowzieModelRenderer(this, 0, 60);
        Neck_.addBox(-4.5F, 0F, -12F, 9, 10, 12);
        Neck_.setRotationPoint(0F, 10.7F, -14.5F);
        Neck_.setTextureSize(256, 128);
        setRotation(Neck_, 0.0743623F, 0F, 0F);
        Body = new MowzieModelRenderer(this, 46, 0);
        Body.addBox(-6F, 0F, -23F, 12, 12, 23);
        Body.setRotationPoint(0F, 10.5F, 5F);
        Body.setTextureSize(256, 128);
        setRotation(Body, 0F, 0F, 0F);
        Tail_1 = new MowzieModelRenderer(this, 46, 40);
        Tail_1.addBox(-5F, 0F, 0F, 10, 11, 10);
        Tail_1.setRotationPoint(0F, 11F, 3F);
        Tail_1.setTextureSize(256, 128);
        setRotation(Tail_1, -0.0349066F, 0F, 0F);
        Tail_2 = new MowzieModelRenderer(this, 46, 65);
        Tail_2.addBox(-4F, 0F, 0F, 8, 9, 9);
        Tail_2.setRotationPoint(0F, 12F, 10F);
        Tail_2.setTextureSize(256, 128);
        setRotation(Tail_2, -0.0610865F, 0F, 0F);
        Tail_3 = new MowzieModelRenderer(this, 46, 87);
        Tail_3.addBox(-3F, 0F, 0F, 6, 7, 8);
        Tail_3.setRotationPoint(0F, 13F, 17F);
        Tail_3.setTextureSize(256, 128);
        setRotation(Tail_3, -0.0610865F, 0F, 0F);
        Tail_4 = new MowzieModelRenderer(this, 46, 104);
        Tail_4.addBox(-2F, 0F, 0F, 4, 5, 19);
        Tail_4.setRotationPoint(0F, 14F, 22F);
        Tail_4.setTextureSize(256, 128);
        setRotation(Tail_4, -0.0261799F, 0F, 0F);
        Fin_1 = new MowzieModelRenderer(this, 101, 102);
        Fin_1.addBox(-1F, 0F, 0F, 2, 8, 12);
        Fin_1.setRotationPoint(0F, 12.7F, 36F);
        Fin_1.setTextureSize(256, 128);
        setRotation(Fin_1, 0.0090932F, 0F, 0F);
        Fin_2 = new MowzieModelRenderer(this, 101, 86);
        Fin_2.addBox(-1F, 0F, -6F, 2, 4, 6);
        Fin_2.setRotationPoint(0F, 12.7F, 36F);
        Fin_2.setTextureSize(256, 128);
        setRotation(Fin_2, 0.3065147F, 0F, 0F);
        Fin_3 = new MowzieModelRenderer(this, 101, 70);
        Fin_3.addBox(-1F, -3.9F, -6F, 2, 4, 6);
        Fin_3.setRotationPoint(0F, 20.5F, 36.2F);
        Fin_3.setTextureSize(256, 128);
        setRotation(Fin_3, -0.2047271F, 0F, 0F);
        Fin_4 = new MowzieModelRenderer(this, 128, 70);
        Fin_4.addBox(-1F, 0F, 0F, 2, 4, 6);
        Fin_4.setRotationPoint(0F, 12.5F, 48F);
        Fin_4.setTextureSize(256, 128);
        setRotation(Fin_4, -0.2837905F, 0F, 0F);
        Fin_5 = new MowzieModelRenderer(this, 128, 86);
        Fin_5.addBox(-1F, 0F, -6F, 2, 4, 6);
        Fin_5.setRotationPoint(0F, 20.5F, 48F);
        Fin_5.setTextureSize(256, 128);
        setRotation(Fin_5, -2.965192F, 0F, 0F);
        Fin_6 = new MowzieModelRenderer(this, 134, 105);
        Fin_6.addBox(-1F, 0F, 0F, 2, 5, 6);
        Fin_6.setRotationPoint(0F, 14.5F, 47.8F);
        Fin_6.setTextureSize(256, 128);
        setRotation(Fin_6, 0F, 0F, 0F);
        Right_Front_Flipper = new MowzieModelRenderer(this, 160, 14);
        Right_Front_Flipper.addBox(-6F, 0F, -3F, 6, 1, 12);
        Right_Front_Flipper.setRotationPoint(-5F, 20F, -11F);
        Right_Front_Flipper.setTextureSize(256, 128);
        setRotation(Right_Front_Flipper, -0.296706F, -1.161831F, 0F);
        Left_Front_Flipper = new MowzieModelRenderer(this, 122, 14);
        Left_Front_Flipper.addBox(0F, 0F, -3F, 6, 1, 12);
        Left_Front_Flipper.setRotationPoint(5F, 20F, -11F);
        Left_Front_Flipper.setTextureSize(256, 128);
        setRotation(Left_Front_Flipper, -0.296706F, 1.161831F, 0F);
        Right_Back_Flipper = new MowzieModelRenderer(this, 160, 27);
        Right_Back_Flipper.addBox(-6F, 0F, -2F, 6, 1, 13);
        Right_Back_Flipper.setRotationPoint(-5F, 20F, 4F);
        Right_Back_Flipper.setTextureSize(256, 128);
        setRotation(Right_Back_Flipper, -0.296706F, -1.161831F, 0F);
        Left_Back_Flipper = new MowzieModelRenderer(this, 121, 27);
        Left_Back_Flipper.addBox(0F, 0F, -2F, 6, 1, 13);
        Left_Back_Flipper.setRotationPoint(5F, 20F, 4F);
        Left_Back_Flipper.setTextureSize(256, 128);
        setRotation(Left_Back_Flipper, -0.296706F, 1.161831F, 0F);
        Knob_1 = new MowzieModelRenderer(this, 36, 4);
        Knob_1.addBox(-0.5F, -2F, 0F, 1, 3, 1);
        Knob_1.setRotationPoint(0F, 12.9F, -26F);
        Knob_1.setTextureSize(256, 128);
        setRotation(Knob_1, -0.4089647F, 0F, 0F);
        Knob_2 = new MowzieModelRenderer(this, 36, 4);
        Knob_2.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_2.setRotationPoint(0F, 12.7F, -24F);
        Knob_2.setTextureSize(256, 128);
        setRotation(Knob_2, -0.4089647F, 0F, 0F);
        Knob_3 = new MowzieModelRenderer(this, 36, 4);
        Knob_3.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_3.setRotationPoint(0F, 12.5F, -22F);
        Knob_3.setTextureSize(256, 128);
        setRotation(Knob_3, -0.4089647F, 0F, 0F);
        Knob_4 = new MowzieModelRenderer(this, 36, 4);
        Knob_4.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_4.setRotationPoint(0F, 12F, -20F);
        Knob_4.setTextureSize(256, 128);
        setRotation(Knob_4, -0.4089647F, 0F, 0F);
        Knob_5 = new MowzieModelRenderer(this, 36, 4);
        Knob_5.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_5.setRotationPoint(0F, 11.5F, -18F);
        Knob_5.setTextureSize(256, 128);
        setRotation(Knob_5, -0.4089647F, 0F, 0F);
        Knob_6 = new MowzieModelRenderer(this, 36, 4);
        Knob_6.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_6.setRotationPoint(0F, 11.5F, -16F);
        Knob_6.setTextureSize(256, 128);
        setRotation(Knob_6, -0.4089647F, 0F, 0F);
        Knob_7 = new MowzieModelRenderer(this, 36, 4);
        Knob_7.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_7.setRotationPoint(0F, 11.5F, -14F);
        Knob_7.setTextureSize(256, 128);
        setRotation(Knob_7, -0.4089647F, 0F, 0F);
        Knob_8 = new MowzieModelRenderer(this, 36, 4);
        Knob_8.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_8.setRotationPoint(0F, 15F, 30F);
        Knob_8.setTextureSize(256, 128);
        setRotation(Knob_8, -0.4833219F, 0F, 0F);
        Knob_9 = new MowzieModelRenderer(this, 36, 4);
        Knob_9.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_9.setRotationPoint(0F, 14.5F, 32F);
        Knob_9.setTextureSize(256, 128);
        setRotation(Knob_9, -0.4833219F, 0F, 0F);
        Knob_10 = new MowzieModelRenderer(this, 36, 4);
        Knob_10.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_10.setRotationPoint(0F, 14F, 34F);
        Knob_10.setTextureSize(256, 128);
        setRotation(Knob_10, -0.4833219F, 0F, 0F);
        Knob_11 = new MowzieModelRenderer(this, 36, 4);
        Knob_11.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_11.setRotationPoint(0F, 13.5F, 36F);
        Knob_11.setTextureSize(256, 128);
        setRotation(Knob_11, -0.5356818F, 0F, 0F);
        Knob_12 = new MowzieModelRenderer(this, 36, 4);
        Knob_12.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_12.setRotationPoint(0F, 13.5F, 38F);
        Knob_12.setTextureSize(256, 128);
        setRotation(Knob_12, -0.5356818F, 0F, 0F);
        Knob_13 = new MowzieModelRenderer(this, 36, 4);
        Knob_13.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_13.setRotationPoint(0F, 13.5F, 40F);
        Knob_13.setTextureSize(256, 128);
        setRotation(Knob_13, -0.5356818F, 0F, 0F);
        Knob_14 = new MowzieModelRenderer(this, 36, 4);
        Knob_14.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_14.setRotationPoint(0F, 13.5F, 42F);
        Knob_14.setTextureSize(256, 128);
        setRotation(Knob_14, -0.5356818F, 0F, 0F);
        Knob_15 = new MowzieModelRenderer(this, 36, 4);
        Knob_15.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_15.setRotationPoint(0F, 13.5F, 44F);
        Knob_15.setTextureSize(256, 128);
        setRotation(Knob_15, -0.5356818F, 0F, 0F);
        Knob_16 = new MowzieModelRenderer(this, 36, 4);
        Knob_16.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_16.setRotationPoint(0F, 13.5F, 46F);
        Knob_16.setTextureSize(256, 128);
        setRotation(Knob_16, -0.5356818F, 0F, 0F);
        Knob_17 = new MowzieModelRenderer(this, 36, 4);
        Knob_17.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_17.setRotationPoint(0F, 13.8F, 48F);
        Knob_17.setTextureSize(256, 128);
        setRotation(Knob_17, -0.5356818F, 0F, 0F);
        Knob_18 = new MowzieModelRenderer(this, 36, 4);
        Knob_18.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_18.setRotationPoint(0F, 14.4F, 50F);
        Knob_18.setTextureSize(256, 128);
        setRotation(Knob_18, -0.5356818F, 0F, 0F);
        Knob_19 = new MowzieModelRenderer(this, 36, 4);
        Knob_19.addBox(-0.5F, -2F, 0F, 1, 2, 1);
        Knob_19.setRotationPoint(0F, 15.1F, 52F);
        Knob_19.setTextureSize(256, 128);
        setRotation(Knob_19, -0.5356818F, 0F, 0F);
        Knob_20 = new MowzieModelRenderer(this, 36, 4);
        Knob_20.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_20.setRotationPoint(0F, 19F, 32F);
        Knob_20.setTextureSize(256, 128);
        setRotation(Knob_20, 0.5356765F, 0F, 0F);
        Knob_21 = new MowzieModelRenderer(this, 36, 4);
        Knob_21.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_21.setRotationPoint(0F, 19.5F, 34F);
        Knob_21.setTextureSize(256, 128);
        setRotation(Knob_21, 0.5356765F, 0F, 0F);
        Knob_22 = new MowzieModelRenderer(this, 36, 4);
        Knob_22.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_22.setRotationPoint(0F, 20F, 36F);
        Knob_22.setTextureSize(256, 128);
        setRotation(Knob_22, 0.5356765F, 0F, 0F);
        Knob_23 = new MowzieModelRenderer(this, 36, 4);
        Knob_23.addBox(-0.5333334F, 0F, 0F, 1, 2, 1);
        Knob_23.setRotationPoint(0F, 20F, 38F);
        Knob_23.setTextureSize(256, 128);
        setRotation(Knob_23, 0.5356765F, 0F, 0F);
        Knob_24 = new MowzieModelRenderer(this, 36, 4);
        Knob_24.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_24.setRotationPoint(0F, 20F, 40F);
        Knob_24.setTextureSize(256, 128);
        setRotation(Knob_24, 0.5356765F, 0F, 0F);
        Knob_25 = new MowzieModelRenderer(this, 36, 4);
        Knob_25.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_25.setRotationPoint(0F, 20F, 42F);
        Knob_25.setTextureSize(256, 128);
        setRotation(Knob_25, 0.5356765F, 0F, 0F);
        Knob_26 = new MowzieModelRenderer(this, 36, 4);
        Knob_26.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_26.setRotationPoint(0F, 20F, 44F);
        Knob_26.setTextureSize(256, 128);
        setRotation(Knob_26, 0.5356765F, 0F, 0F);
        Knob_27 = new MowzieModelRenderer(this, 36, 4);
        Knob_27.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_27.setRotationPoint(0F, 20F, 46F);
        Knob_27.setTextureSize(256, 128);
        setRotation(Knob_27, 0.5356765F, 0F, 0F);
        Knob_28 = new MowzieModelRenderer(this, 36, 4);
        Knob_28.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_28.setRotationPoint(0F, 19.6F, 48F);
        Knob_28.setTextureSize(256, 128);
        setRotation(Knob_28, 0.5356765F, 0F, 0F);
        Knob_29 = new MowzieModelRenderer(this, 36, 4);
        Knob_29.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_29.setRotationPoint(0F, 19.2F, 50F);
        Knob_29.setTextureSize(256, 128);
        setRotation(Knob_29, 0.5356765F, 0F, 0F);
        Knob_30 = new MowzieModelRenderer(this, 36, 4);
        Knob_30.addBox(-0.5F, 0F, 0F, 1, 2, 1);
        Knob_30.setRotationPoint(0F, 18.6F, 52F);
        Knob_30.setTextureSize(256, 128);
        setRotation(Knob_30, 0.5356765F, 0F, 0F);
        Teeth = new MowzieModelRenderer(this, 0, 83);
        Teeth.addBox(-2.5F, 0F, -10F, 5, 1, 10);
        Teeth.setRotationPoint(0F, 17.4F, -32F);
        Teeth.setTextureSize(256, 128);
        setRotation(Teeth, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Head.render(f5);
        Upper_Jaw.render(f5);
        Lower_Jaw.render(f5);
        Neck_.render(f5);
        Body.render(f5);
        Tail_1.render(f5);
        Tail_2.render(f5);
        Tail_3.render(f5);
        Tail_4.render(f5);
        Fin_1.render(f5);
        Fin_2.render(f5);
        Fin_3.render(f5);
        Fin_4.render(f5);
        Fin_5.render(f5);
        Fin_6.render(f5);
        Right_Front_Flipper.render(f5);
        Left_Front_Flipper.render(f5);
        Right_Back_Flipper.render(f5);
        Left_Back_Flipper.render(f5);
        Knob_1.render(f5);
        Knob_2.render(f5);
        Knob_3.render(f5);
        Knob_4.render(f5);
        Knob_5.render(f5);
        Knob_6.render(f5);
        Knob_7.render(f5);
        Knob_8.render(f5);
        Knob_9.render(f5);
        Knob_10.render(f5);
        Knob_11.render(f5);
        Knob_12.render(f5);
        Knob_13.render(f5);
        Knob_14.render(f5);
        Knob_15.render(f5);
        Knob_16.render(f5);
        Knob_17.render(f5);
        Knob_18.render(f5);
        Knob_19.render(f5);
        Knob_20.render(f5);
        Knob_21.render(f5);
        Knob_22.render(f5);
        Knob_23.render(f5);
        Knob_24.render(f5);
        Knob_25.render(f5);
        Knob_26.render(f5);
        Knob_27.render(f5);
        Knob_28.render(f5);
        Knob_29.render(f5);
        Knob_30.render(f5);
        Teeth.render(f5);
    }

    private void setRotation(MowzieModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }

}
