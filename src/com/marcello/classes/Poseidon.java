package com.marcello.classes;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.marcello.utils.KitAPI;

public class Poseidon implements Listener {
	@EventHandler
	public void Bater(final EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			final Player t = (Player) e.getDamager();
			if (e.isCancelled()) {
				return;
			}
			if (KitAPI.getKit(t) == "Poseidon" && t.getItemInHand().getType() == Material.WOOD_SWORD
					&& t.getLocation().getBlock().isLiquid()
					&& t.getLocation().getBlock().getType().name().contains("WATER")) {
				e.setDamage(e.getDamage() + 10.0);
			}
		}
	}

	@EventHandler
	public void Andar(final PlayerMoveEvent e) {
		final Player p = e.getPlayer();
		if (KitAPI.getKit(p) == "Poseidon" && p.getLocation().getBlock().isLiquid()
				&& p.getLocation().getBlock().getType().name().contains("WATER")) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 2), true);
			p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 60, 1), true);
			p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 2), true);
			p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 100, 2), true);
		}
	}
}
