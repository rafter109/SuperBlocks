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


public class ColoredGlowstoneBlock extends Block{

    private final String name = "coloredglowstoneBlock";
    private int maxMeta = 16;

    private IIcon[] icons;

    public ColoredGlowstoneBlock() {
        super(Material.glass);
        this.setLightLevel(1.0F);
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(SuperBlocks.tabSuperBlocks);
        GameRegistry.registerBlock(this, ItemBlockMultiBlock.class, name);
        icons = new IIcon[maxMeta];
    }

    @Override
    public int damageDropped(int meta) { return meta;}

    @SuppressWarnings({ "unchecked", "rawtypes"})
    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < maxMeta; i++) {
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

        switch(meta){

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
            case 5:
                return icons[5];
            case 6:
                return icons[6];
            case 7:
                return icons[7];
            case 8:
                return icons[8];
            case 9:
                return icons[9];
            case 10:
                return icons[10];
            case 11:
                return icons[11];
            case 12:
                return icons[12];
            case 13:
                return icons[13];
            case 14:
                return icons[14];
            case 15:
                return icons[15];
            default: {
                return icons[0];
            }
        }
    }

}

