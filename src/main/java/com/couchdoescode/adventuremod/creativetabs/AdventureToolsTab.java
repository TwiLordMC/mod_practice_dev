package com.couchdoescode.adventuremod.creativetabs;

import com.couchdoescode.adventuremod.init.*;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class AdventureToolsTab extends CreativeTabs {

	public AdventureToolsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return AdventureItems.rubyPickaxe;
	}

}
