package com.gmail.martin67370.MineAzurMod.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class MineAzurCreativeTabs extends CreativeTabs
{

public MineAzurCreativeTabs(String label)
{
super(label);

}
@Override
public ItemStack getIconItemStack()
{
return new ItemStack(MineAzurMod.logo);
}
@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem() {
	// TODO Auto-generated method stub
	return null;
}
 


}
 