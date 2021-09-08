package com.marcello.guis;

import com.marcello.utils.KillsDeathsMoney;
import com.marcello.manager.Groups;
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

public class UltilsMenu implements Listener, CommandExecutor
{
    public static ItemStack vidro;
    public static ItemMeta vidrometa;
    public static ItemStack close;
    public static ItemMeta closemeta;
    public static ItemStack perms;
    public static ItemMeta permsmeta;
    public static ItemStack livro;
    public static ItemMeta livrometa;
    public static ItemStack admins;
    public static ItemMeta adminsmeta;
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
            if (Inv.getTitle().equalsIgnoreCase("§aUltils")) {
                if (e.getCurrentItem().isSimilar(UltilsMenu.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(UltilsMenu.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(UltilsMenu.livro)) {
                    p.chat("/ultils");
                }
                if (e.getCurrentItem().isSimilar(UltilsMenu.perms)) {
                    p.chat("/lojaperm");
                }
                if (e.getCurrentItem().isSimilar(UltilsMenu.admins)) {
                    p.chat("/admins");
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
        final Inventory warp = Bukkit.createInventory((InventoryHolder)p, 54, "§aUltils");
        UltilsMenu.livro = new ItemStack(Material.BOOK);
        (UltilsMenu.livrometa = UltilsMenu.livro.getItemMeta()).setDisplayName("§a§lULTILS");
        UltilsMenu.livro.setItemMeta(UltilsMenu.livrometa);
        UltilsMenu.close = new ItemStack(Material.REDSTONE);
        (UltilsMenu.closemeta = UltilsMenu.close.getItemMeta()).setDisplayName("§c§lVOLTAR");
        UltilsMenu.close.setItemMeta(UltilsMenu.closemeta);
        UltilsMenu.closemeta.setLore((List)Lore("§7Feche o menu"));
        UltilsMenu.admins = new ItemStack(Material.ENCHANTMENT_TABLE);
        (UltilsMenu.adminsmeta = UltilsMenu.admins.getItemMeta()).setDisplayName("§c§lADMINS");
        UltilsMenu.admins.setItemMeta(UltilsMenu.adminsmeta);
        UltilsMenu.adminsmeta.setLore((List)Lore("§7Apenas para staffers"));
        UltilsMenu.perms = new ItemStack(Material.DIAMOND);
        (UltilsMenu.permsmeta = UltilsMenu.perms.getItemMeta()).setDisplayName("§b§lLOJA");
        UltilsMenu.permsmeta.setLore((List)Lore("§7Acesse a loja"));
        UltilsMenu.perms.setItemMeta(UltilsMenu.permsmeta);
        final ItemStack stack = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        final SkullMeta meta = (SkullMeta)stack.getItemMeta();
        final ArrayList<String> lore = new ArrayList<String>();
        meta.setOwner(p.getName());
        lore.add("§7");
        lore.add("§7Seu Nick: §e" + p.getName());
        lore.add("§7Grupo: " + Groups.getRank(p));
        lore.add("§7Kills:§a " + KillsDeathsMoney.getKills(p));
        lore.add("§7Deaths:§c " + KillsDeathsMoney.getDeaths(p));
        lore.add("§7Money:§6 " + KillsDeathsMoney.getMoney(p));
        meta.setLore((List)lore);
        meta.setDisplayName("§cStatus:");
        stack.setItemMeta((ItemMeta)meta);
        for (int i = 0; i != 54; ++i) {
            warp.setItem(0, UltilsMenu.close);
            warp.setItem(13, UltilsMenu.livro);
            warp.setItem(20, UltilsMenu.perms);
            warp.setItem(22, stack);
            warp.setItem(24, UltilsMenu.admins);
        }
        p.openInventory(warp);
        return false;
    }
}
