package com.eggy648.moreeggs.common;

import com.eggy648.moreeggs.event.BlockEvents;
import com.eggy648.moreeggs.event.LivingEvents;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.EventBus;

/**
 * Created by Cheese on 2017/2/22.
 * Define & Manage Minecraft Events
 */
public class EventLoader {
    public static final EventBus EVENT_BUS= new EventBus();
    public EventLoader() {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new LivingEvents());
        MinecraftForge.EVENT_BUS.register(new BlockEvents());
    }

    @Cancelable
    public static class PlayerRightClickFossilDirtEvent extends PlayerEvent {

        public final BlockPos pos;
        public final World world;

        public PlayerRightClickFossilDirtEvent(EntityPlayer player, BlockPos pos, World world) {
            super(player);
            this.pos = pos;
            this.world = world;
        }
    }
}
