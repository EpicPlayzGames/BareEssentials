package me.epicplayzgames.bareessentials.lib.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class homeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String label, String[] args) {

        if(sdr instanceof Player player) {

            if(args.length == 0) {

                player.teleport(player.getBedSpawnLocation());

            } else if (args.length == 1) {

                String playerName = args[0];
                Player targetPlayer = Bukkit.getPlayerExact(playerName);

                if(targetPlayer != null && targetPlayer.getBedSpawnLocation() != null) {

                    targetPlayer.teleport(targetPlayer.getBedSpawnLocation());
                    targetPlayer.sendMessage("You've been sent home by " + player);
                    player.sendMessage(targetPlayer.getDisplayName() + " was sent home.");

                } else {

                    player.sendMessage(ChatColor.RED + "That player does not have a valid bed location.");

                }

            } else {

                player.sendMessage(ChatColor.RED + "Unknown player");

            }

        } else {

            System.out.println("Must be a player to execute that command.");

        }

        return true;
    }

}
