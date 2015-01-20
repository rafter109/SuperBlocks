package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.BrickFurnaceEntity;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BrickFurnaceGui extends GuiContainer{
    public static final ResourceLocation guiTexture = new ResourceLocation(Constants.MODID + ":" + "textures/gui/brickFurnaceGui.png");
    public BrickFurnaceEntity brickFurnace;
    public BrickFurnaceGui(InventoryPlayer inventoryPlayer, BrickFurnaceEntity entity) {
        super(new BrickFurnaceContainer(inventoryPlayer, entity));
        brickFurnace = entity;
        xSize = 176;
        ySize = 166;
    }
    public void drawGuiContainerForegroundLayer(int par1, int par2) {
        String name = brickFurnace.hasCustomInventoryName() ? brickFurnace.getInventoryName() : I18n.format(brickFurnace.getInventoryName(), new Object[0]);
        fontRendererObj.drawString(name, xSize / 2 - fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
        fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, ySize - 96 + 2, 4210752);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GL11.glColor4f(1F, 1F, 1F, 1F);
        mc.getMinecraft().getTextureManager().bindTexture(guiTexture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        if(brickFurnace.isBurning()) {
            int k = brickFurnace.getBurnTimeRemainingScaled(13);
            drawTexturedModalRect(guiLeft + 56, guiTop + 48 - k, 176, 12 - k, 14, k + 1);
            int j = brickFurnace.getCookProgressScaled(24);
            drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 14, j + 1, 16);
        }
    }
}
