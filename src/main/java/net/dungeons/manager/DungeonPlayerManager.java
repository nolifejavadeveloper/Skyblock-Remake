package net.dungeons.manager;

import net.dungeons.player.DungeonsPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DungeonPlayerManager {

    private static final Map<UUID, DungeonsPlayer> players = new HashMap<>();


    public static DungeonsPlayer getByUUID(UUID u) {
        return players.get(u);
    }

    public static void set(UUID uuid, DungeonsPlayer player) {
        players.put(uuid, player);
    }

    public static void remove(UUID uuid) {
        players.remove(uuid);
    }

}
