package HQuester;

import org.bukkit.plugin.java.JavaPlugin;
import HQuester.managers.PluginManager;
import HQuester.listeners.PlayerListener;

public class HQuester extends JavaPlugin {
    
    @Override
    public void onEnable() {
        
        // Initialize managers
        PluginManager.getInstance().initialize();
        
        // Register listeners
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        
        getLogger().info("HQuester has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("HQuester has been disabled!");
    }
    
}