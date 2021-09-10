package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.marcello.utils.KillsDeathsMoney;

public class GiveXpCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!cmd.getName().equalsIgnoreCase("givexp")) {
			return false;
		}
		if (!sender.hasPermission("cmd.xp")) {
			sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			return true;
		}
		if (args.length < 3) {
			sender.sendMessage("§b§lGIVEXP §7Utilize o comando §b/givexp add (nick) 1000");
			return true;
		}
		final int tanto = Integer.valueOf(args[2]);
		final Player t = Bukkit.getPlayer(args[1]);
		if (args[0].equalsIgnoreCase("add")) {
			try {
				KillsDeathsMoney.addKill(t, tanto);
				sender.sendMessage("§b§lGIVEXP §7Voc\u00ea adicionou §b1000 §7de XP ao jogador §b" + t.getName());
				t.sendMessage("§b§lXP §7Voc\u00ea rececebeu §b1000 §7de XP!");
			} catch (Exception e) {
				sender.sendMessage("§b§lGIVEXP §7Utilize apenas n\u00fameros para dar xp");
			}
		} else {
			sender.sendMessage("§b§lGIVEXP §7Utilize o comando §b/givexp add (nick) 1000");
		}
		return false;
	}
}
