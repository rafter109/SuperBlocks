package com.totallyminecraft.superblocks.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public final class ModBlocks {

    public static Block plasticBlock;
    public static Block edgedplasticBlock;
    public static Block coloredBrickBlock;
    public static Block fancyBrickBlock;
    public static Block coloredobsidianBlock;
    public static Block coloredemeraldBlock;
    public static Block rawplasticBlock;
    public static Block coloredrawplasticBlock;
    public static Block coloredglowstoneBlock;
    public static Block constructionBlocks;
    public static Block woodWorker;
    public static Block brickFurnaceIdle;
    public static Block brickFurnaceActive;
    public static Block machinecoreBlock;
    public static Block batterychargerBlock;

    public static Block fancyAcaciaBlock;
    public static Block fancyBirchBlock;
    public static Block fancyDarkOakBlock;
    public static Block fancyJungleBlock;
    public static Block fancyOakBlock;
    public static Block fancySpruceBlock;

    //stairs
    public static Block plastic_stairs;
    public static Block edgedplastic_stairs;
    public static Block coloredbrick_stairs;
    public static Block coloredobsidian_stairs;
    public static Block coloredemerald_stairs;
    public static Block fancybrick_stairs;

    public static Block fancyAcacia_stairs;
    public static Block fancyBirch_stairs;
    public static Block fancyDarkOak_stairs;
    public static Block fancyJungle_stairs;
    public static Block fancyOak_stairs;
    public static Block fancySpruce_stairs;




    public static void init(){
        plasticBlock = new PlasticBlock();
        edgedplasticBlock = new EdgedPlasticBlock();
        coloredBrickBlock = new ColoredBrickBlock();
        fancyBrickBlock = new FancyBrickBlock();
        coloredobsidianBlock = new ColoredObsidianBlock();
        coloredemeraldBlock = new ColoredEmeraldBlock();
        rawplasticBlock = new RawPlasticBlock();
        coloredrawplasticBlock = new ColoredRawPlasticBlock();
        coloredglowstoneBlock = new ColoredGlowstoneBlock();
        constructionBlocks = new ConstructionBlock();
        woodWorker = new WoodWorkerBlock();
        brickFurnaceIdle = new BrickFurnaceBlock(false);
        brickFurnaceActive = new BrickFurnaceBlock(true);
        machinecoreBlock = new MachineCoreBlock();
        batterychargerBlock = new BatteryChargerBlock();

        fancyAcaciaBlock = new FancyWoodBlock(1);
        fancyBirchBlock = new FancyWoodBlock(2);
        fancyDarkOakBlock = new FancyWoodBlock(3);
        fancyJungleBlock = new FancyWoodBlock(4);
        fancyOakBlock = new FancyWoodBlock(5);
        fancySpruceBlock = new FancyWoodBlock(6);

        //stairs
        for(int i=0; i < 16; i++) {
            GameRegistry.registerBlock(plastic_stairs = new ModBlockStairs("plastic_stairs" + i , ModBlocks.plasticBlock, i), "plastic_stairs" + i);
            GameRegistry.registerBlock(edgedplastic_stairs = new ModBlockStairs("edgedplastic_stairs" + i , ModBlocks.edgedplasticBlock, i), "edgedplastic_stairs" + i);
            GameRegistry.registerBlock(coloredbrick_stairs = new ModBlockStairs("coloredbrick_stairs" + i , ModBlocks.coloredBrickBlock, i), "coloredbrick_stairs" + i);
            GameRegistry.registerBlock(coloredobsidian_stairs = new ModBlockStairs("coloredobsidian_stairs" + i , ModBlocks.coloredobsidianBlock, i), "coloredobsidian_stairs" + i);
            GameRegistry.registerBlock(coloredemerald_stairs = new ModBlockStairs("coloredemerald_stairs" + i , ModBlocks.coloredemeraldBlock, i), "coloredemerald_stairs" + i);
            GameRegistry.registerBlock(fancybrick_stairs = new ModBlockStairs("fancybrick_stairs" + i , ModBlocks.fancyBrickBlock, i), "fancybrick_stairs" + i);
            /*
            GameRegistry.registerBlock(fancyAcacia_stairs = new ModBlockStairs("fancyOak_stairs" + i , ModBlocks.fancyAcaciaBlock, i), "fancyAcacia_stairs" + i);
            GameRegistry.registerBlock(fancyBirch_stairs = new ModBlockStairs("fancyOak_stairs" + i , ModBlocks.fancyBirchBlock, i), "fancyBirch_stairs" + i);
            GameRegistry.registerBlock(fancyDarkOak_stairs = new ModBlockStairs("fancyOak_stairs" + i , ModBlocks.fancyDarkOakBlock, i), "fancyDarkOak_stairs" + i);
            GameRegistry.registerBlock(fancyJungle_stairs = new ModBlockStairs("fancyOak_stairs" + i , ModBlocks.fancyJungleBlock, i), "fancyJungle_stairs" + i);
            GameRegistry.registerBlock(fancyOak_stairs = new ModBlockStairs("fancyOak_stairs" + i , ModBlocks.fancyOakBlock, i), "fancyOak_stairs" + i);
            GameRegistry.registerBlock(fancySpruce_stairs = new ModBlockStairs("fancyOak_stairs" + i , ModBlocks.fancySpruceBlock, i), "fancySpruce_stairs" + i);
            */
        }
    }
}
