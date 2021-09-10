package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.marcello.utils.KillsDeathsMoney;

public class UpRankCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (cmd.getName().equalsIgnoreCase("upar")) {
			final Player p = (Player) sender;
			if (args.length == 0) {
				p.sendMessage("§7Voc\u00ea precisa de 100 coins para upar de Rank!");
				return true;
			}
			if (args.length < 3) {
				final Player t = Bukkit.getPlayer(args[1]);
				KillsDeathsMoney.removermoney(t, 100);
				sender.sendMessage("§E§LUPRANK §7Liga upada com sucesso.");
			}
		}
		return false;
	}
}
