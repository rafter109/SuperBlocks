package com.totallyminecraft.superblocks.blocks;


import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.Mod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class ModBlockStairs extends BlockStairs {


    //Used for meta block
    public ModBlockStairs(String unlocalizedName, Block baseBlock, int metaOfBlock){
        super(baseBlock, metaOfBlock);
        this.setBlockName(Constants.MODID + "_" + unlocalizedName);
        this.setCreativeTab(SuperBlocks.tabSuperBlocks);
    }


    //Used for non meta block
 //   public ModBlockStairs(String unlocalizedName, Block baseBlock) {
 //       this(unlocalizedName, baseBlock, 0);
 //   }

}
