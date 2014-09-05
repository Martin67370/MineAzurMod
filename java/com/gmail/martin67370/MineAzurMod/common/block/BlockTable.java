package com.gmail.martin67370.MineAzurMod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

import com.gmail.martin67370.MineAzurMod.proxy.ClientProxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTable extends Block 
{

	public BlockTable(Material material)
	{
		super(material);
			
	}
	 
	public boolean renderAsNormalBlock()
	{
			return false;
	}
	
    public boolean isOpaqueCube()
    {
    		return false;
    }
    
	@SideOnly(Side.CLIENT)
	public int getRenderType()
	{
			return ClientProxy.renderTableId;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
	{
			return true;
	}

	
	
	
}

