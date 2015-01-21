package com.totallyminecraft.superblocks.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WoodWorkerShapelessRecipies implements IRecipe{
    private final ItemStack recipeOutput;
    public final List recipeItems;
    public WoodWorkerShapelessRecipies(ItemStack par1ItemStack, List par2List)
    {
        recipeOutput = par1ItemStack;
        recipeItems = par2List;
    }
    public ItemStack getRecipeOutput()
    {
        return recipeOutput;
    }
    public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        ArrayList arraylist = new ArrayList(recipeItems);
        for (int i = 0; i < 5; ++i)
        {
            for (int j = 0; j < 5; ++j)
            {
                ItemStack itemstack = par1InventoryCrafting.getStackInRowAndColumn(j, i);
                if (itemstack != null)
                {
                    boolean flag = false;
                    Iterator iterator = arraylist.iterator();

                    while (iterator.hasNext())
                    {
                        ItemStack itemstack1 = (ItemStack)iterator.next();

                        if (itemstack.getItem() == itemstack1.getItem() && (itemstack1.getItemDamage() == 32767 || itemstack.getItemDamage() == itemstack1.getItemDamage()))
                        {
                            flag = true;
                            arraylist.remove(itemstack1);
                            break;
                        }
                    }
                    if (!flag)
                    {
                        return false;
                    }
                }
            }
        }
        return arraylist.isEmpty();
    }
    public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting)
    {
        return recipeOutput.copy();
    }
    public int getRecipeSize()
    {
        return recipeItems.size();
    }
}
