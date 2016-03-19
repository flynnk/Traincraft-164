/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.traincraft.common.core.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import si.meansoft.traincraft.common.library.BlockIDs;
import si.meansoft.traincraft.common.library.ItemIDs;

public final class OreHandler 
{
	public static void registerOres ()
  {		
		OreDictionary.registerOre("oreCopper", new ItemStack(BlockIDs.oreTC.block, 1, 0));
//		OreDictionary.registerOre("oreOilsands", new ItemStack(BlockIDs.oreTC.block, 1, 1));
//		OreDictionary.registerOre("orePetroleum", new ItemStack(BlockIDs.oreTC.block, 1, 2));

		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemIDs.ingotCopper.item));

//		OreDictionary.registerOre("ingotSteel", new ItemStack(ItemIDs.steel.item));
		
//		OreDictionary.registerOre("dustPlastic", new ItemStack(ItemIDs.rawPlastic.item));
		
//		OreDictionary.registerOre("dustCoal", new ItemStack(ItemIDs.coaldust.item));
	}
}
