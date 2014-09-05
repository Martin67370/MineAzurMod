package com.gmail.martin67370.MineAzurMod.common;

import net.minecraft.block.Block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

import com.gmail.martin67370.MineAzurMod.common.block.BlockBoisVernie;
import com.gmail.martin67370.MineAzurMod.common.block.BlockChair;
import com.gmail.martin67370.MineAzurMod.common.block.BlockLanterne;
import com.gmail.martin67370.MineAzurMod.common.block.BlockPlafond;
import com.gmail.martin67370.MineAzurMod.common.block.BlockTable;
import com.gmail.martin67370.MineAzurMod.common.block.BlockToit;
import com.gmail.martin67370.MineAzurMod.common.items.ItemBierre;
import com.gmail.martin67370.MineAzurMod.common.items.ItemObsiArmor;
import com.gmail.martin67370.MineAzurMod.common.items.ItemObsiAxe;
import com.gmail.martin67370.MineAzurMod.common.items.ItemObsiHoe;
import com.gmail.martin67370.MineAzurMod.common.items.ItemObsiPickaxe;
import com.gmail.martin67370.MineAzurMod.common.items.ItemObsiShovel;
import com.gmail.martin67370.MineAzurMod.common.items.ItemObsiSword;
import com.gmail.martin67370.MineAzurMod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import  net.minecraftforge.common.util.EnumHelper;
@Mod(modid = "mineazurmod", name = "MineAzur Mod", version = "1.0.0")

public class MineAzurMod
{
	@Instance("mineazurmod")
	public static MineAzurMod instance;
	

    public static final String MODID = "mineazurmod";
	
    @SidedProxy (clientSide = "com.gmail.martin67370.MineAzurMod.proxy.ClientProxy", serverSide = "com.gmail.martin67370.MineAzurMod.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static CreativeTabs MineAzurTabs = new MineAzurCreativeTabs("MineAzurCreativeTabs");
    
    //Variable block
    
    public static Block blockLanterne, blockTable, blockChair, blockPlafond, blockToit, blockTuto, blockBoisVernis, blockBasalt, blockCobbleBasalt;
    
    //Variable items
    
    public static Item helmetObsi, chestPlateObsi, leggingsObsi, bootsObsi, ingotObsi, swordObsi, pickaxeObsi, axeObsi, shovelObsi, hoeObsi, vernis, logo;
    public static Item pizza, mayo, sandwich, bierre, choppe, farine, assurance;
    
    public static Block BlockTutorialStairs, blockShowcase;
    
    public static ArmorMaterial armorObsi = EnumHelper.addArmorMaterial("armorObsi", 25, new int[] {5, 6, 6, 5}, 30);
    public static ToolMaterial toolObsi = EnumHelper.addToolMaterial("toolObsi", 3, 2000, 12.0F, 4.0F, 18);
    
    
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		/**
	     * Block
	     */
		
		blockLanterne = new BlockLanterne(Material.glass).setBlockName("lanterne").setBlockTextureName(MODID +":block_lanterne").setHardness(0.3F).setLightLevel(1.0F).setCreativeTab(MineAzurMod.MineAzurTabs);
		blockTable = new BlockTable(Material.wood).setBlockName("table").setBlockTextureName(MODID + ":block_table").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs);
		blockChair = new BlockChair(Material.wood).setBlockName("chair").setBlockTextureName(MODID + ":block_chair").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs) ;
		blockPlafond = new BlockPlafond(Material.wood).setBlockName("plafond").setBlockTextureName(MODID + ":block_plafond").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs) ;
		blockToit = new BlockToit(Material.wood).setBlockName("toit").setBlockTextureName(MODID + ":block_toit").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs);
		blockBoisVernis = new BlockBoisVernie(Material.wood).setBlockName("bois_vernis").setBlockTextureName(MODID +":block_bois_vernis").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs);
		blockShowcase = new BlockShowcase(Material.wood).setBlockName("showcase").setBlockTextureName(MODID +":block_showcase").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs);
		
		BlockTutorialStairs = new BlockTutorialStairs(MineAzurMod.blockBoisVernis, 0).setBlockName("BlockTutorialStairs").setBlockTextureName(MODID +":block_bois_vernis").setHardness(0.5F).setCreativeTab(MineAzurMod.MineAzurTabs);
		/**
	     * items
	     */
		
		pizza = new ItemFood(10, false).setUnlocalizedName("pizza").setCreativeTab(MineAzurMod.MineAzurTabs).setTextureName(MODID + ":items_pizza");
		helmetObsi = new ItemObsiArmor(armorObsi, 0).setUnlocalizedName("helmetObsi").setTextureName(MODID + ":items_helmet_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		chestPlateObsi = new ItemObsiArmor(armorObsi, 1).setUnlocalizedName("chestPlateObsi").setTextureName(MODID + ":items_chestplate_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		leggingsObsi = new ItemObsiArmor(armorObsi, 2).setUnlocalizedName("leggingsObsi").setTextureName(MODID + ":items_leggings_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		bootsObsi = new ItemObsiArmor(armorObsi, 3).setUnlocalizedName("bootsObsi").setTextureName(MODID + ":items_boots_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		ingotObsi = new Item().setUnlocalizedName("ingotObsi").setTextureName(MODID + ":items_ingot_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		swordObsi = new ItemObsiSword(toolObsi).setUnlocalizedName("swordObsi").setTextureName(MODID + ":items_sword_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		pickaxeObsi = new ItemObsiPickaxe(toolObsi).setUnlocalizedName("pickaxeObsi").setTextureName(MODID + ":items_pickaxe_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		axeObsi = new ItemObsiAxe(toolObsi).setUnlocalizedName("axeObsi").setTextureName(MODID + ":items_axe_obsi").setCreativeTab(MineAzurMod.MineAzurTabs);
		shovelObsi = new ItemObsiShovel(toolObsi).setUnlocalizedName("shovelObsi").setTextureName(MODID + ":items_shovel_obsi").setCreativeTab(MineAzurMod.MineAzurTabs) ;
		hoeObsi = new ItemObsiHoe(toolObsi).setUnlocalizedName("hoeObsi").setTextureName(MODID + ":items_hoe_obsi").setCreativeTab(MineAzurMod.MineAzurTabs) ;
		vernis = new Item().setUnlocalizedName("vernis").setTextureName(MODID + ":items_vernis").setCreativeTab(MineAzurMod.MineAzurTabs);
		mayo = new ItemFood(5, false).setPotionEffect(2, 5, 5, 1F).setUnlocalizedName("mayo").setTextureName(MODID + ":items_mayo").setCreativeTab(MineAzurMod.MineAzurTabs);
		logo = new Item().setUnlocalizedName("logo").setTextureName(MODID + ":items_logo").setCreativeTab(MineAzurMod.MineAzurTabs);
		sandwich = new ItemFood(10, false).setUnlocalizedName("sandwich").setTextureName(MODID + ":items_sandwich").setCreativeTab(MineAzurMod.MineAzurTabs);
		bierre = new ItemBierre(4, 2, false).setPotionEffect(9, 10, 10, 1F).setUnlocalizedName("bierre").setTextureName(MODID + ":items_choppe_bierre").setCreativeTab(MineAzurMod.MineAzurTabs);
		choppe = new Item().setUnlocalizedName("choppe").setTextureName(MODID + ":items_choppe").setCreativeTab(MineAzurMod.MineAzurTabs);
		farine = new ItemFood(1, false).setUnlocalizedName("farine").setTextureName(MODID + ":items_farine").setCreativeTab(MineAzurMod.MineAzurTabs);
		assurance = new Item().setUnlocalizedName("assurance").setTextureName(MODID + ":items_assurance").setCreativeTab(MineAzurMod.MineAzurTabs);
		
		//Blocks
		GameRegistry.registerBlock(blockPlafond, "plafond");
		GameRegistry.registerBlock(blockToit, "toit");
		GameRegistry.registerBlock(blockLanterne, "lanterne");
		GameRegistry.registerBlock(blockTable, "table");
		GameRegistry.registerBlock(blockChair, "chair");
		GameRegistry.registerBlock(blockBoisVernis, "bois_vernie");
		GameRegistry.registerBlock(blockShowcase, "bois_showcase");
		
		
		//Items
		
			//Nouriture
		
		GameRegistry.registerItem(pizza, "pizza");
		GameRegistry.registerItem(sandwich, "sandwich");
		GameRegistry.registerItem(bierre, "bierre");
		GameRegistry.registerItem(farine, "farine");
		
		
			//Armure
		
		GameRegistry.registerItem(helmetObsi, "helmetObsi");
		GameRegistry.registerItem(chestPlateObsi, "chestPlateObsi");
		GameRegistry.registerItem(leggingsObsi, "leggingsObsi");
		GameRegistry.registerItem(bootsObsi, "bootsObsi");
		
			//Outils
	
		GameRegistry.registerItem(swordObsi, "swordObsi");
		GameRegistry.registerItem(pickaxeObsi, "pickaxeObsi");
		GameRegistry.registerItem(axeObsi, "axeObsi");
		GameRegistry.registerItem(shovelObsi, "shovelObsi");
		GameRegistry.registerItem(hoeObsi, "hoeObsi");
		
		//Autres
		
		
		GameRegistry.registerItem(ingotObsi, "ingotObsi");
		GameRegistry.registerItem(logo, "logo");
		GameRegistry.registerItem(vernis, "vernis");
		GameRegistry.registerItem(mayo, "mayo");
		GameRegistry.registerItem(choppe, "choppe");
		GameRegistry.registerItem(assurance, "assurance");
		
		
		
		
		
		GameRegistry.registerTileEntity(TileEntityShowcase.class, "mineazurmod:showcase");
	    GameRegistry.registerBlock(BlockTutorialStairs, "BlockTutorialStairs");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRender();
		proxy.registerTileEntityRender();
		
		
		
		MineAzurRecipe.InitCommonRecipes();
		MineAzurSmelting.InitCommonSmelting();
		


	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
	
	
	
	
	
}