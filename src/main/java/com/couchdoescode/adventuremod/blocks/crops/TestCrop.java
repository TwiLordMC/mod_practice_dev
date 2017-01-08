package com.couchdoescode.adventuremod.blocks.crops;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.init.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.item.*;

public class TestCrop extends BlockCrops {

	public TestCrop(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	protected Item getSeed() {
		return AdventureItems.burpleSeed;
	}
	
	protected Item getCrop() {
		return AdventureItems.burple;
	}
}
