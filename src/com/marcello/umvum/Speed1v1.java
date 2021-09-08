package com.marcello.umvum;

import org.bukkit.event.EventHandler;
import com.marcello.Main;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.entity.Player;
import java.util.List;
import org.bukkit.event.Listener;

public class Speed1v1 implements Listener
{
    public static boolean Partida1;
    public static String Nome;
    public static List<Player> Iniciou;
    public static List<Player> NeginhoSegundos;
    public static HashMap<String, Player> Player2;
    public static HashMap<String, Player> Player1;
    
    static {
        Speed1v1.Partida1 = false;
        Speed1v1.Nome = "";
        Speed1v1.Iniciou = new ArrayList<Player>();
        Speed1v1.NeginhoSegundos = new ArrayList<Player>();
        Speed1v1.Player2 = new HashMap<String, Player>();
        Speed1v1.Player1 = new HashMap<String, Player>();
    }
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent event) {
        final Player p = event.getPlayer();
        if (p.getItemInHand().equals((Object)Join1v1.Cinza) && (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR)) {
            if (Speed1v1.Partida1) {
                p.performCommand("speed1v1 " + Speed1v1.Nome);
                Speed1v1.Partida1 = false;
                Speed1v1.Nome = "";
                return;
            }
            if (!Speed1v1.Partida1) {
                Speed1v1.Nome = p.getName();
                Speed1v1.Partida1 = true;
                p.getInventory().removeItem(new ItemStack[] { Join1v1.Cinza });
                p.sendMessage("�4�l1v1: �7Voc\u00ea entro na fila de 1v1 rapido.");
                Speed1v1.Iniciou.add(p);
                this.Trocar(p);
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        Speed1v1.NeginhoSegundos.add(p);
                    }
                }, 2L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (Speed1v1.NeginhoSegundos.contains(p)) {
                            Speed1v1.NeginhoSegundos.remove(p);
                            Speed1v1.Partida1 = true;
                            Speed1v1.Nome = "";
                            Speed1v1.Iniciou.remove(p);
                            p.getInventory().removeItem(new ItemStack[] { Join1v1.Verde1 });
                            p.getInventory().removeItem(new ItemStack[] { Join1v1.Verde2 });
                            p.getInventory().removeItem(new ItemStack[] { Join1v1.Verde3 });
                            if (!Events1v1.inPvP.contains(p)) {
                                p.updateInventory();
                                p.sendMessage("�4�l1v1: �7Nenhuma partida foi localizada.");
                                p.getInventory().setItem(5, Join1v1.Cinza);
                            }
                        }
                    }
                }, 200L);
            }
        }
    }
    
    public void Trocar(final Player p) {
        if (Speed1v1.Iniciou.contains(p)) {
            p.getInventory().setItem(5, new ItemStack(Join1v1.Verde1));
            p.updateInventory();
        }
    }
    
    @EventHandler
    public void onInteract2(final PlayerInteractEvent event) {
        final Player p = event.getPlayer();
        if ((p.getItemInHand().equals((Object)Join1v1.Verde1) || p.getItemInHand().equals((Object)Join1v1.Verde2) || p.getItemInHand().equals((Object)Join1v1.Verde3)) && (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) && Speed1v1.NeginhoSegundos.contains(p)) {
            p.sendMessage("�4�l1v1: �7Voc\u00ea j\u00e1 est\u00e1 na fila...");
        }
    }
}
