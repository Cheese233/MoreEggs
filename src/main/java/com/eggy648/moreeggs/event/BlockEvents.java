package com.eggy648.moreeggs.event;

import com.eggy648.moreeggs.common.EventLoader;
import com.eggy648.moreeggs.item.ItemLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
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

            player.addChatMessage(new TextComponentString("You right clicked a fossild block, and you find a " +
                    ItemLoader.dirtEgg.getUnlocalizedName() + " in it. It looks will boom! run away quickly!"));
        }

    }
}
