package com.totallyminecraft.superblocks.tileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
    public static final int WoodCutterID = 2550;

    public static void init(){
        GameRegistry.registerTileEntity(WoodCutter_entity.class,"WoodCutter");
    }
}
