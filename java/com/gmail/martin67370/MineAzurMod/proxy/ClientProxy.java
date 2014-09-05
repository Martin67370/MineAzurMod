package com.gmail.martin67370.MineAzurMod.proxy;

import com.gmail.martin67370.MineAzurMod.client.render.RenderChair;
import com.gmail.martin67370.MineAzurMod.client.render.RenderPlafond;
import com.gmail.martin67370.MineAzurMod.client.render.RenderTable;
import com.gmail.martin67370.MineAzurMod.client.render.RenderToit;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

;
	public static int renderTableId;
	public static int renderChairId;
	public static int renderPlafondId;
	public static int renderToitId;
	public static int renderInventoryTESRId;
	public static int renderInventoryTESR1;
	
@Override
public void registerRender()
{
	renderTableId = RenderingRegistry.getNextAvailableRenderId();
	RenderingRegistry.registerBlockHandler(renderTableId, new RenderTable());
	
	renderChairId = RenderingRegistry.getNextAvailableRenderId();
	RenderingRegistry.registerBlockHandler(renderChairId, new RenderChair());

	renderPlafondId = RenderingRegistry.getNextAvailableRenderId();
	RenderingRegistry.registerBlockHandler(renderPlafondId, new RenderPlafond());
	
	renderToitId = RenderingRegistry.getNextAvailableRenderId();
	RenderingRegistry.registerBlockHandler(renderToitId, new RenderToit());
	

    
}}
