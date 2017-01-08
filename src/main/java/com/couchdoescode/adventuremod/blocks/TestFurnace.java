package com.couchdoescode.adventuremod.blocks;

import java.util.*;

import com.couchdoescode.adventuremod.init.*;
import com.couchdoescode.adventuremod.tileentities.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.relauncher.*;

public class TestFurnace extends BlockContainer{
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	private final boolean isBurning;
	private static boolean keepInventory;
	
	public TestFurnace(boolean isBurning, String name) {
		super(Material.rock);
		this.isBurning = isBurning;
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		setUnlocalizedName(name);
	}
	
	public Item getItemDropped(IBlockState block, Random random, int fortune){
		return Item.getItemFromBlock(AdventureBlocks.testFurnace_idle);
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		this.setDefaultFacing(world, pos, state);
	}
	
	private void setDefaultFacing(World world, BlockPos pos, IBlockState state){
		if(!world.isRemote){
			Block north = world.getBlockState(pos.north()).getBlock();
			Block south = world.getBlockState(pos.south()).getBlock();
			Block east = world.getBlockState(pos.east()).getBlock();
			Block west = world.getBlockState(pos.west()).getBlock();
			EnumFacing enumFacing = (EnumFacing)state.getValue(FACING);
			
			if(enumFacing == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()){
				enumFacing = EnumFacing.SOUTH;
			}
			
			if(enumFacing == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()){
				enumFacing = EnumFacing.NORTH;
			}
			
			if(enumFacing == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()){
				enumFacing = EnumFacing.EAST;
			}
			
			if(enumFacing == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()){
				enumFacing = EnumFacing.WEST;
			}
			
			world.setBlockState(pos, state.withProperty(FACING, enumFacing), 2);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTestFurnace();
	}
	
	public static void setState(boolean active, World world, BlockPos pos){
		IBlockState state = world.getBlockState(pos);
		TileEntity tile = world.getTileEntity(pos);
		keepInventory = true;
		
		if(active){
			world.setBlockState(pos, AdventureBlocks.testFurnace_active.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}else{
			world.setBlockState(pos, AdventureBlocks.testFurnace_idle.getDefaultState().withProperty(FACING, state.getValue(FACING)));
		}
		
		keepInventory = false;
		
		if(tile != null){
			tile.validate();
			world.setTileEntity(pos, tile);
		}
	}
	
	@SideOnly(Side.CLIENT)
    @SuppressWarnings("incomplete-switch")
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (this.isBurning)
        {
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            switch (enumfacing)
            {
                case WEST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case EAST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case NORTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case SOUTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }
    }
}
