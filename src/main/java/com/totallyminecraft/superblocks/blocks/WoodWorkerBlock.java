package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import com.totallyminecraft.superblocks.tileEntity.WoodWorkerEntity;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.util.IIcon;
import net.minecraft.client.renderer.texture.IIconRegister;

public class WoodWorkerBlock extends BlockContainer {
    private String name;
    private IIcon[] icons = new IIcon[6];

    public WoodWorkerBlock() {
        super(Material.rock);
        name = "WoodWorker";
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
        player.openGui(SuperBlocks.instance, ModTileEntities.WoodWorkerID, world, x, y, z);
        return true;
    }

    public TileEntity createNewTileEntity(World world, int i) {
        return new WoodWorkerEntity();
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