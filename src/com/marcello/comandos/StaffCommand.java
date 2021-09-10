package com.marcello.comandos;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffCommand implements CommandExecutor {
	public static ArrayList<String> staffchat;

	static {
		StaffCommand.staffchat = new ArrayList<String>();
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§7Comandos apenas no servidor!");
			return true;
		}
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("sc")) {
			if (!p.hasPermission("cmd.sc")) {
				p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§4§LSTAFFCHAT §7Utilize o comando §c/sc (entrar) §7ou §c(sair)");
				return true;
			}
			if (args[0].equalsIgnoreCase("entrar")) {
				StaffCommand.staffchat.add(p.getName());
				p.sendMessage("§4§LSTAFFCHAT §7Voce entrou no chat da staff");
			} else if (args[0].equalsIgnoreCase("sair") && StaffCommand.staffchat.contains(p.getName())) {
				p.sendMessage("§4§LSTAFFCHAT §7Voce saiu do chat da staff");
				StaffCommand.staffchat.remove(p.getName());
			}
		}
		return false;
	}
}
