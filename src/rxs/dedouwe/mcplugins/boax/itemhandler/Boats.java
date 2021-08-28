package rxs.dedouwe.mcplugins.boax.itemhandler;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Boats {
	public static ItemStack boat;
	public static void init() {
		createBoat();
	}
	private static void createBoat() {
		ItemStack item = new ItemStack(Material.GUNPOWDER,1);
		ItemMeta meta = item.getItemMeta();
		meta.setCustomModelData(1248670);
		meta.setDisplayName(ChatColor.GRAY + "Boat");
		ArrayList<String> lore = new ArrayList<>();
		lore.add(ChatColor.WHITE + "Type: " + ChatColor.GRAY + "Normal");
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		boat=item;
		
		//RecipeChoice boats = new RecipeChoice.MaterialChoice(Arrays.asList(
		//Material.OAK_BOAT, Material.BIRCH_BOAT, Material.SPRUCE_BOAT,Material.ACACIA_BOAT,Material.JUNGLE_BOAT));
		ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("custom_boat"), item);
			
		recipe.shape(" Q ", 
					     "QBQ", 
					     " Q ");
			
		recipe.setIngredient('Q', Material.QUARTZ_BLOCK);
		recipe.setIngredient('B', Material.OAK_BOAT);
		
		Bukkit.getServer().addRecipe(recipe);

	}
}
