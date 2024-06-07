package net.dungeons.skills.impl;

import net.dungeons.skills.Skill;

public class TamingSkill extends Skill {
    private double xp;

    public TamingSkill(double xp) {
        this.xp = xp;
    }

    @Override
    public String getSkillName() {
        return "Taming";
    }

    @Override
    public int getMaxLevel() {
        return 60;
    }

    @Override
    public int getLevelFromExperience(double experience) {
        //TODO: do this
        return 0;
    }
}
