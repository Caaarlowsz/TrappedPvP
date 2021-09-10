package com.marcello.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class RegrasCommand implements Listener, CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		cmd.getName().equalsIgnoreCase("regras");
		p.sendMessage("     §4§lREGRAS:    ");
		p.sendMessage("§cNao usar hack!");
		p.sendMessage("§cNao abusar de bugs");
		p.sendMessage("§cNao testar staff!");
		p.sendMessage("§cNao chingar staff");
		p.sendMessage("§cNao chingar o servidor");
		p.sendMessage("§cNao dilvugar outro servidor");
		p.sendMessage("§cNao chingar o servidor!");
		p.sendMessage("§cNao divulgar links");
		p.sendMessage("§cNao fazer free-kill");
		return false;
	}
}
