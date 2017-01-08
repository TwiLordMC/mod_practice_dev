package com.couchdoescode.adventuremod.items;

import com.couchdoescode.adventuremod.*;

import net.minecraft.item.*;

public class ItemRubySword extends ItemSword {
	public ItemRubySword(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("rubySword");
		setCreativeTab(AdventureMod.toolsTab);
	}
}
