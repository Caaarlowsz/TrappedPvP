package com.marcello.events;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import com.marcello.utils.KitAPI;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.Listener;

public class ServerexitEvent implements Listener
{
    @EventHandler
    public void Sair(final PlayerQuitEvent e) {
        final Player p = e.getPlayer();
        e.setQuitMessage((String)null);
        KitAPI.RemoveKit(p);
    }
}
