package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.Material;
import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.Listener;

public class Viking implements Listener
{
    @EventHandler
    public void Bater(final EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
            final Player t = (Player)e.getDamager();
            if (KitAPI.getKit(t) == "Viking" && t.getItemInHand().getType() == Material.STONE_AXE) {
                e.setDamage(e.getDamage() + 3.0);
            }
        }
    }
}
