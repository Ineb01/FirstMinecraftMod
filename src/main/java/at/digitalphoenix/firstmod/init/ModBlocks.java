package at.digitalphoenix.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import at.digitalphoenix.firstmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FIRE_RUNE_BLOCK = new BlockBase("fire_rune_block", Material.IRON);
}
