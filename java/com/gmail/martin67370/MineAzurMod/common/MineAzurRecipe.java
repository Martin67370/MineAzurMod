package com.gmail.martin67370.MineAzurMod.common;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MineAzurRecipe {

	
	public static void InitCommonRecipes()
{

		//Craft
		
			//Blocks
		
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.blockLanterne), new Object[]{"BGB", "GTG", "BGB", 'B', Items.iron_ingot, 'T', Blocks.torch, 'G', Blocks.glass_pane,});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.blockPlafond), new Object[]{"PPP", 'P', Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.blockTable), new Object[]{"PPP", "F", "F", 'P', MineAzurMod.blockPlafond, 'F', Blocks.fence});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.blockToit), new Object[]{"B  ", "BB ", "BBB", 'B', MineAzurMod.blockBoisVernis});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.blockToit), new Object[]{"  B", " BB", "BBB", 'B', MineAzurMod.blockBoisVernis});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.blockBoisVernis), new Object[]{"V", "B", 'V', MineAzurMod.vernis, 'B', Blocks.planks});
		
			//Items
		
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.vernis), new Object[]{"C", "B", 'C', Blocks.cactus, 'B', Items.glass_bottle});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.mayo), new Object[]{"OMO", "GGG", 'O', Items.egg, 'M', Items.milk_bucket, 'G', Blocks.glass});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.farine), new Object[]{"W", 'W', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.sandwich), new Object[]{"PV ", "VMV", " VP", 'P', Items.bread, 'V', Items.porkchop, 'M', MineAzurMod.mayo});
		//GameRegistry.addRecipe(new ItemStack(MineAzurMod.bierre), new Object[]{"E", "W", "C", 'E', Items.water_bottle})
		
					//Outils
		
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.pickaxeObsi), new Object[]{"OOO", " S ", " S ", 'O', MineAzurMod.ingotObsi, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.swordObsi), new Object[]{" O ", " O ", " S ", 'O', MineAzurMod.ingotObsi, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.axeObsi), new Object[]{"OO ", "OS ", " S ", 'O', MineAzurMod.ingotObsi, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.axeObsi), new Object[]{" OO", " SO", " S ", 'O', MineAzurMod.ingotObsi, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.shovelObsi), new Object[]{" O ", " S ", " S ", 'O', MineAzurMod.ingotObsi, 'S', Items.stick});
		
		
					//Armure
		
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.helmetObsi), new Object[]{"OOO", "O O", 'O', MineAzurMod.ingotObsi});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.chestPlateObsi), new Object[]{"O O", "OOO", "OOO", 'O', MineAzurMod.ingotObsi});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.leggingsObsi), new Object[]{"OOO", "O O", "O O", 'O', MineAzurMod.ingotObsi});
		GameRegistry.addRecipe(new ItemStack(MineAzurMod.bootsObsi), new Object[]{"O O", "O O", 'O', MineAzurMod.ingotObsi});
		
		
		//Smelting
		

		
		GameRegistry.addSmelting(Blocks.obsidian,new ItemStack(MineAzurMod.ingotObsi), 55);
		
	
}
}