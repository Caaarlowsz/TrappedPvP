package com.marcello.comandos;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class BuildCommand implements Listener, CommandExecutor {
	public static HashMap<String, BuildStats> Build;

	static {
		BuildCommand.Build = new HashMap<String, BuildStats>();
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
			return true;
		}
		if (!sender.hasPermission("cmd.build")) {
			sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			return true;
		}
		final Player p = (Player) sender;
		if (args.length == 0) {
			p.sendMessage("§e§lBUILD §7Utilize o comando §e/build (on) §7ou §e(off)");
		}
		if (args[0].equalsIgnoreCase("on")) {
			if (BuildCommand.Build.get(p.getName()) == BuildStats.ON) {
				p.sendMessage("§e§lBUILD §7o modo constru\u00e7\u00e3o j\u00e1 estava ativado");
				return true;
			}
			p.sendMessage("§e§lBUILD §7o modo constru\u00e7\u00e3o foi ativado");
			BuildCommand.Build.put(p.getName(), BuildStats.ON);
			return true;
		} else {
			if (!args[0].equalsIgnoreCase("off")) {
				p.sendMessage("§e§lBUILD §7Utilize o comando §e/build (on) §7ou §e(off)");
				return false;
			}
			if (BuildCommand.Build.get(p.getName()) == BuildStats.OFF) {
				p.sendMessage("§e§lBUILD §7o modo constru\u00e7\u00e3o j\u00e1 estava desativado");
				return true;
			}
			p.sendMessage("§e§lBUILD §7o modo constru\u00e7\u00e3o foi desativado");
			BuildCommand.Build.put(p.getName(), BuildStats.OFF);
			return true;
		}
	}

	@EventHandler
	public void Entrou(final PlayerJoinEvent e) {
		BuildCommand.Build.put(e.getPlayer().getName(), BuildStats.OFF);
	}

	@EventHandler
	public void Quebrar(final BlockBreakEvent e) {
		final Player p = e.getPlayer();
		if (BuildCommand.Build.get(p.getName()) == BuildStats.OFF) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void Quebrar(final BlockPlaceEvent e) {
		final Player p = e.getPlayer();
		if (BuildCommand.Build.get(p.getName()) == BuildStats.OFF) {
			e.setCancelled(true);
		}
	}

	public enum BuildStats {
		ON("ON", 0), OFF("OFF", 1);

		private BuildStats(final String s, final int n) {
		}
	}
}
