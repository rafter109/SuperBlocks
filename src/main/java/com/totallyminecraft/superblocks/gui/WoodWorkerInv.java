package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.tileEntity.WoodWorkerEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class WoodWorkerInv extends Container {
    public WoodWorkerEntity tile;

    public WoodWorkerInv(InventoryPlayer inventory, WoodWorkerEntity tileEntityTestContainer)
    {
        tile = tileEntityTestContainer;
        bindPlayerInventory(inventory);
    }
    private void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        int id = 0;

        for(int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, id, i * 18 + 8, 189));
            id++;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer, id ,j * 18 + 8, i * 18 + 131 ));
                id++;
            }
        }
    }

    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
