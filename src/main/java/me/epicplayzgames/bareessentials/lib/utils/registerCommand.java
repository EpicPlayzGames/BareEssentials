package me.epicplayzgames.bareessentials.lib.utils;

import me.epicplayzgames.bareessentials.BareEssentials;
import me.epicplayzgames.bareessentials.lib.commands.homeCommand;
import me.epicplayzgames.bareessentials.lib.commands.spawnCommand;

import java.util.Objects;

public class registerCommand {

    public void RegisterCommands() {

        Objects.requireNonNull(BareEssentials.getBareEssentials().getServer().getPluginCommand("home")).setExecutor(new homeCommand());
        Objects.requireNonNull(BareEssentials.getBareEssentials().getServer().getPluginCommand("spawn")).setExecutor(new spawnCommand());

    }

}
