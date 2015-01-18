package com.totallyminecraft.superblocks.renderer;

import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.model.ModelBatteryCharger;
import com.totallyminecraft.superblocks.tileEntity.TileEntityBatteryChargerBlock;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


public class RenderBatteryCharger extends TileEntitySpecialRenderer{

    private static final ResourceLocation texture = new ResourceLocation(Constants.MODID + ":" + "textures/model/BatteryChargerModel.png");

    private ModelBatteryCharger model;

    public RenderBatteryCharger(){
        this.model = new ModelBatteryCharger();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f){
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5625F, (float)z + 0.5F);
        TileEntityBatteryChargerBlock tile = (TileEntityBatteryChargerBlock) tileentity;
        int direction = tile.direction;
        GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
            this.bindTexture(texture);

            GL11.glPushMatrix();
                this.model.renderModel(0.06525F);
            GL11.glPopMatrix();

        GL11.glPopMatrix();
    }

}
