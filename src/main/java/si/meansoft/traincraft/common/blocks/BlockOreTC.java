package si.meansoft.traincraft.common.blocks;

import java.util.List;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import si.meansoft.traincraft.common.Traincraft;

public class BlockOreTC extends BlockOre
{
//  public static final PropertyInteger TYPE_PROPERTY = PropertyInteger.create("traincraft.ore.type", 0, 3);
  
//	private static Icon texture1;
//	private static Icon texture2;
//	private static Icon texture3;
//	private static Icon texture4;

	public BlockOreTC (int tex) 
  {
    super();
//    setDefaultState(blockState.getBaseState().withProperty(TYPE_PROPERTY, 0));
		setCreativeTab(Traincraft.tcTab);
	}

//	@Override
//	public Icon getIcon(int side, int metadata) {
//		if (metadata == 0) {
//			return texture1;
//		}
//		else if (metadata == 1) {
//			return texture2;
//		}
//		else if(metadata == 2){
//			return texture3;
//		}else{
//			return texture4;
//		}
//	}

//	@Override
//	public int damageDropped (IBlockState state) 
//  {
//		return getMetaFromState(state);
//	}

//	@Override
//	public int idDropped(int i, Random random, int j) {
//		return blockID;
//	}
//
//	@Override
//	public int quantityDropped(Random random) {
//		return 1;
//	}
//
//	@Override
//	public void onBlockAdded(World world, int x, int y, int z) {
//		if (this.blockID == BlockIDs.oreTC.blockID && world.getBlockMetadata(x, y, z) == 1) {
//			world.scheduleBlockUpdate(x, y, z, this.blockID, 5);
//		}
//	}
//
//	@Override
//	public void onNeighborBlockChange(World world, int x, int y, int z, int par5) {
//		if (this.blockID == BlockIDs.oreTC.blockID && world.getBlockMetadata(x, y, z) == 1) {
//			if (!world.isRemote) {
//				tryToFall(world, x, y, z);
//				world.scheduleBlockUpdate(x, y, z, this.blockID, 5);
//			}
//		}
//	}
//
//	@Override
//	public void updateTick(World world, int x, int y, int z, Random par5Random) {
//		if (this.blockID == BlockIDs.oreTC.blockID && world.getBlockMetadata(x, y, z) == 1) {
//			if (!world.isRemote) {
//				if (world.getBlockId(x, y - 1, z) == 0) {
//					tryToFall(world, x, y, z);
//				}
//			}
//		}
//	}
//
//	private void tryToFall(World world, int x, int y, int z) {
//		if (!world.isRemote) {
//			int meta = world.getBlockMetadata(x, y, z);
//			if (canFallBelow(world, x, y - 1, z) && y >= 0) {
//				byte byte0 = 32;
//				if (!world.checkChunksExist(x - byte0, y - byte0, z - byte0, x + byte0, y + byte0, z + byte0)) {
//					world.setBlock(x, y, z, 0);
//					for (; canFallBelow(world, x, y - 1, z) && y > 0; y--) {
//						if (y > 0) {
//							world.setBlockMetadataWithNotify(x, y, z, BlockIDs.oreTC.blockID, 1);
//						}
//					}
//				}
//				else {
//					EntityFallingSand ent = new EntityFallingSand(world, (double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, blockID, meta);
//					//onStartFalling(ent);
//					world.spawnEntityInWorld(ent);
//				}
//			}
//		}
//	}

//	public static boolean canFallBelow(World world, int x, int y, int z) {
//		int var4 = world.getBlockId(x, y, z);
//		if (var4 == 0) {
//			return true;
//		}
//		else if (var4 == Block.fire.blockID) {
//			return true;
//		}
//		else {
//			Material var5 = Block.blocksList[var4].blockMaterial;
//			return var5 == Material.water ? true : var5 == Material.lava;
//		}
//	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks (Item par1, CreativeTabs tab, List subItems) 
  {
		for (int index = 0; index < 1; index++)
			subItems.add(new ItemStack(this, 1, index));
	}

//	@Override
//	@SideOnly(Side.CLIENT)
//	public void registerIcons (IconRegister iconRegister) 
//  {
//		texture1 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_copper");
//		texture2 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_oilsands");
//		texture3 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_petroleum");
//		texture4 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ballast_test");
//	}
    
//
//	public static Icon getTexture1() {
//		return texture1;
//	}

//  @Override
//  public int getMetaFromState (IBlockState blockState)
//  {
//    return blockState.getValue(TYPE_PROPERTY);
//  }
//
//  @Override
//  public IBlockState getStateFromMeta (int state_as_int)
//  {
//    return getDefaultState().withProperty(TYPE_PROPERTY, state_as_int);
//  }
}
