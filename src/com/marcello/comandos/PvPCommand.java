package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class PvPCommand implements CommandExecutor, Listener
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (!cmd.getName().equalsIgnoreCase("togglepvp") || (!sender.hasPermission("cmd.togglepvp") && !sender.isOp())) {
            return false;
        }
        if (p.getWorld().getPVP()) {
            p.getWorld().setPVP(false);
            Bukkit.getServer().broadcastMessage("§9§lTOGGLE §7Dano desativado");
            Bukkit.getServer().broadcastMessage("§9§lTOGGLE §7PvP desativado");
            return true;
        }
        p.getWorld().setPVP(true);
        Bukkit.getServer().broadcastMessage("§9§lTOGGLE §7Dano ativado");
        Bukkit.getServer().broadcastMessage("§9§lTOGGLE §7PvP ativado");
        return true;
    }
}
