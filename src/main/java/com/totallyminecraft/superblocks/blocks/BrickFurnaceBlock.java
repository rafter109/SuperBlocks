package com.totallyminecraft.superblocks.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BrickFurnaceBlock extends BlockContainer{
    public BrickFurnaceBlock(){
        super(Material.rock);
    }
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
