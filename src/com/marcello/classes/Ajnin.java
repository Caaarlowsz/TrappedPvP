package com.marcello.classes;

import com.marcello.api.CooldownAPI;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.Plugin;
import com.marcello.Main;
import org.bukkit.Bukkit;
import com.marcello.utils.KitAPI;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.entity.Player;
import java.util.HashMap;
import org.bukkit.event.Listener;

public class Ajnin implements Listener
{
    public static HashMap<Player, Player> a;
    
    static {
        Ajnin.a = new HashMap<Player, Player>();
    }
    
    @EventHandler
    public void a(final EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            final Player hitou = (Player)e.getDamager();
            final Player hitado = (Player)e.getEntity();
            if (KitAPI.getKit(hitou) == "Ajnin" && !Ajnin.a.containsKey(hitou)) {
                Ajnin.a.put(hitou, hitado);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getPlugin((Class)null), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        Ajnin.a.remove(hitou);
                        Ajnin.a.remove(hitado);
                    }
                }, 220L);
            }
        }
    }
    
    @EventHandler
    public void a(final PlayerToggleSneakEvent e) {
        final Player hitou = e.getPlayer();
        if (e.isSneaking() && KitAPI.getKit(hitou) == "Ajnin" && CooldownAPI.Cooldown.containsKey(hitou.getName())) {
            hitou.sendMessage("§c§lKIT §7Seu kit §4§lAJNIN§7 est\u00e1 em cooldown aguarde alguns segundos");
            return;
        }
        if (e.isSneaking() && KitAPI.getKit(hitou) == "Ajnin" && Ajnin.a.containsKey(hitou)) {
            final Player hitado = Ajnin.a.get(hitou);
            if (hitou.getLocation().distance(hitado.getLocation()) < 40.0) {
                hitado.teleport(hitou.getLocation());
                CooldownAPI.addCooldown(hitou, 7);
            }
            else {
                hitou.sendMessage("§c§lKIT §7Voc\u00ea est\u00e1 muito longe do ultimo player hitado");
            }
        }
    }
}
