package juliminecraft.dispenserplanting;

import net.minecraft.block.BlockDispenser;
import blusunrize.immersiveengineering.common.IEContent;

public class ImmersiveEngineering {
    public static void init(){        
        BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(IEContent.itemSeeds, new BehaviourSeeds(IEContent.blockCrop));
    }
}