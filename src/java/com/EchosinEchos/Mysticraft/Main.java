package com.EchosinEchos.Mysticraft;
import com.EchosinEchos.Mysticraft.CreativeTabMysticraft;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)


public class Main {
	
	public static CreativeTabs MysticraftTab = new CreativeTabMysticraft("Mysticraft");
	@SidedProxy(clientSide="com.EchosinEchos.Mysticraft.ClientProxy", serverSide="com.EchosinEchos.Mysticraft.ServerProxy")
	public static CommonProxy proxy;

    public static final String MODID = "mysticraft";
    public static final String MODNAME = "Mysticraft";
    public static final String VERSION = "1.0.0";
        
    @Instance
    public static Main instance = new Main();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}