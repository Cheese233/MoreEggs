package com.eggy648.moreeggs.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemDirtEgg extends ItemFood{
	public ItemDirtEgg()
	{
		super(4,0.15F,false);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(25), 100, 1));
			player.addChatMessage(new TextComponentString("What?  You eat a Dirt Egg? May it spawns " +
					" a chicken in your body case you fly."));
		}


		super.onFoodEaten(stack, worldIn, player);
	}
}
