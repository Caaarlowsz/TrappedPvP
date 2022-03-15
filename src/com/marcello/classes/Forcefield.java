package com.marcello.classes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.utils.KitAPI;

public class Forcefield implements Listener {
	public List<Player> cooldownm;
	public static ArrayList<Player> forcefield;
	public static ArrayList<Player> forcefielddano;

	static {
		Forcefield.forcefield = new ArrayList<Player>();
		Forcefield.forcefielddano = new ArrayList<Player>();
	}

	public Forcefield() {
		this.cooldownm = new ArrayList<Player>();
	}

	@EventHandler
	public void stomperApple(final PlayerInteractEvent event) {
		final Player p = event.getPlayer();
		if (event.getPlayer().getItemInHand().getType() == Material.NETHER_FENCE && KitAPI.getKit(p) == "Forcefield") {
			if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK
					|| event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
				event.setCancelled(true);
			}
			if (this.cooldownm.contains(p)) {
				p.sendMessage("�c�lKIT �7Seu kit �4�lFORCEFIELD�7 est\u00e1 em cooldown aguarde alguns segundos");
				return;
			}
			final Location loc = p.getLocation();
			p.getWorld().playSound(loc, Sound.MAGMACUBE_WALK2, 5.0f, -5.0f);
			this.cooldownm.add(p);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							Forcefield.forcefielddano.add(p);
							p.sendMessage("�c�LKIT �7Seu kit forcefield foi ativado");
						}
					}, 0L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							Forcefield.forcefielddano.remove(p);
						}
					}, 300L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							Forcefield.this.cooldownm.remove(p);
							p.sendMessage("�c�lKIT �7Seu kit �4�lFORCEFIELD �7saiu de cooldown, pode usa-lo novamente");
							p.getWorld().playSound(p.getLocation(), Sound.BURP, 5.0f, 5.0f);
						}
					}, 1000L);
		}
	}

	@EventHandler
	public void fraqueza(final PlayerMoveEvent event) {
		final Player p = event.getPlayer();
		if (Forcefield.forcefielddano.contains(p)) {
			final List<Entity> Local = (List<Entity>) p.getNearbyEntities(4.0, 4.0, 4.0);
			for (final Entity inimigos : Local) {
				final Player local = (Player) inimigos;
				local.damage(3.0);
				local.sendMessage(
						"�c�lKIT �7Voc\u00ea est\u00e1 perto de um �4�lFORCEFIELD �7isso \u00e9 um kit n\u00e3o um hack");
				inimigos.setVelocity(new Vector(0.2, 0.0, 0.2));
			}
		}
	}
}
