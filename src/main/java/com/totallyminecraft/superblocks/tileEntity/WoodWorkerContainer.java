package com.totallyminecraft.superblocks.tileEntity;

import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;

public class WoodWorkerContainer extends Container{
    private WoodWorkerEntity woodWorker;
    public WoodWorkerContainer(InventoryPlayer invPlayer, WoodWorkerEntity entity){
        woodWorker = entity;
        addSlotToContainer(new Slot(entity, 0, 30, 17));
        addSlotToContainer(new Slot(entity, 1, 48, 17));
        addSlotToContainer(new Slot(entity, 2, 66, 17));
        addSlotToContainer(new Slot(entity, 3, 30, 35));
        addSlotToContainer(new Slot(entity, 4, 48, 35));
        addSlotToContainer(new Slot(entity, 5, 66, 35));
        addSlotToContainer(new Slot(entity, 6, 30, 53));
        addSlotToContainer(new Slot(entity, 7, 48, 53));
        addSlotToContainer(new Slot(entity, 8, 66, 53));
        addSlotToContainer(new SlotCrafting(invPlayer.player, entity, invPlayer, 9, 124, 35));

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 9; j++){
                addSlotToContainer(new Slot(invPlayer, (j + i*9 + 9), (8+j*18), (84+i*18)));
            }
        }
        for(int j = 0; j < 9; j++){
            addSlotToContainer(new Slot(invPlayer, j, (8+j*18), 142));
        }
    }
    public boolean canInteractWith(EntityPlayer player){
        return false;
    }
}
