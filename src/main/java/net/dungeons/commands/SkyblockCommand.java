package net.dungeons.commands;

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

        return false;
    }
}
