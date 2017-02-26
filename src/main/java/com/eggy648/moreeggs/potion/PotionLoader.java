package com.eggy648.moreeggs.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Cheese on 2017/2/25.
 * load potions
 */
public class PotionLoader {
    public static Potion potionFallProtection;
    public PotionLoader()
    {
        potionFallProtection=new PotionFallProtection();
        GameRegistry.register(potionFallProtection);
    }
}
