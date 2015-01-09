package com.totallyminecraft.superblocks.blocks;

import net.minecraft.block.Block;

/**
 * Created by Jake on 1/1/2015.
 */
public final class ModBlocks {

    public static Block testBlock;
    public static Block multiBlock;
    public static Block plasticBlock;
    public static Block edgedplasticBlock;
    public static Block coloredBrickBlock;
    public static Block coloredobsidianBlock;
    public static Block coloredemeraldBlock;
    public static Block rawplasticBlock;
    public static Block coloredglowstoneBlock;


    public static void init(){

        testBlock = new TestBlock();
        multiBlock = new MultiBlock();
        plasticBlock = new PlasticBlock();
        edgedplasticBlock = new EdgedPlasticBlock();
        coloredBrickBlock = new ColoredBrickBlock();
        coloredobsidianBlock = new ColoredObsidianBlock();
        coloredemeraldBlock = new ColoredEmeraldBlock();
        rawplasticBlock = new RawPlasticBlock();
        coloredglowstoneBlock = new ColoredGlowstoneBlock();

    }
}
