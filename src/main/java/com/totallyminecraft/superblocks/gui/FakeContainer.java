package com.totallyminecraft.superblocks.gui;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class FakeContainer extends Container{
        @Override
        public boolean canInteractWith(EntityPlayer p_75145_1_) {
            return true;
        }
}
