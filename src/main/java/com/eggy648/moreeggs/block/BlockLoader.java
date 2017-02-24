package com.eggy648.moreeggs.block;

import com.eggy648.moreeggs.moreeggs;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
    public static Block fossilDirt =
            new BlockFossilDirt()
                    .setRegistryName("fossil_dirt")
                    .setUnlocalizedName("fossilDirt")
                    .setCreativeTab(moreeggs.tab).
                    setHardness(1.5f);


    public BlockLoader() {
        GameRegistry.register(fossilDirt);
        GameRegistry.register(new ItemBlock(fossilDirt).setRegistryName(fossilDirt.getRegistryName()));
        System.out.println("fossil_dirt registered!");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(fossilDirt, 0);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(block),
                meta,
                new ModelResourceLocation(block.getRegistryName(),
                        "inventory"));

    }
}
