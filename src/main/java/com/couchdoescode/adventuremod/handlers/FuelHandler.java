package com.couchdoescode.adventuremod.handlers;

import com.couchdoescode.adventuremod.init.*;

import net.minecraft.item.*;
import net.minecraftforge.fml.common.*;

public class FuelHandler implements IFuelHandler{
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == AdventureItems.magnesium){
			return 2600;
		}
		
		return 0;
	}
}
