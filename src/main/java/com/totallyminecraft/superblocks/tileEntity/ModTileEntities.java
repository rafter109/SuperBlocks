package com.totallyminecraft.superblocks.tileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
    public static final int WoodWorkerID = 2550;
    public static final int SlimWoodWorkerID = 2551;
    public static final int BrickFurnaceID = 2552;

    public static void init(){
        GameRegistry.registerTileEntity(WoodWorkerEntity.class,"WoodWorker");
        GameRegistry.registerTileEntity(WoodWorkerEntity.class,"SlimWoodWorker");
        GameRegistry.registerTileEntity(WoodWorkerEntity.class,"Brickfurnace");
    }
}
