package net.dungeons.item.impl.sword;

import com.google.common.collect.Lists;
import net.dungeons.item.ItemRarity;
import net.dungeons.item.SItem;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import net.dungeons.util.Stringify;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.List;
import java.util.UUID;

public class WoodenSword implements SItem {
    @Override
    public double getStat(Stat stat) {
        return getStats().getStat(stat);
    }

    @Override
    public SkyblockStats getStats() {
        return new SkyblockStats()
                .setDamage(500)
                .setStrength(100);
    }

    @Override
    public ItemRarity getItemRarity() {
        return ItemRarity.VERYSPECIAL;
    }

    @Override
    public String getTexture() {
        return null;
    }

    @Override
    public Color leatherColor() {
        return null;
    }

    @Override
    public boolean isDungeonized() {
        return false;
    }

    @Override
    public Material getMaterial() {
        return Material.WOODEN_SWORD;
    }

    @Override
    public String getItemID() {
        return "WOODEN_SWORD";
    }

    @Override
    public List<String> getDescription() {
        return Stringify.createLore(
                "&7This is a developer item created upon",
                "&7initial development. You should not have",
                "&7this item. Please talk to staff members."
        );
    }

    @Override
    public boolean isUnique() {
        return false;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public byte getStars() {
        return 0;
    }
}
