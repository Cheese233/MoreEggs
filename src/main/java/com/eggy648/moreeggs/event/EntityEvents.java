package com.eggy648.moreeggs.event;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


/**
 * Created by Cheese on 2017/2/24.
 * subscribe some events of Entities
 */
public class EntityEvents {
    @SubscribeEvent
    public void onEntityInteract(PlayerInteractEvent.EntityInteract event)
    {
        if(event.getEntityPlayer() instanceof EntityPlayerMP) {
            System.out.println("one player interact a Entity");
            EntityPlayer player = event.getEntityPlayer();
            if (player.isServerWorld() && event.getTarget() instanceof EntityPig && (!event.getTarget().isDead)){
                EntityPig pig = (EntityPig) event.getTarget();
                ItemStack stack = player.getHeldItem(event.getHand());
                if(event.getHand() == EnumHand.MAIN_HAND)
                player.addChatMessage(new TextComponentString("You interact a pig with " + stack.getItem().getRegistryName()));
                if ((stack != null && (stack.getItem() == Items.WHEAT || stack.getItem() == Items.WHEAT_SEEDS))) {
                    player.attackEntityFrom(new DamageSource("byPig").setDifficultyScaled().setExplosion(),
                            10.0F);
                    player.worldObj.createExplosion(player, pig.posX, pig.posY, pig.posZ, 2.0F, false);
                    pig.setDead();
                    player.addChatMessage(new TextComponentString("You fed the pig a bad food cause he is very angry " +
                            "and boom~"));
                }
            }
        }
    }
}
