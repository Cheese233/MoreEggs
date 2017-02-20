package com.eggy648.moreeggs.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MECreativeTab extends CreativeTabs {
    public MECreativeTab() {
        super("METab");
        this.setBackgroundImageName("moreeggs.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemLoader.dirtEgg);
    }


    @Override
    public boolean hasSearchBar() {
        return true;
    }


}
