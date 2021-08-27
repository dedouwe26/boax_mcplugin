package rxs.dedouwe.mcplugins.boax;

import org.bukkit.plugin.java.JavaPlugin;

import rxs.dedouwe.mcplugins.boax.crafting.BoatCrafter;
import rxs.dedouwe.mcplugins.boax.events.Events;
import rxs.dedouwe.mcplugins.boax.itemhandler.Boats;


public class Boax extends JavaPlugin {

	@Override
	public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        BoatCrafter crafter = new BoatCrafter(this);
        getServer().addRecipe(crafter.getRecipe());
        Boats.init();
        
		getLogger().info("[Boax] started succesfull");
	}
	
    @Override
	public void onDisable() {
		
	}

}