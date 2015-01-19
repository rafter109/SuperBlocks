package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.ModTabs;
import com.totallyminecraft.superblocks.SuperBlocks;
import com.totallyminecraft.superblocks.lib.Constants;
import com.totallyminecraft.superblocks.tileEntity.ModTileEntities;
import com.totallyminecraft.superblocks.tileEntity.SlimWoodWorkerEntity;
import com.totallyminecraft.superblocks.tileEntity.TileEntityBatteryChargerBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SlimWoodWorkerBlock extends BlockContainer {
    private String name = "slimwoodworkerBlock";
    private IIcon[] icons = new IIcon[6];

    public SlimWoodWorkerBlock() {
        super(Material.rock);
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(ModTabs.tabSuperBlocks);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe", 1);

    }

    public boolean hasTileEntity(int meta) {
        return true;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int Side, float hitX, float hitY, float hitZ) {
        player.openGui(SuperBlocks.instance, ModTileEntities.SlimWoodWorkerID, world, x, y, z);
        return true;
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
        return new SlimWoodWorkerEntity();
    }
    //possibly dont need check after block render in hand is working

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack){
        if(entity == null) {
            return;
        }
        TileEntityBatteryChargerBlock tile =  (TileEntityBatteryChargerBlock) world.getTileEntity(x, y, z);
        tile.direction = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360F) + 0.5D) & 3;

    }

}