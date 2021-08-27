package rxs.dedouwe.mcplugins.boax.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {
	// Events here with @eventhandler
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.getPlayer().sendMessage(ChatColor.RED + "[Boax] Please install the resource pack!");
		event.getPlayer().setResourcePack("https://dedouwe.nl/content/minecraft/resource/boax-pack.zip");
	}

}