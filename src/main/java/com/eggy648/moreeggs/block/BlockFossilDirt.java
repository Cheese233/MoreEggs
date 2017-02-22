package com.eggy648.moreeggs.block;

import com.eggy648.moreeggs.common.EventLoader;
import com.eggy648.moreeggs.moreeggs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
        EventLoader.PlayerRightClickFossilDirtEvent event;
        event=new EventLoader.PlayerRightClickFossilDirtEvent(playerIn,pos,worldIn);
        EventLoader.EVENT_BUS.post(event);
        if(!event.isCanceled())
        {
            worldIn.setBlockToAir(pos);
            return true;
        }
        return false;
    }
}
