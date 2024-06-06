package net.dungeons.item;

import org.bukkit.Material;

public class SItemBasic implements SItem {
    @Override
    public double getHealth() {
        return 500;
    }

    @Override
    public boolean isDungeonized() {
        return false;
    }

    @Override
    public Material getMaterial() {
        return Material.ACACIA_BUTTON;
    }
}
