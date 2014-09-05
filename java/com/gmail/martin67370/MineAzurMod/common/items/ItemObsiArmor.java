package com.gmail.martin67370.MineAzurMod.common.items;



import com.gmail.martin67370.MineAzurMod.common.MineAzurMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemObsiArmor extends ItemArmor
{

	public ItemObsiArmor(ArmorMaterial material, int type)
	{
		super(material, 0, type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		   if(slot == 2)
		   {
			   return MineAzurMod.MODID + ":textures/models/armor/obsi_layer_2.png";
		   }
		   return MineAzurMod.MODID + ":textures/models/armor/obsi_layer_1.png";
	}
	
	
	
}
