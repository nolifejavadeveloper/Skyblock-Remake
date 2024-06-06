package net.dungeons.reforge;

import net.dungeons.item.SItemInstance;
import net.dungeons.player.DungeonsPlayer;
import net.dungeons.stats.SkyblockStats;

public interface IReforge {
    public SkyblockStats getStats(DungeonsPlayer player, SItemInstance item);
    public String getReforgeName();
}
