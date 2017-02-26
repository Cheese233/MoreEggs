package com.eggy648.moreeggs.item;

import com.eggy648.moreeggs.enchantment.EnchantmentsLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;

import java.util.List;

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

    /**
     * Returns the enchantment types relevant to this tab
     */
    @Override
    public EnumEnchantmentType[] getRelevantEnchantmentTypes() {
        return new EnumEnchantmentType[]{EnchantmentsLoader.FIRE_POWER_ENCHANTMENT_TYPE};
    }

    /**
     * Adds the enchantment books from the supplied EnumEnchantmentType to the given list.
     *
     * @param itemList
     * @param enchantmentType
     */
    @Override
    public void addEnchantmentBooksToList(List<ItemStack> itemList, EnumEnchantmentType... enchantmentType) {
        super.addEnchantmentBooksToList(itemList, EnchantmentsLoader.FIRE_POWER_ENCHANTMENT_TYPE);
    }
}
