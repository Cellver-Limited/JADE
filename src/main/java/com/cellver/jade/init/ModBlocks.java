package com.cellver.jade.init;

import com.cellver.jade.blocks.BlockCheese;
import com.cellver.jade.blocks.BlockGenerator;
import com.cellver.jade.blocks.BlockSolarPanel;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block cheese;
	public static Block generator;
	public static Block solar_panel;
	
	public static void init() {
		cheese = new BlockCheese();
		generator = new BlockGenerator();
		solar_panel = new BlockSolarPanel();
	}
	
	public static void register() {
		registerBlock(cheese);
		registerBlock(generator);
		registerBlock(solar_panel);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(generator);
		registerRender(solar_panel);
	}
	
	private static void registerRender(Block block){
		System.out.println("Block Unlocalized: " + block.getUnlocalizedName());
		System.out.println("Block Registry: " + block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
