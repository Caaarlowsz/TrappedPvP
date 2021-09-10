package com.marcello.classes;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import com.marcello.utils.KitAPI;

public class Turtle implements Listener {
	public void levouDano(final EntityDamageEvent e) {
		if (e.getEntity() instanceof Player) {
			final Player p = (Player) e.getEntity();
			if (KitAPI.getKit(p) == "Turtle" && p.isSneaking()) {
				e.setDamage(2.5);
			}
		}
	}

	@EventHandler
	public void DeuDano(final EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			final Player p = (Player) e.getDamager();
			if (KitAPI.getKit(p) == "Turtle" && p.isSneaking()) {
				e.setDamage(2);
			}
		}
	}
}
