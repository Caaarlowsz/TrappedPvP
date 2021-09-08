package com.marcello.comandos;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class CoinsCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (args.length < 2) {
            p.sendMessage("§6§lCOINS §7Este sistema ser\u00e1 adicionado em breve.");
            return true;
        }
        return false;
    }
}
