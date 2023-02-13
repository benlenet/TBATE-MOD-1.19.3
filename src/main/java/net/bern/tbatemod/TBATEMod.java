package net.bern.tbatemod;

import net.bern.tbatemod.block.ModBlocks;
import net.bern.tbatemod.item.ModItemGroup;
import net.bern.tbatemod.item.ModItems;
import net.bern.tbatemod.networking.ModMessages;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBATEMod implements ModInitializer {
	public static final String MOD_ID = "tbatemod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("tbatemod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution!
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModMessages.registerS2CPackets();
		LOGGER.info("Hello Fabric world!");
	}
}