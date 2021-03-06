package com.crafter6789.loztwiprincess.blocks;

import com.crafter6789.loztwiprincess.blocks.MSapling;
import com.crafter6789.loztwiprincess.blocks.MLeaves;
import com.crafter6789.loztwiprincess.blocks.MLog;
import com.crafter6789.loztwiprincess.blocks.ores.RPGrass;
import com.crafter6789.loztwiprincess.blocks.ores.RupeeOre;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MBlocksClass {
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block ShdwSteel;
	public static Block FeSteel;
	public static Block HyrlSteel;
	public static Block Ag;

	public static Block ShdwOre;
	public static Block AgOre;
	public static Block MasterOre;
	public static Block RupeeOre;
	
	public static Block RPGrass;
	
	public static Block TwiHyrulePortal;
	public static Block TwiHyrulePortalSupport;
	
	//public static Block BeechSapling;
	//public static Block BeechLog;
	//public static Block BeechLeaves;
	
	//public static Block SwordStand;

	public static void initializeBlock(){
		
		//Steel
		
		ShdwSteel = new MBlocksStone(Material.iron, 5.0f, 5.0f, "pickaxe", 0).setBlockName("ShdwSteel").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":ShdwBlock");
		FeSteel = new MBlocksStone(Material.iron, 5.0f, 5.0f, "pickaxe", 0).setBlockName("FeSteel").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":FeBlock");
		HyrlSteel = new MBlocksStone(Material.iron, 5.0f, 5.0f, "pickaxe", 0).setBlockName("HyrlSteel").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":HyrlBlock");
		Ag = new MBlocksStone(Material.iron, 5.0f, 5.0f, "pickaxe", 0).setBlockName("Ag").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":AgBlock");
		
		//Ore
		
		ShdwOre = new MOre("SOre", Material.rock, MItems.ShdwGem, 0, 1, 1).setHardness(5.0f).setResistance(5.0f).setBlockName("ShdwOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":oreShadow");
		AgOre = new MBlocksStone(Material.rock, 5.0f, 4.0f, "pickaxe", 0).setBlockName("AgOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":oreAg");
		MasterOre = new MBlocksStone(Material.rock, 20.0f, 40.0f, "pickaxe", 3).setBlockName("MasterOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":oreMaster");
		RupeeOre = new RupeeOre("RupeeOre", Material.rock).setBlockName("RupeeOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":oreRupee");
		
		//Rupee Grass
		
		RPGrass = new RPGrass("RPGrass", Material.grass).setBlockName("RPGrass").setCreativeTab(MCreativeTabs.tabItem).setBlockTextureName(RefStrings.MODID + ":RPGrass");
		
		//Portal
		
		TwiHyrulePortal = new TwiHyrulePortal();
		TwiHyrulePortalSupport = new MBlocksStone(Material.rock, 5.0f, 4.0f, "pickaxe", 0).setBlockName("TwiHyrulePortalSupport").setCreativeTab(MCreativeTabs.tabUtil).setBlockTextureName(RefStrings.MODID + ":TwiHyrulePortalSupport");
			
		//Woods
		
		//BeechSapling = new MSapling("BeechSapling");
		//BeechLog = new MLog("BeechLog");
		//BeechLeaves = new MLeaves("BeechLeaves");
		
		//TileEntities
		
		
		//SwordStand = new SwordStand().setBlockName("SwordStand").setCreativeTab(MCreativeTabs.tabBlock);
		
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(ShdwSteel, ShdwSteel.getUnlocalizedName());
		GameRegistry.registerBlock(Ag, Ag.getUnlocalizedName());
		GameRegistry.registerBlock(FeSteel, FeSteel.getUnlocalizedName());
		GameRegistry.registerBlock(HyrlSteel, HyrlSteel.getUnlocalizedName());
		
		GameRegistry.registerBlock(ShdwOre, ShdwOre.getUnlocalizedName());
		GameRegistry.registerBlock(AgOre, AgOre.getUnlocalizedName());
		GameRegistry.registerBlock(MasterOre, MasterOre.getUnlocalizedName());
		GameRegistry.registerBlock(RupeeOre, RupeeOre.getUnlocalizedName());
		
		GameRegistry.registerBlock(RPGrass, RPGrass.getUnlocalizedName());
		
		GameRegistry.registerBlock(TwiHyrulePortal, TwiHyrulePortal.getUnlocalizedName());
		GameRegistry.registerBlock(TwiHyrulePortalSupport, TwiHyrulePortalSupport.getUnlocalizedName());

		//GameRegistry.registerBlock(BeechSapling, BeechSapling.getUnlocalizedName());
		//GameRegistry.registerBlock(BeechLog, BeechLog.getUnlocalizedName());
		//GameRegistry.registerBlock(BeechLeaves, BeechLeaves.getUnlocalizedName());
		
		//GameRegistry.registerBlock(SwordStand, SwordStand.getUnlocalizedName());

		
	}
}
