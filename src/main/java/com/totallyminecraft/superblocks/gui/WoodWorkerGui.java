package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.lib.Constants;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class WoodWorkerGui extends GuiContainer{
    public static final int ID = 1;
    public static final ResourceLocation backgroundimage = new ResourceLocation(Constants.MODID, "textures/gui/woodWorkerGui.png");
    public WoodWorkerGui(InventoryPlayer invPlayer, World world ,int x, int y, int z){
        super(new WoodWorkerContainer(invPlayer, world, x, y, z));
        xSize = 176;
        ySize = 166;
    }
    public void onGuiClosed(){ super.onGuiClosed(); }
    public void drawGuiContainerForegroundLayer(int par1, int par2){
        fontRendererObj.drawString(StatCollector.translateToLocal("Wood Worker"),30,5,0x000000);
    }
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3){
        mc.getTextureManager().bindTexture(backgroundimage);
        par2 = (width - xSize) / 2;
        int j = (height - ySize) / 2;
        drawTexturedModalRect(par2, j, 0, 0, xSize,  ySize);
    }
    public boolean doesGuiPauseGame()
    {
        return false;
    }
}
