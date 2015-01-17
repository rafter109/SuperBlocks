package com.totallyminecraft.superblocks;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Crafting {

    private static int j;

    public static void init() {


        //use for meta with dye
        for (int i = 0; i < 16; i++) {

            j = 15-i;

            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredrawplasticBlock, 16, j), new Object[]{"###", "#*#", "###", '#', ModBlocks.rawplasticBlock, '*', new ItemStack(Items.dye, 1, i)});
            GameRegistry.addSmelting(new ItemStack(ModBlocks.coloredrawplasticBlock, 1, i), new ItemStack(ModBlocks.plasticBlock, 1, i), 0F);

            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredemeraldBlock, 8, i), new Object[]{"###", "#*#", "###", '#', new ItemStack(ModBlocks.coloredemeraldBlock, 1, 0), '*', new ItemStack(Items.dye, 1, j)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 9), new Object[]{new ItemStack(ModBlocks.coloredemeraldBlock,1,i)});

            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredobsidianBlock, 8, i), new Object[]{"###", "#*#", "###", '#', new ItemStack(ModBlocks.coloredobsidianBlock, 1, 0), '*', new ItemStack(Items.dye, 1, j)});
        }

        //used for meta with no dye
        for (int i = 0; i < 16; i++) {

            //GameRegistry.addSmelting(new ItemStack(ModBlocks.plasticBlock, 1, i), new ItemStack(ModBlocks.edgedplasticBlock, 1, i), 0.0F);
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.edgedplasticBlock, 1, i), new Object[]{new ItemStack(ModBlocks.plasticBlock,1 , i), ModItems.cuttingtorchItem});
        }


        //single
        GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredobsidianBlock, 8, 0), new Object[]{"###", "#*#", "###", '#', Blocks.obsidian, '*', new ItemStack(ModItems.bleachbucketItem)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredemeraldBlock, 8, 0), new Object[]{"###", "#*#", "###", '#', Blocks.emerald_block, '*', new ItemStack(ModItems.bleachbucketItem)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bleachbucketItem), new Object[]{Items.water_bucket, new ItemStack(Items.dye, 1, 15)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironscrapItem, 18), new Object[] {Blocks.iron_block, new ItemStack(ModItems.cuttingtorchItem, 1)});
        GameRegistry.addRecipe(new ItemStack(ModItems.cuttingtorchItem, 1), new Object[]{"#  ", " * ", " * ", '*', Items.iron_ingot, '#', new ItemStack(Items.gold_ingot)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.machinecoreBlock, 1), new Object[]{"###", "#*#", "###", '#', ModItems.ironscrapItem, '*', new ItemStack(ModItems.cuttingtorchItem)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), new Object[]{ModItems.ironscrapItem, ModItems.ironscrapItem, new ItemStack(ModItems.cuttingtorchItem, 1)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.woodWorker), new Object[]{"###", "PCP", "#P#", '#', Blocks.planks, 'P', Blocks.piston, 'C', ModBlocks.machinecoreBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumnuggetItem, 4), new Object[]{ModItems.lithiumingotItem});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.suspendedlithiumItem) , new Object[]{ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem,
                ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.lithiumnuggetItem, ModItems.jarItem});



        GameRegistry.addSmelting(Items.baked_potato, new ItemStack(ModItems.overbakedpotatoItem), 0.0F);




    }
}
