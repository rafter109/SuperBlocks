package com.totallyminecraft.superblocksore;

import com.totallyminecraft.superblocksore.blocks.ModBlocks;
import com.totallyminecraft.superblocksore.lib.Constants;
import com.totallyminecraft.superblocksore.world.WorldGeneratorSuperBlocksOre;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)


public class SuperBlocksOre {

    @Mod.Instance(Constants.MODID)
    public static SuperBlocksOre instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

            ModBlocks.init();

            GameRegistry.registerWorldGenerator(new WorldGeneratorSuperBlocksOre(), 1);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){


    }

}
