package com.marcello.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.marcello.manager.Elos;

public class ChatEvent implements Listener {
	@EventHandler
	public void modificarchat(final AsyncPlayerChatEvent evento) {
		final Player jogador = evento.getPlayer();
		if (jogador.hasPermission("chat.cor")) {
			evento.setFormat(String.valueOf(jogador.getDisplayName()) + " §7(" + Elos.getIconElo(jogador) + "§7)§f: "
					+ evento.getMessage().replace("%", " Porcento(s)"));
			evento.setFormat(evento.getFormat().replace("&", "§"));
		} else {
			evento.setFormat(String.valueOf(jogador.getDisplayName()) + " §7(" + Elos.getIconElo(jogador) + "§7)§f: "
					+ evento.getMessage());
		}
		if (jogador.hasPermission("cmd.admin")) {
			evento.setFormat(String.valueOf(jogador.getDisplayName()) + " §7(" + Elos.getIconElo(jogador) + "§7)§f: "
					+ evento.getMessage());
		} else {
			evento.setFormat(String.valueOf(jogador.getDisplayName()) + " §7(" + Elos.getIconElo(jogador) + "§7)§f: "
					+ evento.getMessage());
		}
	}
}
