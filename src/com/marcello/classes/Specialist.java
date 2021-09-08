package com.marcello.classes;

import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import com.marcello.utils.KitAPI;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class Specialist implements Listener
{
    @EventHandler
    public void onIasnteract(final PlayerInteractEvent event) {
        final Player p = event.getPlayer();
        if (KitAPI.getKit(p) == "Specialist" && (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.ENCHANTED_BOOK) {
            p.openEnchanting((Location)null, true);
        }
    }
    
    @EventHandler
    public void onVampire(final EntityDeathEvent event) {
        if (event.getEntity() instanceof Player) {
            final Player killed = (Player)event.getEntity();
            if (killed.getKiller() instanceof Player) {
                final Player player = event.getEntity().getKiller();
                if (KitAPI.getKit(player) == "Specialist") {
                    player.setLevel(1);
                }
            }
        }
    }
}
