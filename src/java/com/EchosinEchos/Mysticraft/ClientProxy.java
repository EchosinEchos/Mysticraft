package com.EchosinEchos.Mysticraft;

import com.EchosinEchos.Mysticraft.tileEntitys.TEMystiblock;
import com.EchosinEchos.Mysticraft.tileEntitys.TESRMystiblock;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{


    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ClientRegistry.bindTileEntitySpecialRenderer(TEMystiblock.class, new TESRMystiblock());
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
	
}
