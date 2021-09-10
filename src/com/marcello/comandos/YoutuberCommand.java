package com.marcello.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class YoutuberCommand implements Listener, CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		cmd.getName().equalsIgnoreCase("youtuber");
		p.sendMessage(" ");
		p.sendMessage("§7Requisitos para tag §b§lYOUTUBER");
		p.sendMessage("§7200 inscritos - Um video no servidor e 40 likes");
		p.sendMessage(" ");
		p.sendMessage("§7Requisitos para tag §a§lLIGHT");
		p.sendMessage("§730  inscritos - Um video no servidor e 5 likes.");
		return false;
	}
}
