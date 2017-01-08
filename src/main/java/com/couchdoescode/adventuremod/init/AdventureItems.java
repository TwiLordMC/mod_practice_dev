package com.couchdoescode.adventuremod.init;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.items.*;
import com.couchdoescode.adventuremod.items.crops.*;
import com.couchdoescode.adventuremod.materials.*;

import net.minecraft.client.*;
import net.minecraft.client.resources.model.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.*;

public class AdventureItems {
	
	public static Item ruby;
	public static Item magnesium;
	public static Item carbite;
	
	public static Item burple;
	
	public static Item rubyPickaxe;
	public static Item rubyAxe;
	public static Item rubySword;
	public static Item rubyHoe;
	public static Item rubySpade;
	
	public static Item rubyHelmet;
	public static Item rubyChest;
	public static Item rubyLegs;
	public static Item rubyBoots;
	
	public static Item carbitePickaxe;
	public static Item carbiteAxe;
	public static Item carbiteSword;
	public static Item carbiteHoe;
	public static Item carbiteSpade;
	
	public static Item carbiteHelmet;
	public static Item carbiteChest;
	public static Item carbiteLegs;
	public static Item carbiteBoots;
	
	public static Item burpleSeed;
	
	public static Item lightningSpawner;
	
	public static void Init(){
		ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(AdventureMod.itemsTab);
		magnesium = new Item().setUnlocalizedName("magnesium").setCreativeTab(AdventureMod.itemsTab);
		carbite = new Item().setUnlocalizedName("carbite").setCreativeTab(AdventureMod.itemsTab);
		
		burple = new ItemTestFood(6, 0.6F, false);
		burpleSeed = new ItemTestSeed(AdventureBlocks.burpleCrop, Blocks.farmland, "burpleSeed");
		
		rubyPickaxe = new ItemRubyPickaxe(ToolMaterials.RUBY);
		rubyAxe = new ItemRubyAxe(ToolMaterials.RUBY);
		rubySword = new ItemRubySword(ToolMaterials.RUBY);
		rubyHoe = new ItemRubyHoe(ToolMaterials.RUBY);
		rubySpade = new ItemRubySpade(ToolMaterials.RUBY);
		
		rubyHelmet = new ItemRubyArmor("rubyHelmet", ArmourMaterials.RUBY, 1, 0);
		rubyChest = new ItemRubyArmor("rubyChest", ArmourMaterials.RUBY, 1, 1);
		rubyLegs = new ItemRubyArmor("rubyLegs", ArmourMaterials.RUBY, 2, 2);
		rubyBoots = new ItemRubyArmor("rubyBoots", ArmourMaterials.RUBY, 1, 3);

		carbitePickaxe = new ItemCarbitePickaxe(ToolMaterials.CARBITE);
		carbiteAxe = new ItemCarbiteAxe(ToolMaterials.CARBITE);
		carbiteSword = new ItemCarbiteSword(ToolMaterials.CARBITE);
		carbiteHoe = new ItemCarbiteHoe(ToolMaterials.CARBITE);
		carbiteSpade = new ItemCarbiteSpade(ToolMaterials.CARBITE);
		
		carbiteHelmet = new ItemCarbiteArmor("carbiteHelmet", ArmourMaterials.CARBITE, 1, 0);
		carbiteChest = new ItemCarbiteArmor("carbiteChest", ArmourMaterials.CARBITE, 1, 1);
		carbiteLegs = new ItemCarbiteArmor("carbiteLegs", ArmourMaterials.CARBITE, 2, 2);
		carbiteBoots = new ItemCarbiteArmor("carbiteBoots", ArmourMaterials.CARBITE, 1, 3);
		
		lightningSpawner = new ItemLightningSpawner("lightningSpawner");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(magnesium, "magnesium");
		GameRegistry.registerItem(carbite, "carbite");
		
		GameRegistry.registerItem(burple, "burple");
		GameRegistry.registerItem(burpleSeed, "burpleSeed");

		GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
		GameRegistry.registerItem(rubySword, "rubySword");
		GameRegistry.registerItem(rubyAxe, "rubyAxe");
		GameRegistry.registerItem(rubyHoe, "rubyHoe");
		GameRegistry.registerItem(rubySpade, "rubySpade");
		GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
		GameRegistry.registerItem(rubyChest, "rubyChest");
		GameRegistry.registerItem(rubyLegs, "rubyLegs");
		GameRegistry.registerItem(rubyBoots, "rubyBoots");
		
		GameRegistry.registerItem(carbitePickaxe, "carbitePickaxe");
		GameRegistry.registerItem(carbiteSword, "carbiteSword");
		GameRegistry.registerItem(carbiteAxe, "carbiteAxe");
		GameRegistry.registerItem(carbiteHoe, "carbiteHoe");
		GameRegistry.registerItem(carbiteSpade, "carbiteSpade");
		GameRegistry.registerItem(carbiteHelmet, "carbiteHelmet");
		GameRegistry.registerItem(carbiteChest, "carbiteChest");
		GameRegistry.registerItem(carbiteLegs, "carbiteLegs");
		GameRegistry.registerItem(carbiteBoots, "carbiteBoots");
		
		GameRegistry.registerItem(lightningSpawner, "lightningSpawner");
	}
	
	public static void registerRenders()
	{
		registerRender(ruby);
		registerRender(magnesium);
		registerRender(carbite);
		
		registerRender(burple);
		registerRender(burpleSeed);
		
		registerRender(rubyPickaxe);
		registerRender(rubySword);
		registerRender(rubyAxe);
		registerRender(rubyHoe);
		registerRender(rubySpade);
		registerRender(rubyHelmet);
		registerRender(rubyChest);
		registerRender(rubyLegs);
		registerRender(rubyBoots);
		
		registerRender(carbitePickaxe);
		registerRender(carbiteSword);
		registerRender(carbiteAxe);
		registerRender(carbiteHoe);
		registerRender(carbiteSpade);
		registerRender(carbiteHelmet);
		registerRender(carbiteChest);
		registerRender(carbiteLegs);
		registerRender(carbiteBoots);
		
		registerRender(lightningSpawner);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Ref.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
