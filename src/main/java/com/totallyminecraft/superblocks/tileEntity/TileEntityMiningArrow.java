package com.totallyminecraft.superblocks.tileEntity;



import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;


public class TileEntityMiningArrow extends TileEntity{

    public static int Direction;


    @Override
    public void readFromNBT(NBTTagCompound nbt){
        super.readFromNBT(nbt);
        this.Direction = nbt.getInteger("Direction");
        System.out.println(Direction + " Read");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt){
        super.writeToNBT(nbt);
        nbt.setInteger("Direction", Direction);
        System.out.println(Direction + " Written");
    }

}
