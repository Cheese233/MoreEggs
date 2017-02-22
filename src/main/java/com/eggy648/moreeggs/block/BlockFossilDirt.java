package com.eggy648.moreeggs.block;

import com.eggy648.moreeggs.common.EventLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public class BlockFossilDirt extends Block {
    public BlockFossilDirt() {
        super(Material.GOURD);
    }

    @Override
    public boolean onBlockActivated(World worldIn,
                                    BlockPos pos,
                                    IBlockState state,
                                    EntityPlayer playerIn,
                                    EnumHand hand,
                                    EnumFacing heldItem,
                                    float side,
                                    float hitX,
                                    float hitY) {
        EventLoader.PlayerRightClickFossilDirtEvent event =
                new EventLoader.PlayerRightClickFossilDirtEvent(playerIn, pos, worldIn);
        MinecraftForge.EVENT_BUS.post(event);

        /*
         * don't know why need add 0.5 to origin coordinate
         * may BlockPos define?
         * 2017-02-23
         *
         */
        if (!event.isCanceled()) {
            worldIn.setBlockToAir(pos);
            if (!worldIn.isRemote) {
                Entity tntEntity = new EntityTNTPrimed(worldIn, pos.getX()+0.5 , pos.getY()+0.5, pos.getZ()+0.5, null);
                worldIn.spawnEntityInWorld(tntEntity);
            }
            return true;
        }
        return false;
    }
}
