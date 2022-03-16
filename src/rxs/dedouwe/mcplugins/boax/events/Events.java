package rxs.dedouwe.mcplugins.boax.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import rxs.dedouwe.mcplugins.boax.Boax;

public class Events implements Listener {
	// Events here with @eventhandler
	Boax plugin;
	public Events(Boax plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.getPlayer().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "[Boax] Please install the resource pack!");
		event.getPlayer().setResourcePack("https://dedouwe.nl/content/minecraft/resource/boax-pack.zip");
	}
	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		new BukkitRunnable() {
		    public void run() {
		    	if (!(e.getItemDrop().isOnGround())) {
           		 if (e.getItemDrop().getItemStack().getItemMeta().getCustomModelData() == 1248670) 
        				if (e.getItemDrop().isInWater()) {
        					Location loc = e.getItemDrop().getLocation();
        					Entity a = e.getItemDrop().getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
        					a.
        					cancel();
        				}
           	 	} else {
           	 		cancel();
           	 	}
		     }
		}.runTaskTimer(plugin, 1L, 0L);};

}