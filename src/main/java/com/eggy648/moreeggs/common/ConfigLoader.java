package com.eggy648.moreeggs.common;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


public class ConfigLoader {
    private static Configuration config;
    private static Logger logger;
    private static int diamondBurnTime;

    public ConfigLoader(FMLPreInitializationEvent event)
    {
        logger= event.getModLog();
        config=new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();

    }
    public static void load()
    {
        logger.info("Started load config");

        StringBuilder comment=new StringBuilder();
        comment.append("How many second can a diamond burn int a furnace.");

        diamondBurnTime=config.get(Configuration.CATEGORY_GENERAL,"diamondBurnTime",640,comment.toString()).getInt();

        config.save();
        logger.info("Finished load config");
    }
    public static Logger logger()
    {
        return logger;
    }
}
