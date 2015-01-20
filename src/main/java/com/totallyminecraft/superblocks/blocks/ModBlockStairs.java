package com.totallyminecraft.superblocks.blocks;


import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class ModBlockStairs extends BlockStairs {


    //Used for meta block
    public ModBlockStairs(String unlocalizedName, Block baseBlock, int metaOfBlock) {
        super(baseBlock, metaOfBlock);
        this.setBlockName(Constants.MODID + "_" + unlocalizedName);
        this.setCreativeTab(ModTabs.tabSuperBlocks);
    }


}
