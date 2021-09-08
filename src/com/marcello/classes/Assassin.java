package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import com.marcello.utils.KitAPI;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.Listener;

public class Assassin implements Listener
{
    @EventHandler
    public void Miley(final PlayerToggleSneakEvent e) {
        final Player p = e.getPlayer();
        if (KitAPI.getKit(p).equalsIgnoreCase("Assassin") && p.isSneaking()) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 40, 0));
            if (!p.isSneaking()) {
                p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
            }
        }
    }
}
