package com.marcello.events;

import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.Listener;

public class PluginsEvent implements Listener
{
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCommandPreProcess(final PlayerCommandPreprocessEvent e) {
        final String[] msg = e.getMessage().split(" ");
        final List<String> plugins = new ArrayList<String>();
        plugins.add("pl");
        plugins.add("plugin");
        plugins.add("ver" + msg);
        plugins.add("help" + msg);
        plugins.add("pex" + msg);
        plugins.add("peermissionex" + msg);
        plugins.add("peermissionsex" + msg);
        plugins.add("ver");
        plugins.add("help");
        plugins.add("?");
        plugins.add("me");
        plugins.add("bukkit:help");
        plugins.add("plugins");
        plugins.add("minecraft:me");
        for (final String Loop : plugins) {
            if (msg[0].equalsIgnoreCase("/" + Loop)) {
                e.getPlayer().sendMessage("§5§lPLUGINS §7Projeto criado para o Servidor §b§lTRAPPED§f§lMC");
                e.setCancelled(true);
            }
        }
        if (e.getMessage().contains("//calc") || e.getMessage().contains("//calculate") || e.getMessage().contains("//solve") || e.getMessage().contains("//eval") || e.getMessage().contains("//evaluate")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§cDesculpe, mas este comando foi bloqueado ;(");
        }
    }
}
