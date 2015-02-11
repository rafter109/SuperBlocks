package com.totallyminecraft.superblocks.renderer;

import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.model.ModelFlatStairs;
import com.totallyminecraft.superblocks.model.ModelMachineCore;
import com.totallyminecraft.superblocks.tileEntity.TileEntityFlatStairs;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMachineCore;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


public class RenderFlatStairs extends TileEntitySpecialRenderer{

    private static final ResourceLocation texture = new ResourceLocation(Constants.MODID + ":" + "textures/model/ModelFlatStairs.png");

    private ModelFlatStairs model;

    public RenderFlatStairs(){
        this.model = new ModelFlatStairs();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f){
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y + 0.0F, (float)z + 0.5F);
        TileEntityFlatStairs tile = (TileEntityFlatStairs) tileentity;
        GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);
            this.bindTexture(texture);

            GL11.glPushMatrix();
                this.model.renderModel(0.06525F);
            GL11.glPopMatrix();

        GL11.glPopMatrix();
    }

}
