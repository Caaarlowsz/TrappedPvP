package com.marcello.classes;

import org.bukkit.event.EventHandler;
import java.util.concurrent.TimeUnit;
import org.bukkit.Sound;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.Material;
import com.marcello.utils.KitAPI;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.event.Listener;

public class Urgal implements Listener
{
    public HashMap<String, Long> cooldown;
    public static ArrayList<Player> titan;
    
    static {
        Urgal.titan = new ArrayList<Player>();
    }
    
    public Urgal() {
        this.cooldown = new HashMap<String, Long>();
    }
    
    @EventHandler
    public void Armadura(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && KitAPI.getKit(p) == "Urgal" && p.getItemInHand().getType() == Material.REDSTONE) {
            if (this.cooldown.containsKey(p.getName()) && this.cooldown.get(p.getName()) > System.currentTimeMillis()) {
                p.sendMessage("§c§LKIT §7Seu kit §4§lURGAL §7est\u00e1 em cooldown aguarde alguns segundos");
                e.setCancelled(true);
                return;
            }
            p.sendMessage("§c§LKIT §7Voc\u00ea recebeu §4§lFOR\u00c7A 1 §7do seu kit");
            e.setCancelled(true);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 250, 0));
            p.playSound(p.getLocation(), Sound.BLAZE_DEATH, 1.0f, 1.0f);
            this.cooldown.put(p.getName(), System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(25L));
        }
    }
}
