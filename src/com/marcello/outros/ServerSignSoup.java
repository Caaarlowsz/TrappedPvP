package com.marcello.outros;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.block.Sign;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.Listener;

public class ServerSignSoup implements Listener
{
    @EventHandler
    public void Escrever(final SignChangeEvent e) {
        final Player p = e.getPlayer();
        if (p.hasPermission("placa.sopa") && e.getLine(0).equalsIgnoreCase("sopa")) {
            e.setLine(0, "§3§lTRAPPED");
            e.setLine(2, "§eSopas");
            e.setLine(3, "§7(Clique)");
            p.sendMessage("§9§LSOPA §7A placa foi criada com sucesso");
        }
    }
    
    @EventHandler
    public void Inv(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK && ((e.getClickedBlock() != null && e.getClickedBlock().getType() == Material.WALL_SIGN) || e.getClickedBlock().getType() == Material.SIGN_POST)) {
            final Sign s = (Sign)e.getClickedBlock().getState();
            final String[] lines = s.getLines();
            if (lines.length > 0 && lines[0].equals("§3§lTRAPPED") && lines.length > 2 && lines[2].equals("§eSopas") && lines.length > 3 && lines[3].equals("§7(Clique)")) {
                final Inventory inv = Bukkit.createInventory((InventoryHolder)p, 54, "§3§lTRAPPED §7Sopas");
                final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
                final ItemMeta sopameta = sopa.getItemMeta();
                sopameta.setDisplayName("§aSopa");
                sopa.setItemMeta(sopameta);
                for (int i = 0; i != 54; ++i) {
                    inv.setItem(i, sopa);
                }
                p.openInventory(inv);
            }
        }
    }
}
