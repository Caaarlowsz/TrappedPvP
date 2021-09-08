package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class ChatCommand implements Listener, CommandExecutor
{
    public static boolean chat1;
    
    static {
        ChatCommand.chat1 = true;
    }
    
    @EventHandler
    public void onPlayerChat(final AsyncPlayerChatEvent e) {
        if (!e.getPlayer().hasPermission("falar.chat") && !ChatCommand.chat1) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§d§lCHAT §7Apenas vips §a§lLIGHT §7e acima para falar com o chat mutado");
        }
    }
    
    @EventHandler
    public void onPlayerChat1(final PlayerChatEvent e) {
        if (!e.getPlayer().hasPermission("falar.chat") && !ChatCommand.chat1) {
            e.setCancelled(true);
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        if (sender.hasPermission("cmd.chat")) {
            sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
            if (args.length > 0) {
                sender.sendMessage("§d§lCHAT §7Utilize o comando §d/chat (mutar) §7ou §d(demutar)");
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("mutar")) {
                        ChatCommand.chat1 = false;
                        Bukkit.broadcastMessage("§d§lCHAT §7O chat do servidor foi completamente §4§lMUTADO");
                    }
                    else if (args[0].equalsIgnoreCase("desmutar")) {
                        ChatCommand.chat1 = true;
                        Bukkit.broadcastMessage("§d§lCHAT §7O chat do servidor foi completamente §c§lDESMUTADO");
                    }
                }
                else {
                    sender.sendMessage("§d§lCHAT §7Utilize o comando §d/chat (mutar) §7ou §d(demutar)");
                }
            }
            else {
                sender.sendMessage("§d§lCHAT §7Utilize o comando §d/chat (mutar) §7ou §d(demutar)");
            }
        }
        return true;
    }
}
