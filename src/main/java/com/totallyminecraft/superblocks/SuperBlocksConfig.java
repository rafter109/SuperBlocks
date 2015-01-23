package com.totallyminecraft.superblocks;



import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.config.Configuration;

public class SuperBlocksConfig {

    public static boolean genLithiumOre;
    public static final boolean genLithiumOreDefault = true;
    public static final String genLithiumOreName= "Generate Lithium Ore In World";

    public static boolean genAluminumOre;
    public static final boolean genAluminumOreDefault = true;
    public static final String genAluminumOreName= "Generate Aluminum Ore In World";


    public static void syncConfig(){

        FMLCommonHandler.instance().bus().register(SuperBlocks.instance);

        final String TOGGLE = Configuration.CATEGORY_GENERAL + Configuration.CATEGORY_SPLITTER + "Toggles";
        SuperBlocks.superblocksconfig.addCustomCategoryComment(TOGGLE, "Enable or dissable parts of the mod");

        genLithiumOre = SuperBlocks.superblocksconfig.get(TOGGLE, genLithiumOreName, genLithiumOreDefault).getBoolean(genLithiumOreDefault);
        genAluminumOre = SuperBlocks.superblocksconfig.get(TOGGLE, genAluminumOreName, genAluminumOreDefault).getBoolean(genAluminumOreDefault);


        if(SuperBlocks.superblocksconfig.hasChanged()){
            SuperBlocks.superblocksconfig.save();
        }
    }

}
