package com.couchdoescode.adventuremod.items;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.init.*;

import net.minecraft.entity.*;
import net.minecraft.item.*;

public class ItemRubyArmor extends ItemArmor {

	public ItemRubyArmor(String name, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		
		setUnlocalizedName(name);
		setCreativeTab(AdventureMod.toolsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 2){
			return "cdc:textures/models/armor/rubyArmor_layer_2.png";
		}
		
		return "cdc:textures/models/armor/rubyArmor_layer_1.png";
	}

}
