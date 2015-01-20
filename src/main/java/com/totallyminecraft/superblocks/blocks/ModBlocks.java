package com.totallyminecraft.superblocks.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public final class ModBlocks {

    public static Block plasticBlock;
    public static Block edgedplasticBlock;
    public static Block coloredBrickBlock;
    public static Block fancyBrickBlock;
    public static Block fancyWoodBlock;
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
    public static Block slimwoodworkerBlock;

    //stairs
    public static Block plastic_stairs;
    public static Block edgedplastic_stairs;
    public static Block coloredbrick_stairs;
    public static Block coloredobsidian_stairs;
    public static Block coloredemerald_stairs;
    public static Block fancybrick_stairs;
    public static Block fancywood_stairs;




    public static void init(){
        plasticBlock = new PlasticBlock();
        edgedplasticBlock = new EdgedPlasticBlock();
        coloredBrickBlock = new ColoredBrickBlock();
        fancyBrickBlock = new FancyBrickBlock();
        fancyWoodBlock = new FancyWoodBlock();
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
        slimwoodworkerBlock = new SlimWoodWorkerBlock();


        //stairs
        for(int i=0; i < 16; i++) {
            GameRegistry.registerBlock(plastic_stairs = new ModBlockStairs("plastic_stairs" + i , ModBlocks.plasticBlock, i), "plastic_stairs" + i);
            GameRegistry.registerBlock(edgedplastic_stairs = new ModBlockStairs("edgedplastic_stairs" + i , ModBlocks.edgedplasticBlock, i), "edgedplastic_stairs" + i);
            GameRegistry.registerBlock(coloredbrick_stairs = new ModBlockStairs("coloredbrick_stairs" + i , ModBlocks.coloredBrickBlock, i), "coloredbrick_stairs" + i);
            GameRegistry.registerBlock(coloredobsidian_stairs = new ModBlockStairs("coloredobsidian_stairs" + i , ModBlocks.coloredobsidianBlock, i), "coloredobsidian_stairs" + i);
            GameRegistry.registerBlock(coloredemerald_stairs = new ModBlockStairs("coloredemerald_stairs" + i , ModBlocks.coloredemeraldBlock, i), "coloredemerald_stairs" + i);
            GameRegistry.registerBlock(fancybrick_stairs = new ModBlockStairs("fancybrick_stairs" + i , ModBlocks.fancyBrickBlock, i), "fancybrick_stairs" + i);
            GameRegistry.registerBlock(fancywood_stairs = new ModBlockStairs("fancywood_stairs" + i , ModBlocks.fancyWoodBlock, i), "fancywood_stairs" + i);
        }
    }
}
