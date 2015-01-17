package com.totallyminecraft.superblocksore.blocks;


import com.totallyminecraft.superblocks.ModAchievements;
import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocksore.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Random;


public class LithiumOreBlock extends Block {

    private String name = "lithiumoreBlock";

    public LithiumOreBlock(){
        super(Material.rock);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setCreativeTab(ModTabs.tabSuperBlocks);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe",2);
    }




    @Override
    public void onBlockHarvested(World world, int x, int y, int z, int var4, EntityPlayer player){
        Random rn = new Random();
        int answer = rn.nextInt(5) + 1;

        if(answer == 2){
            world.createExplosion(null, x, y, z, 2F, false);
            player.addStat(ModAchievements.thehardway, 1);
        }




    }



}
