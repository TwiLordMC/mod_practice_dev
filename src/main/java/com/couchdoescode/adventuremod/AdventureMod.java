package com.couchdoescode.adventuremod;


import com.couchdoescode.adventuremod.creativetabs.*;
import com.couchdoescode.adventuremod.handlers.*;
import com.couchdoescode.adventuremod.init.*;
import com.couchdoescode.adventuremod.proxy.*;
import com.couchdoescode.adventuremod.world.*;

import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.*;

@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.MOD_VERSION)
public class AdventureMod {
	
	@SidedProxy(clientSide = Ref.CLIENT_PROXY_CLASS, serverSide = Ref.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final AdventureBlocksTab blocksTab = new AdventureBlocksTab("blocksTab");
	public static final AdventureItemsTab itemsTab = new AdventureItemsTab("itemsTab");
	public static final CreativeTabs toolsTab = new AdventureToolsTab("toolsTab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Initializations
		AdventureBlocks.Init();
		AdventureItems.Init();
		
		//Registers
		AdventureItems.register();
		AdventureBlocks.register();
		
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
		smeltingRecipes();
		craftingRecipes();
		addFuel();
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AdventureItems.burpleSeed), 1, 5, 85));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AdventureItems.burpleSeed), 1, 5, 85));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AdventureItems.burpleSeed), 1, 5, 85));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AdventureItems.burpleSeed), 1, 5, 85));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AdventureItems.lightningSpawner), 1, 1, 15));
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		proxy.registerTileEntities();
	}
	public void smeltingRecipes()
	{
		GameRegistry.addSmelting(AdventureBlocks.rubyOre, new ItemStack(AdventureItems.ruby, 1), 0.5F);
	}
	
	public void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyAxe), 
				"AA ", "AC ", " C ", 'A', AdventureItems.ruby, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyPickaxe), 
				"AAA", " C ", " C ", 'A', AdventureItems.ruby, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubySword), 
				" A ", " A ", " C ", 'A', AdventureItems.ruby, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubySpade), 
				" A ", " C ", " C ", 'A', AdventureItems.ruby, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyHoe), 
				"AA ", " C ", " C ", 'A', AdventureItems.ruby, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteAxe), 
				"AA ", "AC ", " C ", 'A', AdventureItems.carbite, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbitePickaxe), 
				"AAA", " C ", " C ", 'A', AdventureItems.carbite, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteSword), 
				" A ", " A ", " C ", 'A', AdventureItems.carbite, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteSpade), 
				" A ", " C ", " C ", 'A', AdventureItems.carbite, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteHoe), 
				"AA ", " C ", " C ", 'A', AdventureItems.carbite, 'C', Items.stick
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyHelmet), 
				"   ", "AAA", "A A", 'A', AdventureItems.ruby
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyChest), 
				"A A", "AAA", "AAA", 'A', AdventureItems.ruby
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyLegs), 
				"AAA", "A A", "A A", 'A', AdventureItems.ruby
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.rubyBoots), 
				"   ", "A A", "A A", 'A', AdventureItems.ruby
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteHelmet), 
				"   ", "AAA", "A A", 'A', AdventureItems.carbite
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteChest), 
				"A A", "AAA", "AAA", 'A', AdventureItems.carbite
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteLegs), 
				"AAA", "A A", "A A", 'A', AdventureItems.carbite
		);
		
		GameRegistry.addRecipe(new ItemStack(AdventureItems.carbiteBoots), 
				"   ", "A A", "A A", 'A', AdventureItems.carbite
		);
	}
	
	public void addFuel(){
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
}
