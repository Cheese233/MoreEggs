package com.eggy648.moreeggs.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Cheese on 2017/2/25.
 * add a potion protect fall damage
 */
public class PotionFallProtection extends Potion{

    private static final ResourceLocation res =
            new ResourceLocation("moreeggs:textures/gui/potion.png");

    /**
     * Called to draw the this Potion onto the player's inventory when it's active.
     * This can be used to e.g. render Potion icons from your own texture.
     *
     * @param x      the x coordinate
     * @param y      the y coordinate
     * @param effect the active PotionEffect
     * @param mc     the Minecraft instance, for convenience
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
        mc.getTextureManager().bindTexture(PotionFallProtection.res);
        mc.currentScreen.drawTexturedModalRect(x+6,y+7,0,0,18,18);
    }

    public PotionFallProtection() {
        super(false, 0x828282);

        this.setPotionName("potion.fallProtection");
        this.setRegistryName("moreeggs:fall_protection");
    }
}
