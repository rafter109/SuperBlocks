package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.tileEntity.BrickFurnaceEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class BrickFurnaceContainer extends Container {
    private BrickFurnaceEntity brickFurnace;
    public int lastBurnTime;
    public int lastCurrentItemBurnTime;
    public int lastCookTime;
    public BrickFurnaceContainer(InventoryPlayer inventory, BrickFurnaceEntity tileentity) {
        brickFurnace = tileentity;
        addSlotToContainer(new Slot(tileentity, 0, 56, 17));
        addSlotToContainer(new Slot(tileentity, 1, 56, 53));
        addSlotToContainer(new SlotFurnace(inventory.player, tileentity, 2, 116, 35));
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for(int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
        }
    }
    public void addCraftingToCrafters (ICrafting icrafting) {
        super.addCraftingToCrafters(icrafting);
        icrafting.sendProgressBarUpdate(this, 0, brickFurnace.cookTime);
        icrafting.sendProgressBarUpdate(this, 1, brickFurnace.burnTime);
        icrafting.sendProgressBarUpdate(this, 2, brickFurnace.currentItemBurnTime);
    }
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for(int i = 0; i < crafters.size(); i++) {
            ICrafting icrafting = (ICrafting) crafters.get(i);
            if(lastCookTime != brickFurnace.cookTime) {
                icrafting.sendProgressBarUpdate(this, 0, brickFurnace.cookTime);
            }
            if(lastBurnTime != brickFurnace.burnTime) {
                icrafting.sendProgressBarUpdate(this, 1, brickFurnace.burnTime);
            }
            if(lastCurrentItemBurnTime != brickFurnace.currentItemBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, brickFurnace.currentItemBurnTime);
            }
        }
        lastCookTime = brickFurnace.cookTime;
        lastBurnTime = brickFurnace.burnTime;
        lastCurrentItemBurnTime = brickFurnace.currentItemBurnTime;
    }
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0) {
            brickFurnace.cookTime = par2;
        }
        if (par1 == 1) {
            brickFurnace.burnTime = par2;
        }

        if (par1 == 2) {
            brickFurnace.currentItemBurnTime = par2;
        }
    }
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(par2);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (par2 == 2) {
                if (!mergeItemStack(itemstack1, 3, 39, true)) {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null) {
                    if (!mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }else if (BrickFurnaceEntity.isItemFuel(itemstack1)) {
                    if (!mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }else if (par2 >= 3 && par2 < 30){
                    if (!mergeItemStack(itemstack1, 30, 39, false)){
                        return null;
                    }
                }else if (par2 >= 30 && par2 < 39 && !mergeItemStack(itemstack1, 3, 30, false)) {
                    return null;
                }
            } else if (!mergeItemStack(itemstack1, 3, 39, false)) {
                return null;
            }
            if (itemstack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }
            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }
        return itemstack;
    }
    public boolean canInteractWith(EntityPlayer var1) {
        return true;
    }
}
