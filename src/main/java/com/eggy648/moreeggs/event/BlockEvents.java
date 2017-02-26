package com.eggy648.moreeggs.event;

import com.eggy648.moreeggs.common.EventLoader;
import com.eggy648.moreeggs.enchantment.EnchantmentsLoader;
import com.eggy648.moreeggs.item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Cheese on 2017/2/23.
 * subscribe events of Blocks
 */
public class BlockEvents {
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = false)
    public void onRightClickFossildDirtBlock(EventLoader.PlayerRightClickFossilDirtEvent event) {

        if (!event.world.isRemote) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            player.dropItemWithOffset(ItemLoader.dirtEgg, 1, 1);

            player.addChatMessage(new TextComponentString("You right clicked a fossil block, and you "
                    +"find a dirt Egg in it. It looks will boom! run away quickly!"));
        }

    }

    @SubscribeEvent
    public void onHarvestBlockDrop(BlockEvent.HarvestDropsEvent event)
    {
        if(!event.getWorld().isRemote && event.getHarvester() != null)
        {
            ItemStack tool= event.getHarvester().getHeldItemMainhand();
            if(EnchantmentHelper.getEnchantmentLevel(EnchantmentsLoader.firePower,tool)>0 &&
                    tool.getItem()!= Items.SHEARS)
            {
                for (ItemStack dropItem:event.getDrops())
                {
                    ItemStack newStack= FurnaceRecipes.instance().getSmeltingResult(dropItem);
                    if(newStack!=null)
                    {
                        newStack=newStack.copy();//change pointer address
                        //set newStack count as itemStack's count
                        event.getDrops().set(event.getDrops().indexOf(dropItem),newStack);
                    }else if(dropItem!=null)
                    {
                        Block block= Block.getBlockFromItem(dropItem.getItem());
                        boolean b=(block!=null);
                        if(b&&(
                                block.isFlammable(event.getWorld(),event.getPos(), EnumFacing.DOWN)
                                ||block.isFlammable(event.getWorld(),event.getPos(), EnumFacing.EAST)
                                ||block.isFlammable(event.getWorld(),event.getPos(), EnumFacing.NORTH)
                                ||block.isFlammable(event.getWorld(),event.getPos(), EnumFacing.SOUTH)
                                ||block.isFlammable(event.getWorld(),event.getPos(), EnumFacing.WEST)
                                ||block.isFlammable(event.getWorld(),event.getPos(), EnumFacing.UP)
                                ))
                        {
                            event.getDrops().remove(dropItem);
                        }
                    }
                }
            }
        }
    }
}
