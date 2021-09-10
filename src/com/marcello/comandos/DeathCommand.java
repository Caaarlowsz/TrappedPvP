package com.marcello.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.marcello.score.Score;

public class DeathCommand implements Listener, CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("morrer")) {
			p.setHealth(0.0);
			Score.setScore(p);
			p.sendMessage("§d§LSUICIDE §7Voc\u00ea se suicidou.");
		}
		return false;
	}
}
