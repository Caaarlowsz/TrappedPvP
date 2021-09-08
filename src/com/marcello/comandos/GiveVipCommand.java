package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GiveVipCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("givevip")) {
            if (!sender.hasPermission("cmd.givevip")) {
                sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§2§LGIVEVIT §7Utilize o comando §a/givevip (nick) (vip)");
                return true;
            }
            final int length = args.length;
            if (args.length == 2) {
                final String vipgroup = args[1];
                final Player jogador = Bukkit.getPlayer(args[0]);
                if (vipgroup.equalsIgnoreCase("Ultimate")) {
                    p.sendMessage("2§LGIVEVIT §7O vip §d§lULTIMATE §7foi dado ao jogador §a" + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set ultimate");
                    return true;
                }
                if (vipgroup.equalsIgnoreCase("Premium")) {
                    p.sendMessage("2§LGIVEVIT §7O vip §6§lPREMIUM §7foi dado ao jogador §a" + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set premium");
                    return true;
                }
                if (vipgroup.equalsIgnoreCase("light")) {
                    p.sendMessage("2§LGIVEVIT §7O vip §a§lLIGHT §7foi dado ao jogador §a" + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set light");
                    return true;
                }
            }
        }
        return false;
    }
}
