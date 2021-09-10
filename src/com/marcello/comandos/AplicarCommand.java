package com.marcello.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class AplicarCommand implements Listener, CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		cmd.getName().equalsIgnoreCase("aplicar");
		p.sendMessage("§7 ");
		p.sendMessage("§7             §5§lAPLICAR§7                ");
		p.sendMessage("  ");
		p.sendMessage("§5§lTRIAL-MOD §7- §cEm breve!");
		p.sendMessage("§9§lHELPER §7- §cSem vagas!");
		return false;
	}
}
