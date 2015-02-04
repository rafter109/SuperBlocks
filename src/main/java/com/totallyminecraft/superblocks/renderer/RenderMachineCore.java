package com.totallyminecraft.superblocks.renderer;

import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.model.ModelMachineCore;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMachineCore;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


public class RenderMachineCore extends TileEntitySpecialRenderer{

    private static final ResourceLocation texture = new ResourceLocation(Constants.MODID + ":" + "textures/model/ModelMachineCore.png");

    private ModelMachineCore model;

    public RenderMachineCore(){
        this.model = new ModelMachineCore();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f){
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y + -0.5F, (float)z + 0.5F);
        TileEntityMachineCore tile = (TileEntityMachineCore) tileentity;
        GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);
            this.bindTexture(texture);

            GL11.glPushMatrix();
                this.model.renderModel(0.06525F);
            GL11.glPopMatrix();

        GL11.glPopMatrix();
    }

}
