package com.totallyminecraft.superblocks.gui;

        import com.totallyminecraft.superblocks.lib.Constants;
        import net.minecraft.client.gui.inventory.GuiContainer;
        import net.minecraft.util.ResourceLocation;

public class GuideBookGui extends GuiContainer{
    public static final int ID = 3;
    public static final ResourceLocation backgroundimage = new ResourceLocation(Constants.MODID, "textures/gui/GuideBook/GuideBookCover.png");
    public GuideBookGui(){
        super(new FakeContainer());
        xSize = 256;
        ySize = 256;
    }
    public void onGuiClosed(){ super.onGuiClosed(); }
    public void drawGuiContainerForegroundLayer(int par1, int par2){

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
