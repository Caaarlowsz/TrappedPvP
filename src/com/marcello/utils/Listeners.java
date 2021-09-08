package com.marcello.utils;

import com.marcello.comandos.MOTDCommand;
import org.bukkit.event.server.ServerListPingEvent;
import com.marcello.manager.TopKillStreak;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import com.marcello.comandos.StaffCommand;
import org.bukkit.Bukkit;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.Listener;

public class Listeners implements Listener
{
    @EventHandler
    public void ChatStaff(final AsyncPlayerChatEvent e) {
        final Player p = e.getPlayer();
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player pl = onlinePlayers[i];
            if (pl.hasPermission("cmd.sc") && StaffCommand.staffchat.contains(p.getName())) {
                e.setCancelled(true);
                pl.sendMessage("§4§lSTAFF§c§lCHAT §c- §7" + p.getName() + " §d> §f" + e.getMessage());
            }
        }
    }
    
    public static void darItem(final Player p, final Material mat, final int quant, final int modo, final String nome, final int lugar) {
        final ItemStack item = new ItemStack(mat, quant, (short)modo);
        final ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(nome);
        item.setItemMeta(itemm);
        p.getInventory().setItem(lugar, item);
    }
    
    public static void darItem(final Player p, final Material mat, final int quant, final int modo, final String nome, final Enchantment e, final int lugar) {
        final ItemStack item = new ItemStack(mat, quant, (short)modo);
        item.addUnsafeEnchantment(e, 100);
        final ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(nome);
        item.setItemMeta(itemm);
        p.getInventory().setItem(lugar, item);
    }
    
    public static void DarItem(final Player p, final Material item, final int slot, final String name) {
        final ItemStack give = new ItemStack(item);
        final ItemMeta givem = give.getItemMeta();
        givem.setDisplayName(name);
        give.setItemMeta(givem);
        p.getInventory().setItem(slot, give);
    }
    
    public static void KillStreak(final Player p) {
        if (TopKillStreak.getKsTop(p) == 5) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c5");
        }
        if (TopKillStreak.getKsTop(p) == 10) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c10");
        }
        if (TopKillStreak.getKsTop(p) == 15) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c15");
        }
        if (TopKillStreak.getKsTop(p) == 20) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c20");
        }
        if (TopKillStreak.getKsTop(p) == 25) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c25");
        }
        if (TopKillStreak.getKsTop(p) == 30) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c30");
        }
        if (TopKillStreak.getKsTop(p) == 35) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c35");
        }
        if (TopKillStreak.getKsTop(p) == 40) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §c§lKILLSTREAK §7de §c40");
        }
        if (TopKillStreak.getKsTop(p) == 45) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c45");
        }
        if (TopKillStreak.getKsTop(p) == 50) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c50");
        }
        if (TopKillStreak.getKsTop(p) == 55) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c55");
        }
        if (TopKillStreak.getKsTop(p) == 60) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c60");
        }
        if (TopKillStreak.getKsTop(p) == 65) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c65");
        }
        if (TopKillStreak.getKsTop(p) == 70) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O Jogador §f" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c70");
        }
        if (TopKillStreak.getKsTop(p) == 75) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O jogador §c" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c75");
        }
        if (TopKillStreak.getKsTop(p) == 80) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O jogador §c" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c80");
        }
        if (TopKillStreak.getKsTop(p) == 85) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O jogador §c" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c85");
        }
        if (TopKillStreak.getKsTop(p) == 90) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O jogador §c" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c90");
        }
        if (TopKillStreak.getKsTop(p) == 95) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O jogador §c" + p.getName() + " §7Conseguiu um §2§lKILLSTREAK §7de §c95");
        }
        if (TopKillStreak.getKsTop(p) == 100) {
            Bukkit.broadcastMessage("§4§lKILLSTREAK §7O jogador §c" + p.getName() + " §7Conseguiu a §c2lKILLSTREAK §7M\u00e1xima de §c100");
        }
    }
    
    @EventHandler
    public void onPing(final ServerListPingEvent e) {
        e.setMaxPlayers(Bukkit.getOnlinePlayers().length + 1);
        if (!MOTDCommand.changeMOTD.isEmpty()) {
            e.setMotd(MOTDCommand.changeMOTD.toString().replace("&", "§").replace("[", "").replace("]", "").replace("\n", "\n"));
        }
        else {
            e.setMotd("   §8§l§m §b§l§m]§b§l§m   §b§lTRAPPED§F§LNETWORK  §f | §dMinecraft Server §b§l§m   [§8§l§m \n§e   Venha ver as novidades do nosso servidor!");
        }
    }
}
