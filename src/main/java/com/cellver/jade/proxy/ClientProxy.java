package com.cellver.jade.proxy;

import com.cellver.jade.init.ModBlocks;
import com.cellver.jade.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
