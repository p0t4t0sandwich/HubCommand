package ca.sperrer.bungee.hubcommand;

import net.md_5.bungee.api.plugin.Plugin;

public final class HubCommand extends Plugin {
    @Override
    public void onEnable() {
        getLogger().info("has loaded!");
        getProxy().getPluginManager().registerCommand(this, new Hub());
        getProxy().getPluginManager().registerCommand(this, new Lobby());
    }
}
