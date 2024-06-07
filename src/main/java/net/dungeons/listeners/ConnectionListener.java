package net.dungeons.listeners;

import net.dungeons.manager.DungeonPlayerManager;
import net.dungeons.player.DungeonsPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onPrelog(AsyncPlayerPreLoginEvent event) {

    }


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        DungeonsPlayer player = DungeonPlayerManager.add(e.getPlayer());

        player.load();
    }

}
