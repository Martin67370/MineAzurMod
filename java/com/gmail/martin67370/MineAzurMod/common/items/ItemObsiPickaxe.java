package com.gmail.martin67370.MineAzurMod.common.items;

import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemObsiPickaxe extends ItemPickaxe
{
public ItemObsiPickaxe(ToolMaterial material)
{
super(material);
}
public boolean getIsRepairable(ItemStack input, ItemStack repair)
{
if(repair.getItem() == MineAzurMod.pickaxeObsi)
{
return true;
}
return false;
}
}