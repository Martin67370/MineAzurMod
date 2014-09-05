package com.gmail.martin67370.MineAzurMod.common.items;

import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemObsiHoe extends ItemHoe
{
public ItemObsiHoe(ToolMaterial material)
{
super(material);
}
public boolean getIsRepairable(ItemStack input, ItemStack repair)
{
if(repair.getItem() == MineAzurMod.hoeObsi)
{
return true;
}
return false;
}
}