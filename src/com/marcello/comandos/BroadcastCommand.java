package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command command, final String commandLabel,
			final String[] args) {
		if (commandLabel.equalsIgnoreCase("bc") && sender.hasPermission("cmd.bc")) {
			if (args.length >= 1) {
				String bcast = "";
				for (int x = 0; x < args.length; ++x) {
					bcast = String.valueOf(bcast) + args[x] + " ";
				}
				bcast = ChatColor.translateAlternateColorCodes('&', bcast);
				Bukkit.broadcastMessage("§4§LBROADCAST §f" + bcast);
			} else {
				sender.sendMessage("§4§lBROADCAST §7Utilize o comando §c/bc (mensagem)");
			}
		} else {
			sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
		}
		return false;
	}
}
