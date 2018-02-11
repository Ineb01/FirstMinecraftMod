package at.digitalphoenix.firstmod.blocks.fire;

import at.digitalphoenix.firstmod.blocks.LightSource;
import net.minecraft.block.material.Material;

public class FireLamp extends LightSource{

	public FireLamp(String name, Material material, int lightLevel) {
		super(name, material, lightLevel);
		setHardness(2.0f);
		setHarvestLevel("axe", 1);
	}

}
