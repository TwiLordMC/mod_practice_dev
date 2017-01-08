package com.couchdoescode.adventuremod.blocks;

import java.util.*;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.init.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;

public class CarbiteOre extends Block{
	public CarbiteOre(Material mat) {
		super(mat);
		setCreativeTab(AdventureMod.blocksTab);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return AdventureItems.carbite;
	}
}
