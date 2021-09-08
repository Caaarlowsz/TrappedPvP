package com.marcello.comandos;

import org.bukkit.event.EventHandler;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import com.marcello.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.ArrayList;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class ClicktestCommand implements Listener, CommandExecutor
{
    public static ItemStack kits;
    public static ItemMeta kitsmeta;
    public static ItemStack warps;
    public static ItemMeta warpsmeta;
    public static ItemStack click1;
    public static ItemMeta click1meta;
    public static ItemStack parkour;
    public static ItemMeta parkourmeta;
    public static ItemStack loja;
    public static ItemMeta lojameta;
    public static ArrayList<String> click;
    public static ArrayList<String> jaesta;
    
    static {
        ClicktestCommand.click = new ArrayList<String>();
        ClicktestCommand.jaesta = new ArrayList<String>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String CommandLabel, final String[] args) {
        final Player p = (Player)sender;
        if (!cmd.getName().equalsIgnoreCase("testclick")) {
            return true;
        }
        if (ClicktestCommand.jaesta.contains(p.getName())) {
            p.sendMessage("§b§LCLICKTEST §7Voc\u00ea ja est\u00e1 em um testclick");
            return true;
        }
        Bukkit.getScheduler().scheduleAsyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
            @Override
            public void run() {
                ClicktestCommand.jaesta.add(p.getName());
                p.sendMessage("§b§LCLICKTEST §7Iniciando em §b3 §7segundos!");
            }
        }, 20L);
        Bukkit.getScheduler().scheduleAsyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
            @Override
            public void run() {
                p.sendMessage("§b§LCLICKTEST §7Iniciando em §b2 §7segundos!");
            }
        }, 40L);
        Bukkit.getScheduler().scheduleAsyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
            @Override
            public void run() {
                p.sendMessage("§b§LCLICKTEST §7Iniciando em §b1 §7segundos!");
            }
        }, 60L);
        Bukkit.getScheduler().scheduleAsyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
            @Override
            public void run() {
                p.sendMessage("§b§LCLICKTEST §7foi iniciado com sucesso!");
                p.sendMessage("§b§LCLICKTEST §7Lembre-se de clickar sem nada na m\u00e3o!");
                ClicktestCommand.click.add(p.getName());
            }
        }, 80L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
            @Override
            public void run() {
                if (ClicktestCommand.click.contains(p.getName())) {
                    ClicktestCommand.jaesta.remove(p.getName());
                    ClicktestCommand.click.remove(p.getName());
                    p.sendMessage("§b§LCLICKTEST §7Voce finalizou o Teste!");
                    p.sendMessage("§b§LCLICKTEST §7Calculando Resultados...");
                    p.sendMessage("§E");
                    p.sendMessage("§E");
                    p.sendMessage("§E");
                    p.sendMessage("§E");
                    p.sendMessage("§b§LCLICKTEST §7Resultados Calculados:");
                    p.sendMessage("§7");
                    p.sendMessage("§7» Tempo do teste §b10 Segundos");
                    p.sendMessage("§7» Clicks que voc\u00ea deu §b" + p.getLevel());
                    p.sendMessage("§E");
                    p.setLevel(0);
                }
            }
        }, 260L);
        return true;
    }
    
    @EventHandler
    public void clicar(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (ClicktestCommand.click.contains(p.getName()) && e.getAction() == Action.LEFT_CLICK_AIR && p.getItemInHand().getType() == Material.AIR) {
            p.setLevel(p.getLevel() + 1);
        }
    }
    
    @EventHandler
    public void clicando(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        ClicktestCommand.jaesta.contains(p.getName());
    }
}
