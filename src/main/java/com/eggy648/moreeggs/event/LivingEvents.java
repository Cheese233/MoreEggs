package com.eggy648.moreeggs.event;

import com.eggy648.moreeggs.common.EventLoader;
import com.eggy648.moreeggs.potion.PotionLoader;
import com.sun.org.glassfish.gmbal.IncludeSubclass;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Cheese on 2017/2/22.
 * subscribe events of livingEntities
 */
public class LivingEvents {


    @SubscribeEvent(priority = EventPriority.HIGH)
    public void entityFall(LivingFallEvent event) {
        if ((event.getEntityLiving() instanceof EntityPlayerMP)) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            player.addChatMessage(new TextComponentString("You fell " + event.getDistance() + " meters don't worry,i can protect you!"));

            event.setCanceled(true);
            event.setResult(Event.Result.DENY);
        }

    }

    @SubscribeEvent(priority = EventPriority.LOW, receiveCanceled = true)
    public void entityFall_(LivingFallEvent event) {
        if ((event.getEntity() instanceof EntityPlayerMP)) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            player.addChatMessage(new TextComponentString("You fell, the RESULT is " + event.getResult().toString() + ". do you think it can protect you? fuck^&!&%@*#"));

            event.setCanceled(false);
        }
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if (event.getSource().getDamageType().equals("fall")) {
            PotionEffect effect = event.getEntityLiving().getActivePotionEffect(PotionLoader.potionFallProtection);
            if (effect != null) {
                if (effect.getAmplifier() >= 0) {
                    event.setAmount(event.getAmount() / (effect.getAmplifier() + 2));
                    if (event.getEntityLiving() instanceof EntityPlayerMP) {
                        event.getEntityLiving().addChatMessage(
                                new TextComponentString("you fell and <fall protection> play a role ")
                        );
                    }

                }
            }

        }
    }


}
