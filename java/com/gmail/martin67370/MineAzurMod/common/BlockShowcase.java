package com.gmail.martin67370.MineAzurMod.common;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class BlockShowcase extends Block {
	
	public BlockShowcase(Material wood) {
		super(wood);
	}
	@Override
	public boolean hasTileEntity(int metadata)
	{
	return true; // signale que le bloc a une entité
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
	return new TileEntityShowcase(); // indique quelle est l'entité de bloc
	}

}
	
