package juliminecraft.dispenserplanting;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "dispenserplanting", name = "Dispenserplanting harvestcraft addon", version = "0.1")
public class Dispenserplanting {
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Harvestcraft.init();
	}
}