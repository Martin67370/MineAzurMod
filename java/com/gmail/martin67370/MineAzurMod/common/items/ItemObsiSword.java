package com.gmail.martin67370.MineAzurMod.common.items;

import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemObsiSword extends ItemSword
{
public ItemObsiSword(ToolMaterial material)
{
super(material);
}
public boolean getIsRepairable(ItemStack input, ItemStack repair)
{
if(repair.getItem() == MineAzurMod.swordObsi)
{
return true;
}
return false;
}
}