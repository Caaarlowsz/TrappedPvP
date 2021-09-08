package com.marcello.guis;

import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class VisGui implements Listener, CommandExecutor
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
    
    public static List<String> Lore(final String string) {
        return null;
    }
    
    @EventHandler
    public void Execute(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§cAdmins - Visibilidade")) {
                if (e.getCurrentItem().isSimilar(VisGui.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(VisGui.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(VisGui.livro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(VisGui.vis)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/vis");
                }
                if (e.getCurrentItem().isSimilar(VisGui.monitor)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/invis");
                }
                if (e.getCurrentItem().isSimilar(VisGui.close)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.sendMessage("§cInvent\u00e1rio de §FVISIBILIDADE§c Fechado!");
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
        final Inventory warp = Bukkit.createInventory((InventoryHolder)p, 54, "§cAdmins - Visibilidade");
        VisGui.livro = new ItemStack(Material.BOOK);
        (VisGui.livrometa = VisGui.livro.getItemMeta()).setDisplayName("§c§lMONITOR");
        VisGui.livro.setItemMeta(VisGui.livrometa);
        VisGui.monitor = new ItemStack(Material.getMaterial(351), 1, (short)8);
        (VisGui.monitormeta = VisGui.monitor.getItemMeta()).setDisplayName("§C§lFICAR INVISIVEL");
        VisGui.monitor.setItemMeta(VisGui.monitormeta);
        VisGui.vis = new ItemStack(Material.getMaterial(351), 1, (short)10);
        (VisGui.vismeta = VisGui.vis.getItemMeta()).setDisplayName("§a§lFICAR VISIVEL");
        VisGui.vis.setItemMeta(VisGui.vismeta);
        VisGui.close = new ItemStack(Material.REDSTONE);
        (VisGui.closemeta = VisGui.close.getItemMeta()).setDisplayName("§c§lFECHAR");
        VisGui.close.setItemMeta(VisGui.closemeta);
        for (int i = 0; i != 54; ++i) {
            warp.setItem(13, VisGui.livro);
            warp.setItem(21, VisGui.vis);
            warp.setItem(23, VisGui.monitor);
        }
        p.openInventory(warp);
        return false;
    }
}
