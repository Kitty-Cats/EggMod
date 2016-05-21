package net.geeknerds.mods.eggmod.recipe;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by Joshua on 21/05/2016.
 */
public class ObsidianToDragon {

  public static final int NUMBER_OF_EGGS = 1;
  public static final float XP = 100.0F;

  public static void addToGame() {
    GameRegistry.addSmelting(
        Blocks.obsidian,
        new ItemStack(Blocks.dragon_egg, NUMBER_OF_EGGS), XP);
  }

}
