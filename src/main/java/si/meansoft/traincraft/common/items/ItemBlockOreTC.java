package si.meansoft.traincraft.common.items;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockOreTC extends ItemBlock 
{
	private final static List<String> subNames = Arrays.asList(new String[]{ "copperOre", "oilSands", "petroleum", "ballast" });

	public ItemBlockOreTC (Block block)
  {
		super(block);
		setHasSubtypes(false);
	}

  /**
   * Needed to make the item drop properly.
   * 
   * @param damageValue
   * @return 
   */
	@Override
	public int getMetadata (int damageValue) 
  {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName (ItemStack itemstack) 
  {
		if (itemstack.getItemDamage() < subNames.size())
    	return super.getUnlocalizedName() + "." + subNames.get(itemstack.getItemDamage());
		else
			return super.getUnlocalizedName() + ".";
	}
}
