package com.marcello.classes;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.marcello.utils.KitAPI;

public class Viper implements Listener {
	@EventHandler
	public void bater(final EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			final Player p = (Player) e.getEntity();
			final Player t = (Player) e.getDamager();
			if (KitAPI.getKit(t) == "Viper" && t.getItemInHand().getType() == Material.STONE_SWORD
					&& new Random().nextInt(100) <= 30) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 0));
			}
		}
	}
}
