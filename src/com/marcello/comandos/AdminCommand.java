package com.marcello.comandos;

import org.bukkit.inventory.Inventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;
import org.bukkit.GameMode;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;
import java.util.ArrayList;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class AdminCommand implements CommandExecutor, Listener
{
    public static ArrayList<String> admin;
    public static HashMap<String, ItemStack[]> saveinv;
    public static HashMap<String, ItemStack[]> savearmor;
    
    static {
        AdminCommand.admin = new ArrayList<String>();
        AdminCommand.saveinv = new HashMap<String, ItemStack[]>();
        AdminCommand.savearmor = new HashMap<String, ItemStack[]>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        if (!sender.hasPermission("cmd.admin")) {
            sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
            return true;
        }
        final Player p = (Player)sender;
        if (args.length == 0) {
            if (!AdminCommand.admin.contains(p.getName())) {
                p.sendMessage("§c§LADMIN §7Voc\u00ea entrou no modo administrador");
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                    final Player s = onlinePlayers[i];
                    if (!s.hasPermission("cmd.admin")) {
                        s.hidePlayer(p);
                    }
                }
                p.setGameMode(GameMode.CREATIVE);
                AdminCommand.admin.add(p.getName());
                AdminCommand.saveinv.put(p.getName(), p.getInventory().getContents());
                AdminCommand.savearmor.put(p.getName(), p.getInventory().getArmorContents());
                p.setAllowFlight(true);
                p.getInventory().clear();
                p.updateInventory();
                final ItemStack barra = new ItemStack(Material.BEDROCK);
                final ItemMeta barrameta = barra.getItemMeta();
                barrameta.setDisplayName("§8§lCAGE");
                barra.setItemMeta(barrameta);
                final ItemStack estrela = new ItemStack(Material.MUSHROOM_SOUP);
                final ItemMeta estrelameta = estrela.getItemMeta();
                estrelameta.setDisplayName("§a§lAUTOSOUP");
                estrela.setItemMeta(estrelameta);
                p.getInventory().setItem(3, barra);
                p.getInventory().setItem(5, estrela);
                p.updateInventory();
            }
            else {
                p.sendMessage("§c§LADMIN §7Voc\u00ea saiu no modo administrador");
                p.getInventory().clear();
                AdminCommand.admin.remove(p.getName());
                Player[] onlinePlayers2;
                for (int length2 = (onlinePlayers2 = Bukkit.getOnlinePlayers()).length, j = 0; j < length2; ++j) {
                    final Player s = onlinePlayers2[j];
                    if (!s.hasPermission("cmd.admin")) {
                        s.showPlayer(p);
                    }
                }
                p.setGameMode(GameMode.SURVIVAL);
                p.getInventory().setContents((ItemStack[])AdminCommand.saveinv.get(p.getName()));
                p.getInventory().setArmorContents((ItemStack[])AdminCommand.savearmor.get(p.getName()));
            }
        }
        return false;
    }
    
    @EventHandler
    public void prender(final PlayerInteractEntityEvent e) {
        if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.BEDROCK && AdminCommand.admin.contains(e.getPlayer().getName())) {
            final Player p = e.getPlayer();
            final Player t = (Player)e.getRightClicked();
            p.chat("/arena " + t.getName());
        }
    }
    
    @EventHandler
    public void AUTOSOUP(final PlayerInteractEntityEvent e) {
        if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.MUSHROOM_SOUP && AdminCommand.admin.contains(e.getPlayer().getName())) {
            final Player p = e.getPlayer();
            final Player t = (Player)e.getRightClicked();
            p.chat("/autosoup " + t.getName());
        }
    }
    
    public static int getMaterial(final Player p, final Material m) {
        int value = 0;
        ItemStack[] contents;
        for (int length = (contents = p.getInventory().getContents()).length, i = 0; i < length; ++i) {
            final ItemStack item = contents[i];
            if (item != null && item.getType() == m && item.getAmount() > 0) {
                value += item.getAmount();
            }
        }
        return value;
    }
    
    @EventHandler
    public void Abririnv(final PlayerInteractEntityEvent e) {
        if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.AIR && AdminCommand.admin.contains(e.getPlayer().getName())) {
            final Player t = (Player)e.getRightClicked();
            e.getPlayer().openInventory((Inventory)t.getInventory());
        }
    }
}
