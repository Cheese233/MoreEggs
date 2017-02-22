package com.eggy648.moreeggs.event;

import com.google.common.eventbus.Subscribe;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingFallEvent;

/**
 * Created by Cheese on 2017/2/22.
 * add events about livingEntities
 */
public class LivingEvents {

    @Subscribe
    public void entityFall(LivingFallEvent event)
    {
        if(event.getEntityLiving() instanceof EntityPlayer)
        {
            EntityPlayer player=(EntityPlayer)event.getEntityLiving();
            player.addChatMessage(new TextComponentString("You fell "+event.getDistance()+"meters, don't you think ache?"));


        }

    }
}
