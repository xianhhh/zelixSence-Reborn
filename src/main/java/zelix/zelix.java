package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import zelix.module.ModuleManager;

import java.awt.event.KeyEvent;

@Mod(modid = zelix.MODID, name =zelix.NAME, version = zelix.VERSION)
public class zelix
{
    public static final String MODID = "zelix";
    public static final String NAME = "zelix-reborn";

    public static final String VERSION = "1.0";
    private static final String VERSIONT = "b1";

    private static Logger logger;

    public static ModuleManager moduleManager;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Display.setTitle(MODID+ " | " + NAME + " | " + VERSIONT);
        moduleManager = new ModuleManager();
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        moduleManager.register();
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
