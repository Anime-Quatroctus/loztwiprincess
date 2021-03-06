package com.crafter6789.loztwiprincess.world.dimension;

import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	
	public static void mainRegistry(){
		registerWorldProvider();
		registerDimensions();
	}

	public static void registerDimensions(){
		DimensionManager.registerDimension(RefStrings.dimensionId, RefStrings.dimensionId);
	}
	
	public static void registerWorldProvider(){
		//DimensionManager.registerProviderType(RefStrings.dimensionId, WorldProviderTwilightPrincess.class, false);
		DimensionManager.registerProviderType(RefStrings.dimensionId, WorldProviderTwilightPrincess.class, true);
	}

}