package at.digitalphoenix.firstmod.blocks;

import net.minecraft.block.material.Material;

public class LightSource extends BlockBase {

	public LightSource(String name, Material material, float lightLevel) {
		super(name, material);
	
		setLightLevel(lightLevel);
	}

}
