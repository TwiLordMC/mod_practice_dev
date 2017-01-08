package com.couchdoescode.adventuremod.creativetabs;

import com.couchdoescode.adventuremod.init.*;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class AdventureItemsTab extends CreativeTabs{
	public AdventureItemsTab(String label) {
		super(label);
	}
	
	@Override
	public Item getTabIconItem() {
		return AdventureItems.ruby;
	}
}
