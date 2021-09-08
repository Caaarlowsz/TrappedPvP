package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.Material;
import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.Listener;

public class Boxer implements Listener
{
    @EventHandler
    public void Bater(final EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
            final Player t = (Player)e.getDamager();
            if (KitAPI.getKit(t) == "Boxer" && t.getItemInHand().getType() == Material.QUARTZ) {
                e.setDamage(e.getDamage() + 4.0);
            }
        }
    }
}
