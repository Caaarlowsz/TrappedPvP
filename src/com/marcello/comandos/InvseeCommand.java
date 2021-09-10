package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InvseeCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
			return true;
		}
		final Player p = (Player) sender;
		if (!p.hasPermission("cmd.inv")) {
			p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			return true;
		}
		if (args.length == 0) {
			p.sendMessage("§1§LINVSEE §7Utilize o comando §b/inv (nick)");
		} else {
			final Player t = Bukkit.getPlayer(args[0]);
			if (t == null) {
				p.sendMessage("§1§LINVSEE §7Este player n\u00e3o est\u00e1 conectado ao servidor");
				return true;
			}
			p.openInventory((Inventory) t.getInventory());
			p.sendMessage("§1§LINVSEE §7Inventario do Jogador §7(§b" + t.getDisplayName() + "§7) §7foi aberto");
		}
		return false;
	}
}
