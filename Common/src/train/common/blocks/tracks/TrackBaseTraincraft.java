/**
 * This is based on Railcraft's code
 * @author CovertJaguar
 */
package src.train.common.blocks.tracks;

import mods.railcraft.api.tracks.TrackInstanceBase;
import mods.railcraft.api.tracks.TrackRegistry;
import mods.railcraft.api.tracks.TrackSpec;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.Icon;
import src.train.common.library.TrackIDs;

public abstract class TrackBaseTraincraft extends TrackInstanceBase {
	public SpeedController speedController;

	public abstract TrackIDs getTrackType();
	@Override
	public float getRailMaxSpeed(EntityMinecart cart) {
		if (this.speedController == null) {
			this.speedController = SpeedController.getInstance();
		}
		return this.speedController.getMaxSpeed(this, cart);
	}
	@Override
	public TrackSpec getTrackSpec() {
		return TrackRegistry.getTrackSpec(getTrackType().ordinal() + 513);
	}
	@Override
	public Icon getIcon() {
		return getIcon(0);
	}

	public Icon getIcon(int index) {
		return TrackTextureLoader.INSTANCE.getTrackIcons(getTrackSpec())[index];
	}

	public int getPowerPropagation() {
		return 0;
	}
}
