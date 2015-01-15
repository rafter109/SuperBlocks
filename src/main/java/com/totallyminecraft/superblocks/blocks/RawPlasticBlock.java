package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.TileEntityTestBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;


public class RawPlasticBlock extends Block{

    private String name = "rawplasticBlock";


    public RawPlasticBlock() {
        super(Material.rock);
        this.setCreativeTab(ModTabs.tabSuperBlocks);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);
    }


}

