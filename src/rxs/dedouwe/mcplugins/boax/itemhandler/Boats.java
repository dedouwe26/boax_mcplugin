package rxs.dedouwe.mcplugins.boax.itemhandler;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Boats {
	public static ItemStack boat = null;
	public static void init() {
		createBoat();
	}
	private static void createBoat() {
		ItemStack item = new ItemStack(Material.GUNPOWDER,1);
		ItemMeta meta = item.getItemMeta();
		meta.setCustomModelData(1248670);
		meta.setDisplayName(ChatColor.GRAY + "Boat");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Type: " + ChatColor.GRAY + "Normal");
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		item = boat;
	}

}
