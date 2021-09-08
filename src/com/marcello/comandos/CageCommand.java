package com.marcello.comandos;

import org.bukkit.Material;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class CageCommand implements CommandExecutor, Listener
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String arg2, final String[] args) {
        final Player p = (Player)sender;
        if (p.hasPermission("cmd.arena") && cmd.getName().equalsIgnoreCase("arena")) {
            sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
        }
        if (args.length == 0) {
            p.sendMessage("§c§lCAGE §7Utilize o comando §c/arena (nick)");
        }
        if (args.length == 1) {
            final Player o = Bukkit.getPlayer(args[0]);
            if (o != null) {
                o.getLocation().add(0.0, 13.0, 0.0).getBlock().setType(Material.BEDROCK);
                o.getLocation().add(0.0, 11.0, 1.0).getBlock().setType(Material.BEDROCK);
                o.getLocation().add(1.0, 11.0, 0.0).getBlock().setType(Material.BEDROCK);
                o.getLocation().add(0.0, 11.0, -1.0).getBlock().setType(Material.BEDROCK);
                o.getLocation().add(-1.0, 11.0, 0.0).getBlock().setType(Material.BEDROCK);
                o.getLocation().add(0.0, 10.0, 0.0).getBlock().setType(Material.BEDROCK);
                o.teleport(o.getLocation().add(0.0, 11.0, -0.05));
                p.sendMessage("§c§LCAGE §7Voc\u00ea prendeu o jogador §c" + o.getName());
                o.sendMessage("§c§lCAGE §7Ol\u00e1 voc\u00ea \u00e9 suspeito de utilizar programas ilegais permane\u00e7a parado n\u00e3o utizile nenhum comando se deslogar voc\u00ea ser\u00e1 §c§lBANIDO§7.");
                Player[] arrayOfPlayer;
                for (int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length, i = 0; i < j; ++i) {
                    p.sendMessage("§c§LCAGE §7Parece que este player n\u00e3o est\u00e1 conectado com o servidor");
                }
            }
        }
        return false;
    }
}
