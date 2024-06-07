package net.dungeons.listeners;

import com.destroystokyo.paper.event.server.ServerTickStartEvent;
import net.dungeons.Dungeons;
import net.dungeons.item.SItemFactory;
import net.dungeons.item.SkyblockItem;
import net.dungeons.manager.DungeonPlayerManager;
import net.dungeons.player.DungeonsPlayer;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {
    @EventHandler
    public void tick(ServerTickStartEvent event)
    {
        for (Player player1 : Dungeons.getPlugin().getServer().getOnlinePlayers())
        {
            ItemStack item = player1.getInventory().getItemInMainHand();
            DungeonsPlayer player = DungeonPlayerManager.getByPlayer(player1);

            if (item == null || item.getType() == Material.AIR)
                continue;

            if (!(item instanceof SkyblockItem))
            {
                player1.sendMessage("Not a skyblock item! trying to convert it to one.");

                player1.getInventory().setItemInMainHand(SItemFactory.convertItemToSkyblock(item, player));
            }
        }
    }
}
