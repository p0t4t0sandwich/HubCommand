package ca.sperrer.bungee.hubcommand;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.CommandSender;

public class Lobby extends Command {

    public Lobby() {
        super("lobby");
    }
    public void execute (CommandSender sender, String[]args){
        if ((sender instanceof ProxiedPlayer)) {
            ProxiedPlayer p = (ProxiedPlayer) sender;
            p.sendMessage(new ComponentBuilder("Connecting you to the Lobby!").color(ChatColor.AQUA).create());
            p.connect(ProxyServer.getInstance().getServerInfo("Lobby"));
        }
    }
}
