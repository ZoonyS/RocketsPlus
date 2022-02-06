package zoony.rocketsplus.rocket.common.init;

import zoony.rocketsplus.rocket.common.block.LGM30;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RocketsPlusBlock {
    public static Block LGM30_BLOCK;
    public static BlockItem LGM30_BLOCK_ITEM;
    
    public static void init() {
		LGM30_BLOCK = Registry.register(Registry.BLOCK, new Identifier(zoony.rocketsplus.rocket.common.RocketsPlus.MODID, "lgm30"), new LGM30(FabricBlockSettings.of(Material.AGGREGATE)));
		LGM30_BLOCK_ITEM = Registry.register(Registry.ITEM, new Identifier(zoony.rocketsplus.rocket.common.RocketsPlus.MODID, "lgm30"), new BlockItem(LGM30_BLOCK, new FabricItemSettings()));
    }
}
