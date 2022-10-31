package me.epicplayzgames.bareessentials.lib.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player){

            if(args.length == 0) {

                player.teleport(player.getWorld().getSpawnLocation());

            } else if(args.length == 1) {

                String playerName = args[0];
                Player targetPlayer = Bukkit.getPlayerExact(playerName);

                if(player.hasPermission("Bare-Essentials.other")) {

                    if(targetPlayer != null) {

                        targetPlayer.teleport(targetPlayer.getWorld().getSpawnLocation());

                    } else {

                        player.sendMessage(ChatColor.RED + "Unknown player");

                    }

                } else {

                    player.sendMessage(ChatColor.RED + "Unable to execute that command");

                }

            } else {

                player.sendMessage(ChatColor.RED + "Unknown arguments.");

            }

        } else {

            System.out.println("Must be a player to execute that command");

        }

        return true;
    }

}
