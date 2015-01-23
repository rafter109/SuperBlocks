package com.totallyminecraft.superblocks.items;
import net.minecraft.item.Item;

public final class ModItems {

    public static Item quiverItem;
    public static Item overbakedpotatoItem;
    public static Item bleachbucketItem;
    public static Item ironscrapItem;
    public static Item cuttingtorchItem;
    public static Item aluminumingotItem;
    public static Item lithiumingotItem;
    public static Item lithiumnuggetItem;
    public static Item suspendedlithiumItem;
    public static Item jarItem;
    public static Item lithiumCellItem;
    public static Item lithiumCellStackItem;
    public static Item lithiumBatteryItem;
    public static Item foilItem;
    public static Item guideBookItem;

    public static void init(){

        quiverItem = new QuiverItem();
        overbakedpotatoItem = new OverBakedPotatoItem();
        bleachbucketItem = new BleachBucketItem();
        ironscrapItem = new IronScrapItem();
        cuttingtorchItem = new CuttingTorchItem();
        aluminumingotItem = new AluminumIngotItem();
        lithiumingotItem = new LithiumIngotItem();
        lithiumnuggetItem = new LithiumNuggetItem();
        suspendedlithiumItem = new SuspendedLithiumItem();
        jarItem = new JarItem();
        lithiumCellItem = new LithiumCellItem();
        lithiumCellStackItem = new LithiumCellStackItem();
        lithiumBatteryItem = new LithiumBatteryItem();
        foilItem = new FoilItem();
        guideBookItem = new GuideBookItem();

    }
}
