package com.couchdoescode.adventuremod.proxy;

import com.couchdoescode.adventuremod.init.*;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders()
	{
		AdventureBlocks.registerRenders();
		AdventureItems.registerRenders();
	}
	

}
