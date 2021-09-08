package com.marcello.guis;

import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.Inventory;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.ArrayList;
import org.bukkit.ChatColor;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class Admins implements Listener, CommandExecutor
{
    public static ItemStack vidro;
    public static ItemMeta vidrometa;
    public static ItemStack livro;
    public static ItemMeta livrometa;
    public static ItemStack close;
    public static ItemMeta closemeta;
    public static ItemStack adminmode;
    public static ItemMeta adminmodemeta;
    public static ItemStack monitor;
    public static ItemMeta monitormeta;
    public static ItemStack vis;
    public static ItemMeta vismeta;
    
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
    public void Clicar(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.getMaterial(397) && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§cAdmin §7(Clique)")) {
            p.chat("/admins");
        }
    }
    
    @EventHandler
    public void Execute(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§cAdmins")) {
                if (e.getCurrentItem().isSimilar(Admins.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(Admins.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(Admins.livro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(Admins.adminmode)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/admin");
                }
                if (e.getCurrentItem().isSimilar(Admins.vis)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/visgui");
                }
                if (e.getCurrentItem().isSimilar(Admins.monitor)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/monitorgui");
                }
                if (e.getCurrentItem().isSimilar(Admins.close)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.sendMessage("§c§ADMINS §7O inventario de admin foi fechado com sucesso");
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
        final Inventory warp = Bukkit.createInventory((InventoryHolder)p, 54, "§cAdmins");
        Admins.livro = new ItemStack(Material.BOOK);
        (Admins.livrometa = Admins.livro.getItemMeta()).setDisplayName("§4§lADMINS");
        Admins.livro.setItemMeta(Admins.livrometa);
        Admins.adminmode = new ItemStack(Material.ENCHANTED_BOOK);
        (Admins.adminmodemeta = Admins.adminmode.getItemMeta()).setDisplayName("§4§lMODO ADMIN");
        Admins.adminmode.setItemMeta(Admins.adminmodemeta);
        Admins.monitor = new ItemStack(Material.CHEST);
        (Admins.monitormeta = Admins.monitor.getItemMeta()).setDisplayName("§4§lMODO MONITOR");
        Admins.monitor.setItemMeta(Admins.monitormeta);
        Admins.vis = new ItemStack(Material.POTION);
        (Admins.vismeta = Admins.vis.getItemMeta()).setDisplayName("§4§lVISIBILIDADE");
        Admins.vis.setItemMeta(Admins.vismeta);
        Admins.close = new ItemStack(Material.REDSTONE);
        (Admins.closemeta = Admins.close.getItemMeta()).setDisplayName("§4§lFECHAR");
        Admins.close.setItemMeta(Admins.closemeta);
        for (int i = 0; i != 54; ++i) {
            warp.setItem(13, Admins.livro);
            warp.setItem(21, Admins.adminmode);
            warp.setItem(22, Admins.vis);
            warp.setItem(23, Admins.monitor);
        }
        p.openInventory(warp);
        return false;
    }
}
