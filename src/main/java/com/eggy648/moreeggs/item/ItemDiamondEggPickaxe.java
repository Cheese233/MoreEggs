package com.eggy648.moreeggs.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Cheese on 2017/2/23.
 * Define Item: DiamondEgg Pickaxe
 */
public class ItemDiamondEggPickaxe extends ItemPickaxe{
    public static final Item.ToolMaterial DIAMONDEGG_TOOL=EnumHelper.addToolMaterial("DiamondEgg",
            3,
            7000,
            18F,
            4.5F,
            14
            );
    public ItemDiamondEggPickaxe() {
        super(DIAMONDEGG_TOOL);
    }


}
