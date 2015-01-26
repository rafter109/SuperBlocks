package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.gui.BrickBinderGui;
import com.totallyminecraft.superblocks.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BrickBinderBlock extends Block {
    private String name;
    private IIcon[] icons = new IIcon[2];

    public BrickBinderBlock() {
        super(Material.wood);
        name = "BrickBinder";
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(ModTabs.tabSuperBlocksMachine);
        GameRegistry.registerBlock(this, ItemBlockMultiBlock.class, name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int Side, float hitX, float hitY, float hitZ) {
        if(!player.isSneaking()){
            player.openGui(SuperBlocks.instance, BrickBinderGui.ID, world, x, y, z);
            return true;
        }
        return false;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        for (int i = 0; i < icons.length; i++) {
            icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        switch(side){

            case 1:
                return icons[1];

            default: {
                return icons[0];
            }
        }
    }

}