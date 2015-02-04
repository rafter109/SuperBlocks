package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMachineCore;
import com.totallyminecraft.superblocks.tileEntity.TileEntityMiningArrow;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class MiningArrowBlock extends BlockContainer{

    private String name = "miningarrowBlock";
    public static int DirectionDegree;

    public MiningArrowBlock() {
        super(Material.iron);
        this.setCreativeTab(ModTabs.tabSuperBlocksMachine);
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
        return new TileEntityMiningArrow();
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entitylivingBase, ItemStack itemStack)
    {
        int DirectionUnfixed = MathHelper.floor_double((double) ((entitylivingBase.rotationYaw * 4F) / 360F) + 2.5D) & 3;

        switch(DirectionUnfixed){
            case 0:
                TileEntityMiningArrow.Direction = 180;
                break;
            case 1:
                TileEntityMiningArrow.Direction = 90;
                break;
            case 2:
                TileEntityMiningArrow.Direction = 0;
                break;
            case 3:
                TileEntityMiningArrow.Direction = 270;
                break;
            default:
                TileEntityMiningArrow.Direction = 0;
        }


    }


}

