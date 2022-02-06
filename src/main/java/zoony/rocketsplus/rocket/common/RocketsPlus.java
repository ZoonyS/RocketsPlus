package zoony.rocketsplus.rocket.common;

import zoony.rocketsplus.rocket.common.init.RocketsPlusBlock;
// import zoony.rocketsplus.rocket.common.block.LGM30;

import net.fabricmc.api.ModInitializer;
// import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
// import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

// import net.minecraft.block.Block;
// import net.minecraft.block.Material;
// import net.minecraft.item.BlockItem;
// import net.minecraft.util.Identifier;
// import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RocketsPlus implements ModInitializer {
	public static final String MODID = "rocketsplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	//public static final Block LGM30 = new LGM30(FabricBlockSettings.of(Material.AGGREGATE));

	// static {
	// 	Registry.register(Registry.BLOCK, new Identifier(MODID, "lgm30"), LGM30);
	// 	Registry.register(Registry.ITEM, new Identifier(MODID, "lgm30"), new BlockItem(LGM30, new FabricItemSettings()));
	// }
	
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		RocketsPlusBlock.init();
	}

}
