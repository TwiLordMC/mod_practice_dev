package com.couchdoescode.adventuremod.items;

import com.couchdoescode.adventuremod.*;

import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class ItemLightningSpawner extends Item {
	public ItemLightningSpawner(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AdventureMod.itemsTab);
		setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World world, EntityPlayer player) {
		MovingObjectPosition result = player.rayTrace(100, 1F);
		
		int x = result.getBlockPos().getX();
		int y = result.getBlockPos().getY();
		int z = result.getBlockPos().getZ();
		
		EntityLightningBolt lightning = new EntityLightningBolt(world, x, y, z);
		world.addWeatherEffect(lightning);
		
		return new ItemStack(this);
	}
}
