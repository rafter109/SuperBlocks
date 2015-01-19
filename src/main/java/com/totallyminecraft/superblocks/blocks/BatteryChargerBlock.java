package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.TileEntityBatteryChargerBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;



public class BatteryChargerBlock extends BlockContainer {

    private String name = "batterychargerBlock";



    public BatteryChargerBlock(){
        super(Material.iron);
        this.setCreativeTab(ModTabs.tabSuperBlocks);
        this.setBlockName(Constants.MODID + "_" + name);
        setBlockBounds(0.1875F, 0F, 0.375F, 0.8125F, 0.25F, 0.875F);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe",1);
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
        return new TileEntityBatteryChargerBlock();
    }


    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack){
       if(entity == null) {
           return;
       }
        TileEntityBatteryChargerBlock tile =  (TileEntityBatteryChargerBlock) world.getTileEntity(x, y, z);
        tile.direction = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360F) + 0.5D) & 3;

    }


}
