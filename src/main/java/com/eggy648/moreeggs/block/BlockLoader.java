package com.eggy648.moreeggs.block;

import com.eggy648.moreeggs.moreeggs;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockLoader {
    public static Block fossilDirt = new BlockFossilDirt();

    public BlockLoader() {
        GameRegistry.register(fossilDirt.setRegistryName("fossil_dirt").setUnlocalizedName("fossilDirt").setCreativeTab(moreeggs.tab));

    }

    public static void registerRenders() {
         registerRender(fossilDirt,0);
    }

    public static void registerRender(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
