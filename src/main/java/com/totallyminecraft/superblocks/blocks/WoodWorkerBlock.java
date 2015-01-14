package com.totallyminecraft.superblocks.blocks;

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
import net.minecraft.tileentity.TileEntity;

public class WoodWorkerBlock extends BlockContainer{
    private String name;
    private IIcon iconTop;
    public WoodWorkerBlock(){
        super(Material.rock);
        name="WoodWorker";
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(SuperBlocks.tabSuperBlocks);
        GameRegistry.registerBlock(this, ItemBlockMultiBlock.class, name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);
    }
    public boolean hasTileEntity(int meta) {
        return true;
    }
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int Side, float hitX, float hitY, float hitZ){
        player.openGui(SuperBlocks.instance, ModTileEntities.WoodWorkerID, world, x ,y, z);
        return true;
    }
    public TileEntity createNewTileEntity(World world, int i){
        return new WoodWorkerEntity();
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(Constants.MODID + ":" + "woodWorkerSide");
        iconTop = iconRegister.registerIcon(Constants.MODID + ":" + "woodWorkerTop");
    }
}
