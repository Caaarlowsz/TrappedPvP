package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GivePermissionCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("givepermission")) {
			if (!sender.hasPermission("cmd.givepermission")) {
				sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§c§LPERMISSAO §7Utilize o comando §c/givepermission (nick) (perm)");
				p.sendMessage("§7Utilize tamb\u00e9m §c/permissionlist §7para ver a list da permissoes");
				return true;
			}
			if (args.length != 2) {
				p.sendMessage("§c§LPERMISSAO §7Utilize o comando §c/givepermission (nick) (perm)");
				return true;
			}
			final String permissions = args[1];
			final Player jogador = Bukkit.getPlayer(args[0]);
			if (permissions.equalsIgnoreCase("Admin")) {
				p.sendMessage("§c§LPERMISSAO §7A permiss\u00e3o MODO ADMINISTRADOR §7Foi dada ao jogador §c "
						+ jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.admin");
				return true;
			}
			if (permissions.equalsIgnoreCase("staffchat")) {
				p.sendMessage("§c§LPERMISSAO §7A permiss\u00e3o ACESSO AO STAFFCHAT Foi dada so Jogador "
						+ jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.staff");
				return true;
			}
			if (permissions.equalsIgnoreCase("fullkit")) {
				p.sendMessage("§eA Permissao de TODOS OS KITS Foi dada ao Jogador " + jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add kit.*");
				return true;
			}
			if (permissions.equalsIgnoreCase("teleportar")) {
				p.sendMessage("§ea Permissao TELETRANSPORTAR foi dada ao Jogador " + jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.tp");
				return true;
			}
			if (permissions.equalsIgnoreCase("setgroups")) {
				p.sendMessage("§c§LPERMISSAO §7A permiss\u00e3o para SETAR GRUPOS §7Foi dada ao jogador §c "
						+ jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.groupset");
				return true;
			}
			if (permissions.equalsIgnoreCase("givevips")) {
				p.sendMessage(
						"§c§LPERMISSAO §7A permiss\u00e3o para DAR VIPS §7Foi dada ao jogador §c " + jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.givevip");
				return true;
			}
			if (permissions.equalsIgnoreCase("givekit")) {
				p.sendMessage("§c§LPERMISSAO §7A permiss\u00e3o de §e§lDAR KITS §7Foi dada ao jogador §c "
						+ jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.givekit");
				return true;
			}
			if (permissions.equalsIgnoreCase("sortearkit")) {
				p.sendMessage("§c§LPERMISSAO §7A permiss\u00e3o de §e§lSORTEAR KITS foi dada ao jogador "
						+ jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.sortarkit");
				return true;
			}
			if (permissions.equalsIgnoreCase("sortearvip")) {
				p.sendMessage("§c§LPERMISSAO §7A permiss\u00e3o de §e§lSORTEAR VIPS §7Foi dada ao jogador §c "
						+ jogador.getName());
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " add pluspvp.cmd.sortearvip");
				return true;
			}
		}
		return false;
	}
}
