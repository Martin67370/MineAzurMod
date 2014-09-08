package com.gmail.martin67370.MineAzurMod.client.render;

import org.lwjgl.opengl.GL11;

import com.gmail.martin67370.MineAzurMod.proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderChair implements ISimpleBlockRenderingHandler {

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		
		if(world.getBlockMetadata(x, y, z) == 3)
		    {
		    	//patte de chair            X     Z     Y   
		    	 renderer.setRenderBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.5F, 0.3F);
		    	 renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //sit chair
		         renderer.setRenderBounds(0.15F, 0.5F, 0.15F, 0.85F, 0.548F, 0.85F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //dossier chair
		         renderer.setRenderBounds(0.71F, 0.549F, 0.15F, 0.75F, 1.30F, 0.2F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.71F, 0.549F, 0.80F, 0.75F, 1.30F, 0.85F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         
		         renderer.setRenderBounds(0.71F, 1.0F, 0.2F, 0.75F, 1.20F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.71F, 0.8F, 0.2F, 0.75F, 0.9F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		     }
		         
		else if(world.getBlockMetadata(x, y, z) == 1)
		     {
		    	//patte de chair ouest
		    	 renderer.setRenderBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //sit chair
		         renderer.setRenderBounds(0.15F, 0.5F, 0.15F, 0.85F, 0.548F, 0.85F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //dossier chair
		         renderer.setRenderBounds(0.15F, 0.549F, 0.15F, 0.19F, 1.30F, 0.2F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.15F, 0.549F, 0.80F, 0.19F, 1.30F, 0.85F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         
		         renderer.setRenderBounds(0.15F, 1.0F, 0.2F, 0.19F, 1.20F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.15F, 0.8F, 0.2F, 0.19F, 0.9F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		     }
		     
		else if(world.getBlockMetadata(x, y, z) == 2)
		     {
		    	 //patte de chair sud
		    	 renderer.setRenderBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //sit chair
		         renderer.setRenderBounds(0.15F, 0.5F, 0.15F, 0.85F, 0.548F, 0.85F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //dossier chair
		         renderer.setRenderBounds(0.15F, 0.549F, 0.70F, 0.19F, 1.30F, 0.75F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.80F, 0.549F, 0.70F, 0.85F, 1.30F, 0.75F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         
		         renderer.setRenderBounds(0.19F, 1.0F, 0.7F, 0.799F, 1.20F, 0.75F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.19F, 0.8F, 0.7F, 0.799F, 0.9F, 0.75F);
		         renderer.renderStandardBlock(block, x, y, z);
		     }
		else if(world.getBlockMetadata(x, y, z) == 0)
		     {
		    	//patte de chair
		    	 renderer.setRenderBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.5F, 0.8F);
		         renderer.renderStandardBlock(block, x, y, z);
		         renderer.setRenderBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.5F, 0.3F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //sit chair
		         renderer.setRenderBounds(0.15F, 0.5F, 0.15F, 0.85F, 0.548F, 0.85F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         //dossier chair
		         renderer.setRenderBounds(0.8F, 0.549F, 0.15F, 0.85F, 1.30F, 0.2F);
		         renderer.renderStandardBlock(block, x, y, z);
		    	 
		         renderer.setRenderBounds(0.15F, 0.549F, 0.15F, 0.20F, 1.30F, 0.20F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.201F, 1.0F, 0.15F, 0.8F, 1.20F, 0.19F);
		         renderer.renderStandardBlock(block, x, y, z);
		         
		         renderer.setRenderBounds(0.201F, 0.8F, 0.15F, 0.8F, 0.9F, 0.19F);
		         renderer.renderStandardBlock(block, x, y, z);
		     }
		     
		
		
		
		
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {

		return true;
	}

	@Override
	public int getRenderId() {

		return ClientProxy.renderTableId;
	}

	 private void renderInInventory(Tessellator tessellator, RenderBlocks renderer, Block block, int metadata)
	    {
	    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
	    tessellator.startDrawingQuads();
	    tessellator.setNormal(0.0F, -1F, 0.0F);
	    renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(0, metadata));
	    tessellator.draw();
	    tessellator.startDrawingQuads();
	    tessellator.setNormal(0.0F, 1.0F, 0.0F);
	    renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(1, metadata));
	    tessellator.draw();
	    tessellator.startDrawingQuads();
	    tessellator.setNormal(0.0F, 0.0F, -1F);
	    renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(2, metadata));
	    tessellator.draw();
	    tessellator.startDrawingQuads();
	    tessellator.setNormal(0.0F, 0.0F, 1.0F);
	    renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(3, metadata));
	    tessellator.draw();
	    tessellator.startDrawingQuads();
	    tessellator.setNormal(-1F, 0.0F, 0.0F);
	    renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(4, metadata));
	    tessellator.draw();
	    tessellator.startDrawingQuads();
	    tessellator.setNormal(1.0F, 0.0F, 0.0F);
	    renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(5, metadata));
	    tessellator.draw();
	    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	    
	    
	    
	    
	    
	    }
    
    
    
    
    
    

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,
			RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}
}

