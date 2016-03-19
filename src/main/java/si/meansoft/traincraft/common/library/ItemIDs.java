/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package si.meansoft.traincraft.common.library;

import net.minecraft.item.Item;

public enum ItemIDs 
{
//	diesel("ItemContainer", "item_diesel_filled", 20),
//	stake("ItemStacked", "item_stake", 1),
//	steeldust("ItemTrain", "item_steeldust", 0),
//	coaldust("ItemTrain", "item_coaldust", 15),
//	graphite("ItemTrain", "item_graphite", 10),
//	boiler("ItemTrain", "item_boiler_steel", 5),
//	firebox("ItemTrain", "item_firebox_steel", 5),
//	bogie("ItemTrain", "item_bogie_steel", 4),
//	steelframe("ItemTrain", "item_frame_steel", 6),
//	steelcab("ItemTrain", "item_cab_steel", 5),
//	steelchimney("ItemTrain", "item_chimney_steel", 5),
//	airship("ItemZeppelin", "item_zeppelin", 1),
//	balloon("ItemTrain", "item_balloon", 7),
//	propeller("ItemTrain", "item_propeller", 6),
//	steamengine("ItemTrain", "item_engine_steam", 2),
//	dieselengine("ItemTrain", "item_engine_diesel", 1),
//	piston("ItemTrain", "item_piston", 9),
//	camshaft("ItemTrain", "item_camshaft", 8),
//	cylinder("ItemTrain", "item_cylinder", 7),
//	electmotor("ItemTrain", "item_engine_electric", 1),
//	woodenFrame("ItemTrain", "item_frame_wood", 12),
//	woodenBogie("ItemTrain", "item_bogie_wood", 15),
//	woodenCab("ItemTrain", "item_cab_wood", 10),
//	ironChimney("ItemTrain", "item_chimney_iron", 7),
//	ironFirebox("ItemTrain", "item_firebox_iron", 4),
//	ironBoiler("ItemTrain", "item_boiler_iron", 5),
//	ironFrame("ItemTrain", "item_frame_iron", 6),
//	ironBogie("ItemTrain", "item_bogie_iron", 8),
//	ironCab("ItemTrain", "item_cab_iron", 5),
//	steel("ItemTrain", "item_steel", 4),
//	refinedFuel("ItemContainer", "item_fuel_filled", 15),
//	signal("ItemSignal", "item_signal", 0),
//	seats("ItemTrain", "item_seats", 15),
//	transformer("ItemTrain", "item_transformer", 4),
//	controls("ItemTrain", "item_controls", 7),
//	transmition("ItemTrain", "item_transmition", 5),
//	generator("ItemTrain", "item_generator", 5),
//	overalls("ItemTCArmor", "armour_overalls", 1),
//	jacket("ItemTCArmor", "armour_jacket", 1),
//	hat("ItemTCArmor", "armour_hat", 1),
//	rawPlastic("ItemTrain", "item_plastic", 20),
	ingotCopper("ItemTrain", "item_copper", 9),
//	copperWireFine("ItemTrain", "item_wire", 4),
//	electronicCircuit("ItemTrain", "item_circuit", 2),
//	chunkLoaderActivator("ItemChunkLoaderActivator", "item_chunk_loader", 1),
//	//refinedFuelLiquid("ItemTrain", "item_liquid_fuel"),
//	//dieselLiquid("ItemTrain", "item_liquid_diesel"),
//	emptyCanister("ItemContainer", "item_canister", 40),
//	copperRail("ItemRail", "item_rail_copper", 1),
//	steelRail("ItemRail", "item_rail_steel", 1),
//	recipeBook("ItemRecipeBook", "", 1),
//
//	minecartWork("ItemRollingStock", "train_work", 4),
//	minecartTender("ItemRollingStock", "train_tender", 4),
//	minecartChest("ItemRollingStock", "train_freight_1", 4),
//	minecartPower("ItemRollingStock", "train_steam_normal", 10),
//	minecartLoco3("ItemRollingStock", "train_steam_small", 7),
//	minecartBuilder("ItemRollingStock", "train_builder", 20),
//	minecartCaboose("ItemRollingStock", "train_caboose", 6),
//	minecartGrain("ItemRollingStock", "train_hopper_grain", 6),
//	minecartWatertransp("ItemRollingStock", "train_tank_lava", 7),
//	minecartWood("ItemRollingStock", "train_transport_wood", 3),
//	minecartPassenger2("ItemRollingStock", "train_passenger_1", 2),
//	minecartBR_E69("ItemRollingStock", "train_bre69", 10),
//	minecartShunter("ItemRollingStock", "train_shunter", 10),
//	minecartVL10("ItemRollingStock", "train_vl10", 10),
//	minecartTramWood("ItemRollingStock", "train_tram", 7),
//	minecartChmE3("ItemRollingStock", "train_chme3", 8),
	//minecartHeavySteam("ItemRollingStock", "steam", HandleMaxAttachedCarts.HEAVY_STEAM_CARTS, 0D, (int) SpeedHandler.HEAVYSTEAM, "train_steam_heavy"),//TODO put it back once Heavy Steam is back
	//minecartTenderHeavy("ItemRollingStock", "train_tender_heavy", 5),
//	minecartFlatCart("ItemRollingStock", "train_flat", 1),
	//minecartNewHighSpeedLoco("ItemRollingStock","train_speed",10),
//	minecartFreightCart2("ItemRollingStock", "train_freight_2", 2),
//	minecartOpenWagon("ItemRollingStock", "train_hopper", 3),
//	minecartTankWagon("ItemRollingStock", "train_tank_us", 5),
//	minecartJukeBoxCart("ItemRollingStock", "train_jukebox", 10),
//	minecartStockCar("ItemRollingStock", "train_stock", 10),
//	minecartCabooseWork("ItemRollingStock", "train_caboose_work", 3),
//	minecartPassenger5("ItemRollingStock", "train_passenger_2", 2),
//	minecartTankWagon2("ItemRollingStock", "train_tank_blue", 5),
//	minecartPassengerBlue("ItemRollingStock", "train_passenger_3", 2),
//	minecartGP7Red("ItemRollingStock", "train_gp7", 10),
//	minecartCD742("ItemRollingStock", "train_cd742", 10),
//	minecartFlatCartSU("ItemRollingStock", "train_flat_su", 1),
//	minecartFlatCartUS("ItemRollingStock", "train_flat_us", 1),
//	minecartBoxCartUS("ItemRollingStock", "train_box_us", 4),
//	minecartFreightHopperUS("ItemRollingStock", "train_hopper_us", 6),
//	minecartTankWagonUS("ItemRollingStock", "train_tank_us_2", 8),
//	minecartFlatCartWoodUS("ItemRollingStock", "train_flat_wood", 3),
//	minecartFreightCartUS("ItemRollingStock", "train_freight_3", 4),
//	minecartFreightCartSmall("ItemRollingStock", "train_freight_4", 2),
//	minecartLocoCherepanov("ItemRollingStock", "train_cherpanov", 4),
//	minecartMineTrain("ItemRollingStock", "train_mine_cart", 1),
//	minecartLocoMineTrain("ItemRollingStock", "train_mine_train", 2),
//	minecartSteamRedTender("ItemRollingStock", "train_tender_steam", 4),
//	minecartFreightWood2("ItemRollingStock", "train_transport_wood_2", 6),
//	minecartCaboose3("ItemRollingStock", "train_caboose_2", 3),
//	minecartPassenger7("ItemRollingStock", "train_passenger_4", 2),
//	minecartFreightClosed("ItemRollingStock", "train_freight_closed", 5),
//	minecartFreightOpen2("ItemRollingStock", "train_freight_open", 6),
//	minecartLocomogulBlue("ItemRollingStock", "train_mogul", 10),
//	minecartLocoForneyRed("ItemRollingStock", "train_forney", 10),
//	minecartLocoBR01_DB("ItemRollingStock", "train_br01", 15),
//	minecartMailWagon_DB("ItemRollingStock", "train_mail", 4),
//	minecartFreightWagon_DB("ItemRollingStock", "train_freight_db", 3),
//	minecartPassenger8_1class_DB("ItemRollingStock", "train_passenger_5", 6),
//	minecartPassenger9_2class_DB("ItemRollingStock", "train_passenger_6", 5),
	minecartLocoBR80_DB("ItemRollingStock", "train_br80", 10),
//	minecartTenderBR01_DB("ItemRollingStock", "train_tender_br01", 15),
//	minecartFlatCartRail_DB("ItemRollingStock", "train_transport_rail", 6),
//	minecartFlatCart_DB("ItemRollingStock", "train_flat_db", 1),
//	minecartFlatCartLogs_DB("ItemRollingStock", "train_transport_wood_3", 2),
//	minecartFreightGondola_DB("ItemRollingStock", "train_freight_gondola", 3),
//	minecartTankWagon_DB("ItemRollingStock", "train_tank_db", 6),
//	minecartLocoSD70("ItemRollingStock", "train_sd70", 10),
	//minecartRotativeDigger("ItemRotativeDigger","train_",10),
//	minecartLocoEr("ItemRollingStock", "train_ussr", 10),
//	minecartTenderEr("ItemRollingStock", "train_tender_ussr", 4),
	//minecartLocoU57("ItemRollingStock","train_",10),
	//minecartTenderU57("ItemRollingStock","train_",10),
	//minecartLocoSD40("ItemRollingStock","train_",10),
//	minecartFreightCenterBeam_Empty("ItemRollingStock", "train_freight_empty", 2),
//	minecartFreightCenterBeam_Wood_1("ItemRollingStock", "train_freight_wood_1", 3),
//	minecartFreightCenterBeam_Wood_2("ItemRollingStock", "train_freight_wood_2", 3),
//	minecartFreightTrailer("ItemRollingStock", "train_freight_trailer", 5),
//	minecartFreightWellcar("ItemRollingStock", "train_freight_wellcar", 5),
//	minecartKof_DB("ItemRollingStock", "train_kof", 10),
//	minecartV60_DB("ItemRollingStock", "train_v60", 10),

//	hat_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_hat", 1),
//	pants_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_pants", 1),
//	jacket_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_jacket", 1),
//	hat_driver_paintable("ItemTCArmor", "armor_driver_hat", 1),
//	pants_driver_paintable("ItemTCArmor", "armor_driver_pants", 1),
//	jacket_driver_paintable("ItemTCArmor", "armor_driver_jacket", 1),
//
//	helmet_suit_paintable("ItemTCArmor", "armor_composite_helmet", 1),
//	pants_suit_paintable("ItemTCArmor", "armor_composite_pants", 1),
//	boots_suit_paintable("ItemTCArmor", "armor_composite_boots", 1),
//	jacket_suit_paintable("ItemTCArmor", "armor_composite_chest", 1),
//	reinforcedPlastic("ItemTrain", "item_fiberglass_plate", 10),
//	reinforcedPlates("ItemTrain", "item_reinforced_plate", 10),
//	composite_wrench("ItemWrench", "item_composite_wrench", 1),
//
//	minecartPassengerHighSpeedCarZeroED("ItemRollingStock", "train_high_speed_cart_zeroed", 14),
//	minecartNYTram("ItemRollingStock", "train_tram_ny", 7),
//	minecartLocoHighSpeedZeroED("ItemRollingStock", "train_high_speed_loco_zeroed", 17),
//	minecartLocoC62Class("ItemRollingStock", "train_loco_c62_class", 14),
//	minecartTenderC62Class("ItemRollingStock", "train_tender_c62_class", 5),
//	minecartLocoSteamShay("ItemRollingStock", "train_shay", 4),
//	minecartLocoSteamAdler("ItemRollingStock", "train_adler", 3),
//	minecartTenderAdler("ItemRollingStock", "train_tender_adler", 1),
//	minecartPassengerAdler("ItemRollingStock", "train_passenger_adler", 2),
//	
//	minecartCabooseLogging("ItemRollingStock", "train_logging_caboose", 1),
//	minecartPassengerTramNY("ItemRollingStock", "train_tram_ny", 3),
//	//TODO Needs icon
//	//minecartPassengerDBOriental("ItemRollingStock", "train_tram_ny", 2),
//	minecartLocoSD40("ItemRollingStock", "train_sd40", 10),
//	zeppelin("ItemZeppelin", "item_zeppelin_one_balloon", 1),
//	
//	tcRailSmallStraight("ItemTCRail", "item_rail_straight_small", 5),
//	tcRailMediumStraight("ItemTCRail", "item_rail_straight_medium", 5),
//	tcRailLongStraight("ItemTCRail", "item_rail_straight_large", 5),
//	
//	tcRailMediumTurn("ItemTCRail", "item_rail_turn_medium", 5),
//	tcRailLargeTurn("ItemTCRail", "item_rail_turn_large", 5),
//	tcRailVeryLargeTurn("ItemTCRail", "item_rail_turn_veryLarge", 5),
//
//	tcRailMediumSwitch("ItemTCRail", "item_rail_switch_medium", 5),
//	tcRailLargeSwitch("ItemTCRail", "item_rail_switch_large", 5),
//	tcRailMediumParallelSwitch("ItemTCRail", "item_rail_switch_parallel", 5),
//	
//	tcRailTwoWaysCrossing("ItemTCRail","item_rail_two_ways_crossing",5),
//	tcRailLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 5),
//	tcRailLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 5),
//	tcRailLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 5)
  ;

	public Item item;
	public int itemID;
	public String className;
	public String iconName;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;

	/**
	 * @param languageName
	 * @param classMethodName
	 * @param iconName
	 * @param amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

	public static String getIcon(int itemIDs) {
		for (ItemIDs itemID : ItemIDs.values()) {
			if (itemIDs == itemID.itemID + 256) {
				return itemID.iconName;
			}
		}
		return "";
	}
}
