package com.EchosinEchos.Mysticraft.blocks;

import com.EchosinEchos.Mysticraft.Main;
import com.EchosinEchos.Mysticraft.tileEntitys.TEMystiblock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Mystiblock extends BlockContainer{
	
	private static final String name = "mystiblock";
	
	protected Mystiblock() {
		super(Material.glass);
		GameRegistry.registerBlock(this,"mystiblock");
        this.setBlockName(name);
        //this.setBlockTextureName(Main.MODID + ":" + name);
        this.setCreativeTab(Main.MysticraftTab);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(7.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeGlass);
	}

	
	@Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
        return false;
    }
 
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
 
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
 
    @Override
    public TileEntity createNewTileEntity(World world, int par2)
    {
        return new TEMystiblock();
    }
	
}