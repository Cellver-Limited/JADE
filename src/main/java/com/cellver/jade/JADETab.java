package com.cellver.jade;

import com.cellver.jade.init.ModBlocks;
import com.cellver.jade.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JADETab extends CreativeTabs {

	public JADETab() {
		super("tabJADE");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.cheese;
	}

}
