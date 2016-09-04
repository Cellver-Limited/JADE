package com.cellver.jade;

public class Reference {
	public static final String MODID = "jade";
	public static final String NAME = "Just Another Drone Experiment";
	public static final String VERSION = "1.0.0-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.cellver.jade.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.cellver.jade.proxy.ServerProxy";
	
	public static enum ModItems {
		CHEESE("cheese", "ItemCheese");
		
		private String unlocalizedName;
		private String registryName;
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum ModBlocks {
		CHEESE("cheese", "BlockCheese"), GENERATOR("generator", "BlockGenerator"), SOLAR_PANEL("solar_panel", "BlockSolarPanel");
		
		private String unlocalizedName;
		private String registryName;
		
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
