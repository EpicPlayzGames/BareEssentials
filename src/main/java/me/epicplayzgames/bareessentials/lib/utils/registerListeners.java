package me.epicplayzgames.bareessentials.lib.utils;

import me.epicplayzgames.bareessentials.BareEssentials;
import me.epicplayzgames.bareessentials.lib.listeners.playerJoinListener;
import me.epicplayzgames.bareessentials.lib.listeners.playerLeaveListener;

public class registerListeners {

    public void RegisterListeners() {

        BareEssentials.getBareEssentials().getServer().getPluginManager().registerEvents(new playerJoinListener(), BareEssentials.getBareEssentials());
        BareEssentials.getBareEssentials().getServer().getPluginManager().registerEvents(new playerLeaveListener(), BareEssentials.getBareEssentials());

    }

}
