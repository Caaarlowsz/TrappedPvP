package com.marcello.authme;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.marcello.Main;

public class Mudar implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String arg2, final String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("mudarsenha")) {
			final Player p = (Player) sender;
			if (arg3.length == 0) {
				p.sendMessage("§b§lLOGIN §7Para mudar sua senha utilize §b/mudarsenha (nova senha)");
				return true;
			}
			if (Main.login.contains(p.getName())) {
				p.sendMessage(
						"§b§lLOGIN §7Voc\u00ea n\u00e3o est\u00e1 logado, voc\u00ea n\u00e3o pode mudar a sua senha");
				return true;
			}
			if (arg3.length == 1) {
				final String senha = arg3[0];
				Main.plugin.getConfig().set("Login." + p.getName().toLowerCase() + ".senha", (Object) senha);
				p.sendMessage("§b§lLOGIN §7Sua senha foi alterada para: §b" + senha.toLowerCase());
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 5.0f, 5.0f);
				Main.plugin.saveConfig();
				return true;
			}
		}
		return false;
	}
}
