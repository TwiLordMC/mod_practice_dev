package com.couchdoescode.adventuremod.creativetabs;

import com.couchdoescode.adventuremod.init.*;

import net.minecraft.block.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class AdventureBlocksTab extends CreativeTabs{
	public AdventureBlocksTab(String label) {
		super(label);
	}
	
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(AdventureBlocks.rubyOre);
	}
}
