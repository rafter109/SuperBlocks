package com.totallyminecraft.superblocks.tileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
    public static final int BrickFurnaceID = 2550;

    public static void init(){
        GameRegistry.registerTileEntity(BrickFurnaceEntity.class,"BrickFurnace");
    }
}
