package com.marcello.authme;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;

public class Logar implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String arg2, final String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("login")) {
			final Player p = (Player) sender;
			if (arg3.length == 1) {
				if (arg3[0].equalsIgnoreCase(
						(String) TrappedPvP.plugin.getConfig().get("Login." + p.getName().toLowerCase() + ".senha"))) {
					p.sendMessage("�6�l\u26a0 �b�lLOGIN �aVoc\u00ea logou com sucesso no servidor.");
					TrappedPvP.login.remove(p.getName());
					TrappedPvP.login.remove(p.getName());
					TrappedPvP.login.remove(p.getName());
					TrappedPvP.login.remove(p.getName());
					TrappedPvP.login.remove(p.getName());
					return true;
				}
				p.sendMessage("�b�lLOGIN �7A senha digitada est\u00e1 incorreta tente novamente.");
			}
		}
		return false;
	}
}
