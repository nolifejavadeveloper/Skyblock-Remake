package net.dungeons.manager;

import net.dungeons.player.DungeonsPlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DungeonPlayerManager {

    private static final Map<UUID, DungeonsPlayer> players = new HashMap<>();


    public static DungeonsPlayer getByUUID(UUID u) {
        return players.get(u);
    }
    public static DungeonsPlayer getByPlayer(Player player) {return getByUUID(player.getUniqueId());}

    public static void set(UUID uuid, DungeonsPlayer player) {
        players.put(uuid, player);
    }

    public static void remove(UUID uuid) {
        players.remove(uuid);
    }

    public static DungeonsPlayer add(Player player)
    {
        DungeonsPlayer p = new DungeonsPlayer(player);

        players.put(player.getUniqueId(), p);

        return p;
    }

}
