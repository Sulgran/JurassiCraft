// Date: 13.06.2014 13:20:20
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package to.uk.ilexiconn.jurassicraft.data.entity.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGallimimus extends MowzieModelBase
{
  //fields
	MowzieModelRenderer Body;
    MowzieModelRenderer Upper__Body;
    MowzieModelRenderer Tail;
    MowzieModelRenderer Tail2;
    MowzieModelRenderer Neck;
    MowzieModelRenderer Head;
    MowzieModelRenderer Upper_Beak;
    MowzieModelRenderer Lower_Beak;
    MowzieModelRenderer Thigh;
    MowzieModelRenderer Thigh2;
    MowzieModelRenderer Calf;
    MowzieModelRenderer Calf2;
    MowzieModelRenderer Foot;
    MowzieModelRenderer Foot2;
    MowzieModelRenderer Upper_Arm;
    MowzieModelRenderer Upper_Arm2;
    MowzieModelRenderer Lower_Arm;
    MowzieModelRenderer Lower_Arm2;
  
  public ModelGallimimus()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new MowzieModelRenderer(this, 0, 15);
      Body.addBox(0F, 0F, 0F, 8, 7, 10);
      Body.setRotationPoint(-4F, 7F, -3F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Upper__Body = new MowzieModelRenderer(this, 42, 20);
      Upper__Body.addBox(0F, 0F, 0F, 5, 6, 6);
      Upper__Body.setRotationPoint(-2.5F, 6F, -7F);
      Upper__Body.setTextureSize(64, 32);
      Upper__Body.mirror = true;
      setRotation(Upper__Body, -0.2094395F, 0F, 0F);
      Tail = new MowzieModelRenderer(this, 22, 0);
      Tail.addBox(0F, 0F, 0F, 4, 4, 6);
      Tail.setRotationPoint(-2F, 7F, 7F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      Tail2 = new MowzieModelRenderer(this, 0, 5);
      Tail2.addBox(0F, 0F, 0F, 2, 2, 18);
      Tail2.setRotationPoint(-1F, 8F, 13F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Neck = new MowzieModelRenderer(this, 42, 0);
      Neck.addBox(0F, 0F, 0F, 2, 14, 2);
      Neck.setRotationPoint(-1F, -5F, -6F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, -0.2094395F, 0F, 0F);
      Head = new MowzieModelRenderer(this, 46, 11);
      Head.addBox(0F, 0F, 0F, 4, 5, 5);
      Head.setRotationPoint(-2F, -8F, -10F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Upper_Beak = new MowzieModelRenderer(this, 52, 5);
      Upper_Beak.addBox(0F, 0F, 0F, 2, 2, 4);
      Upper_Beak.setRotationPoint(-1F, -6.5F, -14F);
      Upper_Beak.setTextureSize(64, 32);
      Upper_Beak.mirror = true;
      setRotation(Upper_Beak, 0F, 0F, 0F);
      Lower_Beak = new MowzieModelRenderer(this, 52, 0);
      Lower_Beak.addBox(0F, 0F, 0F, 2, 1, 4);
      Lower_Beak.setRotationPoint(-1F, -4.5F, -14F);
      Lower_Beak.setTextureSize(64, 32);
      Lower_Beak.mirror = true;
      setRotation(Lower_Beak, 0F, 0F, 0F);
      Thigh = new MowzieModelRenderer(this, 0, 12);
      Thigh.addBox(0F, 0F, 0F, 3, 6, 5);
      Thigh.setRotationPoint(-7F, 10F, 2F);
      Thigh.setTextureSize(64, 32);
      Thigh.mirror = true;
      setRotation(Thigh, 0F, 0F, 0F);
      Thigh2 = new MowzieModelRenderer(this, 0, 12);
      Thigh2.addBox(0F, 0F, 0F, 3, 6, 5);
      Thigh2.setRotationPoint(4F, 10F, 2F);
      Thigh2.setTextureSize(64, 32);
      Thigh2.mirror = true;
      setRotation(Thigh2, 0F, 0F, 0F);
      Calf = new MowzieModelRenderer(this, 0, 0);
      Calf.addBox(0F, 0F, 0F, 2, 10, 2);
      Calf.setRotationPoint(4F, 14F, 6F);
      Calf.setTextureSize(64, 32);
      Calf.mirror = true;
      setRotation(Calf, -0.1745329F, 0F, 0F);
      Calf2 = new MowzieModelRenderer(this, 0, 0);
      Calf2.addBox(0F, 0F, 0F, 2, 10, 2);
      Calf2.setRotationPoint(-6F, 14F, 6F);
      Calf2.setTextureSize(64, 32);
      Calf2.mirror = true;
      setRotation(Calf2, -0.1745329F, 0F, 0F);
      Foot = new MowzieModelRenderer(this, 22, 10);
      Foot.addBox(0F, 0F, 0F, 3, 2, 3);
      Foot.setRotationPoint(4F, 23F, 3F);
      Foot.setTextureSize(64, 32);
      Foot.mirror = true;
      setRotation(Foot, 0F, 0F, 0F);
      Foot2 = new MowzieModelRenderer(this, 22, 10);
      Foot2.addBox(-3F, 0F, 0F, 3, 2, 3);
      Foot2.setRotationPoint(-4F, 23F, 3F);
      Foot2.setTextureSize(64, 32);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Upper_Arm = new MowzieModelRenderer(this, 0, 0);
      Upper_Arm.addBox(0F, 0F, 0F, 2, 5, 2);
      Upper_Arm.setRotationPoint(2.5F, 9F, -7.4F);
      Upper_Arm.setTextureSize(64, 32);
      Upper_Arm.mirror = true;
      setRotation(Upper_Arm, 0.1858931F, 0F, 0F);
      Upper_Arm2 = new MowzieModelRenderer(this, 0, 0);
      Upper_Arm2.addBox(-2F, 0F, 0F, 2, 5, 2);
      Upper_Arm2.setRotationPoint(-2.5F, 9F, -7.4F);
      Upper_Arm2.setTextureSize(64, 32);
      Upper_Arm2.mirror = true;
      setRotation(Upper_Arm2, 0.1858931F, 0F, 0F);
      Lower_Arm = new MowzieModelRenderer(this, 8, 0);
      Lower_Arm.addBox(0F, 0F, 0F, 2, 5, 2);
      Lower_Arm.setRotationPoint(2.5F, 13F, -6.4F);
      Lower_Arm.setTextureSize(64, 32);
      Lower_Arm.mirror = true;
      setRotation(Lower_Arm, -0.2617994F, 0F, 0F);
      Lower_Arm2 = new MowzieModelRenderer(this, 8, 0);
      Lower_Arm2.addBox(-2F, 0F, 0F, 2, 5, 2);
      Lower_Arm2.setRotationPoint(-2.5F, 13F, -6.4F);
      Lower_Arm2.setTextureSize(64, 32);
      Lower_Arm2.mirror = true;
      setRotation(Lower_Arm2, -0.2617994F, 0F, 0F);
      
      addChildTo(Foot, Calf);
      addChildTo(Calf, Thigh2);
      addChildTo(Foot2, Calf2);
      addChildTo(Calf2, Thigh);
      
      Body.setInitValuesToCurrentPose();
      Upper__Body.setInitValuesToCurrentPose();
      Tail.setInitValuesToCurrentPose();
      Tail2.setInitValuesToCurrentPose();
      Neck.setInitValuesToCurrentPose();
      Head.setInitValuesToCurrentPose();
      Upper_Beak.setInitValuesToCurrentPose();
      Lower_Beak.setInitValuesToCurrentPose();
      Thigh.setInitValuesToCurrentPose();
      Thigh2.setInitValuesToCurrentPose();
      Calf.setInitValuesToCurrentPose();
      Calf2.setInitValuesToCurrentPose();
      Foot.setInitValuesToCurrentPose();
      Foot2.setInitValuesToCurrentPose();
      Upper_Arm.setInitValuesToCurrentPose();
      Upper_Arm2.setInitValuesToCurrentPose();
      Lower_Arm.setInitValuesToCurrentPose();
      Lower_Arm2.setInitValuesToCurrentPose();
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Upper__Body.render(f5);
    Tail.render(f5);
    Tail2.render(f5);
    Neck.render(f5);
    Head.render(f5);
    Upper_Beak.render(f5);
    Lower_Beak.render(f5);
    Thigh.render(f5);
    Thigh2.render(f5);
//    Calf.render(f5);
//    Calf2.render(f5);
//    Foot.render(f5);
//    Foot2.render(f5);
    Upper_Arm.render(f5);
    Upper_Arm2.render(f5);
    Lower_Arm.render(f5);
    Lower_Arm2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    walk(Thigh, 0.7F, 0.4F, false, 0F, f, f1);
    walk(Thigh2, 0.7F, 0.4F, true, 0F, f, f1);
  }
}
