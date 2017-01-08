package com.couchdoescode.adventuremod.items;

import com.couchdoescode.adventuremod.*;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.*;

public class ItemTestFood extends ItemFood {

	private boolean alwaysEdible;

	public ItemTestFood(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setCreativeTab(AdventureMod.itemsTab);
		setUnlocalizedName("burple");
//		setPotionEffect(Potion.invisibility.id, 20, 0, 1.0F);
//		setPotionEffect(Potion.nightVision.id, 20, 0, 0.8F);
		setPotionEffect(Potion.damageBoost.id, 20, 1, 1F);
		setAlwaysEdible();
	}
}
