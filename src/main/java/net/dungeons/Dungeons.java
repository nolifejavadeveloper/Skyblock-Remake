package net.dungeons;

import net.dungeons.listeners.ConnectionListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Dungeons extends JavaPlugin {
    @Override
    public void onEnable() {
        //Register Listeners
        getServer().getPluginManager().registerEvents(new ConnectionListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
