package me.epicplayzgames.bareessentials.lib.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {

        if (playerJoinEvent.getPlayer().hasPlayedBefore()) {

            playerJoinEvent.setJoinMessage(ChatColor.GOLD + "Welcome back, " + ChatColor.WHITE + playerJoinEvent.getPlayer().getDisplayName() + ChatColor.GOLD  + " to the Server!");

        } else {

            playerJoinEvent.setJoinMessage(ChatColor.WHITE + playerJoinEvent.getPlayer().getDisplayName() + ChatColor.GOLD + "" + ChatColor.BOLD + " has joined for the first time. Welcome!");

        }

    }

}
