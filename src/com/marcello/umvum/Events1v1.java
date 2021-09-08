package com.marcello.umvum;

import org.bukkit.event.player.PlayerJoinEvent;
import java.util.Arrays;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerQuitEvent;
import com.marcello.utils.KitAPI;
import java.util.Iterator;
import org.bukkit.potion.PotionEffect;
import org.bukkit.GameMode;
import org.bukkit.inventory.Inventory;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import com.marcello.utils.WarpsAPI;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.EventHandler;
import com.marcello.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.entity.Player;
import java.util.List;
import org.bukkit.event.Listener;

public class Events1v1 implements Listener
{
    public static List<Player> ChamouDuelo;
    public static List<Player> AceitarDuelo;
    public static List<Player> Jogando1v1Player;
    public static List<Player> congelar;
    public static List<Player> inPvP;
    public static HashMap<String, String> JogandoSair;
    
    static {
        Events1v1.ChamouDuelo = new ArrayList<Player>();
        Events1v1.AceitarDuelo = new ArrayList<Player>();
        Events1v1.Jogando1v1Player = new ArrayList<Player>();
        Events1v1.congelar = new ArrayList<Player>();
        Events1v1.inPvP = new ArrayList<Player>();
        Events1v1.JogandoSair = new HashMap<String, String>();
    }
    
    @EventHandler
    public void PlayerInteractEntityEvent4(final PlayerInteractEntityEvent event) {
        final Player p = event.getPlayer();
        if (!(event.getRightClicked() instanceof Player)) {
            return;
        }
        if (p.getItemInHand().equals((Object)Join1v1.Item_)) {
            if (Events1v1.ChamouDuelo.contains(p)) {
                p.sendMessage("�4�l1v1: �7Aguarde para convidar outra pessoa.");
                return;
            }
            final Player Player2 = (Player)event.getRightClicked();
            Events1v1.AceitarDuelo.add(Player2);
            Events1v1.ChamouDuelo.add(p);
            p.sendMessage("�7Voc\u00ea convidou o jogador �c" + Player2.getName() + " �7para uma batalha 1v1.");
            Player2.sendMessage("�7Voc\u00ea foi convidado pelo jogador �c" + p.getName() + " �7para uma batalha 1v1");
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                @Override
                public void run() {
                    if (Events1v1.ChamouDuelo.contains(p)) {
                        Events1v1.ChamouDuelo.remove(p);
                        Events1v1.AceitarDuelo.remove(Player2);
                    }
                }
            }, 100L);
        }
    }
    
    @EventHandler
    public void onPlayerMove(final PlayerMoveEvent event) {
        final Player player = event.getPlayer();
        if (Events1v1.congelar.contains(player)) {
            event.setTo(player.getLocation());
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                @Override
                public void run() {
                    Events1v1.congelar.remove(player);
                }
            }, 60L);
        }
    }
    
    @EventHandler
    public void PlayerInteractEntityEvent3(final PlayerInteractEntityEvent event) {
        final Player p = event.getPlayer();
        if (!(event.getRightClicked() instanceof Player)) {
            return;
        }
        if (Events1v1.AceitarDuelo.contains(p) && p.getItemInHand().equals((Object)Join1v1.Item_)) {
            final Player Player2 = (Player)event.getRightClicked();
            if (Events1v1.ChamouDuelo.contains(Player2)) {
                Events1v1.Jogando1v1Player.add(p);
                Events1v1.Jogando1v1Player.add(Player2);
                Events1v1.JogandoSair.put(p.getName(), Player2.getName());
                Events1v1.JogandoSair.put(Player2.getName(), p.getName());
                Events1v1.congelar.add(p);
                Events1v1.congelar.add(Player2);
                WarpsAPI.ir(Player2, "1v1loc2");
                WarpsAPI.ir(p, "1v1loc1");
                Events1v1.ChamouDuelo.remove(Player2);
                Events1v1.AceitarDuelo.remove(Player2);
                Events1v1.ChamouDuelo.remove(p);
                Events1v1.AceitarDuelo.remove(p);
                Events1v1.inPvP.add(p);
                Events1v1.inPvP.add(Player2);
                p.getInventory().clear();
                Player2.getInventory().clear();
                final ItemStack Espada = new ItemStack(Material.DIAMOND_SWORD);
                Espada.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
                final ItemMeta Espada2 = Espada.getItemMeta();
                Espada2.setDisplayName("�eEspada");
                Espada.setItemMeta(Espada2);
                p.getInventory().addItem(new ItemStack[] { Espada });
                Player2.getInventory().addItem(new ItemStack[] { Espada });
                Player2.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
                Player2.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
                Player2.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                Player2.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
                p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
                for (int i = 1; i < 9; ++i) {
                    final ItemStack Fisherman = new ItemStack(Material.MUSHROOM_SOUP);
                    p.getInventory().addItem(new ItemStack[] { Fisherman });
                    Player2.getInventory().addItem(new ItemStack[] { Fisherman });
                    Player2.updateInventory();
                    p.updateInventory();
                    if (Speed1v1.Iniciou.contains(p)) {
                        Speed1v1.Iniciou.remove(p);
                        Speed1v1.Partida1 = false;
                    }
                    if (Speed1v1.Iniciou.contains(Player2)) {
                        Speed1v1.Iniciou.remove(Player2);
                        Speed1v1.Partida1 = false;
                    }
                    Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                        @Override
                        public void run() {
                            Player[] onlinePlayers;
                            for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                                final Player plr = onlinePlayers[i];
                                Player2.hidePlayer(plr);
                                p.hidePlayer(plr);
                                p.showPlayer(Player2);
                                Player2.showPlayer(p);
                            }
                        }
                    }, 2L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                        @Override
                        public void run() {
                            if (Events1v1.congelar.contains(p)) {
                                p.setMaxHealth(20);
                                p.setHealth(20);
                                Player2.setMaxHealth(20);
                                Player2.setHealth(20);
                            }
                        }
                    }, 20L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                        @Override
                        public void run() {
                            if (Events1v1.congelar.contains(p)) {
                                p.setMaxHealth(20);
                                p.setHealth(20);
                                Player2.setMaxHealth(20);
                                Player2.setHealth(20);
                            }
                        }
                    }, 40L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                        @Override
                        public void run() {
                            if (Events1v1.congelar.contains(p)) {
                                p.setMaxHealth(20);
                                p.setHealth(20);
                                Player2.setMaxHealth(20);
                                Player2.setHealth(20);
                                Events1v1.congelar.remove(p);
                            }
                        }
                    }, 60L);
                }
            }
        }
    }
    
    @EventHandler
    public void Morrer2(final PlayerDeathEvent e) {
        final Player v = e.getEntity();
        e.setDeathMessage("");
        if (e.getEntity().getKiller() instanceof Player) {
            final Player m = e.getEntity().getKiller();
            if (m != v) {
                if (!Events1v1.Jogando1v1Player.contains(m) && !Events1v1.Jogando1v1Player.contains(v)) {
                    Events1v1.Jogando1v1Player.remove(v);
                    Events1v1.Jogando1v1Player.remove(m);
                    return;
                }
                final int amountv = this.itemsInInventory((Inventory)v.getInventory(), new Material[] { Material.MUSHROOM_SOUP });
                final int amountm = this.itemsInInventory((Inventory)m.getInventory(), new Material[] { Material.MUSHROOM_SOUP });
                Events1v1.inPvP.remove(m);
                Events1v1.inPvP.remove(v);
                m.sendMessage("     ");
                m.sendMessage("�4�l1v1: �7Voc\u00ea ganhou de jogador �c" + v.getName() + " �7e ele ficou com �c" + amountv + " �7sopas.");
                v.sendMessage("     ");
                v.sendMessage("�4�l1v1: �7Voc\u00ea perdeu para o jogador �c" + m.getName() + " �7e ele ficou com �c" + amountm + " �7sopas.");
                WarpsAPI.ir(m, "1v1");
                m.setGameMode(GameMode.SURVIVAL);
                m.getInventory().setArmorContents((ItemStack[])null);
                m.getInventory().clear();
                for (final PotionEffect effect : m.getActivePotionEffects()) {
                    m.removePotionEffect(effect.getType());
                }
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        WarpsAPI.ir(v, "1v1");
                        v.setGameMode(GameMode.SURVIVAL);
                        v.getInventory().setArmorContents((ItemStack[])null);
                        v.getInventory().clear();
                        for (final PotionEffect effect : v.getActivePotionEffects()) {
                            v.removePotionEffect(effect.getType());
                        }
                    }
                }, 1L);
                KitAPI.setKit(m, "1v1");
                KitAPI.setKit(v, "1v1");
                Events1v1.Jogando1v1Player.remove(v);
                Events1v1.Jogando1v1Player.remove(m);
                Events1v1.JogandoSair.remove(m.getName());
                Events1v1.JogandoSair.remove(v.getName());
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        v.getInventory().setItem(3, Join1v1.Item_);
                        v.getInventory().setItem(5, Join1v1.Cinza);
                        m.getInventory().setItem(3, Join1v1.Item_);
                        m.getInventory().setItem(5, Join1v1.Cinza);
                        m.updateInventory();
                        v.updateInventory();
                        WarpsAPI.ir(v, "1v1");
                        WarpsAPI.ir(m, "1v1");
                        KitAPI.setKit(m, "1v1");
                        KitAPI.setKit(v, "1v1");
                    }
                }, 2L);
                m.setHealth(20);
                v.setHealth(20);
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                    final Player plr = onlinePlayers[i];
                    v.showPlayer(plr);
                    m.showPlayer(plr);
                }
            }
        }
    }
    
    @EventHandler
    public void Morrer3(final PlayerDeathEvent e) {
        final Player v = e.getEntity();
        if (e.getEntity().getKiller() instanceof Player) {
            final Player m = e.getEntity().getKiller();
            if (m != v) {
                if (!Events1v1.Jogando1v1Player.contains(v) && !Events1v1.Jogando1v1Player.contains(m)) {
                    Events1v1.Jogando1v1Player.remove(v);
                    Events1v1.Jogando1v1Player.remove(m);
                    return;
                }
                final int amountv = this.itemsInInventory((Inventory)v.getInventory(), new Material[] { Material.MUSHROOM_SOUP });
                final int amountm = this.itemsInInventory((Inventory)m.getInventory(), new Material[] { Material.MUSHROOM_SOUP });
                m.sendMessage("     ");
                m.sendMessage("�4�l1v1: �7Voc\u00ea ganhou de jogador �c" + v.getName() + " �7e ele ficou com �c" + amountv + " �7sopas.");
                Events1v1.inPvP.remove(m);
                Events1v1.inPvP.remove(v);
                v.sendMessage("     ");
                v.sendMessage("�4�l1v1: �7Voc\u00ea perdeu para o jogador �c" + m.getName() + " �7e ele ficou com �c" + amountm + " �7sopas.");
                WarpsAPI.ir(m, "1v1");
                m.setGameMode(GameMode.SURVIVAL);
                m.getInventory().setArmorContents((ItemStack[])null);
                m.getInventory().clear();
                for (final PotionEffect effect : m.getActivePotionEffects()) {
                    m.removePotionEffect(effect.getType());
                }
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        WarpsAPI.ir(v, "1v1");
                        v.setGameMode(GameMode.SURVIVAL);
                        v.getInventory().setArmorContents((ItemStack[])null);
                        v.getInventory().clear();
                        for (final PotionEffect effect : v.getActivePotionEffects()) {
                            v.removePotionEffect(effect.getType());
                        }
                    }
                }, 1L);
                Events1v1.Jogando1v1Player.remove(v);
                Events1v1.Jogando1v1Player.remove(m);
                Events1v1.JogandoSair.remove(m.getName());
                Events1v1.JogandoSair.remove(v.getName());
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        v.getInventory().setItem(3, Join1v1.Item_);
                        v.getInventory().setItem(5, Join1v1.Cinza);
                        m.getInventory().setItem(3, Join1v1.Item_);
                        m.getInventory().setItem(5, Join1v1.Cinza);
                        m.updateInventory();
                        v.updateInventory();
                        WarpsAPI.ir(v, "1v1");
                        WarpsAPI.ir(m, "1v1");
                        KitAPI.setKit(m, "1v1");
                        KitAPI.setKit(v, "1v1");
                    }
                }, 2L);
                m.setHealth(20);
                v.setHealth(20);
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                    final Player plr = onlinePlayers[i];
                    v.showPlayer(plr);
                    m.showPlayer(plr);
                }
            }
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLeft(final PlayerQuitEvent e) {
        final Player p = e.getPlayer();
        if (Events1v1.JogandoSair.containsKey(p.getName())) {
            final Player t = Bukkit.getServer().getPlayer((String)Events1v1.JogandoSair.get(p.getName()));
            WarpsAPI.ir(t, "1v1");
            Events1v1.JogandoSair.remove(t.getName());
            Events1v1.JogandoSair.remove(p.getName());
            Events1v1.Jogando1v1Player.remove(p);
            Events1v1.Jogando1v1Player.remove(t);
            Events1v1.inPvP.remove(p);
            Events1v1.inPvP.remove(t);
            t.setMaxHealth(20.0);
            t.setHealth(20.0);
            t.setGameMode(GameMode.SURVIVAL);
            t.getInventory().setArmorContents((ItemStack[])null);
            t.getInventory().clear();
            for (final PotionEffect effect : t.getActivePotionEffects()) {
                t.removePotionEffect(effect.getType());
            }
            t.sendMessage("�c�l1v1: �7O jogador �c" + p.getName() + " �7deslogou no 1v1.");
            t.getInventory().setItem(3, Join1v1.Item_);
            t.getInventory().setItem(5, Join1v1.Cinza);
            KitAPI.setKit(t, "1v1");
            t.updateInventory();
            Player[] onlinePlayers;
            for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                final Player plr = onlinePlayers[i];
                t.showPlayer(plr);
                p.showPlayer(plr);
            }
        }
    }
    
    @EventHandler
    public void cmda(final PlayerCommandPreprocessEvent event) {
        final Player p = event.getPlayer();
        if (Events1v1.Jogando1v1Player.contains(p)) {
            event.getPlayer().sendMessage("�4�l1v1: �7Sem comandos em batalha.");
            event.setCancelled(true);
        }
    }
    
    public int itemsInInventory(final Inventory inventory, final Material[] search) {
        final List wanted = Arrays.asList(search);
        int found = 0;
        ItemStack[] arrayOfItemStack;
        for (int j = (arrayOfItemStack = inventory.getContents()).length, i = 0; i < j; ++i) {
            final ItemStack item = arrayOfItemStack[i];
            if (item != null && wanted.contains(item.getType())) {
                found += item.getAmount();
            }
        }
        return found;
    }
    
    @EventHandler
    public void PlayerInteractEntityEvent2(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player pl = onlinePlayers[i];
            if (Events1v1.Jogando1v1Player.contains(pl)) {
                pl.hidePlayer(p);
            }
        }
    }
}
