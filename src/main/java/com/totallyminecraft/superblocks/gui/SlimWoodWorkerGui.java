package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.SlimWoodWorkerEntity;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class SlimWoodWorkerGui extends GuiContainer{
    public static final ResourceLocation backgroundimage = new ResourceLocation(Constants.MODID, "textures/gui/woodWorkerGui.png");
    public SlimWoodWorkerEntity SlimWoodWorker;
    public SlimWoodWorkerGui(InventoryPlayer invPlayer, TileEntity entity){
        super(new SlimWoodWorkerInv(invPlayer, (SlimWoodWorkerEntity) entity));
        SlimWoodWorker = (SlimWoodWorkerEntity) entity;
        xSize = 176;
        ySize = 166;
    }
    public void drawGuiContainerForegroundLayer(int par1, int par2){
        String local = SlimWoodWorker.isInvNameLocalized() ? SlimWoodWorker.getInvName() : I18n.format(SlimWoodWorker.getInvName());
        fontRendererObj.drawString(local, xSize / 2 - fontRendererObj.getStringWidth(local), 6, 4210753);
        fontRendererObj.drawString(I18n.format("container.inventory"), 8, ySize - 94, 4210753);
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
