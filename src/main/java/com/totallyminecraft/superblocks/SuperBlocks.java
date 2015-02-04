package com.totallyminecraft.superblocks;


import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.crafting.Crafting;
import com.totallyminecraft.superblocks.gui.GuiHandler;
import com.totallyminecraft.superblocks.items.ModItems;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.proxy.CommonProxy;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.common.config.Configuration;



@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)


public class SuperBlocks {

    public static Configuration superblocksconfig;

    private int tick;

    @Mod.Instance(Constants.MODID)
    public static SuperBlocks instance;


    @SidedProxy(clientSide = "com.totallyminecraft.superblocks.proxy.ClientProxy", serverSide = "com.totallyminecraft.superblocks.proxy.CommonProxy")
    public static CommonProxy Proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();
        ModBlocks.init();
        ModTileEntities.init();
        Crafting.init();
        ModOnXEvent.init();

        superblocksconfig = new Configuration(event.getSuggestedConfigurationFile());
        SuperBlocksConfig.syncConfig();

        Proxy.registerRenderThings();
   }


    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent event){
        if(event.modID.equals(Constants.MODID)){
            SuperBlocksConfig.syncConfig();
        }
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        FMLCommonHandler.instance().bus().register(instance);
        ModAchievements.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){


    }

}
