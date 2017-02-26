package com.eggy648.moreeggs.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by Cheese on 2017/2/25.
 * add fire power enchantment to tools
 */
public class EnchantmentFirePower extends Enchantment
{
    public EnchantmentFirePower(Rarity rarityIn) {
        super(rarityIn, EnchantmentsLoader.FIRE_POWER_ENCHANTMENT_TYPE,
                new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND});
        this.setName("firePower");
    }

    /**
     * Returns the minimal value of enchantability needed on the enchantment level passed.
     *
     * @param enchantmentLevel
     */
    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 15;
    }
    /**
     * Returns the maximum value of enchantability needed on the enchantment level passed.
     *
     * @param enchantmentLevel
     */
    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return super.getMaxEnchantability(enchantmentLevel)+50;
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    @Override
    public int getMaxLevel() {
        return 1;
    }

    /**
     * Determines if the enchantment passed can be applied together with this enchantment.
     *
     * @param ench
     */
    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench.getRegistryType() !=
                Enchantments.SILK_TOUCH.getRegistryType()
                 && ench.getRegistryType() != Enchantments.FORTUNE.getRegistryType();
        //can't apply with silkTouch and fortune together
    }
}
