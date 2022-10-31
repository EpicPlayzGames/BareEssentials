package me.epicplayzgames.bareessentials.lib.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerLeaveListener implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent playerQuitEvent) {
        playerQuitEvent.setQuitMessage(ChatColor.WHITE + playerQuitEvent.getPlayer().getDisplayName() + ChatColor.RED + " has left the server.");

    }

}
