package net.dungeons.item;

import net.dungeons.item.stars.StarService;
import net.dungeons.player.DungeonsPlayer;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.util.Stringify;
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
        if (context.instance.stars >= 1)
        {
            name += " " + StarService.getStarString(item.stars);
        }

        return name;
    }





}
