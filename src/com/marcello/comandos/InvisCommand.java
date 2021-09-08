package com.marcello.comandos;

import com.marcello.api.ArraysAPI;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class InvisCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("invis")) {
            if (!sender.hasPermission("cmd.visible")) {
                p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            if (args.length == 0) {
                if (ArraysAPI.Admin.contains(p)) {
                    p.sendMessage("§E§LINVIS §7Voc\u00ea ficou invisivel para todos");
                    return true;
                }
                p.sendMessage("§E§LINVIS §7Apenas no modo administrador");
                return true;
            }
        }
        return false;
    }
}
