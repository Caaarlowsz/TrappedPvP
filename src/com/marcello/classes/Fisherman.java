package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Entity;
import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.Listener;

public class Fisherman implements Listener
{
    @EventHandler
    public void Pescar(final PlayerFishEvent e) {
        final Player p = e.getPlayer();
        if (e.getCaught() instanceof Player && KitAPI.getKit(p) == "Fisherman") {
            final Player t = (Player)e.getCaught();
            t.teleport((Entity)p);
            p.sendMessage("§c§LKIT §7Voc\u00ea fisgou o player §c" + t.getDisplayName());
            t.sendMessage("§c§LKIT §7Voc\u00ea foi fiscado pelo player §c" + p.getDisplayName());
        }
    }
}
