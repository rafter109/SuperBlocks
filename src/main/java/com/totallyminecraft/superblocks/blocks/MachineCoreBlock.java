package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.TileEntityBatteryChargerBlock;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMachineCore;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class MachineCoreBlock extends BlockContainer{

    private String name = "machinecoreBlock";


    public MachineCoreBlock() {
        super(Material.iron);
        this.setCreativeTab(ModTabs.tabSuperBlocks);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2){
        return new TileEntityMachineCore();
    }

}

