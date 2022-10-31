package me.epicplayzgames.bareessentials.lib.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player) {

            if(args.length == 1) {
                String playerName = args[0];
                Player targetPlayer = Bukkit.getPlayerExact(playerName);

                    if(targetPlayer != null) {

                        player.sendMessage(ChatColor.YELLOW + "Teleported to " + targetPlayer.getDisplayName());
                        player.teleport(targetPlayer.getLocation());

                    }

            } else {

                player.sendMessage("Too few arguments");

            }

        } else {

            System.out.println("Must be a player to execute that command");

        }

        return true;
    }
}
