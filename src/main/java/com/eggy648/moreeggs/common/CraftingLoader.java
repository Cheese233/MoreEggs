package com.eggy648.moreeggs.common;

import com.eggy648.moreeggs.block.BlockLoader;
import com.eggy648.moreeggs.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Cheese on 2017/2/22.
 * add items Recipe 2017/2/22
 */
public class CraftingLoader {
    public CraftingLoader() {
        registerRecipe();
        registerSmelting();
    }

    private void registerSmelting() {
        GameRegistry.addSmelting(BlockLoader.fossilDirt,new ItemStack(ItemLoader.dirtEgg),1.0F);
    }


    private void registerRecipe() {
        GameRegistry.addRecipe(new ItemStack(ItemLoader.ironEgg)
                ,"###"
                , "#*#"
                , "###"
                , '#', Items.IRON_INGOT
                , '*', ItemLoader.dirtEgg);
        GameRegistry.addRecipe(new ItemStack(ItemLoader.goldenEgg)
                ," # "
                ,"#*#"
                ," # "
                ,'#',Items.GOLD_INGOT
                ,'*',ItemLoader.ironEgg
        );
        GameRegistry.addRecipe(new ItemStack(ItemLoader.diamondEgg)
                ,"   "
                , "#*#"
                ,"   "
                ,'#', Items.DIAMOND
                ,'*',ItemLoader.goldenEgg
        );
    }

}
