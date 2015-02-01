package com.totallyminecraft.superblocks.items;


import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.gui.GuideBookGui;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.List;

public class GuideBookItem extends Item{


    private String name = "guideBookItem";

    public GuideBookItem() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModTabs.tabSuperBlocksItems);
        setTextureName(Constants.MODID + ":" + name);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
        if(world.isRemote){
            FMLCommonHandler.instance().showGuiScreen(new GuideBookGui());

        }
        return itemStack;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        {
            par3List.add("This book will help you along your way.");
        }
    }

}
