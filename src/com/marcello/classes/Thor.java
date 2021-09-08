package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;
import org.bukkit.entity.Player;
import com.marcello.Main;
import org.bukkit.Bukkit;
import java.util.HashSet;
import org.bukkit.Material;
import com.marcello.utils.KitAPI;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class Thor implements Listener
{
    @EventHandler
    public void Interagir(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (KitAPI.getKit(p) == "Thor" && e.getMaterial() == Material.GOLD_AXE) {
            if (!KitAPI.KitDelay.containsKey(p.getName())) {
                final Location loc = p.getTargetBlock((HashSet)null, 20).getLocation();
                p.getWorld().strikeLightning(loc);
                p.getWorld().strikeLightningEffect(loc);
                p.getWorld().strikeLightningEffect(loc.add(1.0, 0.0, 1.0));
                KitAPI.KitDelay.put(p.getName(), 15);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (KitAPI.getKit(p) == "Thor" && KitAPI.KitDelay.containsKey(p.getName()) && KitAPI.KitDelay.get(p.getName()) <= 0) {
                            KitAPI.KitDelay.remove(p.getName());
                            p.sendMessage("§c§lKIT §7Seu kit §4§lTHOR §7saiu do cooldown");
                        }
                    }
                }, 300L);
            }
            else {
                p.sendMessage("§c§lKIT §7Seu kit §4§lTHOR §7est\u00e1 em cooldown aguarde algum segundos");
            }
        }
    }
}
