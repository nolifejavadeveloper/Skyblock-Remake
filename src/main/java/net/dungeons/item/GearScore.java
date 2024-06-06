package net.dungeons.item;

import net.dungeons.player.DungeonsPlayer;

public class GearScore {
    public static int getGearScore(SItem item, DungeonsPlayer player)
    {
        int value = item.getItemRarity(player, null).rarity;

        value *= item.getStars(player, null);
        value *= item.getEnchantments(player, null).size();

        return value;
    }
}
