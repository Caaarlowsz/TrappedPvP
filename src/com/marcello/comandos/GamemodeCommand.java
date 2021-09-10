package com.marcello.comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel,
			final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§crecisa ser um player para usar esse comando");
			return true;
		}
		final Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("gm") || cmd.getName().equalsIgnoreCase("gamemode")) {
			if (player.hasPermission("cmd.gamemode")) {
				if (args.length != 1) {
					player.sendMessage("§b§lGAMEMODE §7Utilize o comando §b/gm (1) §7ou §b(0)");
					return true;
				}
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("0")) {
						player.setGameMode(GameMode.SURVIVAL);
						player.sendMessage("§b§lGAMEMODE §7Seu modo de jogo foi atualizado para survival");
					}
					if (args[0].equalsIgnoreCase("1")) {
						player.setGameMode(GameMode.CREATIVE);
						player.sendMessage("§b§lGAMEMODE §7Seu modo de jogo foi atualizado para creativo");
					}
				}
			} else {
				player.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			}
		}
		return false;
	}
}
