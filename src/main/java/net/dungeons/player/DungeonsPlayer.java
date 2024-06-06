package net.dungeons.player;

import net.dungeons.world.SLocation;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class DungeonsPlayer {
    /*
    * HashMap to <UUID, DungeonsPlayer> to store data, static final is best
    * coins, bank coins, fairy souls, SkyblockStats, (no island), load(), save(), lombok
    * getPlayer()
    * public DungeonsPlayer(Player player) {}
    * SkyblockLevels (int = xp)
    * Rank
    * */
    //fields
    private SLocation location;
    private Player player;
    public DungeonsPlayer(Player player)
    {
        this.location = SLocation.getDefault();
        this.player = player;
    }

    public SLocation getLocation()
    {
        return this.location;
    }

    public void setLocation(SLocation location)
    {
        this.location = location;
    }

    public Location getPosition()
    {
        return this.player.getLocation();
    }

    public void setPosition(Location location)
    {
        this.player.teleport(location);
    }

    public Player getPlayer()
    {
        return this.player;
    }
}
