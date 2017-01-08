package com.couchdoescode.adventuremod.blocks;

import com.couchdoescode.adventuremod.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;

public class MagnesiumOre extends Block {
	public MagnesiumOre(Material mat){
		super(mat);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(AdventureMod.blocksTab);
		setHardness(10F);
		setResistance(15F);
		setLightLevel(0.2F);
	}
}
