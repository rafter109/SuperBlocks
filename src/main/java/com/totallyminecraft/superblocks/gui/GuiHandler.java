package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.tileEntity.BrickFurnaceEntity;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{


    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
        TileEntity entity = world.getTileEntity(x,y,z);
        if(entity != null){
            switch(ID){
                case ModTileEntities.BrickFurnaceID:
                    if (entity instanceof BrickFurnaceEntity) {
                        return new BrickFurnaceContainer(player.inventory, (BrickFurnaceEntity) entity);
                    }
                    return null;
                default:
                    return null;
            }
        }else{
            switch(ID){
                case WoodWorkerGui.ID:
                    return ID == WoodWorkerGui.ID && world.getBlock(x,y,z) == ModBlocks.woodWorker ? new WoodWorkerContainer(player.inventory, world, x, y, z): null;
            }
        }

        return null;
    }


    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);
        if (entity != null) {
            switch (ID) {
                case ModTileEntities.BrickFurnaceID:
                    if (entity instanceof BrickFurnaceEntity) {
                        return new BrickFurnaceGui(player.inventory, (BrickFurnaceEntity) entity);
                    }
                    return null;
                default:
                    return null;
            }
        } else {
            switch (ID) {
                case WoodWorkerGui.ID:
                    return ID == WoodWorkerGui.ID && world.getBlock(x, y, z) == ModBlocks.woodWorker ? new WoodWorkerGui(player.inventory, world, x, y, z) : null;
            }
        }
        return null;
    }
}
