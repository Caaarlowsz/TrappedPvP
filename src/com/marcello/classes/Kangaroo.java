package com.marcello.classes;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import com.marcello.utils.KitAPI;

public class Kangaroo implements Listener {
	public static HashMap<String, Integer> KangarroStats;
	public static ArrayList<String> F;

	static {
		Kangaroo.KangarroStats = new HashMap<String, Integer>();
		Kangaroo.F = new ArrayList<String>();
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void Clicar(final PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		if (KitAPI.getKit(p) == "Kangaroo" && e.getMaterial() == Material.FIREWORK) {
			e.setCancelled(true);
			if (p.isSneaking()) {
				if (!Kangaroo.F.contains(p.getName())) {
					p.setVelocity(p.getLocation().getDirection().multiply(1.2));
					p.setVelocity(new Vector(p.getVelocity().getX(), 0.5, p.getVelocity().getZ()));
					Kangaroo.KangarroStats.put(p.getName(), 1);
				} else if (Kangaroo.KangarroStats.get(p.getName()) != 2) {
					p.setVelocity(p.getLocation().getDirection().multiply(1.2));
					p.setVelocity(new Vector(p.getVelocity().getX(), 0.5, p.getVelocity().getZ()));
					Kangaroo.KangarroStats.put(p.getName(), 2);
				}
			} else if (!Kangaroo.F.contains(p.getName())) {
				p.setVelocity(new Vector(p.getVelocity().getX(), 1.0, p.getVelocity().getZ()));
				Kangaroo.KangarroStats.put(p.getName(), 1);
			} else if (Kangaroo.KangarroStats.get(p.getName()) != 2) {
				p.setVelocity(new Vector(p.getVelocity().getX(), 1.0, p.getVelocity().getZ()));
				Kangaroo.KangarroStats.put(p.getName(), 2);
			}
		}
	}

	@EventHandler
	public void andar(final PlayerMoveEvent e) {
		final Player p = e.getPlayer();
		final Block b = p.getLocation().getBlock();
		if (KitAPI.getKit(p) == "Kangaroo") {
			if (b.getRelative(BlockFace.DOWN).getType() == Material.AIR) {
				Kangaroo.F.add(p.getName());
			} else {
				if (b.getType() == Material.AIR) {
					Kangaroo.KangarroStats.put(p.getName(), 0);
					Kangaroo.F.remove(p.getName());
				}
				if (b.getRelative(BlockFace.DOWN).getType() != Material.AIR || b.getType() != Material.AIR) {
					Kangaroo.KangarroStats.put(p.getName(), 0);
					Kangaroo.F.remove(p.getName());
				}
			}
		}
	}
}
