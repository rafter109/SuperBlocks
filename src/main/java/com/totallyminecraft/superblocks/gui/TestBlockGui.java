package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.lib.Constants;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Resource;


public class TestBlockGui extends GuiScreen{

    int xSize = 256;
    int ySize = 256;
    private static final ResourceLocation backgroundimage = new ResourceLocation(Constants.MODID + ":" + "textures/gui/testblockGui.png");

    public TestBlockGui() {

    }

    @Override
    public void drawScreen(int par1, int par2, float par3){
        this.mc.getTextureManager().bindTexture(backgroundimage);
        par2 = (this.width - xSize) / 2;
        int j = (this.height - ySize - 30) / 2;
        drawTexturedModalRect(par2, j, 0, 0, xSize, ySize);
    }

    public boolean doesGuiPauseGame(){
        return false;
    }

}
