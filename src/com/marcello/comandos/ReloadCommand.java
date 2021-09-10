package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.marcello.Main;

public class ReloadCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cApenas jogadores podem executar esse comando");
			return true;
		}
		final Player p = (Player) sender;
		if (args.length == 0 && cmd.getName().equalsIgnoreCase("atualizar")) {
			if (p.hasPermission("cmd.atualizar")) {
				p.sendMessage("§a§lRELOAD §7Voce iniciou A Reinicializa\u00e7\u00e3o!");
				Bukkit.broadcastMessage("§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a30 §7segundos");
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage(
								"§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a20 §7segundos");
					}
				}.runTaskLater((Plugin) Main.instance, 200L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage(
								"§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a10 §7segundos");
					}
				}.runTaskLater((Plugin) Main.instance, 400L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage(
								"§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a5 §7segundos");
					}
				}.runTaskLater((Plugin) Main.instance, 500L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage(
								"§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a4 §7segundos");
					}
				}.runTaskLater((Plugin) Main.instance, 520L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage(
								"§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a3 §7segundos");
					}
				}.runTaskLater((Plugin) Main.instance, 540L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage(
								"§a§lRELOAD §7Servidor sendo reiniciado automaticamente §a2 §7segundos");
					}
				}.runTaskLater((Plugin) Main.instance, 560L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.broadcastMessage("§a§lRELOAD §7O servidor est\u00e1 sendo atualizado por favor aguarde");
					}
				}.runTaskLater((Plugin) Main.instance, 580L);
				new BukkitRunnable() {
					public void run() {
						Player[] onlinePlayers;
						for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
							final Player s = onlinePlayers[i];
							s.kickPlayer(
									"§c§lReverse§f§lMC   \n§7este servidor foi reiniciado!\n§7estamos preparando tudo...\n\n\n§e@ServerReverse ");
						}
					}
				}.runTaskLater((Plugin) Main.instance, 600L);
				new BukkitRunnable() {
					public void run() {
						Bukkit.shutdown();
					}
				}.runTaskLater((Plugin) Main.instance, 640L);
			} else {
				p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			}
		}
		return false;
	}
}
