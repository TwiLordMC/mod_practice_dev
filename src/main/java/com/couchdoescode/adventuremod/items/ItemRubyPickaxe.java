package com.couchdoescode.adventuremod.items;

import com.couchdoescode.adventuremod.*;

import net.minecraft.item.*;

public class ItemRubyPickaxe extends ItemPickaxe{
	public ItemRubyPickaxe(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("rubyPickaxe");
		setCreativeTab(AdventureMod.toolsTab);
	}
}
