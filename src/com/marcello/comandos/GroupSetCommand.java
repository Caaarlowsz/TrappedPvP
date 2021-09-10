package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GroupSetCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("groupset")) {
			if (!sender.hasPermission("cmd.groupset")) {
				sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length != 2) {
				p.sendMessage("§3§LGROUPSET §7Utilize o comando §3/groupset (nick) (grupo)");
				return true;
			}
			final String grupo = args[1];
			final Player player = Bukkit.getPlayer(args[0]);
			if (grupo.equalsIgnoreCase("normal")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §7§lNORMAL");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Normal");
				player.chat("/tag normal");
				return true;
			}
			if (grupo.equalsIgnoreCase("ultimate")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §d§lULTIMATE");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Ultimate");
				player.chat("/tag ultimate");
				return true;
			}
			if (grupo.equalsIgnoreCase("premium")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §6§lPREMIUM");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Premium");
				player.chat("/tag premium");
				return true;
			}
			if (grupo.equalsIgnoreCase("light")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §a§lLIGHT");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Light");
				player.chat("/tag light");
				return true;
			}
			if (grupo.equalsIgnoreCase("Helper")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §9§lHELPER");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Helper");
				player.chat("/tag helper");
				return true;
			}
			if (grupo.equalsIgnoreCase("youtuber")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §b§lYOUTUBER");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Youtuber");
				player.chat("/tag youtuber");
				return true;
			}
			if (grupo.equalsIgnoreCase("mod")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §5§lMOD");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Mod");
				player.chat("/tag mod");
				return true;
			}
			if (grupo.equalsIgnoreCase("mod+")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §5§lMOD+");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Mod+");
				player.chat("/tag mod+");
				return true;
			}
			if (grupo.equalsIgnoreCase("trial")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §5§lTRIAL");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Trial");
				player.chat("/tag trial");
				return true;
			}
			if (grupo.equalsIgnoreCase("admin")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §c§lADMIN");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Admin");
				player.chat("/tag admin");
				return true;
			}
			if (grupo.equalsIgnoreCase("gerente")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §c§lGERENTE");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Gerente");
				player.chat("/tag gerente");
				return true;
			}
			if (grupo.equalsIgnoreCase("dono")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §4§lDONO");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Dono");
				player.chat("/tag dono");
				return true;
			}
			if (grupo.equalsIgnoreCase("youtuber+")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §3§lYOUTUBER+");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Youtuber+");
				player.chat("/tag youtuber");
				return true;
			}
			if (grupo.equalsIgnoreCase("developer")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §3§lDEVELOPER");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Developer");
				player.chat("/tag developer");
				return true;
			}
			if (grupo.equalsIgnoreCase("builder")) {
				p.sendMessage("§3§lGROUPSET §7O player §3" + player.getName() + "§7(§e" + player.getUniqueId() + "§7)"
						+ " §7alterado para §e§lBUILDER");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + player.getName() + " group set Builder");
				player.chat("/tag builder");
				return true;
			}
		}
		return false;
	}
}
