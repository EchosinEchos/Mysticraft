package com.EchosinEchos.Mysticraft.tileEntitys;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;

public class TEEnchanter extends Container {

	private TileEntity te;
	
	
    public TEEnchanter(IInventory playerInv, ModTileEntity te) {
        this.te = te;
    }
	
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.te.isUseableByPlayer(player);
	}

}
