package com.eggy648.moreeggs.client;

import com.eggy648.moreeggs.block.BlockLoader;
import com.eggy648.moreeggs.common.CommonProxy;
import com.eggy648.moreeggs.item.ItemLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		ItemLoader.registerRenders();
		System.out.println("Items registered render !");
		BlockLoader.registerRenders();
		System.out.println("Blocks registered render  !");
	}
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	@Override
	public void post(FMLPostInitializationEvent event) {
		super.post(event);
	}
}
