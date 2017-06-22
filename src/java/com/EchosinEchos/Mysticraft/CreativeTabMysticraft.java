package com.EchosinEchos.Mysticraft;

import com.EchosinEchos.Mysticraft.items.ModsItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMysticraft extends CreativeTabs {

	
public CreativeTabMysticraft(String label) {
		super(label);
	}

@Override
	public Item getTabIconItem(){
		return ModsItems.mystiblockItem;
	}
	
}
