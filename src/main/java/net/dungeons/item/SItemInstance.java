package net.dungeons.item;

import net.dungeons.item.ability.SAbility;
import net.dungeons.item.enchant.Enchantment;
import net.dungeons.player.DungeonsPlayer;
import net.dungeons.reforge.IReforge;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.List;
import java.util.UUID;

public class SItemInstance implements SItem {
    public SkyblockStats stats;
    public boolean dungeonized;
    public ItemRarity rarity;
    public String texture;
    public Material material;
    public int count;
    public IReforge reforge;
    public String itemId;
    public String name;
    public SItem baseItem;
    public boolean unique;
    public UUID uuid;
    public byte stars;
    public List<Enchantment> enchantments;
    public SItemModifier itemModifier;


    @Override
    public double getStat(Stat stat, DungeonsPlayer player, SItemInstance use) {
        return this.getStats(player, this).getStat(stat);
    }

    @Override
    public SkyblockStats getStats(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getStats(player, this);
    }

    @Override
    public ItemRarity getItemRarity(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getItemRarity(player, this);
    }

    @Override
    public String getTexture(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getTexture(player, this);
    }

    @Override
    public Color leatherColor(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.leatherColor(player, this);
    }

    @Override
    public boolean isDungeonized(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.isDungeonized(player, this);
    }

    @Override
    public Material getMaterial(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getMaterial(player, this);
    }

    @Override
    public int getCount(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getCount(player, this);
    }

    @Override
    public IReforge getReforge(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getReforge(player, this);
    }

    @Override
    public String getItemID(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getItemID(player, this);
    }

    @Override
    public List<String> getDescription(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getDescription(player, this);
    }

    @Override
    public String getItemName(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getItemName(player, this);
    }

    @Override
    public boolean isUnique(SItemInstance use) {
        return baseItem.isUnique(this);
    }

    @Override
    public UUID getUUID() {
        return this.uuid;
    }

    @Override
    public byte getStars(DungeonsPlayer player, SItemInstance use) {
        return baseItem.getStars(player, this);
    }

    @Override
    public List<SAbility> getAbilities(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getAbilities(player, this);
    }

    @Override
    public List<Enchantment> getEnchantments(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getEnchantments(player, this);
    }

    @Override
    public SItemModifier getItemModifier(DungeonsPlayer player, SItemInstance use) {
        return this.baseItem.getItemModifier(player, this);
    }
}
