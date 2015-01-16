package com.totallyminecraft.superblocks;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.gui.GuiHandler;
import com.totallyminecraft.superblocks.items.ModItems;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import com.totallyminecraft.superblocks.world.WorldGeneratorSuperBlocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)


public class SuperBlocks {

    @Mod.Instance(Constants.MODID)
    public static SuperBlocks instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();
        ModBlocks.init();
        ModTileEntities.init();
        Crafting.init();
        ModOnXEvent.init();
        //GameRegistry.registerWorldGenerator(new WorldGeneratorSuperBlocks(), 1);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        ModAchievements.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
