package com.EchosinEchos.Mysticraft.blocks;

import net.minecraft.block.Block;

public final class ModsBlocks {

		public static Block mystiblock;	
		public static Block enchanter;
	
	    public static final void init() {
	    	
	    	mystiblock = new Mystiblock();
	    	enchanter = new Enchanter();
	    	
	    }
	    
}
