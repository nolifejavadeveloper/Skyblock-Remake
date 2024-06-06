package net.dungeons.item.impl.sword;

import com.google.common.collect.Lists;
import net.dungeons.item.ItemRarity;
import net.dungeons.item.SItem;
import net.dungeons.item.SItemInstance;
import net.dungeons.player.DungeonsPlayer;
import net.dungeons.reforge.IReforge;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import net.dungeons.util.Stringify;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.List;
import java.util.UUID;

public class WoodenSword implements SItem {

    @Override
    public double getStat(Stat stat, DungeonsPlayer player, SItemInstance use) {
        return getStats(player, use).getStat(stat);
    }

    @Override
    public SkyblockStats getStats(DungeonsPlayer player, SItemInstance use) {
        //This will be passed null when trying to grab the base stats of the item
        if (use == null)
            return new SkyblockStats()
                    .setDamage(500)
                    .setStrength(185);

        //if the player has above 500 health, we will add 500 damage to the sword on top of the base!
        if (player.getHealth() >= 500)
            return use.stats.addStat(Stat.DAMAGE, 500);

        //return the base stats of the instance item
        return use.stats;
    }

    @Override
    public ItemRarity getItemRarity(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return ItemRarity.VERYSPECIAL;
        return use.rarity;
    }

    @Override
    public String getTexture(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public Color leatherColor(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public boolean isDungeonized(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return false;
        return use.dungeonized;
    }

    @Override
    public Material getMaterial(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return null;
        return use.material;
    }

    @Override
    public int getCount(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return 1;
        return use.count;
    }

    @Override
    public IReforge getReforge(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return null;
        return use.reforge;
    }

    @Override
    public String getItemID(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return "WOODEN_SWORD";
        return use.itemId;
    }

    @Override
    public List<String> getDescription(DungeonsPlayer player, SItemInstance use) {
        return Stringify.createLore(
                "&7Your Health: &c" + player.getHealth()
        );
    }

    @Override
    public String getItemName(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return "Wooden Sword";
        return use.name;
    }

    @Override
    public boolean isUnique(SItemInstance use) {
        if (use == null)
            return true;
        return use.unique;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public byte getStars(DungeonsPlayer player, SItemInstance use) {
        if (use == null)
            return 10;
        return use.stars;
    }
}
