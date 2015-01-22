package com.totallyminecraft.superblocks.gui;

import com.totallyminecraft.superblocks.crafting.WoodWorkerCraftingManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WoodWorkerContainer extends Container {
    public InventoryCrafting woodWorker;
    public IInventory craftResult;
    private World worldObj;
    private int pozX;
    private int pozY;
    private int pozZ;
    public WoodWorkerContainer(InventoryPlayer invPlayer, World world, int x, int y, int z)
    {
        woodWorker= new InventoryCrafting(this, 5, 5);
        craftResult = new InventoryCraftResult();
        worldObj = world;
        pozX = x;
        pozY = y;
        pozZ = z;

        addSlotToContainer(new SlotCrafting(invPlayer.player, woodWorker, craftResult, 0, 138, 43));
        int id = 0;
        int Gx = 6;
        int Gy = 6;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                addSlotToContainer(new Slot(woodWorker, id, i * 18 + Gx, j * 18 + Gy));
                id++;
            }
        }
        bindPlayerInventory(invPlayer);
        onCraftMatrixChanged(woodWorker);
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotIndex)
    {
        return null;
    }
    private void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        int idI = 0;
        for(int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, idI, i * 18 + 6, 158));
            idI++;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer, idI ,j * 18 + 6, i * 18 + 100 ));
                idI++;
            }
        }
    }
    public void onCraftMatrixChanged(IInventory iInventory){
        craftResult.setInventorySlotContents(0, WoodWorkerCraftingManager.getInstance().findMatchingRecipe(woodWorker, worldObj));
    }
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
    public void onContainerClosed(EntityPlayer par1EntityPlayer) {
        super.onContainerClosed(par1EntityPlayer);
        if (!this.worldObj.isRemote) {
            for (int i = 0; i < 9; ++i) {
                ItemStack itemstack = this.woodWorker.getStackInSlotOnClosing(i);
                if (itemstack != null) {
                    par1EntityPlayer.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
}
