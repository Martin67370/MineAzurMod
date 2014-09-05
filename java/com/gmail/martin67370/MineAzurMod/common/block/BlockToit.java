package com.gmail.martin67370.MineAzurMod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.gmail.martin67370.MineAzurMod.proxy.ClientProxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockToit extends Block 
{

	public BlockToit(Material material)
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
			return ClientProxy.renderToitId;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
	{
			return true;
	}

	 public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
	 {
	 int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
	 world.setBlockMetadataWithNotify(x, y, z, direction, 2);
	 }
	
	
}

