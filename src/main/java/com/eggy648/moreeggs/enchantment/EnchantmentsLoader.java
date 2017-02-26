package com.eggy648.moreeggs.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;


/**
 * Created by Cheese on 2017/2/25.
 * loader moreeggs' enchantments
 */
public class EnchantmentsLoader {
    public static final EnumEnchantmentType FIRE_POWER_ENCHANTMENT_TYPE= EnumHelper.addEnchantmentType(
            "fire_power", input -> input instanceof ItemTool || input instanceof ItemSword);
    public static Enchantment firePower=new EnchantmentFirePower(Enchantment.Rarity.COMMON);
    public EnchantmentsLoader() {
        registerEnchantments();
    }
    public static void registerEnchantments()
    {
        registerEnchantment(firePower,"fire_power");
    }
    public static void registerEnchantment(Enchantment enchantment,String name)
    {
        Enchantment.REGISTRY.register(enchantment.hashCode(), new ResourceLocation(name), enchantment.setRegistryName(name));
    }
}
