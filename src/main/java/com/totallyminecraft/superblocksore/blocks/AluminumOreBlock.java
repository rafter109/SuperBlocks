package com.totallyminecraft.superblocksore.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocksore.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class AluminumOreBlock extends Block {

    private String name = "aluminumoreBlock";

    public AluminumOreBlock(){
        super(Material.rock);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setCreativeTab(ModTabs.tabSuperBlocks);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe",1);
    }

}
