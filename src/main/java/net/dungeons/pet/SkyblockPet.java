package net.dungeons.pet;

import net.dungeons.item.SItemInstance;
import net.dungeons.stats.SkyblockStats;

public abstract class SkyblockPet {
    public abstract SkyblockStats getStats();
    public abstract int getMaxLevel();
    public abstract double getNextLevelTotalExp();
    public abstract double getMaxLevelTotalExp();
    public abstract int getLevel();
    public abstract SItemInstance getAsItem();
    public abstract double getExperienceToLevel(int level);

    //
    private String name;
    private double exp;

    public SkyblockPet(String name, double exp) {
        this.name = name;
        this.exp = exp;
    }
}
