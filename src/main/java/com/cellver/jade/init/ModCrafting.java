package com.cellver.jade.init;

import org.omg.CORBA.IRObjectOperations;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.generator), "iii", "ici", "iii", 'i', Items.IRON_INGOT, 'c', Blocks.COAL_BLOCK);
	}
}
