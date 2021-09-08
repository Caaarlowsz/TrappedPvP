package com.marcello.comandos;

import com.marcello.api.ArraysAPI;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class MonitorCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("monitorar")) {
            if (!sender.hasPermission("cmd.monitorar")) {
                p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§5§lMONITORAR §7Utilize o comando §c/monitorar (on) §7ou §c(off)");
                return true;
            }
            if (args[0].equalsIgnoreCase("on")) {
                ArraysAPI.Monitor.add(p);
                p.sendMessage("§5§lMONITORAR §7Voce agora est\u00e1 no modo monitor");
                return true;
            }
            if (args[0].equalsIgnoreCase("off")) {
                ArraysAPI.Monitor.remove(p);
                p.sendMessage("§5§lMONITORAR §7Voce saiu do modo monitor");
                return true;
            }
        }
        return false;
    }
}
