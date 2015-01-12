package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import com.totallyminecraft.superblocks.tileEntity.WoodWorkerContainer;
import com.totallyminecraft.superblocks.tileEntity.WoodWorkerEntity;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
        WoodWorkerEntity entity = (WoodWorkerEntity) world.getTileEntity(x,y,z);
        if(entity != null){
            switch(ID){
                case ModTileEntities.WoodWorkerID:
                    return new WoodWorkerContainer(player.inventory, entity);
            }
        }

        return null;
    }
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
        TileEntity entity = world.getTileEntity(x,y,z);
        if(entity != null){
            switch(ID){
                case ModTileEntities.WoodWorkerID:
                    return new WoodWorkerGui(player.inventory, entity);
            }
        }

        return null;
    }
}