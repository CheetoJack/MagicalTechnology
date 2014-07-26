/*
* Logofile in mcmod.info = 256x256
*/
package com.cheetojack.MagicalTechnology;

import com.cheetojack.MagicalTechnology.handler.ConfigurationHandler;
import com.cheetojack.MagicalTechnology.init.ModItems;
import com.cheetojack.MagicalTechnology.proxy.IProxy;
import com.cheetojack.MagicalTechnology.reference.Reference;
import com.cheetojack.MagicalTechnology.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MagicalTechnology {

    @Mod.Instance(Reference.MOD_ID) //Will not change ever. Its yours forever. Like Diamonds. Diamonds are forever.
    public static MagicalTechnology instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) { //Pre-initialization, used for configs
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info(("Pre-initialization Complete!"));

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info(("Initialization Complete!"));
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) { //Wraps stuff up, runs after other mods init.

        LogHelper.info(("Post-initialization Complete!"));
    }
}
