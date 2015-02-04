package com.totallyminecraft.superblocks.renderer;

import com.totallyminecraft.superblocks.blocks.MiningArrowBlock;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.model.ModelMiningArrow;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMiningArrow;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


public class RenderMiningArrow extends TileEntitySpecialRenderer{

    private static final ResourceLocation texture = new ResourceLocation(Constants.MODID + ":" + "textures/model/ModelMiningArrow.png");

    private ModelMiningArrow model;

    public RenderMiningArrow(){
        this.model = new ModelMiningArrow();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f){
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y + -1.5F, (float)z + 0.5F);
        TileEntityMiningArrow tile = (TileEntityMiningArrow) tileentity;
        GL11.glRotatef(TileEntityMiningArrow.Direction, 0.0F, 1.0F, 0.0F);
            this.bindTexture(texture);

            GL11.glPushMatrix();
                this.model.renderModel(0.06525F);
            GL11.glPopMatrix();

        GL11.glPopMatrix();
    }

}
