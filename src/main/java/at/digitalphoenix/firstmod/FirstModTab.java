package at.digitalphoenix.firstmod;

import at.digitalphoenix.firstmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FirstModTab extends CreativeTabs {

	public FirstModTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FIRE_RUNE);
	}

}
