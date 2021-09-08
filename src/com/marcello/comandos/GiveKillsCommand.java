package com.marcello.comandos;

import org.bukkit.entity.Player;
import com.marcello.utils.KillsDeathsMoney;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GiveKillsCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!cmd.getName().equalsIgnoreCase("givekills")) {
            return false;
        }
        if (!sender.hasPermission("cmd.kills")) {
            sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
            return true;
        }
        if (args.length < 3) {
            sender.sendMessage("§b§lGIVEKILLS §7Utilize o comando §b/givekills add (nick) 100");
            return true;
        }
        final int tanto = Integer.valueOf(args[2]);
        final Player t = Bukkit.getPlayer(args[1]);
        if (args[0].equalsIgnoreCase("add")) {
            try {
                KillsDeathsMoney.addKill(t, tanto);
                sender.sendMessage("§b§lGIVEKILLS §7Voc\u00ea adicionou §b100 §7de KILLS ao jogador §b" + t.getName());
                t.sendMessage("§b§lKILLS §7Voc\u00ea rececebeu §b100 §7de Kill!");
            }
            catch (Exception e) {
                sender.sendMessage("§b§lGIVEKILLS §7Utilize apenas n\u00fameros para dar kills");
            }
        }
        else {
            sender.sendMessage("§b§lGIVEKILLS §7Utilize o comando §b/givekills add (nick) 100");
        }
        return false;
    }
}
