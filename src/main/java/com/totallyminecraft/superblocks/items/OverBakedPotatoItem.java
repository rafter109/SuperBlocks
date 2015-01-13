package com.totallyminecraft.superblocks.items;

import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class OverBakedPotatoItem extends Item{

    private String name = "overbakedpotatoItem";

    public OverBakedPotatoItem() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(SuperBlocks.tabSuperBlocksItems);
        setTextureName(Constants.MODID + ":" + name);
    }

}
