package net.dungeons.player;

import net.dungeons.skills.impl.*;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.world.SLocation;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class DungeonsPlayer {
    /*
    * HashMap to <UUID, DungeonsPlayer> to store data, static final is best
    * coins, bank coins, fairy souls, SkyblockStats, (no island), load(), save(), lombok
    * getPlayer()
    * public DungeonsPlayer(Player player) {}
    * SkyblockLevels (int = xp)
    * Rank
    * */
    //fields
    private SLocation location;
    private final Player player;
    private SkyblockStats stats;
    private DungeonSkill dungeonSkill;
    private AlchemySkill alchemySkill;
    private CarpentrySkill carpentrySkill;
    private CombatSkill combatSkill;
    private EnchantingSkill enchantingSkill;
    private FarmingSkill farmingSkill;
    private FishingSkill fishingSkill;
    private ForagingSkill foragingSkill;
    private MiningSkill miningSkill;
    private TamingSkill tamingSkill;

    public DungeonsPlayer(Player player, SkyblockStats stats) {
        this.location = SLocation.getDefault();
        this.player = player;
        this.stats = stats;
    }

    public SLocation getLocation()
    {
        return this.location;
    }

    public void setLocation(SLocation location)
    {
        this.location = location;
    }

    public Location getPosition()
    {
        return this.player.getLocation();
    }

    public void setPosition(Location location)
    {
        this.player.teleport(location);
    }

    public Player getPlayer()
    {
        return this.player;
    }

    public SkyblockStats getStats() {
        return stats;
    }

    public DungeonSkill getDungeonSkill() {
        return dungeonSkill;
    }

    public AlchemySkill getAlchemySkill() {
        return alchemySkill;
    }

    public CarpentrySkill getCarpentrySkill() {
        return carpentrySkill;
    }

    public CombatSkill getCombatSkill() {
        return combatSkill;
    }

    public EnchantingSkill getEnchantingSkill() {
        return enchantingSkill;
    }

    public FarmingSkill getFarmingSkill() {
        return farmingSkill;
    }

    public FishingSkill getFishingSkill() {
        return fishingSkill;
    }

    public ForagingSkill getForagingSkill() {
        return foragingSkill;
    }

    public MiningSkill getMiningSkill() {
        return miningSkill;
    }

    public TamingSkill getTamingSkill() {
        return tamingSkill;
    }
}
