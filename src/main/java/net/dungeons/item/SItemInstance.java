package net.dungeons.item;

import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import org.bukkit.Material;

public class SItemInstance implements SItem {
    private SkyblockStats stats;
    private boolean dungeonized;

    @Override
    public boolean isDungeonized() {
        return dungeonized;
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public double getStat(Stat stat) {
        return 0.0d;
    }
}
