package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.WoodWorkerContainer;
import com.totallyminecraft.superblocks.tileEntity.WoodWorkerEntity;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class WoodWorkerGui extends GuiContainer{
    public static final ResourceLocation texture = new ResourceLocation(Constants.MODID, "textures/gui/woodWorkerGui.png");
    public WoodWorkerEntity woodCutter;
    public WoodWorkerGui(InventoryPlayer invPlayer, TileEntity entity){
        super(new WoodWorkerContainer(invPlayer, (WoodWorkerEntity) entity));
        woodCutter = (WoodWorkerEntity) entity;
        xSize = 176;
        ySize = 166;
    }
    public void drawGuiContainerForegroundLayer(int par1, int par2){
        String local = woodCutter.isInvNameLocalized() ? woodCutter.getInvName() : I18n.format(woodCutter.getInvName());
        fontRendererObj.drawString(local, xSize / 2 - fontRendererObj.getStringWidth(local), 6, 4210753);
        fontRendererObj.drawString(I18n.format("container.inventory"), 8, ySize - 94, 4210753);
    }
    public void drawGuiContainerForegroundLayer(){

    }
    public void drawGuiContainerBackgroundLayer(float f, int i, int j){

    }

}
