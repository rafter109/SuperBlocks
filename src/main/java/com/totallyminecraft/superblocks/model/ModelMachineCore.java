// Date: 1/20/2015 2:08:07 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.totallyminecraft.superblocks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMachineCore extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Top;
    ModelRenderer Edge1;
    ModelRenderer Edge2;
    ModelRenderer Edge3;
    ModelRenderer Edge4;
    ModelRenderer Side1;
    ModelRenderer Side2;
    ModelRenderer Side3;
    ModelRenderer Side4;
  
  public ModelMachineCore()
  {
    textureWidth = 128;
    textureHeight = 32;

      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(0F, 12F, 0F, 16, 4, 16);
      Bottom.setRotationPoint(-8F, 8F, -8F);
      Bottom.setTextureSize(128, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 0F, 0F, 16, 4, 16);
      Top.setRotationPoint(-8F, 8F, -8F);
      Top.setTextureSize(128, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Edge1 = new ModelRenderer(this, 64, 0);
      Edge1.addBox(12F, 4F, 12F, 4, 8, 4);
      Edge1.setRotationPoint(-8F, 8F, -8F);
      Edge1.setTextureSize(128, 32);
      Edge1.mirror = true;
      setRotation(Edge1, 0F, 0F, 0F);
      Edge2 = new ModelRenderer(this, 64, 0);
      Edge2.addBox(0F, 4F, 12F, 4, 8, 4);
      Edge2.setRotationPoint(-8F, 8F, -8F);
      Edge2.setTextureSize(128, 32);
      Edge2.mirror = true;
      setRotation(Edge2, 0F, 0F, 0F);
      Edge3 = new ModelRenderer(this, 64, 0);
      Edge3.addBox(12F, 4F, 0F, 4, 8, 4);
      Edge3.setRotationPoint(-8F, 8F, -8F);
      Edge3.setTextureSize(128, 32);
      Edge3.mirror = true;
      setRotation(Edge3, 0F, 0F, 0F);
      Edge4 = new ModelRenderer(this, 64, 0);
      Edge4.addBox(0F, 4F, 0F, 4, 8, 4);
      Edge4.setRotationPoint(-8F, 8F, -8F);
      Edge4.setTextureSize(128, 32);
      Edge4.mirror = true;
      setRotation(Edge4, 0F, 0F, 0F);
      Side1 = new ModelRenderer(this, 0, 0);
      Side1.addBox(3F, 4F, 4F, 0, 8, 8);
      Side1.setRotationPoint(-8F, 8F, -8F);
      Side1.setTextureSize(128, 32);
      Side1.mirror = true;
      setRotation(Side1, 0F, 0F, 0F);
      Side2 = new ModelRenderer(this, 0, 0);
      Side2.addBox(12F, 4F, 4F, 0, 8, 8);
      Side2.setRotationPoint(-8F, 8F, -8F);
      Side2.setTextureSize(128, 32);
      Side2.mirror = true;
      setRotation(Side2, 0F, 0F, 0F);
      Side3 = new ModelRenderer(this, 0, 0);
      Side3.addBox(4F, 4F, 12F, 8, 8, 0);
      Side3.setRotationPoint(-8F, 8F, -8F);
      Side3.setTextureSize(128, 32);
      Side3.mirror = true;
      setRotation(Side3, 0F, 0F, 0F);
      Side4 = new ModelRenderer(this, 0, 0);
      Side4.addBox(4F, 4F, 3F, 8, 8, 0);
      Side4.setRotationPoint(-8F, 8F, -8F);
      Side4.setTextureSize(128, 32);
      Side4.mirror = true;
      setRotation(Side4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    Bottom.render(f5);
    Top.render(f5);
    Edge1.render(f5);
    Edge2.render(f5);
    Edge3.render(f5);
    Edge4.render(f5);
    Side1.render(f5);
    Side2.render(f5);
    Side3.render(f5);
    Side4.render(f5);
  }

  public void renderModel(float f){
    Bottom.render(f);
    Top.render(f);
    Edge1.render(f);
    Edge2.render(f);
    Edge3.render(f);
    Edge4.render(f);
    Side1.render(f);
    Side2.render(f);
    Side3.render(f);
    Side4.render(f);
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
