package juliminecraft.dispenserplanting;

import java.util.HashMap;
import java.util.Map;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.growables.BlockPamCrop;

import org.apache.logging.log4j.Level;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLLog;

public class Harvestcraft {
	public static void init() {

        if(!CropRegistry.isInitialized()){
            FMLLog.bigWarning("juliminecraft: Crop Registry not initialized!");
        }
        
        HashMap<String, BlockPamCrop> crops = CropRegistry.getCrops();
        HashMap<String, Item> seeds = CropRegistry.getSeeds();

        for(Map.Entry<String, Item> entry:seeds.entrySet()){                      
            BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(entry.getValue(), new BehaviourSeeds(crops.get(entry.getKey())));
        }
	}
}