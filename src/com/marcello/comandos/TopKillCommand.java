package com.marcello.comandos;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;

public class TopKillCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String Label, final String[] args) {
		if (cmd.getName().equalsIgnoreCase("topkills")) {
			final HashMap<String, Integer> players = new HashMap<String, Integer>();
			for (final String playerName : TrappedPvP.getInstace().stats.getKeys(false)) {
				players.put(playerName, TrappedPvP.getInstace().stats.getInt(String.valueOf(playerName) + ".Kills"));
			}
			sender.sendMessage("�b�l          TOPKILL!");
			String nextTop = "";
			Integer nextTopKills = 0;
			for (int i = 1; i < 11; ++i) {
				for (final String playerName2 : players.keySet()) {
					if (players.get(playerName2) > nextTopKills) {
						nextTop = playerName2;
						nextTopKills = players.get(playerName2);
					}
				}
				sender.sendMessage(String.valueOf(i) + " �a��7 " + nextTop + " \u27b8�f " + nextTopKills);
				players.remove(nextTop);
				nextTop = "";
				nextTopKills = 0;
			}
			sender.sendMessage("�e�l          TOPKILL!");
		}
		return false;
	}
}
