package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class ManutentionCommand implements CommandExecutor, Listener {
	public static boolean manutencao;

	static {
		ManutentionCommand.manutencao = false;
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("manutencao")) {
			if (!sender.hasPermission("cmd.manutencao")) {
				sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§4§LMANUTEN\u00c7\u00c2O §7Utilize o comando §c/manutencao (on) §7ou §c(off)");
				return true;
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("on")) {
					if (ManutentionCommand.manutencao) {
						p.sendMessage(
								"§4§LMANUTEN\u00c7\u00c2O §7O servidor j\u00e1 est\u00e1 no modo manuten\u00e7\u00e3o");
						return true;
					}
					Bukkit.broadcastMessage(
							"§4§LMANUTEN\u00c7\u00c2O §7Servidor entrando em Manuten\u00e7\u00e3o! Todos ser\u00e3o Kickados em §f5 Segundos!");
					ManutentionCommand.manutencao = true;
					p.sendMessage("§4§LMANUTEN\u00c7\u00c2O §7Manuten\u00e7\u00e3o sendo ativada...");
					p.sendMessage("§4§LMANUTEN\u00c7\u00c2O §7Manuten\u00e7\u00e3o ativada com sucesso!");
					p.sendMessage("§4§LMANUTEN\u00c7\u00c2O §7 Voc\u00ea ativou o modo manuten\u00e7\u00e3o!");
					Player[] onlinePlayers;
					for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
						final Player todos = onlinePlayers[i];
						if (!sender.hasPermission("cmd.manutencao")) {
							todos.kickPlayer(
									"§b§lTRAPPED§F§LPVP\n   §7Desculpe, mas o servidor em que voce estava conectado foi fechado para manuten\u00e7\u00e3o\n§7Estaremos de volta assim que possivel!\n\n§e@ServerReverse\n§7Atenciosamente, Equipe ReverseMC");
							return true;
						}
					}
					return true;
				} else if (args[0].equalsIgnoreCase("off")) {
					if (!ManutentionCommand.manutencao) {
						p.sendMessage(
								"§4§LMANUTEN\u00c7\u00c2O §7O Servidor n\u00e3o est\u00e1 em modo manuten\u00e7ao!");
						return true;
					}
					ManutentionCommand.manutencao = false;
					p.sendMessage("§4§LMANUTEN\u00c7\u00c2O §7Manuten\u00e7\u00e3o desativada");
					p.sendMessage("§4§LMANUTEN\u00c7\u00c2O §7Voce desativou a manuten\u00e7\u00e3o");
					return true;
				}
			}
		}
		return false;
	}

	@EventHandler
	public void aoEntrarManutencao(final PlayerLoginEvent e) {
		final Player p = e.getPlayer();
		if (ManutentionCommand.manutencao && !p.hasPermission("cmd.manutencao")) {
			e.disallow(PlayerLoginEvent.Result.KICK_OTHER,
					"§c§lReverse§f§lMC\n   §7Desculpe, mas o servidor em que voc\u00ea est\u00e1 tentando conectar foi fechado para manuten\u00e7\u00e3o\n§7Estaremos de volta assim que possivel!\n\n§e@ServerReverse\n§7Atenciosamente, Equipe ReverseMC");
		}
	}
}
