package net.dungeons.item.gemstone;

import net.dungeons.stats.Stat;

public enum GemstoneType {
    RUBY(Stat.HEALTH, new double[]{7, 10, 14, 22, 30}),
    AMETHYST(Stat.DEFENSE, new double[]{7, 10, 14, 22, 30}),
    SAPPHIRE(Stat.INTELLIGENCE, new double[]{7, 10, 12, 20, 30}),
    CARNELIAN(Stat.FEROCITY, new double[]{3, 3.5, 5, 7, 10}),
    JASPER(Stat.STRENGTH, new double[]{4, 5, 7, 12, 16});

    public final Stat stat;
    private final double[] values;
    GemstoneType(Stat stat, double[] values) {
        this.stat = stat;
        this.values = values;
    }

    public double getStatBonusByQuality(GemstoneQuality gemstoneQuality) {
        return values[gemstoneQuality.index];
    }
}
