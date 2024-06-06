package net.dungeons.level;

public class SkyblockLevel {
    private int xp;

    public int getLevel() {
        return (xp - (xp % 100)) / 100;
    }

    public int getExperience() {
        return xp % 100;
    }
}
