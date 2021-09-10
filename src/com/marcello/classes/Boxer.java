package com.marcello.classes;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.marcello.utils.KitAPI;

public class Boxer implements Listener {
	@EventHandler
	public void Bater(final EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			final Player t = (Player) e.getDamager();
			if (KitAPI.getKit(t) == "Boxer" && t.getItemInHand().getType() == Material.QUARTZ) {
				e.setDamage(e.getDamage() + 4.0);
			}
		}
	}
}
