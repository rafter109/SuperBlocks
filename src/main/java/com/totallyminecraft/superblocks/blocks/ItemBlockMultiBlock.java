package com.totallyminecraft.superblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemBlockMultiBlock extends ItemBlock{

    public ItemBlockMultiBlock(Block block){

        super(block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {

        return meta;
    }


    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        String name;
        switch(itemStack.getItemDamage()) {

            case 0:
                name = "0Meta";
                break;
            case 1:
                name = "1Meta";
                break;
            case 2:
                name = "2Meta";
                break;
            case 3:
                name = "3Meta";
                break;
            case 4:
                name = "4Meta";
                break;
            case 5:
                name = "5Meta";
                break;
            case 6:
                name = "6Meta";
                break;
            case 7:
                name = "7Meta";
                break;
            case 8:
                name = "8Meta";
                break;
            case 9:
                name = "9Meta";
                break;
            case 10:
                name = "10Meta";
                break;
            case 11:
                name = "11Meta";
                break;
            case 12:
                name = "12Meta";
                break;
            case 13:
                name = "13Meta";
                break;
            case 14:
                name = "14Meta";
                break;
            case 15:
                name = "15Meta";
                break;
            default:
                name = "noMeta";
        }
        return getUnlocalizedName() + "." + name;
    }


}
