package com.couchdoescode.adventuremod.items;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.init.*;

import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.*;

public class ItemCarbiteArmor extends ItemArmor {

	public ItemCarbiteArmor(String name, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		
		setUnlocalizedName(name);
		setCreativeTab(AdventureMod.toolsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 2){
			return "cdc:textures/models/armor/carbite_layer_2.png";
		}
		
		return "cdc:textures/models/armor/carbite_layer_1.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem() == AdventureItems.carbiteHelmet) {
	        effectPlayer(player, Potion.nightVision, 0);
	    }
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier){
		if(player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1){
			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
		}
	}
}
