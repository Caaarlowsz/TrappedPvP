package com.marcello.comandos;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.ArrayList;
import org.bukkit.command.CommandExecutor;

public class MOTDCommand implements CommandExecutor
{
    public static ArrayList<String> changeMOTD;
    
    static {
        MOTDCommand.changeMOTD = new ArrayList<String>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (cmd.getName().equalsIgnoreCase("setmotd") && sender instanceof Player) {
            final Player player = (Player)sender;
            if (!sender.hasPermission("cmd.setmotd")) {
                player.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            if (args.length == 0) {
                player.sendMessage("§b§lSETMOTD §7Ops! Use isso De Maneira Correta: §b/setmotd (motd)");
                return true;
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("reset")) {
                    if (MOTDCommand.changeMOTD.isEmpty()) {
                        player.sendMessage("§b§lSETMOTD §7O Motd N\u00e3o tinha sido alterado anteriormente!");
                        return true;
                    }
                    MOTDCommand.changeMOTD.clear();
                    player.sendMessage("§b§lSETMOTD §7A Motd Foi Resetada com Sucesso!");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("view")) {
                    if (MOTDCommand.changeMOTD.isEmpty()) {
                        player.sendMessage("§b§lSETMOTD §7A Motd n\u00e3o est\u00e1 alterada.");
                        return true;
                    }
                    player.sendMessage("§b§lSETMOTD §7A atual MOTD setada: " + MOTDCommand.changeMOTD.toString().replace("[", "").replace("]", ""));
                    return true;
                }
                else {
                    if (!MOTDCommand.changeMOTD.isEmpty()) {
                        player.sendMessage("§b§lSETMOTD §7A Motd j\u00e1 est\u00e1 alterada, Resete-a e Tente novamente.");
                        return true;
                    }
                    final String prefix = "       §e§ml>     §a§l>    §c§l> §f§l §3§lTRAPPED§F§lPVP §c§l<    §a§l<    §e§l<     ";
                    final String motd = args[0];
                    MOTDCommand.changeMOTD.add(String.valueOf(prefix) + motd);
                    player.sendMessage("§b§lSETMOTD §7A motd Foi setada para §b" + motd);
                    return true;
                }
            }
            else if (args.length >= 2) {
                String motd2 = "";
                for (int i = 0; i < args.length; ++i) {
                    motd2 = String.valueOf(motd2) + args[i] + " ";
                }
                if (!MOTDCommand.changeMOTD.isEmpty()) {
                    player.sendMessage("§b§lSETMOTD §7A motd j\u00e1 est\u00e1 alterada resete-a e tente novamente.");
                    return true;
                }
                MOTDCommand.changeMOTD.add(motd2);
                player.sendMessage("§b§LSETMOTD §7A motd foi setada para §b" + motd2);
                return true;
            }
        }
        return false;
    }
}
