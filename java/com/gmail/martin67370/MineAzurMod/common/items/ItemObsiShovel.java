package com.gmail.martin67370.MineAzurMod.common.items;

import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemObsiShovel extends ItemSword
{
public ItemObsiShovel(ToolMaterial material)
{
super(material);
}
public boolean getIsRepairable(ItemStack input, ItemStack repair)
{
if(repair.getItem() == MineAzurMod.shovelObsi)
{
return true;
}
return false;
}
}
	

