package com.marcello.classes;

import org.bukkit.event.EventHandler;
import java.util.Iterator;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.Listener;

public class Stomper implements Listener
{
    @EventHandler
    public void Pulou(final EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            final Player p = (Player)e.getEntity();
            if (KitAPI.getKit(p) == "Stomper" && e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                if (e.getDamage() > 6.0) {
                    for (final Entity s : p.getNearbyEntities(3.5, 1.0, 3.5)) {
                        if (s instanceof Player) {}
                        final Player t = (Player)s;
                        e.setDamage(4.0);
                        t.sendMessage("§c§lKIT §7Voc\u00ea foi stompado por §c" + p.getDisplayName());
                        p.sendMessage("§c§lKIT §7Voc\u00ea estompou §c" + t.getDisplayName());
                        p.getWorld().playSound(p.getLocation(), Sound.ANVIL_LAND, 2.0f, 1.0f);
                        if (!t.isSneaking()) {
                            if (KitAPI.getKit(p) == "AntiTower") {
                                t.damage(999999999, (Entity)p);
                            }
                            else {
                                t.damage(4, (Entity)p);
                            }
                        }
                    }
                    e.setDamage(4.0);
                }
            }
        }
    }
}
