package com.marcello.classes;

import org.bukkit.event.EventHandler;
import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.Listener;

public class AntiTower implements Listener
{
    @EventHandler
    public void Bater(final EntityDamageByEntityEvent e) {
        if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            final Player t = (Player)e.getDamager();
            if (KitAPI.getKit(t) == "AntiTower") {
                e.setDamage(6.0);
            }
        }
    }
}
