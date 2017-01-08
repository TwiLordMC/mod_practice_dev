package com.couchdoescode.adventuremod.init;

import com.couchdoescode.adventuremod.*;
import com.couchdoescode.adventuremod.blocks.*;
import com.couchdoescode.adventuremod.blocks.crops.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.*;
import net.minecraft.client.resources.model.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdventureBlocks {
	
	public static Block rubyOre;
	public static Block magnesiumOre;
	public static Block carbiteOre;
	
	public static Block testFurnace_idle;
	public static Block testFurnace_active;
	
	public static Block burpleCrop;

	public static void Init(){
		rubyOre = new RubyOre(Material.rock).setUnlocalizedName("rubyOre");
		magnesiumOre = new MagnesiumOre(Material.rock).setUnlocalizedName("magnesiumOre");
		carbiteOre = new CarbiteOre(Material.rock).setUnlocalizedName("carbiteOre");
		
//		testFurnace_idle = new TestFurnace(false, "testFurnace").setCreativeTab(AdventureMod.blocksTab);
//		testFurnace_active = new TestFurnace(true, "testFurnace_active");
		
		burpleCrop = new TestCrop("burpleCrop");
	}
	public static void register(){
		GameRegistry.registerBlock(rubyOre, "rubyOre");
		GameRegistry.registerBlock(magnesiumOre, "magnesiumOre");
		GameRegistry.registerBlock(carbiteOre, "carbiteOre");
		GameRegistry.registerBlock(burpleCrop, "burpleCrop");
//		GameRegistry.registerBlock(testFurnace_idle, "testFurnace");
//		GameRegistry.registerBlock(testFurnace_active, "testFurnace_active");
	}
	public static void registerRenders(){
		registerRender(rubyOre);
		registerRender(magnesiumOre);
		registerRender(carbiteOre);
		registerRender(burpleCrop);
//		registerRender(testFurnace_idle);
//		registerRender(testFurnace_active);
	}
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Ref.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
