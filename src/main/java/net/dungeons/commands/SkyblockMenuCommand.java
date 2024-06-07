package net.dungeons.commands;

import net.dungeons.manager.DungeonPlayerManager;
import net.dungeons.menu.SkyblockMenu;
import net.dungeons.player.DungeonsPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SkyblockMenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("You are not player stinky boy");
            return false;
        }

        Player player = (Player) sender;
        DungeonsPlayer player1 = DungeonPlayerManager.getByUUID(player.getUniqueId());

        SkyblockMenu.openMenu(player1);

        return false;
    }
}
