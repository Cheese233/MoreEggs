package com.eggy648.moreeggs.event;

import com.eggy648.moreeggs.client.KeyLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.text.SimpleDateFormat;

/**
 * Created by Cheese on 2017/2/25.
 * listen key down
 */
public class KeyEvents {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public  void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if(KeyLoader.showTime.isPressed())
        {
            EntityPlayer player= Minecraft.getMinecraft().thePlayer;
            World world=Minecraft.getMinecraft().theWorld;
            player.addChatMessage(new TextComponentString("The Game World Time is "
                    +world.getTotalWorldTime()+" Ticks"));
            player.addChatMessage(new TextComponentString("The System Time is "+
                    new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(System.currentTimeMillis())
            ));
        }
    }
}
