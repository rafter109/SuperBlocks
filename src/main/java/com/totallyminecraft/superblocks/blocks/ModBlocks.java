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
        
    }
}
