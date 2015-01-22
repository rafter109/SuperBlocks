package com.totallyminecraft.superblocks.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class WoodWorkerShapedRecipes implements IRecipe {
    public final int recipeWidth;
    public final int recipeHeight;
    public final ItemStack[] recipeItems;
    private ItemStack recipeOutput;
    private boolean field_92101_f;

    public WoodWorkerShapedRecipes(int par1, int par2, ItemStack[] par3ArrayOfItemStack, ItemStack par4ItemStack)
    {
        recipeWidth = par1;
        recipeHeight = par2;
        recipeItems = par3ArrayOfItemStack;
        recipeOutput = par4ItemStack;
    }
    public ItemStack getRecipeOutput()
    {
        return recipeOutput;
    }
    public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        for (int i = 0; i <= 3 - recipeWidth; ++i)
        {
            for (int j = 0; j <= 3 - recipeHeight; ++j)
            {
                if (checkMatch(par1InventoryCrafting, i, j, true))
                {
                    return true;
                }
                if (checkMatch(par1InventoryCrafting, i, j, false))
                {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean checkMatch(InventoryCrafting par1InventoryCrafting, int par2, int par3, boolean par4)
    {
        for (int k = 0; k < 5; ++k)
        {
            for (int l = 0; l < 5; ++l)
            {
                int i1 = k - par2;
                int j1 = l - par3;
                ItemStack itemstack = null;
                if (i1 >= 0 && j1 >= 0 && i1 < recipeWidth && j1 < recipeHeight)
                {
                    if (par4)
                    {
                        itemstack = recipeItems[recipeWidth - i1 - 1 + j1 * recipeWidth];
                    }
                    else
                    {
                        itemstack = recipeItems[i1 + j1 * recipeWidth];
                    }
                }
                ItemStack itemstack1 = par1InventoryCrafting.getStackInRowAndColumn(k, l);
                if (itemstack1 != null || itemstack != null)
                {
                    if (itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                    {
                        return false;
                    }
                    if (itemstack.getItem() != itemstack1.getItem())
                    {
                        return false;
                    }
                    if (itemstack.getItemDamage() != 32767 && itemstack.getItemDamage() != itemstack1.getItemDamage())
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting)
    {
        ItemStack itemstack = getRecipeOutput().copy();
        if (field_92101_f)
        {
            for (int i = 0; i < par1InventoryCrafting.getSizeInventory(); ++i)
            {
                ItemStack itemstack1 = par1InventoryCrafting.getStackInSlot(i);

                if (itemstack1 != null && itemstack1.hasTagCompound())
                {
                    itemstack.setTagCompound((NBTTagCompound)itemstack1.stackTagCompound.copy());
                }
            }
        }
        return itemstack;
    }
    public int getRecipeSize()
    {
        return recipeWidth * recipeHeight;
    }

    public WoodWorkerShapedRecipes func_92100_c()
    {
        field_92101_f = true;
        return this;
    }
}
