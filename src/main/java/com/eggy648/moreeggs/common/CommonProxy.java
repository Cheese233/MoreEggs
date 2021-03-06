package com.eggy648.moreeggs.common;

import com.eggy648.moreeggs.block.BlockLoader;
import com.eggy648.moreeggs.enchantment.EnchantmentFirePower;
import com.eggy648.moreeggs.item.ItemLoader;

import com.eggy648.moreeggs.potion.PotionLoader;
import net.minecraftforge.client.model.BlockStateLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event)
	{
		new ItemLoader();//Register Items
		new BlockLoader();//Register Blocks
		new PotionLoader();

	}
	public void init(FMLInitializationEvent event)
	{
		new CraftingLoader();
		new EventLoader();
	}
	public void post(FMLPostInitializationEvent event)
	{
		
	}
}
