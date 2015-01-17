package com.totallyminecraft.superblocks;


import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import com.totallyminecraft.superblocksore.SuperBlocksOre;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements {

    public static Achievement burnbaby;
    public static Achievement plankbyplank;
    public static Achievement abittoasty;
    public static Achievement thehardway;

    public static void init(){

        burnbaby = new Achievement("achievement.burnbaby", "superblocks.burnbaby", 0, 0, ModItems.cuttingtorchItem, (Achievement)null).initIndependentStat().registerStat();
        plankbyplank = new Achievement("achievement.plankbyplank", "superblocks.plankbyplank", 2, 1, Item.getItemFromBlock(ModBlocks.woodWorker), burnbaby).initIndependentStat().registerStat();
        abittoasty = new Achievement("achievement.abittoasty", "superblocks.abittoasty", 1, 2, Item.getItemFromBlock(ModBlocks.edgedplasticBlock), burnbaby).initIndependentStat().registerStat();
        thehardway = new Achievement("achievement.thehardway", "superblocks.thehardway", -1, -2, Item.getItemFromBlock(com.totallyminecraft.superblocksore.blocks.ModBlocks.lithiumoreBlock), (Achievement)null).initIndependentStat().registerStat();


        AchievementPage.registerAchievementPage(new AchievementPage("SuperBlocks", new Achievement[]{burnbaby, plankbyplank, abittoasty, thehardway}));

    }

}
