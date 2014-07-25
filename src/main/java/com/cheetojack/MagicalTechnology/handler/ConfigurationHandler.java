package com.cheetojack.MagicalTechnology.handler;

import com.cheetojack.MagicalTechnology.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Jack on 7/24/2014.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        //Create the config object from given config file
        if(configuration == null) {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            //Re-sync configs

        }
    }

    public void loadConfiguration(){
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value!");

        if(configuration.hasChanged()){
            configuration.save();
        }
    }
}
