package com.cellver.jade.init;

import com.cellver.jade.items.ItemCheese;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item cheese;
	
	public static void init() {
		cheese = new ItemCheese();
	}
	
	public static void register() {
		GameRegistry.register(cheese);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
	}
	
	private static void registerRender(Item item){
		System.out.println("Item Unlocalized: " + item.getUnlocalizedName());
		System.out.println("Item Registry: " + item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
