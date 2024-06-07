package net.dungeons.menu;

import net.dungeons.player.DungeonsPlayer;
import net.dungeons.stats.SkyblockStats;
import net.dungeons.stats.Stat;
import net.dungeons.util.Stringify;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class SkyblockMenu {

    private SkyblockMenu() {

    }
    private static ItemStack BLACK_PLANE;

    static {
        BLACK_PLANE = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta meta = BLACK_PLANE.getItemMeta();
        meta.displayName(Component.text(""));

        BLACK_PLANE.setItemMeta(meta);
    }

    public static void openMenu(DungeonsPlayer player) {
        Inventory menu = Bukkit.createInventory(null, 54, "Skyblock Menu");
        SkyblockStats stats = player.getStats();


        //Skyblock Profile Item
        ItemStack skyblockProfile = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta skyblockProfileMeta = skyblockProfile.getItemMeta();
        skyblockProfileMeta.displayName(Stringify.create("&aYour Skyblock Profile"));
        List<Component> skyblockProfileLore = Stringify.createList("&7View your equipments, stats,", "&7 and more!", "");
        for (Stat stat : Stat.values()) {
            skyblockProfileLore.add(Stringify.create(createStatLine(stats.getStat(stat), stat)));
        }
        skyblockProfileLore.add(Stringify.create("&eClick to view!"));

        skyblockProfileMeta.lore(skyblockProfileLore);
        skyblockProfile.setItemMeta(skyblockProfileMeta);

        menu.setItem(14, skyblockProfile);
        //Skyblock Profile Item


        makeBackground(menu);


        player.getPlayer().openInventory(menu);


    }

    private static String createStatLine(double value, Stat stat) {
        return "&" + stat.color + stat.icon + " " + stat.name + " " + "&f " + value + (stat.percent ? "%" : "");
    }

    private static void makeBackground(Inventory inv) {
        for (int i = 0; i < 54; i++) {
            if (inv.getItem(i) == null) {
                inv.setItem(i, BLACK_PLANE);
            }
        }
    }

}
