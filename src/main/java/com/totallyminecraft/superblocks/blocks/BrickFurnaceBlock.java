package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.BrickFurnaceEntity;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BrickFurnaceBlock extends BlockContainer{
    private String name;
    private IIcon[] icons = new IIcon[6];

    public BrickFurnaceBlock(){
        super(Material.rock);
        name = "BrickFurnace";
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(ModTabs.tabSuperBlocks);
        GameRegistry.registerBlock(this, ItemBlockMultiBlock.class, name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);
    }
    public boolean hasTileEntity(int meta) {
        return true;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int Side, float hitX, float hitY, float hitZ) {
        player.openGui(SuperBlocks.instance, ModTileEntities.BrickFurnaceID, world, x, y, z);
        return true;
    }

    public TileEntity createNewTileEntity(World world, int i) {
        return new BrickFurnaceEntity();
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

            case 0:
                return icons[0];

            case 1:
                return icons[0];

            case 2:
                return icons[2];

            default: {
                return icons[3];
            }
        }
    }
}
