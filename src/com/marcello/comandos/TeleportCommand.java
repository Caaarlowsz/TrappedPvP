package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("tp")) {
			if (p.hasPermission("cmd.tp")) {
				final Player t = Bukkit.getPlayer(args[0]);
				if (t == null) {
					p.sendMessage("§3§lTELEPORT §7Este player n\u00e3o est\u00e1 conectado ao servidor");
					return true;
				}
				p.teleport((Entity) t);
				p.sendMessage("§3§lTELEPORT §7Voc\u00ea foi teleportado para §3" + t.getName());
			} else {
				p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			}
		}
		if (cmd.getName().equalsIgnoreCase("tphere")) {
			if (p.hasPermission("cmd.tp")) {
				if (args.length == 0) {
					p.sendMessage("§3§lTELEPORT §7Utilize o comando §3/tphere (player)");
					return true;
				}
				final Player t = Bukkit.getPlayer(args[0]);
				if (t == null) {
					p.sendMessage("§3§lTELEPORT §7Este player n\u00e3o est\u00e1 conectado ao servidor");
					return true;
				}
				t.teleport((Entity) p);
				p.sendMessage(
						"§3§lTELEPORT §7O Jogador §3" + t.getName() + " §7foi teleportado at\u00e9 para voc\u00ea");
			} else {
				p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			}
		}
		if (cmd.getName().equalsIgnoreCase("tpall")) {
			if (p.hasPermission("cmd.tp")) {
				Player[] onlinePlayers;
				for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
					final Player todos = onlinePlayers[i];
					todos.teleport((Entity) p);
				}
				p.sendMessage("§3§LTELEPORT §7Todos Player online foram puxados at\u00e9 voc\u00ea");
				Bukkit.broadcastMessage("§3§LTELEPORT §7Todos players foram puxados at\u00e9 §3" + p.getName());
			} else {
				p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			}
		}
		return false;
	}
}
