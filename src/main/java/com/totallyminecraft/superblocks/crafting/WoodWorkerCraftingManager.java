package com.totallyminecraft.superblocks.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

public class WoodWorkerCraftingManager
{
    private static final WoodWorkerCraftingManager instance = new WoodWorkerCraftingManager();
    private List recipes = new ArrayList();

    public static WoodWorkerCraftingManager getInstance()
    {
        return instance;
    }

    private WoodWorkerCraftingManager()
    {
        //Fancy OAK Wood
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 6, 0), " ##","## "," ##",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 9, 1), " ###","### "," ###",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 6, 2), "###","   ","###",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 18, 3), "## ##","## ##","#####","#####",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 16, 4), "## ##","## ##","     ","## ##","## ##",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 13, 5), "# # #"," # # ","# # #"," # # ","# # #",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 21, 6), "#####","## ##","# # #","## ##","#####",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 12, 7), "  #  "," ### ","## ##"," ### ","  #  ",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 8, 8), "  #  "," # # ","#   #"," # # ","  #  ",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 16, 9), " # # ","#####"," # # ","#####"," # # ",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 5, 10), " # ","###"," # ",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 12, 11), "   # ","#### "," # # "," ####"," #   ",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 7, 12), "## ","###"," ##",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 7, 13), "#   #"," #   ","  #  ","   # ","#   #",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 9, 14), "  #  "," # # "," # # ","#   #","#   #",'#', new ItemStack(Blocks.planks, 1, 0));
        this.addRecipe(new ItemStack(ModBlocks.fancyOakBlock, 6, 15), " ### ","   # ","  #  ","     ","  #  ",'#', new ItemStack(Blocks.planks, 1, 0));

        //Fancy DarkOak Wood
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 6, 0), " ##","## "," ##",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 9, 1), " ###","### "," ###",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 6, 2), "###","   ","###",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 18, 3), "## ##","## ##","#####","#####",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 16, 4), "## ##","## ##","     ","## ##","## ##",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 13, 5), "# # #"," # # ","# # #"," # # ","# # #",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 21, 6), "#####","## ##","# # #","## ##","#####",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 12, 7), "  #  "," ### ","## ##"," ### ","  #  ",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 8, 8), "  #  "," # # ","#   #"," # # ","  #  ",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 16, 9), " # # ","#####"," # # ","#####"," # # ",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 5, 10), " # ","###"," # ",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 12, 11), "   # ","#### "," # # "," ####"," #   ",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 7, 12), "## ","###"," ##",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 7, 13), "#   #"," #   ","  #  ","   # ","#   #",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 9, 14), "  #  "," # # "," # # ","#   #","#   #",'#', new ItemStack(Blocks.planks, 1, 5));
        this.addRecipe(new ItemStack(ModBlocks.fancyDarkOakBlock, 6, 15), " ### ","   # ","  #  ","     ","  #  ",'#', new ItemStack(Blocks.planks, 1, 5));

        //Fancy Acacia Wood
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 6, 0), " ##","## "," ##",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 9, 1), " ###","### "," ###",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 6, 2), "###","   ","###",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 18, 3), "## ##","## ##","#####","#####",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 16, 4), "## ##","## ##","     ","## ##","## ##",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 13, 5), "# # #"," # # ","# # #"," # # ","# # #",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 21, 6), "#####","## ##","# # #","## ##","#####",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 12, 7), "  #  "," ### ","## ##"," ### ","  #  ",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 8, 8), "  #  "," # # ","#   #"," # # ","  #  ",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 16, 9), " # # ","#####"," # # ","#####"," # # ",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 5, 10), " # ","###"," # ",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 12, 11), "   # ","#### "," # # "," ####"," #   ",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 7, 12), "## ","###"," ##",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 7, 13), "#   #"," #   ","  #  ","   # ","#   #",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 9, 14), "  #  "," # # "," # # ","#   #","#   #",'#', new ItemStack(Blocks.planks, 1, 4));
        this.addRecipe(new ItemStack(ModBlocks.fancyAcaciaBlock, 6, 15), " ### ","   # ","  #  ","     ","  #  ",'#', new ItemStack(Blocks.planks, 1, 4));

        //Fancy Jungle Wood
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 6, 0), " ##","## "," ##",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 9, 1), " ###","### "," ###",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 6, 2), "###","   ","###",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 18, 3), "## ##","## ##","#####","#####",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 16, 4), "## ##","## ##","     ","## ##","## ##",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 13, 5), "# # #"," # # ","# # #"," # # ","# # #",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 21, 6), "#####","## ##","# # #","## ##","#####",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 12, 7), "  #  "," ### ","## ##"," ### ","  #  ",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 8, 8), "  #  "," # # ","#   #"," # # ","  #  ",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 16, 9), " # # ","#####"," # # ","#####"," # # ",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 5, 10), " # ","###"," # ",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 12, 11), "   # ","#### "," # # "," ####"," #   ",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 7, 12), "## ","###"," ##",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 7, 13), "#   #"," #   ","  #  ","   # ","#   #",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 9, 14), "  #  "," # # "," # # ","#   #","#   #",'#', new ItemStack(Blocks.planks, 1, 3));
        this.addRecipe(new ItemStack(ModBlocks.fancyJungleBlock, 6, 15), " ### ","   # ","  #  ","     ","  #  ",'#', new ItemStack(Blocks.planks, 1, 3));

        //Fancy Birch Wood
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 6, 0), " ##","## "," ##",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 9, 1), " ###","### "," ###",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 6, 2), "###","   ","###",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 18, 3), "## ##","## ##","#####","#####",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 16, 4), "## ##","## ##","     ","## ##","## ##",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 13, 5), "# # #"," # # ","# # #"," # # ","# # #",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 21, 6), "#####","## ##","# # #","## ##","#####",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 12, 7), "  #  "," ### ","## ##"," ### ","  #  ",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 8, 8), "  #  "," # # ","#   #"," # # ","  #  ",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 16, 9), " # # ","#####"," # # ","#####"," # # ",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 5, 10), " # ","###"," # ",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 12, 11), "   # ","#### "," # # "," ####"," #   ",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 7, 12), "## ","###"," ##",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 7, 13), "#   #"," #   ","  #  ","   # ","#   #",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 9, 14), "  #  "," # # "," # # ","#   #","#   #",'#', new ItemStack(Blocks.planks, 1, 2));
        this.addRecipe(new ItemStack(ModBlocks.fancyBirchBlock, 6, 15), " ### ","   # ","  #  ","     ","  #  ",'#', new ItemStack(Blocks.planks, 1, 2));

        //Fancy Spruce Wood
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 6, 0), " ##","## "," ##",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 9, 1), " ###","### "," ###",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 6, 2), "###","   ","###",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 18, 3), "## ##","## ##","#####","#####",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 16, 4), "## ##","## ##","     ","## ##","## ##",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 13, 5), "# # #"," # # ","# # #"," # # ","# # #",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 21, 6), "#####","## ##","# # #","## ##","#####",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 12, 7), "  #  "," ### ","## ##"," ### ","  #  ",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 8, 8), "  #  "," # # ","#   #"," # # ","  #  ",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 16, 9), " # # ","#####"," # # ","#####"," # # ",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 5, 10), " # ","###"," # ",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 12, 11), "   # ","#### "," # # "," ####"," #   ",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 7, 12), "## ","###"," ##",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 7, 13), "#   #"," #   ","  #  ","   # ","#   #",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 9, 14), "  #  "," # # "," # # ","#   #","#   #",'#', new ItemStack(Blocks.planks, 1, 1));
        this.addRecipe(new ItemStack(ModBlocks.fancySpruceBlock, 6, 15), " ### ","   # ","  #  ","     ","  #  ",'#', new ItemStack(Blocks.planks, 1, 1));

        Collections.sort(this.recipes, new WoodWorkerRecipeSorter(this));
    }
    public ShapedRecipes addRecipe(ItemStack p_92103_1_, Object ... p_92103_2_)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        if (p_92103_2_[i] instanceof String[])
        {
            String[] astring = (String[])p_92103_2_[i++];
            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (p_92103_2_[i] instanceof String)
            {
                String s2 = (String)p_92103_2_[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }
        HashMap hashmap;
        for (hashmap = new HashMap(); i < p_92103_2_.length; i += 2)
        {
            Character character = (Character)p_92103_2_[i];
            ItemStack itemstack1 = null;

            if (p_92103_2_[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)p_92103_2_[i + 1]);
            }
            else if (p_92103_2_[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)p_92103_2_[i + 1], 1, 32767);
            }
            else if (p_92103_2_[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)p_92103_2_[i + 1];
            }

            hashmap.put(character, itemstack1);
        }
        ItemStack[] aitemstack = new ItemStack[j * k];
        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }
        ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, p_92103_1_);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack p_77596_1_, Object ... p_77596_2_)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = p_77596_2_;
        int i = p_77596_2_.length;
        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];
            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipy!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }
        this.recipes.add(new ShapelessRecipes(p_77596_1_, arraylist));
    }
    public ItemStack findMatchingRecipe(InventoryCrafting p_82787_1_, World p_82787_2_)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;
        for (j = 0; j < p_82787_1_.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = p_82787_1_.getStackInSlot(j);
            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }
                ++i;
            }
        }
        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
        {
            Item item = itemstack.getItem();
            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int l = j1 + k + item.getMaxDamage() * 5 / 100;
            int i1 = item.getMaxDamage() - l;
            if (i1 < 0)
            {
                i1 = 0;
            }
            return new ItemStack(itemstack.getItem(), 1, i1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(p_82787_1_, p_82787_2_))
                {
                    return irecipe.getCraftingResult(p_82787_1_);
                }
            }
            return null;
        }
    }
    public List getRecipeList()
    {
        return this.recipes;
    }
}