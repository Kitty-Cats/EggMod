package net.geeknerds.mods.eggmod;

import net.geeknerds.mods.eggmod.recipe.ObsidianToDragon;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = EggMod.MODID, version = EggMod.VERSION)
public class EggMod {
  public static final String MODID = "eggmod";
  public static final String VERSION = "1.0";

  @EventHandler
  public void init(FMLInitializationEvent event) {
    // some example code
    System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    ObsidianToDragon.addToGame();
  }
}
