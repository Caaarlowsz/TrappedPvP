package com.marcello.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.marcello.utils.KitAPI;

public class ServerexitEvent implements Listener {
	@EventHandler
	public void Sair(final PlayerQuitEvent e) {
		final Player p = e.getPlayer();
		e.setQuitMessage((String) null);
		KitAPI.RemoveKit(p);
	}
}
