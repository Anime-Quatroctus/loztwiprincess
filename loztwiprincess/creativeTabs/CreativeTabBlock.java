package com.crafter6789.loztwiprincess.creativeTabs;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlock extends CreativeTabs {

	public CreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MBlocksClass.ShdwOre);
	}

}
