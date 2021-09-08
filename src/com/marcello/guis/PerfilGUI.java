package com.marcello.guis;

import com.marcello.utils.KillsDeathsMoney;
import com.marcello.manager.Groups;
import java.util.ArrayList;
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
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class PerfilGUI implements Listener, CommandExecutor
{
    public static ItemStack vidro;
    public static ItemMeta vidrometa;
    public static ItemStack livro;
    public static ItemMeta livrometa;
    public static ItemStack head;
    public static ItemMeta headmeta;
    
    public static List<String> Lore(final String string) {
        return null;
    }
    
    @EventHandler
    public void Execute(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§cAdmins")) {
                if (e.getCurrentItem().isSimilar(PerfilGUI.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(PerfilGUI.vidro)) {
                    e.setCancelled(true);
                    p.closeInventory();
                }
                if (e.getCurrentItem().isSimilar(PerfilGUI.livro)) {
                    e.setCancelled(true);
                    p.closeInventory();
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
        final Inventory warp = Bukkit.createInventory((InventoryHolder)p, 54, "§aStatus");
        PerfilGUI.livro = new ItemStack(Material.BOOK);
        (PerfilGUI.livrometa = PerfilGUI.livro.getItemMeta()).setDisplayName("§a§lSTATUS");
        PerfilGUI.livro.setItemMeta(PerfilGUI.livrometa);
        final ItemStack stack = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        final SkullMeta meta = (SkullMeta)stack.getItemMeta();
        meta.setOwner(p.getName());
        final ArrayList<String> lore = new ArrayList<String>();
        lore.add("§7");
        lore.add("§7Seu Nick: §e" + p.getName());
        lore.add("§7Grupo: " + Groups.getRank(p));
        lore.add("§7Kills:§a " + KillsDeathsMoney.getKills(p));
        lore.add("§7Deaths:§c " + KillsDeathsMoney.getDeaths(p));
        lore.add("§7Money:§6 " + KillsDeathsMoney.getMoney(p));
        meta.setLore((List)lore);
        meta.setDisplayName("§cInforma\u00e7\u00f5es:");
        stack.setItemMeta((ItemMeta)meta);
        for (int i = 0; i != 54; ++i) {
            warp.setItem(13, PerfilGUI.livro);
            warp.setItem(22, stack);
        }
        p.openInventory(warp);
        return false;
    }
}
