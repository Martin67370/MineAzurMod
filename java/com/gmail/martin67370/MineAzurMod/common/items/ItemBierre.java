package com.gmail.martin67370.MineAzurMod.common.items;

import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBierre extends ItemFood {


public ItemBierre(int gigot, float saturation, boolean wolf) {
super(gigot, saturation, wolf);
	}

public EnumAction getItemUseAction(ItemStack par1ItemStack)
{
return EnumAction.drink;


}
public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
	if (!par3EntityPlayer.capabilities.isCreativeMode)
	{
	    if (par1ItemStack.stackSize <= 0)
	    {
	        return new ItemStack(MineAzurMod.choppe);
	    }

	    par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(MineAzurMod.choppe));
	   
	}

	return par1ItemStack;
	
	
}






}
