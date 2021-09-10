package com.marcello.classes;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.Plugin;

import com.marcello.Main;
import com.marcello.utils.KitAPI;

public class Ninja implements Listener {
	public static HashMap<String, Player> NinjaPlayer;
	public static HashMap<String, Integer> NinjaTime;

	static {
		Ninja.NinjaPlayer = new HashMap<String, Player>();
		Ninja.NinjaTime = new HashMap<String, Integer>();
	}

	@EventHandler
	public void Bater(final EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			final Player p = (Player) e.getDamager();
			final Player t = (Player) e.getEntity();
			if (KitAPI.getKit(p) == "Ninja") {
				Ninja.NinjaPlayer.put(p.getName(), t);
				Ninja.NinjaTime.put(p.getName(), 10);
				Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) Main.getInstace(), (Runnable) new Runnable() {
					@Override
					public void run() {
						if (Ninja.NinjaTime.get(p.getName()) <= 0) {
							if (KitAPI.getKit(p) == "Ninja" && KitAPI.KitDelay.containsKey(p.getName())) {
								p.sendMessage("§c§lKIT §7Voc\u00ea ficou muito tempo sem hitar §c"
										+ Ninja.NinjaPlayer.get(p.getName())
										+ " §7n\u00e3o pode mais se teleportar at\u00e9 ele");
							}
							Ninja.NinjaPlayer.remove(p.getName());
						}
					}
				}, 200L);
			}
		}
	}

	@EventHandler
	public void Agachar(final PlayerToggleSneakEvent e) {
		final Player p = e.getPlayer();
		if (p.isSneaking() && KitAPI.getKit(p) == "Ninja") {
			if (KitAPI.KitDelay.containsKey(p.getName())) {
				p.sendMessage("§c§lKIT §7Seu kit §4§lNINJA §7est\u00e1 em cooldown aguarde alguns segundos");
				return;
			}
			if (!Ninja.NinjaPlayer.containsKey(p.getName())) {
				p.sendMessage(
						"§c§lKIT §7Voc\u00ea n\u00e3o hitou ningu\u00e9m, hite alguem para pode utilizar seu kit §4§lNINJA");
				return;
			}
			final Player t = Ninja.NinjaPlayer.get(p.getName());
			if (p.getLocation().distance(t.getLocation()) > 35.0) {
				p.sendMessage("§c§lKIT §7O ultimo player hitado est\u00e1 muito longe");
				return;
			}
			p.teleport((Entity) t);
			p.sendMessage("§c§lKIT §7Voc\u00ea foi teleportado at\u00e9 §c"
					+ Ninja.NinjaPlayer.get(String.valueOf(p.getName()) + "§7 usando seu kit §4§lNINJA"));
			KitAPI.KitDelay.put(p.getName(), 10);
			Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) Main.getInstace(), (Runnable) new Runnable() {
				@Override
				public void run() {
					if (KitAPI.KitDelay.containsKey(p.getName()) && KitAPI.KitDelay.get(p.getName()) <= 0
							&& KitAPI.getKit(p) == "Ninja") {
						p.sendMessage("§c§lKIT §7Seu kit §4§lNINJA §7n\u00e3o est\u00e1 mais em cooldown");
						KitAPI.KitDelay.remove(p.getName());
					}
				}
			}, 200L);
		}
	}
}
