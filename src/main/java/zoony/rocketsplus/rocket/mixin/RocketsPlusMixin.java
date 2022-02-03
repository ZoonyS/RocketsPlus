package zoony.rocketsplus.rocket.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import zoony.rocketsplus.rocket.common.RocketsPlus;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class RocketsPlusMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		RocketsPlus.LOGGER.info("This line is printed by an example mod mixin!");
	}
}