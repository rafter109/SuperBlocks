package com.totallyminecraft.superblocks.tileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
    public static final int WoodWorkerID = 2550;

    public static void init(){
        GameRegistry.registerTileEntity(WoodWorkerEntity.class,"WoodWorker");
        GameRegistry.registerTileEntity(TileEntityTestBlock.class,"TestBlock");
    }
}
