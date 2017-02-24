package com.eggy648.moreeggs.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Cheese on 2017/2/23.
 * define Armor's Material: DiamondEgg
 */
public class ItemDiamondEggArmor extends ItemArmor {
    public static final ItemArmor.ArmorMaterial DIAMONDEGG_ARMOR = EnumHelper.addArmorMaterial(
            "diamond_egg",
            "moreeggs:diamond_egg",
            4000,
            new int[]{2, 8, 8, 2},
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            4.0F)
            ;

    public ItemDiamondEggArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
    }
}
