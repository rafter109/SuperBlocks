package com.totallyminecraft.superblocks;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTabs {

    public static CreativeTabs tabSuperBlocks = new CreativeTabs("superblocksTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.plasticBlock);
        }
    };

    public static CreativeTabs tabSuperBlocksItems = new CreativeTabs("superblocksitemsTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ModItems.overbakedpotatoItem;
        }
    };
}
