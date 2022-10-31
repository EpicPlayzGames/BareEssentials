package me.epicplayzgames.bareessentials;

import me.epicplayzgames.bareessentials.lib.utils.registerCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BareEssentials extends JavaPlugin {

    @Override
    public void onEnable() {

        bareEssentials = this;
        System.out.println("Enabling Bare-Essentials by EpicPlayzGames.");
        getServer().getPluginManager().enablePlugin(bareEssentials);

        new registerCommand().RegisterCommands();

    }

    @Override
    public void onDisable() {

        System.out.println("Disabling Bare-Essentials by EpicPlayzGames.");
        getServer().getPluginManager().disablePlugin(bareEssentials);

    }

    private static BareEssentials bareEssentials;

    public static BareEssentials getBareEssentials() {
        return bareEssentials;

    }

}
