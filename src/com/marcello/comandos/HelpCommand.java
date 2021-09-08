package com.marcello.comandos;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class HelpCommand implements Listener, CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        cmd.getName().equalsIgnoreCase("ajuda");
        p.sendMessage("§d§lPLUGINS §7todos os plugins foram feitos por §duRecover_");
        return false;
    }
}
