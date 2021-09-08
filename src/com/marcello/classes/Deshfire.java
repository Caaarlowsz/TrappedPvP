package com.marcello.classes;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.EventHandler;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;
import com.marcello.Main;
import org.bukkit.Bukkit;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Color;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.entity.Entity;
import org.bukkit.Effect;
import org.bukkit.util.Vector;
import org.bukkit.event.block.Action;
import com.marcello.utils.KitAPI;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.entity.Player;
import java.util.List;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class Deshfire implements Listener
{
    public int boost;
    public static ArrayList<String> Deshfire;
    static ArrayList<String> fall;
    public static HashMap<String, ItemStack[]> Armadura;
    public HashMap<String, ItemStack[]> saveinv;
    public static HashMap<String, ItemStack[]> savearmor;
    public static HashMap<String, ItemStack[]> armadura;
    public static HashMap<String, ItemStack[]> Armadura2;
    public static List<Player> cooldownm;
    
    static {
        com.marcello.classes.Deshfire.Deshfire = new ArrayList<String>();
        com.marcello.classes.Deshfire.fall = new ArrayList<String>();
        com.marcello.classes.Deshfire.Armadura = new HashMap<String, ItemStack[]>();
        com.marcello.classes.Deshfire.savearmor = new HashMap<String, ItemStack[]>();
        com.marcello.classes.Deshfire.armadura = new HashMap<String, ItemStack[]>();
        com.marcello.classes.Deshfire.Armadura2 = new HashMap<String, ItemStack[]>();
        com.marcello.classes.Deshfire.cooldownm = new ArrayList<Player>();
    }
    
    public Deshfire() {
        this.boost = 6;
        this.saveinv = new HashMap<String, ItemStack[]>();
    }
    
    @EventHandler
    public void DeshClick(final PlayerInteractEvent event) {
        final int fire = 6;
        final Player p = event.getPlayer();
        if (event.getPlayer().getItemInHand().getType() == Material.REDSTONE_BLOCK && KitAPI.getKit(p) == "Deshfire") {
            if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
                event.setCancelled(true);
            }
            if (com.marcello.classes.Deshfire.cooldownm.contains(p)) {
                p.sendMessage("§c§lKIT §7Seu kit §4§lDESHFIRE§7 est\u00e1 em cooldown aguarde alguns segundos");
                return;
            }
            com.marcello.classes.Deshfire.cooldownm.add(p);
            com.marcello.classes.Deshfire.fall.add(p.getName());
            p.setVelocity(p.getEyeLocation().getDirection().multiply(this.boost).add(new Vector(0, 0, 0)));
            p.getPlayer().getWorld().playEffect(p.getPlayer().getLocation(), Effect.SMOKE, 10, 0);
            final Location loc = p.getLocation();
            for (final Entity pertos : p.getNearbyEntities(8.0, 8.0, 8.0)) {
                if (pertos instanceof Player) {
                    final Player perto = (Player)pertos;
                    ((Player)pertos).damage(10.0);
                    pertos.setVelocity(new Vector(0.1, 0.0, 0.1));
                    ((Player)pertos).setFireTicks(fire * 20);
                }
            }
            final ItemStack Capacete = new ItemStack(Material.LEATHER_HELMET);
            final LeatherArmorMeta kCapacete = (LeatherArmorMeta)Capacete.getItemMeta();
            kCapacete.setColor(Color.RED);
            Capacete.setItemMeta((ItemMeta)kCapacete);
            final ItemStack Peitoral = new ItemStack(Material.LEATHER_CHESTPLATE);
            final LeatherArmorMeta kPeitoral = (LeatherArmorMeta)Peitoral.getItemMeta();
            kPeitoral.setColor(Color.RED);
            Peitoral.setItemMeta((ItemMeta)kPeitoral);
            final ItemStack Calss = new ItemStack(Material.LEATHER_LEGGINGS);
            final LeatherArmorMeta kCalss = (LeatherArmorMeta)Calss.getItemMeta();
            kCalss.setColor(Color.RED);
            Calss.setItemMeta((ItemMeta)kCalss);
            final ItemStack Bota = new ItemStack(Material.LEATHER_BOOTS);
            final LeatherArmorMeta kBota = (LeatherArmorMeta)Capacete.getItemMeta();
            kBota.setColor(Color.RED);
            Bota.setItemMeta((ItemMeta)kBota);
            com.marcello.classes.Deshfire.Armadura.put(p.getName(), p.getInventory().getArmorContents());
            p.getInventory().setHelmet(Capacete);
            p.getInventory().setChestplate(Peitoral);
            p.getInventory().setLeggings(Calss);
            p.getInventory().setBoots(Bota);
            p.updateInventory();
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                }
            }, 0L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                }
            }, 20L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                }
            }, 30L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                }
            }, 40L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                }
            }, 50L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.updateInventory();
                    com.marcello.classes.Deshfire.fall.remove(p.getName());
                    p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                    p.getInventory().setHelmet(new ItemStack(Material.AIR));
                    final ItemStack peito = new ItemStack(Material.LEATHER_CHESTPLATE);
                    final LeatherArmorMeta kpeito = (LeatherArmorMeta)peito.getItemMeta();
                    kpeito.setColor(Color.PURPLE);
                    peito.setItemMeta((ItemMeta)kpeito);
                    p.getInventory().setChestplate(peito);
                    p.getInventory().setLeggings(new ItemStack(Material.AIR));
                    p.getInventory().setBoots(new ItemStack(Material.AIR));
                }
            }, 60L);
            Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    com.marcello.classes.Deshfire.cooldownm.remove(p);
                    com.marcello.classes.Deshfire.Deshfire.remove(p);
                }
            }, 700L);
        }
    }
    
    @EventHandler
    public void AiMeuCuv5(final EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Player)) {
            return;
        }
        final Player p = (Player)e.getEntity();
        if (e.getCause() == EntityDamageEvent.DamageCause.FALL && com.marcello.classes.Deshfire.fall.contains(p.getName())) {
            com.marcello.classes.Deshfire.fall.remove(p.getName());
            e.setDamage(6.5);
        }
    }
}
