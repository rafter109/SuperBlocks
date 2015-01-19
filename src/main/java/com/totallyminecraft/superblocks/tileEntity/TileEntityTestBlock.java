package com.totallyminecraft.superblocks.tileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.WorldInfo;
import com.totallyminecraft.superblocks.blocks.TestBlock;


public class TileEntityTestBlock extends TileEntity{

    int tick = 0;

    public static final String publicName = "tileEntityTestBlock";
    private String name = "tileEntityTestBlock";

    public String getName() {
        return name;
    }


   // WorldServer worldserver = MinecraftServer.getServer().worldServers[0];
   // WorldInfo worldinfo = worldserver.getWorldInfo();


    @Override
    public void updateEntity() {

        if (!worldObj.isRemote) {
            if (TestBlock.TestBlockActive) {
                tick++;
                if (tick == 100) {
                  //  this.worldObj.setWorldTime(5000);
                   // worldinfo.setRaining(false);
                    tick = 0;
                }
            }

        }

    }
}

