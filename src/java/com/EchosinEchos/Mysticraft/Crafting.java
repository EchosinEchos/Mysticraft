package com.EchosinEchos.Mysticraft;

import com.EchosinEchos.Mysticraft.items.ModsItems;
import com.EchosinEchos.Mysticraft.blocks.ModsBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {
public static final void init(){
	
		GameRegistry.addRecipe(new ItemStack(ModsItems.mystiblockItem),"#E0","GOG","8B8",'#',Blocks.brewing_stand,'0',Blocks.cauldron,'G',Blocks.glass,'E',Items.ender_eye,'O',Items.nether_star,'8',Blocks.enchanting_table,'B',Blocks.beacon);
		GameRegistry.addRecipe(new ItemStack(ModsItems.mystiblockItem),"0E#","GOG","8B8",'#',Items.brewing_stand,'0',Items.cauldron,'G',Blocks.glass,'E',Items.ender_eye,'O',Items.nether_star,'8',Blocks.enchanting_table,'B',Blocks.beacon);
		GameRegistry.addRecipe(new ItemStack(ModsBlocks.enchanter)," P ","8O8","0#0",'#',Blocks.anvil,'0',Blocks.enchanting_table,'P',Blocks.piston,'O',Items.book,'8',Items.enchanted_book);
	}

}
