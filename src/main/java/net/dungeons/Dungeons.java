package net.dungeons;

import net.dungeons.listeners.ConnectionListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;

public class Dungeons extends JavaPlugin {
    @Override
    public void onEnable() {
        //Register Listeners

        //register listeners
        Reflections reflection = new Reflections("net.dungeons.listeners");

        for (Class<?> clasz : reflection.getSubTypesOf(Listener.class))
        {
            try {
                getServer().getPluginManager().registerEvents((Listener) clasz.newInstance(), this);
            } catch (Exception e)
            {
                System.out.println("Error while instanciating listener");
            }
        }

        //other stuff
    }

    @Override
    public void onDisable() {

    }
}
