package net.dungeons.item.gemstone;

import net.dungeons.stats.Stat;

public enum GemstoneType {
    RUBY(Stat.HEALTH),
    AMETHYST(Stat.DEFENSE),
    SAPPHIRE(Stat.INTELLIGENCE),
    CARNELIAN(Stat.FEROCITY),
    JASPER(Stat.STRENGTH);

    public final Stat stat;
    GemstoneType(Stat stat) {
        this.stat = stat;
    }


}
