package net.dungeons.item;

import net.dungeons.item.stars.StarService;
import net.dungeons.player.DungeonsPlayer;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import net.dungeons.util.Stringify;
import net.dungeons.world.SLocation;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemGenerator {
    public static ItemStack generateItem(ItemGenerationContext context) {

        SItemInstance sitem = context.instance;
        DungeonsPlayer player = context.player;

        ItemStack item = new ItemStack(sitem.getMaterial(player, null), sitem.getCount(player, null));
        ItemMeta meta = item.getItemMeta();

        //Work on ItemName first.

        String itemName = createName(context);

        meta.displayName(Component.text(itemName));
        meta.lore(createLore(context));

        return item;
    }

    public static List<Component> createLore(ItemGenerationContext context)
    {
        SItemInstance instance = context.instance;
        DungeonsPlayer player = context.player;
        List<Component> components = new ArrayList<>();

        if (instance.isDungeonized(player, null))
        {
            components.add(Stringify.create("&6Gear Score: &d" + GearScore.getGearScore(instance, player)));
        }

        components.addAll()
    }

    public static List<Component> createStatLore(ItemGenerationContext context)
    {
        SItemInstance instance = context.instance;
        DungeonsPlayer player = context.player;
        List<Component> components = new ArrayList<>();

        boolean inDungeon = player.getLocation() == SLocation.DUNGEON;

        for (Stat stat : Stat.values())
        {
            components.add(createStatLine(instance, player, inDungeon));
        }
    }

    public static Component createStatLine(SItemInstance instance, DungeonsPlayer player, boolean inDungeon)
    {
        StringBuilder builder = new StringBuilder();

        builder.append("")
    }


    public static String createName(ItemGenerationContext context) {
        SItemInstance item = context.instance;

        String name = Stringify.formatString("&" + item.getItemRarity(context.player, item).color);

        if (item.reforge != null)
        {
            name += item.reforge.getReforgeName() + " ";
        }

        name += item.getItemName(context.player, context.instance);

        //stars
        if (context.instance.stars >= 1 && context.instance.isDungeonized(context.player, null))
        {
            name += " " + StarService.getStarString(item.stars);
        }

        return name;
    }





}
