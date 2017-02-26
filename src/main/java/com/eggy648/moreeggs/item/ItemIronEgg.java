package com.eggy648.moreeggs.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.*;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemIronEgg extends ItemFood{
	public ItemIronEgg()
	{
		super(4,2.0F,false);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(player instanceof EntityPlayerMP)
		{
			if(!worldIn.isRemote)
			{
				player.attackEntityFrom(DamageSource.outOfWorld,4.0F);
				player.addChatMessage(new TextComponentString("So cool! You eat a egg made of iron? it" +
						"will damage your throat!"));
			}
		}
		super.onFoodEaten(stack, worldIn, player);
	}
}
