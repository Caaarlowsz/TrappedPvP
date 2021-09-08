package com.marcello.guis;

import com.marcello.utils.KillsDeathsMoney;
import com.marcello.manager.ProximaLiga;
import com.marcello.manager.Elos;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import java.util.ArrayList;
import org.bukkit.ChatColor;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class RankGUI implements Listener, CommandExecutor
{
    public static ItemStack vidro;
    public static ItemMeta vidrometa;
    public static ItemStack primary;
    public static ItemMeta primarymeta;
    public static ItemStack ouro;
    public static ItemMeta ourometa;
    public static ItemStack diamante;
    public static ItemMeta diamantemeta;
    public static ItemStack elite;
    public static ItemMeta elitemeta;
    public static ItemStack master;
    public static ItemMeta mastermeta;
    public static ItemStack legendary;
    public static ItemMeta legendarymeta;
    public static ItemStack unranked;
    public static ItemMeta unrankedmeta;
    public static ItemStack bronze;
    public static ItemMeta bronzemeta;
    public static ItemStack head;
    public static ItemMeta headmeta;
    
    public static List<String> Lore(String string) {
        final String[] split = string.split(" ");
        string = "";
        final ChatColor color = ChatColor.GOLD;
        final ArrayList<String> newString = new ArrayList<String>();
        for (int i = 0; i < split.length; ++i) {
            if (string.length() > 20 || string.endsWith(".")) {
                newString.add(color + string);
                if (string.endsWith(".")) {
                    newString.add("");
                }
                string = "";
            }
            string = String.valueOf(string) + ((string.length() == 0) ? "" : " ") + split[i];
        }
        newString.add(string);
        return newString;
    }
    
    @EventHandler
    public void Execute(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§7Ranks:")) {
                if (e.getCurrentItem().isSimilar(RankGUI.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(RankGUI.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(RankGUI.unranked)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.primary)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.bronze)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.ouro)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.diamante)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.elite)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.master)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.legendary)) {
                    e.setCancelled(true);
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(RankGUI.head)) {
                    e.setCancelled(true);
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7" + p.getName() + " §7ranks")) {
                    e.setCancelled(true);
                }
            }
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cVoce precisa ser um player");
            return true;
        }
        final Player p = (Player)sender;
        final Inventory warp = Bukkit.createInventory((InventoryHolder)p, 36, "§7Ranks:");
        RankGUI.unranked = new ItemStack(Material.CLAY_BALL);
        (RankGUI.unrankedmeta = RankGUI.unranked.getItemMeta()).setDisplayName("§f- UNRANKED");
        RankGUI.unranked.setItemMeta(RankGUI.unrankedmeta);
        RankGUI.unrankedmeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b0"));
        RankGUI.unranked.setItemMeta(RankGUI.unrankedmeta);
        RankGUI.primary = new ItemStack(Material.EMERALD);
        (RankGUI.primarymeta = RankGUI.primary.getItemMeta()).setDisplayName("§a= PRIMARY");
        RankGUI.primary.setItemMeta(RankGUI.primarymeta);
        RankGUI.primarymeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b100"));
        RankGUI.primary.setItemMeta(RankGUI.primarymeta);
        RankGUI.bronze = new ItemStack(Material.getMaterial(336));
        (RankGUI.bronzemeta = RankGUI.bronze.getItemMeta()).setDisplayName("§e\u2630 BRONZE");
        RankGUI.bronze.setItemMeta(RankGUI.bronzemeta);
        RankGUI.bronzemeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b200"));
        RankGUI.bronze.setItemMeta(RankGUI.bronzemeta);
        RankGUI.ouro = new ItemStack(Material.GOLD_INGOT);
        (RankGUI.ourometa = RankGUI.ouro.getItemMeta()).setDisplayName("§6\u2737  OURO");
        RankGUI.ouro.setItemMeta(RankGUI.ourometa);
        RankGUI.ourometa.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b300"));
        RankGUI.ouro.setItemMeta(RankGUI.ourometa);
        RankGUI.diamante = new ItemStack(Material.DIAMOND);
        (RankGUI.diamantemeta = RankGUI.diamante.getItemMeta()).setDisplayName("§b\u2726  DIAMOND");
        RankGUI.diamante.setItemMeta(RankGUI.diamantemeta);
        RankGUI.diamantemeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b400"));
        RankGUI.diamante.setItemMeta(RankGUI.diamantemeta);
        RankGUI.elite = new ItemStack(Material.getMaterial(351), 1, (short)5);
        (RankGUI.elitemeta = RankGUI.elite.getItemMeta()).setDisplayName("§5\u2739  ELITE");
        RankGUI.elite.setItemMeta(RankGUI.elitemeta);
        RankGUI.elitemeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b500"));
        RankGUI.elite.setItemMeta(RankGUI.elitemeta);
        RankGUI.master = new ItemStack(Material.getMaterial(45));
        (RankGUI.mastermeta = RankGUI.master.getItemMeta()).setDisplayName("§c\u272b  MASTER");
        RankGUI.master.setItemMeta(RankGUI.mastermeta);
        RankGUI.mastermeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b600"));
        RankGUI.master.setItemMeta(RankGUI.mastermeta);
        RankGUI.legendary = new ItemStack(Material.REDSTONE);
        (RankGUI.legendarymeta = RankGUI.master.getItemMeta()).setDisplayName("§4\u272a  LEGENDARY");
        RankGUI.legendary.setItemMeta(RankGUI.legendarymeta);
        RankGUI.legendarymeta.setLore((List)Lore("§7» Kills n\u00e9cessarias: §b1000"));
        RankGUI.legendary.setItemMeta(RankGUI.legendarymeta);
        final ItemStack stack = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        final SkullMeta meta = (SkullMeta)stack.getItemMeta();
        final ArrayList<String> lore = new ArrayList<String>();
        meta.setOwner(p.getName());
        lore.add("§7");
        lore.add("§7» Seu rank: " + Elos.getElo(p));
        lore.add("§7» Proximo rank: " + ProximaLiga.getProxElo(p));
        lore.add("§7» Suas Kills:§b " + KillsDeathsMoney.getKills(p));
        meta.setLore((List)lore);
        meta.setDisplayName("§7" + p.getName() + " §7ranks");
        stack.setItemMeta((ItemMeta)meta);
        for (int i = 0; i != 36; ++i) {
            warp.setItem(4, stack);
            warp.setItem(19, RankGUI.unranked);
            warp.setItem(20, RankGUI.primary);
            warp.setItem(21, RankGUI.bronze);
            warp.setItem(22, RankGUI.ouro);
            warp.setItem(23, RankGUI.diamante);
            warp.setItem(24, RankGUI.elite);
            warp.setItem(25, RankGUI.legendary);
        }
        p.openInventory(warp);
        return false;
    }
}
