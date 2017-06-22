package com.EchosinEchos.Mysticraft;

import com.EchosinEchos.Mysticraft.blocks.ModsBlocks;
import com.EchosinEchos.Mysticraft.gui.GUIHandler;
import com.EchosinEchos.Mysticraft.items.ModsItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {
	

    public void preInit(FMLPreInitializationEvent e) {
    	
    	ModsBlocks.init();
    	System.out.println("Blocks Succefully Initialized");
    	ModsItems.init();
    	System.out.println("Item Initialized");

    }

    public void init(FMLInitializationEvent e) {
    	
    	Crafting.init();
    	System.out.println("Craft Succefully Added");
    	NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GUIHandler());
    	
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
    
}