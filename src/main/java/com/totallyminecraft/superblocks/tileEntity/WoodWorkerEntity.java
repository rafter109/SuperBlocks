package com.totallyminecraft.superblocks.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class WoodWorkerEntity extends TileEntity implements ISidedInventory{

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
        return 0;
    }
    public ItemStack getStackInSlot(int i) {
        return slots[i];
    }
    public ItemStack decrStackSize(int i, int j) {
        if(slots[i] != null){
            ItemStack stack;
            if(slots[i].stackSize <= j){
                stack = slots[i];
            }else{
                stack = slots[i].splitStack(j);
                if(slots[i].stackSize == 0){
                    slots[i] = null;
                }
                return stack;
            }
        }
        return null;
    }
    public ItemStack getStackInSlotOnClosing(int i) {
        return null;
    }
    public void setInventorySlotContents(int i, ItemStack itemStack) {

    }
    public String getInventoryName() {
        return null;
    }
    public boolean hasCustomInventoryName() {
        return false;
    }
    public int getInventoryStackLimit() {
        return 0;
    }
    public boolean isUseableByPlayer(EntityPlayer player) {
        return false;
    }
    public void openInventory() {

    }
    public void closeInventory() {

    }
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        return false;
    }
}
