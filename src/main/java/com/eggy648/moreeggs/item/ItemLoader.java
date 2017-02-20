package com.eggy648.moreeggs.item;

import com.eggy648.moreeggs.moreeggs;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameRules;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	public static Item dirtEgg=new ItemDirtEgg();
	public static Item ironEgg=new ItemIronEgg();
	public static Item goldenEgg=new ItemGoldenEgg();
	public static Item diamondEgg=new ItemDiamondEgg();
	public ItemLoader()
	{
		GameRegistry.register(dirtEgg.setRegistryName("dirt_egg").setUnlocalizedName("dirtEgg").setCreativeTab(moreeggs.tab));
		GameRegistry.register(ironEgg.setRegistryName("iron_egg").setUnlocalizedName("ironEgg").setCreativeTab(moreeggs.tab));
		GameRegistry.register(goldenEgg.setRegistryName("golden_egg").setUnlocalizedName("goldenEgg").setCreativeTab(moreeggs.tab));
		GameRegistry.register(diamondEgg.setRegistryName("diamond_egg").setUnlocalizedName("diamondEgg").setCreativeTab(moreeggs.tab));
		
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		registerRender(dirtEgg, 0);
		registerRender(ironEgg,0);
		registerRender(goldenEgg,0);
		registerRender(diamondEgg,0);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item,int meta)
	{
		ModelLoader.setCustomModelResourceLocation(item,
				meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
