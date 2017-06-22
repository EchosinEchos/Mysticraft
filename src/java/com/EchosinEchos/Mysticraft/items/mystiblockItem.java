package com.EchosinEchos.Mysticraft.items;

import com.EchosinEchos.Mysticraft.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class mystiblockItem extends Item {

	private String name = "mystiblockItem";
	
	Item mystiblockItem = new Item();
	public mystiblockItem(){
		GameRegistry.registerItem(this, name);
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" + name);
		this.setMaxStackSize(1);
		this.setCreativeTab(Main.MysticraftTab);
		
	}
	
}
