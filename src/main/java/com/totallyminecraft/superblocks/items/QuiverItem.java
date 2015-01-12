package com.totallyminecraft.superblocks.items;

import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class QuiverItem extends Item{

    private String name = "quiverItem";

    public QuiverItem() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(SuperBlocks.tabSuperBlocksItems);
    }

}
