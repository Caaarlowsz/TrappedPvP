package com.marcello.events;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.marcello.utils.KitAPI;

public class CompassEvent implements Listener {
	@EventHandler
	public void onCompass(final PlayerInteractEvent event) {
		final Player p = event.getPlayer();
		if (KitAPI.getKit(p) != "Nenhum" && p.getItemInHand().getType() == Material.COMPASS
				&& (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK
						|| event.getAction() == Action.RIGHT_CLICK_BLOCK
						|| event.getAction() == Action.RIGHT_CLICK_AIR)) {
			Boolean pesquisado = false;
			for (int i = 0; i < 1000; ++i) {
				final List<Entity> pertos = (List<Entity>) p.getNearbyEntities((double) i, 128.0, (double) i);
				for (final Object e : pertos) {
					if (((Entity) e).getType().equals((Object) EntityType.PLAYER)
							&& p.getLocation().distance(((Entity) e).getLocation()) > 0.0) {
						p.setCompassTarget(((Entity) e).getLocation());
						p.sendMessage("§b§lB\u00daSSOLA §7Apontado para o jogador §b" + ((Player) e).getName());
						pesquisado = true;
						break;
					}
				}
				if (pesquisado) {
					break;
				}
			}
			if (!pesquisado) {
				p.sendMessage("§b§lB\u00daSSOLA §7Nenhum player encontrado");
				p.setCompassTarget(p.getWorld().getSpawnLocation());
			}
		}
	}
}
