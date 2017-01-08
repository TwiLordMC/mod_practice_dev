package com.couchdoescode.adventuremod.blocks;

import java.util.*;

import com.couchdoescode.adventuremod.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;

public class RubyOre extends Block{
	public RubyOre(Material mat) {
		super(mat);
		setCreativeTab(AdventureMod.blocksTab);
		setHardness(6F);
		setResistance(6F);
	}
}
