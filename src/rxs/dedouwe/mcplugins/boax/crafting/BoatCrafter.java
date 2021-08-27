package rxs.dedouwe.mcplugins.boax.crafting;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import rxs.dedouwe.mcplugins.boax.Boax;
import rxs.dedouwe.mcplugins.boax.itemhandler.Boats;

public class BoatCrafter {
	RecipeChoice boats = new RecipeChoice.MaterialChoice(Arrays.asList(
			Material.OAK_BOAT, Material.BIRCH_BOAT, Material.SPRUCE_BOAT,Material.ACACIA_BOAT,Material.JUNGLE_BOAT));
	Boax boax = new Boax();
	public BoatCrafter(Boax boax) {
		boax = this.boax;
	}
	public ShapedRecipe getRecipe() {
		NamespacedKey key = new NamespacedKey(boax, "boax");
		ShapedRecipe recipe = new ShapedRecipe(key, Boats.boat);
		
		recipe.shape(" Q ", "QBQ", " Q ");
		recipe.setIngredient('Q', Material.QUARTZ_BLOCK);
		
		recipe.setIngredient('Q', boats);
		
		return recipe;
	}
}
