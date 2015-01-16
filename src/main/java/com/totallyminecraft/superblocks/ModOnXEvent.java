package com.totallyminecraft.superblocks;


import com.totallyminecraft.superblocks.blocks.ModBlockStairs;
import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModOnXEvent {

        @SubscribeEvent
        public void WhenICraftACuttingTorch(PlayerEvent.ItemCraftedEvent event){
        if (event.crafting.getItem().equals(ModItems.cuttingtorchItem)) {
            event.player.addStat(ModAchievements.burnbaby, 1);
        }
    }

    @SubscribeEvent
    public void WhenICraftAWoodWorker(PlayerEvent.ItemCraftedEvent event) {
        if (event.crafting.getItem().equals(Item.getItemFromBlock(ModBlocks.woodWorker))) {
            event.player.addStat(ModAchievements.plankbyplank, 1);
        }
    }

    @SubscribeEvent
    public void WhenICraftEdgedPlastic(PlayerEvent.ItemCraftedEvent event) {
        if (event.crafting.getItem().equals(Item.getItemFromBlock(ModBlocks.edgedplasticBlock))) {
            event.player.addStat(ModAchievements.abittoasty, 1);
        }
    }

    public static void init(){

        FMLCommonHandler.instance().bus().register( new ModOnXEvent());

    }

}
