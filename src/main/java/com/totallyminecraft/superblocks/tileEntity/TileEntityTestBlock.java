package com.totallyminecraft.superblocks.tileEntity;

import net.minecraft.tileentity.TileEntity;


public class TileEntityTestBlock extends TileEntity{

    int tick = 0;

    public static final String publicName = "tileEntityTestBlock";
    private String name = "tileEntityTestBlock";

    public String getName() {
        return name;
    }

    @Override
    public void updateEntity(){

        if(!worldObj.isRemote){

            tick++;
            if(tick == 100){
                this.worldObj.setWorldTime(5000);
                tick = 0;
            }
        }

    }

}
