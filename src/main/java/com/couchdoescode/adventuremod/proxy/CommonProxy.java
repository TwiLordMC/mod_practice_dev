package com.couchdoescode.adventuremod.proxy;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.tileentities.*;

import net.minecraftforge.fml.common.registry.*;

public class CommonProxy {
	public void registerRenders()
	{
		
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityTestFurnace.class, Ref.MOD_ID + ":testFurnaceTileEntity");
	}

}
