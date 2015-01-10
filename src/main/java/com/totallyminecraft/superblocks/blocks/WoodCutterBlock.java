package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import com.totallyminecraft.superblocks.tileEntity.WoodCutter_entity;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.util.IIcon;
import net.minecraft.client.renderer.texture.IIconRegister;

public class WoodCutterBlock extends BlockContainer{
    private String name;
    private IIcon iconTop;
    public WoodCutterBlock(){
        super(Material.rock);
        name="WoodCutter";
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(SuperBlocks.tabSuperBlocks);
        GameRegistry.registerBlock(this, ItemBlockMultiBlock.class, name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Constants.MODID + ":" + "woodCutterSide");
        this.iconTop = iconRegister.registerIcon(Constants.MODID + ":" + "woodCutterTop");
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata){
        return side == metadata ? this.blockIcon : this.blockIcon;
    }
    public void onBlockAdded(World world, int x, int y, int z){
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }
    private void setDefaultDirection(World world, int x, int y, int z){
        if(!world.isRemote){
            Block a = world.getBlock(x, y, z - 1);
            Block b = world.getBlock(x, y, z + 1);
            Block c = world.getBlock(x - 1, y, z);
            Block d = world.getBlock(x + 1, y, z);
            byte b0 = 3;
            if(a.func_149730_j() && !b.func_149730_j()){
                b0 = 3;
            }
            if(!a.func_149730_j() && b.func_149730_j()){
                b0 = 3;
            }
            if(c.func_149730_j() && !d.func_149730_j()){
                b0 = 3;
            }
            if(!c.func_149730_j() && d.func_149730_j()){
                b0 = 3;
            }
            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack){
        int s = MathHelper.floor_double((entityLivingBase.rotationYaw * 4F / 360F)+0.5D);
        if(s == 0){world.setBlockMetadataWithNotify(x,y,z,2,2);}
        if(s == 1){world.setBlockMetadataWithNotify(x,y,z,5,2);}
        if(s == 2){world.setBlockMetadataWithNotify(x,y,z,3,2);}
        if(s == 3){world.setBlockMetadataWithNotify(x,y,z,4,2);}
        if(itemStack.hasDisplayName()){
            ((WoodCutter_entity)world.getTileEntity(x,y,z)).setGuiDisplayName(itemStack.getDisplayName());
        }
    }
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int Side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
            FMLNetworkHandler.openGui(player, SuperBlocks.instance, ModTileEntities.WoodCutterID, world, x, y, z);
        }
        return true;
    }
    public TileEntity createNewTileEntity(World world, int i){
        return new WoodCutter_entity();
    }
}
