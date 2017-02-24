package com.eggy648.moreeggs.item;

import com.eggy648.moreeggs.moreeggs;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameRules;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {

    //Eggs
    public static Item dirtEgg = new ItemDirtEgg();
    public static Item ironEgg = new ItemIronEgg();
    public static Item goldenEgg = new ItemGoldenEgg();
    public static Item diamondEgg = new ItemDiamondEgg();

    //Armors
    public static Item diamondEggHelmet=new ItemDiamondEggArmor(ItemDiamondEggArmor.DIAMONDEGG_ARMOR,
            1, EntityEquipmentSlot.HEAD);
    public static Item diamondEggChest=new ItemDiamondEggArmor(ItemDiamondEggArmor.DIAMONDEGG_ARMOR,
            1, EntityEquipmentSlot.CHEST);
    public static Item diamondEggLegs=new ItemDiamondEggArmor(ItemDiamondEggArmor.DIAMONDEGG_ARMOR,
            2, EntityEquipmentSlot.LEGS);
    public static Item diamondEggBoots=new ItemDiamondEggArmor(ItemDiamondEggArmor.DIAMONDEGG_ARMOR,
            1, EntityEquipmentSlot.FEET);
    //Tools
    public static ItemPickaxe diamondEggPickaxe = new ItemDiamondEggPickaxe();

    public ItemLoader() {
        GameRegistry.register(dirtEgg.setRegistryName("dirt_egg").setUnlocalizedName("dirtEgg")
                .setCreativeTab(moreeggs.tab));
        GameRegistry.register(ironEgg.setRegistryName("iron_egg").setUnlocalizedName("ironEgg")
                .setCreativeTab(moreeggs.tab));
        GameRegistry.register(goldenEgg.setRegistryName("golden_egg").setUnlocalizedName("goldenEgg")
                .setCreativeTab(moreeggs.tab));
        GameRegistry.register(diamondEgg.setRegistryName("diamond_egg").setUnlocalizedName("diamondEgg")
                .setCreativeTab(moreeggs.tab));

        GameRegistry.register(diamondEggPickaxe.setRegistryName("diamond_egg_pickaxe")
                .setUnlocalizedName("diamondEggPickaxe").setCreativeTab(moreeggs.tab));

        GameRegistry.register(diamondEggHelmet.setRegistryName("diamond_egg_helmet")
                .setUnlocalizedName("diamondEggHelmet").setCreativeTab(moreeggs.tab));
        GameRegistry.register(diamondEggChest.setRegistryName("diamond_egg_chest")
                .setUnlocalizedName("diamondEggChest").setCreativeTab(moreeggs.tab));
        GameRegistry.register(diamondEggLegs.setRegistryName("diamond_egg_legs")
                .setUnlocalizedName("diamondEggLegs").setCreativeTab(moreeggs.tab));
        GameRegistry.register(diamondEggBoots.setRegistryName("diamond_egg_boots")
                .setUnlocalizedName("diamondEggBoots").setCreativeTab(moreeggs.tab));


    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(dirtEgg, 0);
        registerRender(ironEgg, 0);
        registerRender(goldenEgg, 0);
        registerRender(diamondEgg, 0);
        registerRender(diamondEggPickaxe, 0);
        registerRender(diamondEggHelmet,0);
        registerRender(diamondEggChest,0);
        registerRender(diamondEggLegs,0);
        registerRender(diamondEggBoots,0);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item,
                meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
