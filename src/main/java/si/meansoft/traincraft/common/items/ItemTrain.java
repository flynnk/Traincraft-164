package si.meansoft.traincraft.common.items;

import net.minecraft.item.Item;
import si.meansoft.traincraft.common.Traincraft;

public class ItemTrain extends Item 
{
	public ItemTrain () 
  {
		super();
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
	}
}