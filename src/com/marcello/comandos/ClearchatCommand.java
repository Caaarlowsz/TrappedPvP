package com.marcello.comandos;

import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class ClearchatCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, j = 0; j < length; ++j) {
            final Player s = onlinePlayers[j];
            if (!sender.hasPermission("cmd.chat")) {
                sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            for (int i = 0; i != 150; ++i) {
                s.sendMessage("  ");
            }
            s.sendMessage("§d§lCHAT §7O chat do servidor foi completamente limpo!");
        }
        return false;
    }
}
