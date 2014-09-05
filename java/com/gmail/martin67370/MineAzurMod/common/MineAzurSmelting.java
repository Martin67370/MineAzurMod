package com.gmail.martin67370.MineAzurMod.common;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MineAzurSmelting {

	
	
	
	public static void InitCommonSmelting()
{

		//Smelting
		

		
		GameRegistry.addSmelting(Blocks.obsidian,new ItemStack(MineAzurMod.ingotObsi), 55);
		
	
}
}