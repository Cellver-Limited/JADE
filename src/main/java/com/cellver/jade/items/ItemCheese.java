package com.cellver.jade.items;

import com.cellver.jade.JADE;
import com.cellver.jade.Reference;

import net.minecraft.item.Item;

public class ItemCheese extends Item {
	
	public ItemCheese() {
		setUnlocalizedName(Reference.ModItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CHEESE.getRegistryName());
		setCreativeTab(JADE.CREATIVE_TAB);
	}
}
