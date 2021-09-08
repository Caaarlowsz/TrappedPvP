package com.marcello.utils;

import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.Bukkit;
import com.marcello.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class WarpsAPI implements Listener
{
    public static ArrayList<String> segundos;
    public static HashMap<Player, String> warp;
    
    static {
        WarpsAPI.segundos = new ArrayList<String>();
        WarpsAPI.warp = new HashMap<Player, String>();
    }
    
    public static String getWarp(final Player p) {
        return WarpsAPI.warp.get(p);
    }
    
    @EventHandler
    public void Andou(final PlayerMoveEvent e) {
        final Player p = e.getPlayer();
        if (WarpsAPI.segundos.contains(p.getDisplayName())) {
            WarpsAPI.segundos.remove(p.getDisplayName());
            p.sendMessage("§2§LWARP §7Voc\u00ea se moveu e seu teletransporte foi cancelado");
            p.removePotionEffect(PotionEffectType.SLOW);
            p.removePotionEffect(PotionEffectType.BLINDNESS);
        }
    }
    
    public static void Set(final Player p, final String w) {
        Main.getInstace().warps.set("warps." + w + ".X", (Object)p.getLocation().getX());
        Main.getInstace().warps.set("warps." + w + ".Y", (Object)p.getLocation().getY());
        Main.getInstace().warps.set("warps." + w + ".Z", (Object)p.getLocation().getZ());
        Main.getInstace().warps.set("warps." + w + ".Pitch", (Object)p.getLocation().getPitch());
        Main.getInstace().warps.set("warps." + w + ".Yam", (Object)p.getLocation().getYaw());
        Main.getInstace().warps.set("warps." + w + ".World", (Object)p.getLocation().getWorld().getName());
        Main.getInstace().save();
    }
    
    public static void ir(final Player p, final String w) {
        if (Main.getInstace().warps.contains("warps." + w)) {
            final Double X = Main.getInstace().warps.getDouble("warps." + w + ".X");
            final Double Y = Main.getInstace().warps.getDouble("warps." + w + ".Y");
            final Double Z = Main.getInstace().warps.getDouble("warps." + w + ".Z");
            final float Pitch = (float)Main.getInstace().warps.getDouble("warps." + w + ".Pitch");
            final float Yam = (float)Main.getInstace().warps.getDouble("warps." + w + ".Yam");
            final World world = Bukkit.getWorld(Main.getInstace().warps.getString("warps." + w + ".World"));
            final Location loc = new Location(world, (double)X, (double)Y, (double)Z, Yam, Pitch);
            p.teleport(loc);
        }
        else {
            p.sendMessage("§2§LWARP §7Est\u00e1 warp ainda n\u00e3o foi setada");
        }
    }
}
