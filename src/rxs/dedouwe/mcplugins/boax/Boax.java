package rxs.dedouwe.mcplugins.boax;

import org.bukkit.plugin.java.JavaPlugin;

import rxs.dedouwe.mcplugins.boax.events.Events;


public class Boax extends JavaPlugin {

	@Override
	public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        
		getLogger().info("[Boax] started succesfull");
	}
	
    @Override
	public void onDisable() {
		
	}

}