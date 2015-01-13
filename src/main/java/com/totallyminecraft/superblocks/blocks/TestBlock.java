package com.totallyminecraft.superblocks.blocks;

import com.totallyminecraft.superblocks.SuperBlocks;
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


public class TestBlock extends Block implements ITileEntityProvider{

    private String name = "testBlock";

    public static boolean TestBlockActive = false;
    ChatComponentText status1 = new ChatComponentText("Block Is Activated");
    ChatComponentText status2 = new ChatComponentText("Block Is Deactivated");

    public TestBlock(){
        super(Material.rock);
        this.setCreativeTab(SuperBlocks.tabSuperBlocks);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setResistance(30f);
        setHardness(1.5f);
        setHarvestLevel("pickaxe",1);
    }


    @Override
    public TileEntity createNewTileEntity(World world, int meta){
        return new TileEntityTestBlock();
    }

    @Override
    public boolean hasTileEntity(int metadata){
        return true;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par1, float par2, float par3, float par4) {

        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
            if (!world.isRemote) {
                TestBlockActive = !TestBlockActive;
                if(TestBlockActive){
                    entityPlayer.addChatComponentMessage(status1);
                }
                else entityPlayer.addChatComponentMessage(status2);
            }
            return false;
        }
        return false;
    }

}
