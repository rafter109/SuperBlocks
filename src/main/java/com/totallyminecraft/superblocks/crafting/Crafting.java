package com.totallyminecraft.superblocks.crafting;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class Crafting {

    private static int j;

    public static void init() {

        //use for meta with dye
        for (int i = 0; i < 16; i++) {
            j = 15-i;
            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredrawplasticBlock, 16, j), "###", "#*#", "###", '#', ModBlocks.rawplasticBlock, '*', new ItemStack(Items.dye, 1, i));
            GameRegistry.addSmelting(new ItemStack(ModBlocks.coloredrawplasticBlock, 1, i), new ItemStack(ModBlocks.plasticBlock, 1, i), 0F);
            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredemeraldBlock, 8, i), "###", "#*#", "###", '#', new ItemStack(ModBlocks.coloredemeraldBlock, 1, 0), '*', new ItemStack(Items.dye, 1, j));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 9), new ItemStack(ModBlocks.coloredemeraldBlock,1,i));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredobsidianBlock, 8, i), "###", "#*#", "###", '#', new ItemStack(ModBlocks.coloredobsidianBlock, 1, 0), '*', new ItemStack(Items.dye, 1, j));
        }

        //used for meta with no dye
        for (int i = 0; i < 16; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.edgedplasticBlock, 1, i), new ItemStack(ModBlocks.plasticBlock,1 , i), ModItems.cuttingtorchItem);
        }


        //single
        GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredobsidianBlock, 8, 0), "###", "#*#", "###", '#', Blocks.obsidian, '*', new ItemStack(ModItems.bleachbucketItem));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredemeraldBlock, 8, 0), "###", "#*#", "###", '#', Blocks.emerald_block, '*', new ItemStack(ModItems.bleachbucketItem));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bleachbucketItem), Items.water_bucket, new ItemStack(Items.dye, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironscrapItem, 18), Blocks.iron_block, new ItemStack(ModItems.cuttingtorchItem, 1));
        GameRegistry.addRecipe(new ItemStack(ModItems.cuttingtorchItem, 1), "#  ", " * ", " * ", '*', Items.iron_ingot, '#', new ItemStack(Items.gold_ingot));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.machinecoreBlock, 1), "###", "#*#", "###", '#', ModItems.ironscrapItem, '*', new ItemStack(ModItems.cuttingtorchItem));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), ModItems.ironscrapItem, ModItems.ironscrapItem, new ItemStack(ModItems.cuttingtorchItem, 1));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.woodWorker), "###", "PCP", "#P#", '#', Blocks.planks, 'P', Blocks.piston, 'C', ModBlocks.machinecoreBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumnuggetItem, 4), ModItems.lithiumingotItem);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.suspendedlithiumItem) , ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem,
                ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.jarItem);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumCellStackItem), ModItems.lithiumCellItem, ModItems.lithiumCellItem, ModItems.lithiumCellItem, ModItems.lithiumCellItem);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foilItem), ModItems.ironscrapItem);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumBatteryItem), ModItems.foilItem, ModItems.lithiumCellStackItem);

        GameRegistry.addSmelting(Items.baked_potato, new ItemStack(ModItems.overbakedpotatoItem), 0.0F);
    }
}
