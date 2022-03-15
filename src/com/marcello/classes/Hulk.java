package com.marcello.classes;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.utils.KitAPI;

public class Hulk implements Listener {
	ArrayList<Player> cooldown;
	public static ArrayList<Player> Hulk;

	static {
		com.marcello.classes.Hulk.Hulk = new ArrayList<Player>();
	}

	public Hulk() {
		this.cooldown = new ArrayList<Player>();
	}

	@EventHandler
	public void onHulk(final PlayerInteractEntityEvent event) {
		final Player p = event.getPlayer();
		if (event.getRightClicked() instanceof Player) {
			final Player d = (Player) event.getRightClicked();
			if (KitAPI.getKit(p) == "Hulk") {
				if (KitAPI.getKit(p) == "Hulk") {
					if (p.getItemInHand().getType().equals((Object) Material.STONE_SWORD)) {
						if (this.cooldown.contains(p)) {
							p.sendMessage("�c�lKIT �7Seu kit �4�lHULK�7 est\u00e1 em cooldown aguarde alguns segundos");
						} else if (p.getPassenger() == null) {
							p.setPassenger((Entity) d);
							d.sendMessage("�c�lKIT �7Voc\u00ea foi pego por um �4�lHULK �7aperte shift para sair");
							this.cooldown.add(p);
							p.setVelocity(new Vector());
							p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 4.0f, 4.0f);
							Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
									(Runnable) new Runnable() {
										@Override
										public void run() {
											com.marcello.classes.Hulk.this.cooldown.remove(p);
										}
									}, 200L);
						} else {
							p.sendMessage("�c�lKIT �7Voc\u00ea ja possui alguem na sua cabe\u00e7a");
						}
					}
				} else {
					p.sendMessage("�c�lKIT �7Este player tamb\u00e9m est\u00e1 utilizando kit �4�lHULK");
				}
			}
		}
	}
}
