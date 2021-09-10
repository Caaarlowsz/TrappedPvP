package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.marcello.api.ArraysAPI;

public class VisCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("vis")) {
			if (!sender.hasPermission("cmd.vis")) {
				p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				if (!ArraysAPI.Admin.contains(p)) {
					p.sendMessage("§6§lVIS §7Voc\u00ea s\u00f3 pode usar isso no modo administrador");
					return true;
				}
				final Player[] onlinePlayers;
				if ((onlinePlayers = Bukkit.getOnlinePlayers()).length != 0) {
					final Player todos = onlinePlayers[0];
					todos.showPlayer(p);
					p.showPlayer(todos);
					p.sendMessage("§6§lVIS §7Modo visivel ativados todos podem lhe ver");
					return true;
				}
			}
		}
		return false;
	}
}
