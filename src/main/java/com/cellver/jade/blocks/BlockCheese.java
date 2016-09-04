package com.cellver.jade.blocks;

import com.cellver.jade.JADE;
import com.cellver.jade.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.ModBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.CHEESE.getRegistryName());
		setHardness(1.0f);
		setLightLevel(2.0f);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(JADE.CREATIVE_TAB);
	}

}
