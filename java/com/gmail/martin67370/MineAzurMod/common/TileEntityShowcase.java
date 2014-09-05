package com.gmail.martin67370.MineAzurMod.common;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityShowcase extends TileEntity {


	 private int number;
	 private String owner = new String();

	@Override
	 public void readFromNBT(NBTTagCompound compound)
	 {
	 super.readFromNBT(compound);
	 this.number = compound.getInteger("Number"); // pour lire sa valeur depuis la sauvegarde du monde lorsqu'on charge le chunk qui contient l'entité de bloc
	 this.owner = compound.getString("owner");
	 }

	 @Override
	 public void writeToNBT(NBTTagCompound compound)
	 {
	 super.writeToNBT(compound);
	 compound.setInteger("Number", this.number); // pour enregistrer sa valeur dans la sauvegarde du monde lorsqu'on décharge le chunk qui contient l'entité de bloc
	 compound.setString("owner", this.owner);
	 }
	 
	public String getInventoryName() 
	 {
	 return "Etal de "+owner;
	 }
	 public void increase() // une fonction pour augmenter sa valeur
	 {
	 this.number++;
	 }

	 public void decrease() // une fonction pour diminuer sa valeur
	 {
	 this.number--;
	 }

	 public int getNumber() // et une fonction pour obtenir sa valeur (on appelle ça un getter)
	 {
	 return number;
	 }
	 }
