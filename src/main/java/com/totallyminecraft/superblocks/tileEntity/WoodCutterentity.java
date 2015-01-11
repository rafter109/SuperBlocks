package com.totallyminecraft.superblocks.tileEntity;

import net.minecraft.tileentity.TileEntity;

public class WoodCutterentity extends TileEntity{

    private String localizedName;

    public void setGuiDisplayName(String displayName){
        this.localizedName = displayName;
    }
}
