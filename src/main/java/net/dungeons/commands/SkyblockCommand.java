package net.dungeons.commands;

import net.dungeons.item.ItemGenerator;
import net.dungeons.item.SItem;
import net.dungeons.item.SItemRegistry;
import net.dungeons.manager.DungeonPlayerManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SkyblockCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("You are not player stinky boy");
            return false;
        }

        Player player = (Player) sender;

        if (args.length < 1)
        {
            player.sendMessage("You fucking suck! invalid args.");

            return false;
        }

        switch (args[0])
        {
            case "give":
                if (args.length < 2)
                {
                    player.sendMessage("args: skyblock give <item id>");
                    return false;
                }

                String itemId = args[1];
                SItem item = SItemRegistry.getSItem(itemId.toUpperCase());

                if (item == null)
                {
                    player.sendMessage("Invalid id you fucker");
                    return false;
                }

                player.getInventory().addItem(ItemGenerator.generateItem(item, DungeonPlayerManager.getByPlayer(player)));

                break;
        }

        return false;
    }
}
