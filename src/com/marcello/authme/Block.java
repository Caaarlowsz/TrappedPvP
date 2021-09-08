package com.marcello.authme;

import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import com.marcello.Main;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.Listener;

public class Block implements Listener
{
    @EventHandler
    public void Mover(final PlayerMoveEvent e) {
        final Player p = e.getPlayer();
        if (Main.login.contains(p.getName())) {
            p.teleport((Entity)p);
        }
    }
    
    @EventHandler
    public void asd2(final PlayerLoginEvent e) {
        final Player p = e.getPlayer();
        if (p.getName().length() > 16) {
            e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§3§lTRAPPED§F§LPVP \n \n§cDesculpe, mas seu nick so pode conter 16 caracteres.");
            return;
        }
        if (p.getName().contains(" ") || p.getName().contains("$") || p.getName().contains("@") || p.getName().contains("&") || p.getName().contains("#") || p.getName().contains("*") || p.getName().contains("§") || p.getName().contains("§") || p.getName().contains("§") || p.getName().contains("/") || p.getName().contains("\\") || p.getName().contains("]") || p.getName().contains("[") || p.getName().contains(".")) {
            e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§3§lTRAPPED§F§LPVP \n \n§cDesculpe, mas seu nome tem §c§lCARACTERES INVALIDAS§c!");
        }
    }
    
    @EventHandler
    public void login(final PlayerPreLoginEvent e) {
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player s = onlinePlayers[i];
            if (e.getName().equals(s.getName())) {
                e.setResult(PlayerPreLoginEvent.Result.KICK_BANNED);
                e.setKickMessage("§cEsse player ja esta conectado ao Servidor.");
                return;
            }
        }
    }
    
    @EventHandler
    public void onPickUp(final PlayerPickupItemEvent event) {
        final Player p = event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onDrop(final PlayerDropItemEvent event) {
        final Player p = event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onClickInventorySpec(final InventoryClickEvent event) {
        final Player p = (Player)event.getWhoClicked();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
            p.updateInventory();
        }
    }
    
    @EventHandler
    public void onOpenInventorySpec(final InventoryOpenEvent event) {
        final Player p = (Player)event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onBlockBreak(final BlockBreakEvent event) {
        final Player p = event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onBlockPlace(final BlockPlaceEvent event) {
        final Player p = event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onChat(final PlayerChatEvent event) {
        final Player p = event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onDamage(final EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            final Player p = (Player)event.getEntity();
            if (Main.login.contains(p.getName())) {
                event.setCancelled(true);
            }
        }
        if (event.getDamager() instanceof Player) {
            final Player p = (Player)event.getDamager();
            if (Main.login.contains(p.getName())) {
                event.setCancelled(true);
            }
        }
    }
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent event) {
        final Player p = event.getPlayer();
        if (Main.login.contains(p.getName())) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    public void Mover(final AsyncPlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (Main.login.contains(p.getName())) {
            e.setCancelled(true);
        }
        else {
            e.setCancelled(false);
        }
    }
    
    @EventHandler
    public void aoCMD(final PlayerCommandPreprocessEvent e) {
        final Player p = e.getPlayer();
        final String cmd = e.getMessage();
        if (Main.login.contains(p.getName())) {
            if (cmd.contains("login") || cmd.contains("register")) {
                e.setCancelled(false);
            }
            else {
                e.setCancelled(true);
            }
        }
    }
}
