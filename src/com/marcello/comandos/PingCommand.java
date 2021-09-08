package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class PingCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String c, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            final int ping = ((CraftPlayer)p).getHandle().ping;
            if (c.equalsIgnoreCase("ping")) {
                if (args.length == 0) {
                    p.sendMessage("§a§lPING §7Sua latencia e de §a" + ping + " §7ms");
                }
                else if (p.getServer().getPlayer(args[0]) != null) {
                    final String player2 = args[0];
                    final Player target = Bukkit.getServer().getPlayer(args[0]);
                    final int ping2 = ((CraftPlayer)target).getHandle().ping;
                    p.sendMessage("§a§lPING §7O player §a" + player2 + "  §7Tem uma latencia de §a" + ping2 + " §7ms");
                }
                else {
                    p.sendMessage("§a§LPING §7O player n\u00e3o est\u00e1 conectado ao servidor");
                }
            }
        }
        return false;
    }
}
