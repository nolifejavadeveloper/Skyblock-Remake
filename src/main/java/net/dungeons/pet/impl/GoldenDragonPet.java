package net.dungeons.pet.impl;

import net.dungeons.item.SItemInstance;
import net.dungeons.pet.SkyblockPet;
import net.dungeons.stats.SkyblockStats;

public class GoldenDragonPet extends SkyblockPet {
    public GoldenDragonPet(String name, double exp) {
        super(name, exp);
    }

    @Override
    public SkyblockStats getStats()
    {
        return new SkyblockStats()
                .setBonusAttackSpeed(78)
                .setMagicFind(50)
                .setStrength(198);
    }

    @Override
    public int getMaxLevel()
    {
        return 200;
    }

    @Override
    public double getNextLevelTotalExp()
    {
        return this.getLevel() * 398;
    }

    @Override
    public double getMaxLevelTotalExp()
    {
        return 0;
    }

    @Override
    public int getLevel()
    {
        return 3;
    }

    @Override
    public double getExperienceToLevel(int level)
    {
        return 4 * level;
    }

    @Override
    public SItemInstance getAsItem()
    {
        //pog
        return null;
    }
}
