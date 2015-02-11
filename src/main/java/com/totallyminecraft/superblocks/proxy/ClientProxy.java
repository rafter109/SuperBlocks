package com.totallyminecraft.superblocks.proxy;



import com.totallyminecraft.superblocks.renderer.*;
import com.totallyminecraft.superblocks.tileEntity.TileEntityBatteryChargerBlock;
import com.totallyminecraft.superblocks.tileEntity.TileEntityFlatStairs;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMachineCore;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMiningArrow;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;


public class ClientProxy extends CommonProxy{

    public void registerRenderThings(){

        TileEntitySpecialRenderer renderBatterycharger = new RenderBatteryCharger();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBatteryChargerBlock.class, renderBatterycharger);
        //MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.batterychargerBlock), new ItemRenderBatteryCharger(renderBatterycharger, new TileEntityBatteryChargerBlock()));

        TileEntitySpecialRenderer renderMachineCore = new RenderMachineCore();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMachineCore.class, renderMachineCore);

        TileEntitySpecialRenderer renderMiningArrow = new RenderMiningArrow();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMiningArrow.class, renderMiningArrow);

        TileEntitySpecialRenderer renderFlatStairs = new RenderFlatStairs();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlatStairs.class, renderFlatStairs);
    }

    public void registerTileEntitySpecialRenderer(){

    }
}
