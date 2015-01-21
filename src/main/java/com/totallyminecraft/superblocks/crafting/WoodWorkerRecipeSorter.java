package com.totallyminecraft.superblocks.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class WoodWorkerRecipeSorter implements Comparator {
    final WoodWorkerCraftingManager woodWorker;
    public WoodWorkerRecipeSorter(WoodWorkerCraftingManager manager){
        woodWorker = manager;
    }
    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
        return irecipe1 instanceof WoodWorkerShapelessRecipies && irecipe2 instanceof WoodWorkerShapedRecipes ? 1: (irecipe2 instanceof WoodWorkerShapelessRecipies && irecipe1 instanceof WoodWorkerShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }
    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }
}
