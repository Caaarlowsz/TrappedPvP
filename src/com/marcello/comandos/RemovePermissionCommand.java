package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemovePermissionCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("removepermission")) {
			if (!sender.hasPermission("cmd.removepermission")) {
				sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§c§LPERMISSAO §7Utilize o comando §c/removepermission (nick) (perm)");
				p.sendMessage("§7Utilize tamb\u00e9m §c/permissionlist §7para ver a list da permissoes");
				return true;
			}
			if (args.length != 2) {
				p.sendMessage("§E§LACTIVEPVP \u279c §cEssa Permiss\u00e3o n\u00e3o existe!");
				return true;
			}
			final String permissions = args[1];
			final Player jogador = Bukkit.getPlayer(args[0]);
			if (permissions.equalsIgnoreCase("Admin")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a permiss\u00e3o §cModo Admin§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permiss\u00e3o Para o §fModo Admin§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.admin");
				return true;
			}
			if (permissions.equalsIgnoreCase("staffchat")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a permiss\u00e3o §cStaffChat§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permissao do §fSstaffChat§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.staff");
				return true;
			}
			if (permissions.equalsIgnoreCase("fullkit")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu Todos os Kits Ao jogador §f" + jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permiss\u00e3o de §fTodos os Kits§c!");
				jogador.sendMessage("§cSeus kits voltaram ao padr\u00e3o do seu Rank.");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.*");
				return true;
			}
			if (permissions.equalsIgnoreCase("teleportar")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a Permiss\u00e3o de §fTeleportar§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permiss\u00e3o de §fTeleportar§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.tp");
				return true;
			}
			if (permissions.equalsIgnoreCase("setgroups")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a Permiss\u00e3o de §fSetar Grupos§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permiss\u00e3o de §fSetar grupos§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.groupset");
				return true;
			}
			if (permissions.equalsIgnoreCase("givevips")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a Permiss\u00e3o de §fDar Vips§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§c§LPERMISSAO §7Voce perdeu a Permiss\u00e3o de §fDar Vips§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.givevip");
				return true;
			}
			if (permissions.equalsIgnoreCase("givekit")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a Permiss\u00e3o de §fDar Kits§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permiss\u00e3o de §fDar Kits§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.givekit");
				return true;
			}
			if (permissions.equalsIgnoreCase("sortearkit")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a Permiss\u00e3o de §fSortear Kits§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§E§LACTIVEPVP \u279c §cVoce perdeu a Permissao de §fSortear kits§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.sortarkit");
				return true;
			}
			if (permissions.equalsIgnoreCase("sortearvip")) {
				p.sendMessage("§c§LPERMISSAO §7Voce removeu a Permiss\u00e3o de §fSortear Vips§7 do jogador §c"
						+ jogador.getName());
				jogador.sendMessage("§c§LPERMISSAO §7Voce perdeu a Permissao de §fSortear Vips§c!");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove masterkits.cmd.sortearvip");
				return true;
			}
		}
		return false;
	}
}
