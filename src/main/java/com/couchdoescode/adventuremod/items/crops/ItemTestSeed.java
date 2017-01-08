package com.couchdoescode.adventuremod.items.crops;

import com.couchdoescode.adventuremod.*;

import net.minecraft.block.*;
import net.minecraft.item.*;

public class ItemTestSeed extends ItemSeeds {

	public ItemTestSeed(Block crops, Block soil, String name) {
		super(crops, soil);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AdventureMod.itemsTab);
	}

}
