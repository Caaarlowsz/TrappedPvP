package com.marcello.comandos;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TellCommand implements CommandExecutor {
	public static HashMap<Player, Player> gettell;
	static ArrayList<Player> telloff;

	static {
		TellCommand.gettell = new HashMap<Player, Player>();
		TellCommand.telloff = new ArrayList<Player>();
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (label.equalsIgnoreCase("tell")) {
			if (args.length == 0) {
				p.sendMessage(String.valueOf("§cUse: /tell (jogador) (msg)"));
				return true;
			}
			final Player target = Bukkit.getPlayer(args[0]);
			if (args[0].toLowerCase().equalsIgnoreCase("on")) {
				TellCommand.telloff.remove(p);
				p.sendMessage(String.valueOf("§eSeu tell foi §6ativado§e."));
			} else if (args[0].toLowerCase().equalsIgnoreCase("off")) {
				TellCommand.telloff.add(p);
				p.sendMessage(String.valueOf("§eSeu tell foi §6desativado§e."));
			}
			if (args.length > 1) {
				if (target == null) {
					p.sendMessage(String.valueOf("§cEste jogador esta offline ou n\u00e3o existe."));
					return true;
				}
				if (TellCommand.telloff.contains(target)) {
					p.sendMessage(String.valueOf("§cO Tell deste jogador esta §6desativado§c."));
					return true;
				}
				final StringBuilder sb = new StringBuilder();
				for (int i = 1; i < args.length; ++i) {
					sb.append(args[i]).append(" ");
				}
				final String allArgs = sb.toString().trim();
				p.sendMessage("§aVoc\u00ea para §a\u279b " + target.getName() + "§9: §7" + allArgs);
				target.sendMessage("§a\u279b " + p.getName() + " para Voc\u00ea§9: §7" + allArgs);
				TellCommand.gettell.put(p, target);
				TellCommand.gettell.put(target, p);
			}
		} else if (label.equalsIgnoreCase("r")) {
			if (args.length == 0) {
				p.sendMessage(String.valueOf("§cUse: /r (msg)"));
				return true;
			}
			if (!TellCommand.gettell.containsKey(p)) {
				p.sendMessage(String.valueOf("§cVoc\u00ea n\u00e3o tem ninguem para responder."));
				return true;
			}
			final Player deslogo = TellCommand.gettell.get(p);
			if (deslogo == null) {
				p.sendMessage(String.valueOf("§cEste jogador esta offline ou n\u00e3o existe."));
				return true;
			}
			if (TellCommand.telloff.contains(deslogo)) {
				p.sendMessage(String.valueOf("§cO Tell deste jogador est\u00e1 §6desativado§c."));
				return true;
			}
			final StringBuilder sb = new StringBuilder();
			for (int i = 0; i < args.length; ++i) {
				sb.append(args[i]).append(" ");
			}
			final String allArgs = sb.toString().trim();
			p.sendMessage("§aVoc\u00ea para §a\u279b " + deslogo.getName() + "§9: §7" + allArgs);
			deslogo.sendMessage("§a\u279b " + p.getName() + " para Voc\u00ea§9: §7" + allArgs);
		}
		return false;
	}
}
