package com.totallyminecraft.superblocksore.blocks;


import net.minecraft.block.Block;

public final class ModBlocks {

    public static Block lithiumoreBlock;
    public static Block aluminumoreBlock;

    public static void init(){

            lithiumoreBlock = new LithiumOreBlock();
            aluminumoreBlock = new AluminumOreBlock();

    }

}
