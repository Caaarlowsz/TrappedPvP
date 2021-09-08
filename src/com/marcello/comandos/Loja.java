package com.marcello.comandos;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class Loja implements Listener, CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        cmd.getName().equalsIgnoreCase("loja");
        p.sendMessage("§b§LSTORE §7Deseja comprar vip acesse nosso site: §b§nloja-reversemc.tk");
        return false;
    }
}
