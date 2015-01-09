package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by Jake on 1/1/2015.
 */
public class MultiBlock extends Block {

    private final String name = "multiBlock";
    private int maxMeta = 5;

    private IIcon[] icons;


    public MultiBlock() {

        super(Material.rock);
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(SuperBlocks.tabSuperBlocks);
        GameRegistry.registerBlock(this, ItemBlockMultiBlock.class, name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe",1);
        icons = new IIcon[maxMeta];

    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

    @SuppressWarnings({ "unchecked", "rawtypes"})
    @Override public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list){
        for(int i = 0; i < maxMeta; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister){

        for(int i = 0; i < icons.length; i++){
            icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){

        switch(meta) {

            case 0:
                return icons[0];
            case 1:
                return icons[1];
            case 2:
                return icons[2];
            case 3:
                return icons[3];
            case 4:
                return icons[4];
            default: {
                return icons[0];
            }
        }
    }

}
