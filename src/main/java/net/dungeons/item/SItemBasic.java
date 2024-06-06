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

public class SItemBasic implements SItem {
    private Material material;
    private String id;
    private String name;

    public SItemBasic(Material material, String id, String name)
    {
        this.material = material;
        this.id = id;
        this.name = name;
    }

    @Override
    public double getStat(Stat stat, DungeonsPlayer player, SItemInstance use) {
        return 0;
    }

    @Override
    public SkyblockStats getStats(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public ItemRarity getItemRarity(DungeonsPlayer player, SItemInstance use) {
        return ItemRarity.COMMON;
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
        return false;
    }

    @Override
    public Material getMaterial(DungeonsPlayer player, SItemInstance use) {
        return this.material;
    }

    @Override
    public int getCount(DungeonsPlayer player, SItemInstance use) {
        return 1;
    }

    @Override
    public IReforge getReforge(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public String getItemID(DungeonsPlayer player, SItemInstance use) {
        return this.id;
    }

    @Override
    public List<String> getDescription(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public String getItemName(DungeonsPlayer player, SItemInstance use) {
        return this.name;
    }

    @Override
    public boolean isUnique(SItemInstance use) {
        return false;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public byte getStars(DungeonsPlayer player, SItemInstance use) {
        return 0;
    }

    @Override
    public List<SAbility> getAbilities(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public List<Enchantment> getEnchantments(DungeonsPlayer player, SItemInstance use) {
        return null;
    }

    @Override
    public SItemModifier getItemModifier(DungeonsPlayer player, SItemInstance use) {
        return null;
    }
}
