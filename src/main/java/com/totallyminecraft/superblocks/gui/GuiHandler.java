package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import com.totallyminecraft.superblocks.tileEntity.SlimWoodWorkerEntity;
import com.totallyminecraft.superblocks.tileEntity.WoodWorkerEntity;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.swing.text.html.parser.Entity;

public class GuiHandler implements IGuiHandler{


    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
        TileEntity entity = world.getTileEntity(x,y,z);
        if(entity != null){
            switch(ID){
                case ModTileEntities.WoodWorkerID:
                    WoodWorkerEntity woodWorker = (WoodWorkerEntity) world.getTileEntity(x, y, z);
                    return new WoodWorkerInv(player.inventory, woodWorker);
                case ModTileEntities.SlimWoodWorkerID:
                    SlimWoodWorkerEntity SlimWoodWorker = (SlimWoodWorkerEntity) world.getTileEntity(x, y, z);
                    return new SlimWoodWorkerInv(player.inventory, SlimWoodWorker);
                default:
                    return null;
            }
        }

        return null;
    }


    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
        TileEntity entity = world.getTileEntity(x,y,z);
        if(entity != null){
            switch(ID){
                case ModTileEntities.WoodWorkerID:
                    WoodWorkerEntity woodWorker = (WoodWorkerEntity) world.getTileEntity(x, y, z);
                    return new WoodWorkerGui(player.inventory, woodWorker);
                case ModTileEntities.SlimWoodWorkerID:
                    SlimWoodWorkerEntity SlimWoodWorker = (SlimWoodWorkerEntity) world.getTileEntity(x, y, z);
                    return new SlimWoodWorkerGui(player.inventory, SlimWoodWorker);
                default:
                    return null;
            }
        }

        return null;
    }
}
