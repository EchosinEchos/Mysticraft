package com.EchosinEchos.Mysticraft.blocks;

import com.EchosinEchos.Mysticraft.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Enchanter extends Block{

	private static String name = "enchanter";
	
	protected Enchanter() {
		super(Material.anvil);
		GameRegistry.registerBlock(this, name);
		this.setBlockName(name);
		this.setCreativeTab(Main.MysticraftTab);
		this.setBlockTextureName(Main.MODID + ":" + name);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeAnvil);
		this.setResistance(6000.0F);
	}



}

