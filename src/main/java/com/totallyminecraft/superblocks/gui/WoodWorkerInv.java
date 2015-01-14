package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.tileEntity.WoodWorkerEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;

public class WoodWorkerInv extends Container {
    public WoodWorkerEntity tile;
    int id1 = 0;
    int id2 = 0;
    public WoodWorkerInv(InventoryPlayer invPlayer, WoodWorkerEntity entity)
    {
        tile = entity;
        bindPlayerInventory(invPlayer);
        int x = 30;
        int y = 17;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                addSlotToContainer(new Slot(entity, id2, i * 18 + 30, j * 18 + 17));
                id2++;
            }
        }
        addSlotToContainer(new SlotCrafting(invPlayer.player, entity, invPlayer, id2, 124, 35));
        id2++;
    }
    private void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        for(int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, id1, i * 18 + 8, 142));
            id1++;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer, id1 ,j * 18 + 8, i * 18 + 83 ));
                id1++;
            }
        }
    }
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
