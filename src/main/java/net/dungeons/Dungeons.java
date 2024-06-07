package net.dungeons;

import net.dungeons.commands.SkyblockCommand;
import net.dungeons.commands.SkyblockMenuCommand;
import net.dungeons.item.SItemRegistry;
import net.dungeons.listeners.ConnectionListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;

public class Dungeons extends JavaPlugin {
    private static Dungeons plugin;
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

        SItemRegistry.init();

        //other stuff
        getCommand("skyblock").setExecutor(new SkyblockCommand());
        getCommand("sbmenu").setExecutor(new SkyblockMenuCommand());

        plugin = this;
    }

    @Override
    public void onDisable() {

    }

    public static Dungeons getPlugin()
    {
        return plugin;
    }
}
