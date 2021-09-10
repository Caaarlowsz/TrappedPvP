package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PromoveCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("promover")) {
			if (!sender.hasPermission("cmd.promover")) {
				sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§2§LPROMOVER §7Utilize o comando §a/promover (nick) (cargo)");
				return true;
			}
			if (args.length != 2) {
				p.sendMessage("§2§LPROMOVER §7Este cargo n\u00e3o est\u00e1 no nosso banco de dados");
				return true;
			}
			final String kit = args[1];
			final Player k = Bukkit.getPlayer(args[0]);
			if (kit.equalsIgnoreCase("helper")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §d§lHELPER");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §d§lHELPER§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Helper");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("       §7Promovido ao cargo: §d§lHELPER       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
			if (kit.equalsIgnoreCase("trial")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §d§lTRIAL");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §d§lTRIAL§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Trial");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("       §7Promovido ao cargo: §d§lTRIAL       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
			if (kit.equalsIgnoreCase("mod")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §5§lMOD");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §5§lMOD§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Mod");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("        §7Promovido ao cargo: §5§lMOD       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
			if (kit.equalsIgnoreCase("modplus")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §5§lMOD+");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §5§lMOD+§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Mod+");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("       §7Promovido ao cargo: §5§lMOD+       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
			if (kit.equalsIgnoreCase("admin")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §C§lADMIN");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §C§lADMIN§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Admin");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("       §7Promovido ao cargo: §c§lADMIN       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
			if (kit.equalsIgnoreCase("gerente")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §c§lGERENTE");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §c§lGERENTE§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Gerente");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("       §7Promovido ao cargo: §c§lGERENTE       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
			if (kit.equalsIgnoreCase("dono")) {
				p.sendMessage("§2§LPROMOVER §7Voc\u00ea promoveu o jogador §a" + k.getName() + " §7para §4§lDONO");
				k.sendMessage("§c§lReverse§f§lMC §7» Voc\u00ea foi promovido de cargo para: §4§lDONO§7!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + k.getName() + " group set Dono");
				Bukkit.broadcastMessage("          §7» §c§lReverse§f§lMC       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("§7O Jogador §e" + k.getName() + " §7Foi Promovido!");
				Bukkit.broadcastMessage("       §7Promovido ao cargo: §4§lDONO       ");
				Bukkit.broadcastMessage("§7");
				Bukkit.broadcastMessage("          §7» §e§lPROMO\u00c7\u00d5ES      ");
				return true;
			}
		}
		return false;
	}
}
