package com.totallyminecraft.superblocks.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class WoodWorkerEntity extends TileEntity implements IInventory {

    private String localizedName;
    private ItemStack[] slots = new ItemStack[10];

    public int getsizeInventory(){return slots.length;}

    public boolean isInvNameLocalized(){
        return localizedName != null && localizedName.length() > 0;
    }
    public String getInvName(){
        return isInvNameLocalized() ? localizedName : "container.woodWorker";
    }
    public void setGuiDisplayName(String displayName){
        localizedName = displayName;
    }
    public int[] getAccessibleSlotsFromSide(int i) {
        return new int[0];
    }
    public boolean canInsertItem(int i, ItemStack itemStack, int j) {
        return false;
    }
    public boolean canExtractItem(int i, ItemStack itemStack, int j) {
        return false;
    }
    public int getSizeInventory() {
        return slots.length;
    }
    public ItemStack getStackInSlot(int i) {
        return slots[i];
    }
    public ItemStack decrStackSize(int i, int j) {
        ItemStack stack = getStackInSlot(i);
        if(slots[i] != null){
            if (stack.stackSize <= j)
            {
                setInventorySlotContents(i, null);
            }
            else
            {
                stack = stack.splitStack(j);
                if (stack.stackSize == 0)
                {
                    setInventorySlotContents(i, null);
                }
            }
        }
        return null;
    }
    public ItemStack getStackInSlotOnClosing(int i) {
        ItemStack itemStack = getStackInSlot(i);
        if (itemStack != null){
            setInventorySlotContents(i, null);
        }
        return itemStack;
    }
    public void setInventorySlotContents(int i, ItemStack itemStack) {
        slots[i] = itemStack;
        if(itemStack != null && itemStack.stackSize > getInventoryStackLimit()){
            itemStack.stackSize = getInventoryStackLimit();
        }
    }
    public String getInventoryName() {
        return "WoodCutterInv";
    }
    public boolean hasCustomInventoryName() {
        return true;
    }
    public int getInventoryStackLimit() {
        return 64;
    }
    public boolean isUseableByPlayer(EntityPlayer player) {
        return false;
    }
    public void openInventory() {

    }
    public void closeInventory() {

    }
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        return true;
    }
}
