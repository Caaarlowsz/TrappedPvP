package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.GameMode;
import org.bukkit.plugin.Plugin;
import org.bukkit.entity.Player;
import com.marcello.Main;
import org.bukkit.Bukkit;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Color;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import com.marcello.utils.KitAPI;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class Phantom implements Listener
{
    @EventHandler
    public void Interagir(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (KitAPI.getKit(p) == "Phantom" && e.getMaterial() == Material.FEATHER) {
            if (!KitAPI.KitDelay.containsKey(p.getName())) {
                p.sendMessage("§c§lKIT §7Voc\u00ea utilizou seu kit §4§lPHANTOM §7agora pode voar por §c5 §7segundos");
                final ItemStack is = new ItemStack(Material.LEATHER_HELMET);
                final LeatherArmorMeta ism = (LeatherArmorMeta)is.getItemMeta();
                ism.setColor(Color.WHITE);
                is.setItemMeta((ItemMeta)ism);
                p.getInventory().setHelmet(is);
                final ItemStack is2 = new ItemStack(Material.LEATHER_CHESTPLATE);
                final LeatherArmorMeta is1m = (LeatherArmorMeta)is2.getItemMeta();
                is1m.setColor(Color.WHITE);
                is2.setItemMeta((ItemMeta)is1m);
                p.getInventory().setChestplate(is2);
                final ItemStack is3 = new ItemStack(Material.LEATHER_LEGGINGS);
                final LeatherArmorMeta is2m = (LeatherArmorMeta)is3.getItemMeta();
                is2m.setColor(Color.WHITE);
                is3.setItemMeta((ItemMeta)is2m);
                p.getInventory().setLeggings(is3);
                final ItemStack is4 = new ItemStack(Material.LEATHER_BOOTS);
                final LeatherArmorMeta is3m = (LeatherArmorMeta)is4.getItemMeta();
                is3m.setColor(Color.WHITE);
                is4.setItemMeta((ItemMeta)is3m);
                p.getInventory().setBoots(is4);
                p.setAllowFlight(true);
                p.setFlying(true);
                KitAPI.KitDelay.put(p.getName(), 30);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (KitAPI.getKit(p) == "Phantom" && KitAPI.KitDelay.containsKey(p.getName()) && KitAPI.KitDelay.get(p.getName()) <= 0) {
                            KitAPI.KitDelay.remove(p.getName());
                            p.sendMessage("§c§lKIT §7Seu kit §4§lPHANTOM §7saiu do cooldown");
                        }
                    }
                }, 600L);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setLevel(5);
                    }
                }, 0L);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setLevel(4);
                    }
                }, 20L);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setLevel(3);
                        p.sendMessage("§c§lKIT §7A habilidade do seu kit §4§lPHANTOM §7acabara em §c3 §7segundos");
                    }
                }, 40L);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setLevel(2);
                        p.sendMessage("§c§lKIT §7A habilidade do seu kit §4§lPHANTOM §7acabara em §c2 §7segundos");
                    }
                }, 60L);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setLevel(1);
                        p.sendMessage("§c§lKIT §7A habilidade do seu kit §4§lPHANTOM §7acabara em §c1 §7segundos");
                    }
                }, 80L);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (KitAPI.getKit(p) == "Phantom" && KitAPI.KitDelay.containsKey(p.getName()) && KitAPI.KitDelay.get(p.getName()) <= 30) {
                            p.setLevel(0);
                        }
                        p.sendMessage("§c§lKIT §7A habilidade do seu kit §4§lPHANTOM §7acabou");
                        p.getInventory().setHelmet(new ItemStack(Material.AIR));
                        p.getInventory().setChestplate(new ItemStack(Material.AIR));
                        p.getInventory().setLeggings(new ItemStack(Material.AIR));
                        p.getInventory().setBoots(new ItemStack(Material.AIR));
                        p.setAllowFlight(false);
                        p.setFlying(false);
                        p.setGameMode(GameMode.SURVIVAL);
                    }
                }, 100L);
            }
            else {
                p.sendMessage("§c§lKIT §7Seu kit §4§lPHANTOM §7est\u00e1 em cooldown aguarde alguns segundos");
            }
        }
    }
}
