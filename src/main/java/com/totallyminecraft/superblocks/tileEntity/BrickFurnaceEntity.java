package com.totallyminecraft.superblocks.tileEntity;

import com.totallyminecraft.superblocks.blocks.BrickFurnaceBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class BrickFurnaceEntity extends TileEntity implements IInventory {
    private String localizedName;
    private static final int[] slots_top = new int[]{0};
    private static final int[] slots_bottom = new int[]{2, 1};
    private static final int[] slots_side = new int[]{1};
    private ItemStack[] slots = new ItemStack [3];
    public int furnaceSpeed = 130;
    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;
    public void setGuiDisplayName(String displayName) {
        localizedName = displayName;
    }
    public String getInventoryName() {
        return hasCustomInventoryName() ? localizedName : "Brick Furnace";
    }
    public boolean hasCustomInventoryName() {
        return localizedName != null && localizedName.length() > 0;
    }
    public int getSizeInventory() {
        return slots.length;
    }
    @Override
    public ItemStack getStackInSlot(int var1) {
        return slots[var1];
    }
    @Override
    public ItemStack decrStackSize(int var1, int var2) {
        if(slots[var1] != null){
            ItemStack itemstack;
            if(slots[var1].stackSize <= var2 ){
                itemstack = slots[var1];
                slots[var1] = null;
                return itemstack;
            }else{
                itemstack = slots[var1].splitStack(var2);
                if(slots[var1].stackSize == 0) {
                    slots[var1] = null;
                }
                return itemstack;
            }
        }else{
            return null;
        }
    }
    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        if(slots[i]!= null) {
            ItemStack itemstack = slots[i];
            slots[i] = null;
            return itemstack;
        }
        return null;
    }
    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {
        slots[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }
    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return worldObj.getTileEntity(xCoord, yCoord, zCoord) != this ? false : entityplayer.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64.0D;
    }
    public void openInventory() {}
    public void closeInventory() {}
    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return i == 2 ? false : (i == 1 ? isItemFuel(itemstack) : true);
    }
    public static boolean isItemFuel (ItemStack itemstack) {
        return getItemBurnTime(itemstack) > 0;
    }
    private static int getItemBurnTime(ItemStack itemstack) {
        if(itemstack == null){
            return 0;
        }else{
            Item item = itemstack.getItem();
            if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if(block == Blocks.sapling) return 100;
                if(block == Blocks.coal_block) return 14400;
            }
            if(item == Items.coal) return 1600;
            if(item == Items.stick) return 100;
            if(item == Items.lava_bucket) return 20000;
            if(item == Items.blaze_rod) return 2400;
        }
        return GameRegistry.getFuelValue(itemstack);
    }
    public boolean isBurning() {
        return burnTime > 0;
    }
    public void updateEntity() {
        boolean flag = burnTime > 0;
        boolean flag1 = false;
        if(isBurning()) {
            burnTime--;
        }
        if(!worldObj.isRemote) {
            if(burnTime == 0 && canSmelt()) {
                currentItemBurnTime = burnTime = getItemBurnTime(slots[1]);
                if(isBurning()) {
                    flag1 = true;
                    if(slots[1] != null) {
                        slots[1].stackSize--;
                        if(slots[1].stackSize == 0) {
                            slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                        }
                    }
                }
            }
            if(isBurning() && canSmelt()) {
                cookTime++;
                if(cookTime == furnaceSpeed) {
                    cookTime = 0;
                    smeltItem();
                    flag1 = true;
                }
            }else{
                cookTime = 0;
            }
            if(flag != isBurning()) {
                flag1 = true;
                BrickFurnaceBlock.updateBrickFurnaceBlockState(burnTime > 0, worldObj, xCoord, yCoord, zCoord);
            }
        }
        if(flag1) {
            markDirty();
        }
    }
    public boolean canSmelt() {
        if (slots[0] == null) {
            return false;
        }else{
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(slots[0]);
            if(itemstack == null) return false;
            if(slots[2] == null) return true;
            if(!slots[2].isItemEqual(itemstack)) return false;
            int result = slots[2].stackSize + itemstack.stackSize;
            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
    }
    public void smeltItem() {
        if(canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(slots[0]);
            if(slots[2] == null) {
                slots[2] = itemstack.copy();
            }else if(slots[2].isItemEqual(itemstack)) {
                slots[2].stackSize += itemstack.stackSize;
            }
            slots[0].stackSize--;
            if(slots[0].stackSize <= 0) {
                slots[0] = null;
            }
        }
    }
    public int[] getAccessibleSlotsFromSide(int var1) {
        return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_side);
    }
    public boolean canInsertItem(int i, ItemStack itemstack, int j) {
        return isItemValidForSlot(i, itemstack);
    }
    public boolean canExtractItem(int i, ItemStack itemstack, int j) {
        return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
    }
    public int getBurnTimeRemainingScaled(int i) {
        if(currentItemBurnTime ==0) {
            currentItemBurnTime = furnaceSpeed;
        }
        return burnTime * i / currentItemBurnTime;
    }
    public int getCookProgressScaled(int i) {
        return cookTime * i / furnaceSpeed;
    }
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        NBTTagList list = nbt.getTagList("Items", 10);
        slots = new ItemStack[getSizeInventory()];
        for(int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound compound = list.getCompoundTagAt(i);
            byte b = compound.getByte("Slot");
            if(b >= 0 && b < slots.length) {
                slots[b] = ItemStack.loadItemStackFromNBT(compound);
            }
        }
        burnTime = (int)nbt.getShort("BurnTime");
        cookTime = (int)nbt.getShort("CookTime");
        currentItemBurnTime = (int)nbt.getShort("CurrentBurnTime");
        if(nbt.hasKey("CustomName")) {
            localizedName = nbt.getString("CustomName");
        }
    }
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setShort("BurnTime", (short)burnTime);
        nbt.setShort("CookTime", (short)cookTime);
        nbt.setShort("CurrentBurnTime", (short)currentItemBurnTime);
        NBTTagList list = new NBTTagList();
        for (int i = 0; i < slots.length; i++) {
            if(slots[i] != null) {
                NBTTagCompound compound = new NBTTagCompound();
                compound.setByte("Slot", (byte)i);
                slots[i].writeToNBT(compound);
                list.appendTag(compound);
            }
        }
        nbt.setTag("Items", list);
        if (hasCustomInventoryName()) {
            nbt.setString("CustomName", localizedName);
        }
    }
}
