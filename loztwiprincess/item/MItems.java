package com.crafter6789.loztwiprincess.item;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {



	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	//ToolArmorMaterial
	public static ToolMaterial HyrlToolMaterial = EnumHelper.addToolMaterial("HyrlToolMaterial", 2, 420, 10.0f, 2.5f, 10);
	public static ToolMaterial ShdwToolMaterial = EnumHelper.addToolMaterial("ShdwToolMaterial", 2, 420, 10.0f, 2.5f, 10);
	public static ToolMaterial MasterToolMaterial = EnumHelper.addToolMaterial("MasterToolMaterial", 4, -1, 14.0f, 3.5f, 23);
	public static ToolMaterial NewMasterToolMaterial = EnumHelper.addToolMaterial("NewMasterToolMaterial", 4, -1, 18.0f, 5.5f, 23);
	public static ToolMaterial WoodShieldToolMaterial = EnumHelper.addToolMaterial("WoodShieldToolMaterial", 1, 130, 0.5f, -4.0f, 10);	
	public static ToolMaterial HylianShieldToolMaterial = EnumHelper.addToolMaterial("HylianShieldToolMaterial", 4, -1, 0.5f, -4.0f, 23);	
	
	public static ArmorMaterial HyrlNormArmorMaterial = EnumHelper.addArmorMaterial("HyrlNormArmorMaterial", 19, new int[]{3, 5, 4, 3}, 12);
	public static ArmorMaterial ShdwNormArmorMaterial = EnumHelper.addArmorMaterial("ShdwNormArmorMaterial", 19, new int[]{3, 5, 4, 3}, 12);
	
	public static ArmorMaterial GoranTunicMaterial = EnumHelper.addArmorMaterial("GoranTunicMaterial", -1, new int[]{4, 5, 4, 3}, 16);
	public static ArmorMaterial HeroTunicMaterial = EnumHelper.addArmorMaterial("HeroTunicMaterial", -1, new int[]{4, 5, 4, 3}, 16);
	public static ArmorMaterial ZoraTunicMaterial = EnumHelper.addArmorMaterial("ZoraTunicMaterial", -1, new int[]{4, 5, 4, 3}, 16);


	//Miscellaneous
	public static Item MasterSword;
	public static Item MasterIngot;
	public static Item NewMasterSword;
	
	public static Item ChuJellyRed;
	public static Item ChuJellyGreen;
	public static Item ChuJellyBlue;
	public static Item ChuJellyYellow;
	public static Item ChuJellyPurple;
	
	public static Item Rupee;

	public static Item RockSteak;
		
	//Ingot
	public static Item ShdwIngot;
	public static Item AgIngot;
	public static Item AgNugget;
	public static Item CoalDust;
	public static Item FeIngot;
	public static Item HyrlIngot;
	public static Item ShdwGem;
	
	//Tools	
	public static Item HyrlPick;
	public static Item HyrlAxe;
	public static Item HyrlSpade;
	public static Item HyrlHoe;
	public static Item HyrlSword;
	
	public static Item ShdwPick;
	public static Item ShdwAxe;
	public static Item ShdwSpade;
	public static Item ShdwHoe;
	public static Item ShdwSword;
	
	
	//Armour	

	public static Item HyrlNormHelm;
	public static Item HyrlNormChest;
	public static Item HyrlNormLegs;
	public static Item HyrlNormBoots;
	
	public static Item ShdwNormHelm;
	public static Item ShdwNormChest;
	public static Item ShdwNormLegs;
	public static Item ShdwNormBoots;
	
	public static Item GoranTunicHelm;
	public static Item GoranTunicChest;
	public static Item GoranTunicLegs;
	public static Item GoranTunicBoots;
	
	public static Item HeroTunicHelm;
	public static Item HeroTunicChest;
	public static Item HeroTunicLegs;
	public static Item HeroTunicBoots;
	
	public static Item ZoraTunicHelm;
	public static Item ZoraTunicChest;
	public static Item ZoraTunicLegs;
	public static Item ZoraTunicBoots;
	
	
	public static void initializeItem(){
		//Miscellaneous
		MasterSword = new com.crafter6789.loztwiprincess.item.tools.MasterSword(MasterToolMaterial).setUnlocalizedName("MasterSword").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":MasterSword");
		NewMasterSword = new com.crafter6789.loztwiprincess.item.tools.NewMasterSword(NewMasterToolMaterial).setUnlocalizedName("NewMasterSword").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":NewMasterSword");
		
		ChuJellyRed = new Item().setUnlocalizedName("ChuJellyRed").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ChuJellyRed");
		ChuJellyGreen = new Item().setUnlocalizedName("ChuJellyGreen").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ChuJellyGreen");
		ChuJellyBlue = new Item().setUnlocalizedName("ChuJellyBlue").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ChuJellyBlue");
		ChuJellyYellow = new Item().setUnlocalizedName("ChuJellyYellow").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ChuJellyYellow");
		ChuJellyPurple = new Item().setUnlocalizedName("ChuJellyPurple").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ChuJellyPurple");
		
		Rupee = new com.crafter6789.loztwiprincess.item.meta.Rupee("Rupee");
		RockSteak = new com.crafter6789.loztwiprincess.item.RockSteak(1, 1, false, "RockSteak");
		
		//Ingot
		ShdwIngot = new Item().setUnlocalizedName("ShdwIngot").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ShdwIngot");
		AgIngot = new Item().setUnlocalizedName("AgIngot").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":SilverIngot");
		AgNugget = new Item().setUnlocalizedName("AgNugget").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":SilverNugget");
		CoalDust = new Item().setUnlocalizedName("CoalDust").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":CoalDust");
		FeIngot = new Item().setUnlocalizedName("FeIngot").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":FeIngot");
		HyrlIngot = new Item().setUnlocalizedName("HyrlIngot").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":HyrlIngot");
		ShdwGem = new Item().setUnlocalizedName("ShdwGem").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":ShdwGem");
		MasterIngot = new Item().setUnlocalizedName("MasterIngot").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":MasterIngot");

		//Tools
		HyrlPick = new com.crafter6789.loztwiprincess.item.tools.HyrlPick(HyrlToolMaterial).setUnlocalizedName("HyrlPick").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":HyrlPick");
		HyrlAxe = new com.crafter6789.loztwiprincess.item.tools.HyrlAxe(HyrlToolMaterial).setUnlocalizedName("HyrlAxe").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":HyrlAxe");
		HyrlSpade = new com.crafter6789.loztwiprincess.item.tools.HyrlSpade(HyrlToolMaterial).setUnlocalizedName("HyrlSpade").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":HyrlSpade");
		HyrlHoe = new com.crafter6789.loztwiprincess.item.tools.HyrlHoe(HyrlToolMaterial).setUnlocalizedName("HyrlHoe").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":HyrlHoe");
		HyrlSword = new com.crafter6789.loztwiprincess.item.tools.HyrlSword(HyrlToolMaterial).setUnlocalizedName("HyrlSword").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":HyrlSword");
		
		ShdwPick = new com.crafter6789.loztwiprincess.item.tools.ShdwPick(ShdwToolMaterial).setUnlocalizedName("ShdwPick").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":ShdwPick");
		ShdwAxe = new com.crafter6789.loztwiprincess.item.tools.ShdwAxe(ShdwToolMaterial).setUnlocalizedName("ShdwAxe").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":ShdwAxe");
		ShdwSpade = new com.crafter6789.loztwiprincess.item.tools.ShdwSpade(ShdwToolMaterial).setUnlocalizedName("ShdwSpade").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":ShdwSpade");
		ShdwHoe = new com.crafter6789.loztwiprincess.item.tools.ShdwHoe(ShdwToolMaterial).setUnlocalizedName("ShdwHoe").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":ShdwHoe");
		ShdwSword = new com.crafter6789.loztwiprincess.item.tools.ShdwSword(ShdwToolMaterial).setUnlocalizedName("ShdwSword").setCreativeTab(MCreativeTabs.tabTool).setTextureName(RefStrings.MODID + ":ShdwSword");
		
		//Armour
		
		HyrlNormHelm = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormHelm", HyrlNormArmorMaterial, "HyrlNormHelm", 0);
		HyrlNormChest = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormChest", HyrlNormArmorMaterial, "HyrlNormChest", 1);
		HyrlNormLegs = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormLegs", HyrlNormArmorMaterial, "HyrlNormLegs", 2);
		HyrlNormBoots = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormBoots", HyrlNormArmorMaterial, "HyrlNormBoots", 3);
		

		ShdwNormHelm = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormHelm", ShdwNormArmorMaterial, "ShdwNormHelm", 0);
		ShdwNormChest = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormChest", ShdwNormArmorMaterial, "ShdwNormChest", 1);
		ShdwNormLegs = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormLegs", ShdwNormArmorMaterial, "ShdwNormLegs", 2);
		ShdwNormBoots = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormBoots", ShdwNormArmorMaterial, "ShdwNormBoots", 3);

		
		GoranTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicHelm", GoranTunicMaterial, "GoranTunicHelm", 0);
		GoranTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicChest", GoranTunicMaterial, "GoranTunicChest", 1);
		GoranTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicLegs", GoranTunicMaterial, "GoranTunicLegs", 2);
		GoranTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicBoots", GoranTunicMaterial, "GoranTunicBoots", 3);

		
		HeroTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicHelm", HeroTunicMaterial, "HeroTunicHelm", 0);
		HeroTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicChest", HeroTunicMaterial, "HeroTunicChest", 1);
		HeroTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicLegs", HeroTunicMaterial, "HeroTunicLegs", 2);
		HeroTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicBoots", HeroTunicMaterial, "HeroTunicBoots", 3);

		
		ZoraTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicHelm", ZoraTunicMaterial, "ZoraTunicHelm", 0);
		ZoraTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicChest", ZoraTunicMaterial, "ZoraTunicChest", 1);
		ZoraTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicLegs", ZoraTunicMaterial, "ZoraTunicLegs", 2);
		ZoraTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicBoots", ZoraTunicMaterial, "ZoraTunicBoots", 3);
		
		
	}

	public static void registerItem(){
		//Miscellaneous
		GameRegistry.registerItem(ChuJellyRed, ChuJellyRed.getUnlocalizedName());
		GameRegistry.registerItem(ChuJellyGreen, ChuJellyGreen.getUnlocalizedName());
		GameRegistry.registerItem(ChuJellyBlue, ChuJellyBlue.getUnlocalizedName());
		GameRegistry.registerItem(ChuJellyYellow, ChuJellyYellow.getUnlocalizedName());
		GameRegistry.registerItem(ChuJellyPurple, ChuJellyPurple.getUnlocalizedName());

		GameRegistry.registerItem(Rupee, Rupee.getUnlocalizedName());
		GameRegistry.registerItem(RockSteak, RockSteak.getUnlocalizedName());
		
		GameRegistry.registerItem(MasterIngot, MasterIngot.getUnlocalizedName());
		GameRegistry.registerItem(MasterSword, MasterSword.getUnlocalizedName());
		GameRegistry.registerItem(NewMasterSword, NewMasterSword.getUnlocalizedName());
		
		//Ingot
		GameRegistry.registerItem(ShdwIngot, ShdwIngot.getUnlocalizedName());
		GameRegistry.registerItem(AgIngot, AgIngot.getUnlocalizedName());
		GameRegistry.registerItem(AgNugget, AgNugget.getUnlocalizedName());
		GameRegistry.registerItem(CoalDust, CoalDust.getUnlocalizedName());
		GameRegistry.registerItem(FeIngot, FeIngot.getUnlocalizedName());
		GameRegistry.registerItem(HyrlIngot, HyrlIngot.getUnlocalizedName());
		GameRegistry.registerItem(ShdwGem, ShdwGem.getUnlocalizedName());
		
		//Tools
		GameRegistry.registerItem(HyrlPick, HyrlPick.getUnlocalizedName());
		GameRegistry.registerItem(HyrlAxe, HyrlAxe.getUnlocalizedName());
		GameRegistry.registerItem(HyrlSpade, HyrlSpade.getUnlocalizedName());
		GameRegistry.registerItem(HyrlHoe, HyrlHoe.getUnlocalizedName());
		GameRegistry.registerItem(HyrlSword, HyrlSword.getUnlocalizedName());
		
		GameRegistry.registerItem(ShdwPick, ShdwPick.getUnlocalizedName());
		GameRegistry.registerItem(ShdwAxe, ShdwAxe.getUnlocalizedName());
		GameRegistry.registerItem(ShdwSpade, ShdwSpade.getUnlocalizedName());
		GameRegistry.registerItem(ShdwHoe, ShdwHoe.getUnlocalizedName());
		GameRegistry.registerItem(ShdwSword, ShdwSword.getUnlocalizedName());
		
		//Armour
		
		GameRegistry.registerItem(HyrlNormHelm, HyrlNormHelm.getUnlocalizedName());
		GameRegistry.registerItem(HyrlNormChest, HyrlNormChest.getUnlocalizedName());
		GameRegistry.registerItem(HyrlNormLegs, HyrlNormLegs.getUnlocalizedName());
		GameRegistry.registerItem(HyrlNormBoots, HyrlNormBoots.getUnlocalizedName());

		GameRegistry.registerItem(ShdwNormHelm, ShdwNormHelm.getUnlocalizedName());
		GameRegistry.registerItem(ShdwNormChest, ShdwNormChest.getUnlocalizedName());
		GameRegistry.registerItem(ShdwNormLegs, ShdwNormLegs.getUnlocalizedName());
		GameRegistry.registerItem(ShdwNormBoots, ShdwNormBoots.getUnlocalizedName());

		GameRegistry.registerItem(GoranTunicHelm, GoranTunicHelm.getUnlocalizedName());
		GameRegistry.registerItem(GoranTunicChest, GoranTunicChest.getUnlocalizedName());
		GameRegistry.registerItem(GoranTunicLegs, GoranTunicLegs.getUnlocalizedName());
		GameRegistry.registerItem(GoranTunicBoots, GoranTunicBoots.getUnlocalizedName());

		GameRegistry.registerItem(HeroTunicHelm, HeroTunicHelm.getUnlocalizedName());
		GameRegistry.registerItem(HeroTunicChest, HeroTunicChest.getUnlocalizedName());
		GameRegistry.registerItem(HeroTunicLegs, HeroTunicLegs.getUnlocalizedName());
		GameRegistry.registerItem(HeroTunicBoots, HeroTunicBoots.getUnlocalizedName());

		GameRegistry.registerItem(ZoraTunicHelm, ZoraTunicHelm.getUnlocalizedName());
		GameRegistry.registerItem(ZoraTunicChest, ZoraTunicChest.getUnlocalizedName());
		GameRegistry.registerItem(ZoraTunicLegs, ZoraTunicLegs.getUnlocalizedName());
		GameRegistry.registerItem(ZoraTunicBoots, ZoraTunicBoots.getUnlocalizedName());
		
		
		
	}
	
}
