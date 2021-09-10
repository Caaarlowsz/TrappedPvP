package com.marcello.classes;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import com.marcello.Main;
import com.marcello.utils.KitAPI;

public class Anchor implements Listener {
	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerHitAnchor(final EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player)) {
			return;
		}
		if (!(e.getDamager() instanceof Player)) {
			return;
		}
		final Player p = (Player) e.getEntity();
		final Player a = (Player) e.getDamager();
		if (KitAPI.getKit(p).equalsIgnoreCase("anchor")) {
			p.setVelocity(new Vector());
			p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 4.0f, 4.0f);
			a.playSound(p.getLocation(), Sound.ANVIL_BREAK, 4.0f, 4.0f);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) Main.instance,
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.setVelocity(new Vector());
						}
					}, 1L);
		}
		if (KitAPI.getKit(a).equalsIgnoreCase("anchor")) {
			a.playSound(a.getLocation(), Sound.ANVIL_BREAK, 4.0f, 4.0f);
			p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 4.0f, 4.0f);
			p.setVelocity(new Vector());
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) Main.instance,
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.setVelocity(new Vector());
						}
					}, 1L);
		}
	}
}
