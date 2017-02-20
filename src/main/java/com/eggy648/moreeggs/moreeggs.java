package com.eggy648.moreeggs;

import com.eggy648.moreeggs.common.CommonProxy;
import com.eggy648.moreeggs.item.MECreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid=moreeggs.modid,name=moreeggs.name,version=moreeggs.version)
public class moreeggs {
	static final String modid="moreeggs";
	public static final String name="More Eggs";
	public static final String version="1.0.1";
	public static final CreativeTabs tab=new MECreativeTab();
	@Instance(moreeggs.modid)
	public static moreeggs instance;
	@SidedProxy(clientSide = "com.eggy648.moreeggs.client.ClientProxy",
			serverSide = "com.eggy648.moreeggs.common.CommonProxy")
	private static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public void post(FMLPostInitializationEvent event)
	{
		proxy.post(event);
	}
}
