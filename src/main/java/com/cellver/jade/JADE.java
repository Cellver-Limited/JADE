package com.cellver.jade;

import com.cellver.jade.init.ModBlocks;
import com.cellver.jade.init.ModCrafting;
import com.cellver.jade.init.ModItems;
import com.cellver.jade.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class JADE {
    
	@Instance
	public static JADE instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new JADETab(); 
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("JADE preInit start!");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		System.out.println("JADE preInit end!");
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
		System.out.println("JADE init start!");
		System.out.println("JADE init end!");
		proxy.init();
		ModCrafting.register();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
		System.out.println("JADE postInit start!");
		
		System.out.println("JADE postInit end!");    	
    }
}
