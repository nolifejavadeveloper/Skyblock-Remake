package net.dungeons.item;

import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import org.bukkit.Color;
import org.bukkit.Material;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public interface SItem extends Serializable {
    //**stats**
    double getStat(Stat stat);
    SkyblockStats getStats();
    //**data**
    ItemRarity getItemRarity();
    String getTexture();
    Color leatherColor();
    boolean isDungeonized();
    Material getMaterial();
    String getItemID();
    List<String> getDescription();
    boolean isUnique();
    UUID getUUID();
    byte getStars();
}
