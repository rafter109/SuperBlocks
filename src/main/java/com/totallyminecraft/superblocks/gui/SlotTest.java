package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.items.ModItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotTest extends Slot
{
    public SlotTest(IInventory inventory, int slotIndex, int x, int y)
    {
        super(inventory, slotIndex, x ,y);
    }
    public boolean isItemValid(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItem() == ModItems.overbakedpotatoItem;
    }
}