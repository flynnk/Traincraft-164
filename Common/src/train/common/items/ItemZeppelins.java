package src.train.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import src.train.common.Traincraft;
import src.train.common.core.handlers.ConfigHandler;
import src.train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import src.train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import src.train.common.library.Info;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemZeppelins extends Item {
	private int type;
	public ItemZeppelins(int i,int type) {
		super(i);
		maxStackSize = 5;
		setCreativeTab(Traincraft.tcTab);
		this.type=type;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		float f = 1.0F;
		float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
		float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
		double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double) f;
		double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double) f + 1.6200000000000001D) - (double) entityplayer.yOffset;
		double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double) f;
		Vec3 vec3d = Vec3.fakePool.getVecFromPool(d, d1, d2);
		float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
		float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
		float f5 = -MathHelper.cos(-f1 * 0.01745329F);
		float f6 = MathHelper.sin(-f1 * 0.01745329F);
		float f7 = f4 * f5;
		float f8 = f6;
		float f9 = f3 * f5;
		double d3 = 5D;
		Vec3 vec3d1 = vec3d.addVector((double) f7 * d3, (double) f8 * d3, (double) f9 * d3);
		MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(vec3d, vec3d1, true, false);
		if (movingobjectposition == null) { return itemstack; }
		if (!world.isRemote && !ConfigHandler.ENABLE_ZEPPELIN) {
			if (entityplayer != null) entityplayer.addChatMessage("Zeppelin has been deactivated by the OP");
			return itemstack;
		}
		if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE) {
			int i = movingobjectposition.blockX;
			int j = movingobjectposition.blockY;
			int k = movingobjectposition.blockZ;
			if (!world.isRemote) {
				if(type==0)world.spawnEntityInWorld(new EntityZeppelinTwoBalloons(world, (float) i + 0.5F, (float) j + 1.5F, (float) k + 0.5F));
				if(type==1)world.spawnEntityInWorld(new EntityZeppelinOneBalloon(world, (float) i + 0.5F, (float) j + 1.5F, (float) k + 0.5F));
			}
			itemstack.stackSize--;
		}
		return itemstack;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "More info in the guidebook.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		if(type==0)this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":zeppelin");
		if(type==1)this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":zeppelin_one_balloon");
	}
}
