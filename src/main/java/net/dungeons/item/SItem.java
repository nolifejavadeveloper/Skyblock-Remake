package net.dungeons.item;

import net.dungeons.player.DungeonsPlayer;
import net.dungeons.reforge.IReforge;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import org.bukkit.Color;
import org.bukkit.Material;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public interface SItem extends Serializable {
    //**stats**
    double getStat(Stat stat, DungeonsPlayer player, SItemInstance use);
    SkyblockStats getStats(DungeonsPlayer player, SItemInstance use);
    //**data**
    ItemRarity getItemRarity(DungeonsPlayer player, SItemInstance use);
    String getTexture(DungeonsPlayer player, SItemInstance use);
    Color leatherColor(DungeonsPlayer player, SItemInstance use);
    boolean isDungeonized(DungeonsPlayer player, SItemInstance use);
    Material getMaterial(DungeonsPlayer player, SItemInstance use);
    int getCount(DungeonsPlayer player, SItemInstance use);
    IReforge getReforge(DungeonsPlayer player, SItemInstance use);
    String getItemID(DungeonsPlayer player, SItemInstance use);
    List<String> getDescription(DungeonsPlayer player, SItemInstance use);
    String getItemName(DungeonsPlayer player, SItemInstance use);
    boolean isUnique(SItemInstance use);
    UUID getUUID();
    byte getStars(DungeonsPlayer player, SItemInstance use);
}
