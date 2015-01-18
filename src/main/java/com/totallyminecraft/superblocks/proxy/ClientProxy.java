package com.totallyminecraft.superblocks.proxy;


import com.totallyminecraft.superblocks.renderer.ItemRenderBatteryCharger;
import com.totallyminecraft.superblocks.renderer.ItemRenderSlimWoodWorker;
import com.totallyminecraft.superblocks.renderer.RenderBatteryCharger;
import com.totallyminecraft.superblocks.renderer.RenderSlimWoodWorker;
import com.totallyminecraft.superblocks.tileEntity.TileEntityBatteryChargerBlock;
import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.tileEntity.TileEntitySlimWoodWorkerBlock;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{

    public void registerRenderThings(){

        TileEntitySpecialRenderer renderBatterycharger = new RenderBatteryCharger();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBatteryChargerBlock.class, renderBatterycharger);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.batterychargerBlock), new ItemRenderBatteryCharger(renderBatterycharger, new TileEntityBatteryChargerBlock()));

        TileEntitySpecialRenderer renderSlimWoodWorker = new RenderSlimWoodWorker();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySlimWoodWorkerBlock.class, renderSlimWoodWorker);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.slimwoodworkerBlock), new ItemRenderSlimWoodWorker(renderSlimWoodWorker, new TileEntitySlimWoodWorkerBlock()));

    }

    public void registerTileEntitySpecialRenderer(){

    }
}
