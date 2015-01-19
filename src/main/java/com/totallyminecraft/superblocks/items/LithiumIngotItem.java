package com.totallyminecraft.superblocks.items;



import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class LithiumIngotItem extends Item{


    private String name = "lithiumingotItem";

    private int tick = 0;

    public LithiumIngotItem() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModTabs.tabSuperBlocksItems);
        setTextureName(Constants.MODID + ":" + name);
    }


    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        {
            par3List.add("Place your subtext here");
        }
    }

    @Override
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
        if (! par2World.isRemote) {
            if (tick > 100) {

                System.out.println("I Work!");

                tick = 0;
            }
            tick++;
        }
    }

}
