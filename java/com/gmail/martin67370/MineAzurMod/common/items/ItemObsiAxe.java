package com.gmail.martin67370.MineAzurMod.common.items;

import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemObsiAxe extends ItemAxe
{
public ItemObsiAxe(ToolMaterial material)
{
super(material);
}
public boolean getIsRepairable(ItemStack input, ItemStack repair)
{
if(repair.getItem() == MineAzurMod.axeObsi)
{
return true;
}
return false;
}
}