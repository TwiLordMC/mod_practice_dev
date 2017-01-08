package com.couchdoescode.adventuremod.world;

import java.util.*;

import com.couchdoescode.adventuremod.init.*;

import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.common.*;

public class WorldGenOres implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateEnd(World world, Random random, int chunkx, int chunkz){}
	private void generateSurface(World world, Random random, int chunkx, int chunkz){
		addOreSpawn(AdventureBlocks.rubyOre, world, random, chunkx, chunkz, 16, 16, 5, 20, 15, 50);
		addOreSpawn(AdventureBlocks.magnesiumOre, world, random, chunkx, chunkz, 16, 16, 8, 10, 10, 100);
		addOreSpawn(AdventureBlocks.carbiteOre, world, random, chunkx, chunkz, 16, 16, 3, 5, 10, 50);
	}
	private void generateNether(World world, Random random, int chunkx, int chunkz){}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
	 
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world, random, new BlockPos( posX, posY, posZ));
		}
	}
}
