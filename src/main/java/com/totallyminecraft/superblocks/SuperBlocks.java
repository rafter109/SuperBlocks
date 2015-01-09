package com.totallyminecraft.superblocks;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.world.WorldGeneratorSuperBlocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;


@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)

public class SuperBlocks {


    public static CreativeTabs tabSuperBlocks = new CreativeTabs("superblocksTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.testBlock);
        }
    };

    public static CreativeTabs tabSuperBlocksItems = new CreativeTabs("superblocksitemsTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            //return ModItems.buckettestItem;
            return Items.baked_potato;
        }
    };



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();
        ModBlocks.init();
        Crafting.init();
        GameRegistry.registerWorldGenerator(new WorldGeneratorSuperBlocks(), 1);


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
