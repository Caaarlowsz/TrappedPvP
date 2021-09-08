package com.marcello.utils;

import java.util.List;
import java.util.ArrayList;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.enchantments.Enchantment;
import com.marcello.classes.Kangaroo;
import com.marcello.comandos.setArenaCommand;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import java.util.HashMap;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;

public class KitAPI
{
    public static ItemStack sopa;
    public static ItemMeta sopameta;
    public static ItemStack bussola;
    public static ItemMeta bussolameta;
    public static ItemStack pocao;
    public static ItemMeta pocaometa;
    public static ItemStack cogu1;
    public static ItemMeta cogu1meta;
    public static ItemStack cogu2;
    public static ItemMeta cogu2meta;
    public static ItemStack potes;
    public static ItemMeta potesmeta;
    public static ItemStack Kangaroo;
    public static ItemMeta Kangaroometa;
    public static ItemStack reaper;
    public static ItemMeta reapermeta;
    public static ItemStack Fisherman;
    public static ItemMeta Fishermanmeta;
    public static ItemStack deshfire;
    public static ItemMeta deshfiremeta;
    public static ItemStack deshviper;
    public static ItemMeta deshvipermeta;
    public static ItemStack forcefield;
    public static ItemMeta forcefieldmeta;
    public static ItemStack hulk;
    public static ItemMeta hulkmeta;
    public static ItemStack hunter;
    public static ItemMeta huntermeta;
    public static ItemStack madman;
    public static ItemMeta madmanmeta;
    public static ItemStack ryu;
    public static ItemMeta ryumeta;
    public static ItemStack seya;
    public static ItemMeta seyameta;
    public static ItemStack sonic;
    public static ItemMeta sonicmeta;
    public static ItemStack titan;
    public static ItemMeta titanmeta;
    public static ItemStack antistomper;
    public static ItemMeta antistompermeta;
    public static ItemStack urgal;
    public static ItemMeta urgalmeta;
    public static ItemStack thor;
    public static ItemMeta thormeta;
    public static ItemStack phantom;
    public static ItemMeta phantommeta;
    public static ItemStack specialist;
    public static ItemMeta specialistmeta;
    public static ItemStack quickdropper;
    public static ItemMeta quickdroppermeta;
    public static ItemStack poseidon;
    public static ItemMeta poseidonmeta;
    public static ItemStack burstmaster;
    public static ItemMeta burstmastermeta;
    public static ItemStack timelord;
    public static ItemMeta timelordmeta;
    public static ItemStack parkour;
    public static ItemMeta parkourmeta;
    public static ItemStack gladiator;
    public static ItemMeta gladiatormeta;
    public static ItemStack Bussola;
    public static ItemMeta Bussolameta;
    public static ItemStack thresh;
    public static ItemMeta threshmeta;
    public static ItemStack monk;
    public static ItemMeta monkmeta;
    public static ItemStack switcher;
    public static ItemMeta switchermeta;
    public static ItemStack rain;
    public static ItemMeta rainmeta;
    public static ItemStack anchor;
    public static ItemMeta anchormeta;
    public static ItemStack Evento;
    public static ItemMeta Eventometa;
    public static ItemStack Mdr;
    public static ItemMeta Mdrmeta;
    public static ItemStack Rdm;
    public static ItemMeta Rdmmeta;
    public static HashMap<String, String> Kit;
    public static HashMap<String, Integer> KitDelay;
    
    static {
        KitAPI.Kit = new HashMap<String, String>();
        KitAPI.KitDelay = new HashMap<String, Integer>();
    }
    
    public static void setKit(final Player p, final String kit) {
        KitAPI.Kit.put(p.getName(), kit);
    }
    
    public static String getKit(final Player p) {
        if (KitAPI.Kit.containsKey(p.getName())) {
            return KitAPI.Kit.get(p.getName());
        }
        return "Nenhum";
    }
    
    public static void RemoveKit(final Player p) {
        KitAPI.Kit.remove(p.getName());
    }
    
    public static void DarSopas(final Player p) {
        KitAPI.sopa = new ItemStack(Material.MUSHROOM_SOUP);
        (KitAPI.sopameta = KitAPI.sopa.getItemMeta()).setDisplayName("§6Sopa");
        KitAPI.sopa.setItemMeta(KitAPI.sopameta);
        KitAPI.bussola = new ItemStack(Material.COMPASS);
        (KitAPI.bussolameta = KitAPI.sopa.getItemMeta()).setDisplayName("§b§lB\u00daSSOLA");
        KitAPI.bussola.setItemMeta(KitAPI.bussolameta);
        KitAPI.cogu1 = new ItemStack(Material.RED_MUSHROOM, 64);
        KitAPI.cogu1meta = KitAPI.cogu1.getItemMeta();
        KitAPI.cogu1.setItemMeta(KitAPI.cogu1meta);
        KitAPI.cogu2 = new ItemStack(Material.BROWN_MUSHROOM, 64);
        KitAPI.cogu2meta = KitAPI.cogu2.getItemMeta();
        KitAPI.cogu2.setItemMeta(KitAPI.cogu2meta);
        KitAPI.potes = new ItemStack(Material.BOWL, 64);
        KitAPI.potesmeta = KitAPI.potes.getItemMeta();
        KitAPI.potes.setItemMeta(KitAPI.potesmeta);
        for (int i = 1; i < 36; ++i) {
            p.getInventory().setItem(8, KitAPI.bussola);
            p.getInventory().addItem(new ItemStack[] { KitAPI.sopa });
            p.getInventory().setItem(13, KitAPI.potes);
            p.getInventory().setItem(14, KitAPI.cogu1);
            p.getInventory().setItem(15, KitAPI.cogu2);
        }
    }
    
    public static void DarPocao(final Player p) {
        KitAPI.pocao = new ItemStack(Material.POTION, 1, (short)16421);
        (KitAPI.pocaometa = KitAPI.pocao.getItemMeta()).setDisplayName("§6Po\u00e7ao");
        KitAPI.pocao.setItemMeta(KitAPI.pocaometa);
        for (int i = 1; i < 36; ++i) {
            p.getInventory().addItem(new ItemStack[] { KitAPI.pocao });
        }
    }
    
    public static void PvP(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "PvP");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Monk(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Monk");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.monk = new ItemStack(Material.BLAZE_ROD);
        (KitAPI.monkmeta = KitAPI.monk.getItemMeta()).setDisplayName("§eMonk");
        KitAPI.monk.setItemMeta(KitAPI.monkmeta);
        p.getInventory().setItem(1, KitAPI.monk);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void AntiStomper(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "AntiStomper");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Health(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Health");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void magma(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Magma");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Anchor(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Anchor");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Assassin(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Assassin");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Switcher(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Switcher");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.switcher = new ItemStack(Material.SNOW_BALL, 16);
        (KitAPI.switchermeta = KitAPI.switcher.getItemMeta()).setDisplayName("§eSwitcher");
        KitAPI.switcher.setItemMeta(KitAPI.switchermeta);
        p.getInventory().setItem(1, KitAPI.switcher);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Thresh(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Thresh");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.thresh = new ItemStack(Material.LEASH);
        (KitAPI.threshmeta = KitAPI.thresh.getItemMeta()).setDisplayName("§eThresh");
        KitAPI.thresh.setItemMeta(KitAPI.threshmeta);
        p.getInventory().setItem(1, KitAPI.thresh);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Rain(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Rain");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.rain = new ItemStack(Material.ARROW);
        (KitAPI.rainmeta = KitAPI.rain.getItemMeta()).setDisplayName("§eRain");
        KitAPI.rain.setItemMeta(KitAPI.rainmeta);
        p.getInventory().setItem(1, KitAPI.rain);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Stomper(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Stomper");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Viper(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Viper");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Snail(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Snail");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Reaper(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Reaper");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.reaper = new ItemStack(Material.WOOD_HOE);
        (KitAPI.reapermeta = KitAPI.reaper.getItemMeta()).setDisplayName("§eReaper");
        KitAPI.reaper.setItemMeta(KitAPI.reapermeta);
        p.getInventory().setItem(1, KitAPI.reaper);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Thor(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Thor");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.thor = new ItemStack(Material.GOLD_AXE);
        (KitAPI.thormeta = KitAPI.thor.getItemMeta()).setDisplayName("§eThor");
        KitAPI.thor.setItemMeta(KitAPI.thormeta);
        p.getInventory().setItem(1, KitAPI.thor);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void TimeLord(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "TimeLord");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.timelord = new ItemStack(Material.WATCH);
        (KitAPI.timelordmeta = KitAPI.timelord.getItemMeta()).setDisplayName("§eTimeLord");
        KitAPI.timelord.setItemMeta(KitAPI.timelordmeta);
        p.getInventory().setItem(1, KitAPI.timelord);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void quickdropper(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "QuickDropper");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Poseidon(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Poseidon");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Phantom(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Phantom");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.phantom = new ItemStack(Material.FEATHER);
        (KitAPI.phantommeta = KitAPI.phantom.getItemMeta()).setDisplayName("§ePhantom");
        KitAPI.phantom.setItemMeta(KitAPI.phantommeta);
        p.getInventory().setItem(1, KitAPI.phantom);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Gladiator(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Gladiator");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.gladiator = new ItemStack(Material.IRON_FENCE);
        (KitAPI.gladiatormeta = KitAPI.gladiator.getItemMeta()).setDisplayName("§eGladiator");
        KitAPI.gladiator.setItemMeta(KitAPI.gladiatormeta);
        p.getInventory().setItem(1, KitAPI.gladiator);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Camel(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Camel");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void BurstMaster(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "BurstMaster");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.burstmaster = new ItemStack(Material.STONE_HOE);
        (KitAPI.burstmastermeta = KitAPI.burstmaster.getItemMeta()).setDisplayName("§eBurstMaster");
        KitAPI.burstmaster.setItemMeta(KitAPI.burstmastermeta);
        p.getInventory().setItem(1, KitAPI.burstmaster);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Boxer(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Boxer");
        final ItemStack espada = new ItemStack(Material.QUARTZ);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Deshfire(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Deshfire");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.deshfire = new ItemStack(Material.REDSTONE_BLOCK);
        (KitAPI.deshfiremeta = KitAPI.deshfire.getItemMeta()).setDisplayName("§eDeshFire");
        KitAPI.deshfire.setItemMeta(KitAPI.deshfiremeta);
        p.getInventory().setItem(1, KitAPI.deshfire);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Deshviper(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Deshviper");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.deshviper = new ItemStack(Material.EMERALD_BLOCK);
        (KitAPI.deshvipermeta = KitAPI.deshviper.getItemMeta()).setDisplayName("§eDeshViper");
        KitAPI.deshviper.setItemMeta(KitAPI.deshvipermeta);
        p.getInventory().setItem(1, KitAPI.deshviper);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Forcefield(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Forcefield");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.forcefield = new ItemStack(Material.NETHER_FENCE);
        (KitAPI.forcefieldmeta = KitAPI.forcefield.getItemMeta()).setDisplayName("§eForcefield");
        KitAPI.forcefield.setItemMeta(KitAPI.forcefieldmeta);
        p.getInventory().setItem(1, KitAPI.forcefield);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Hulk(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Hulk");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Ryu(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Ryu");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.ryu = new ItemStack(Material.DIAMOND_BLOCK);
        (KitAPI.ryumeta = KitAPI.ryu.getItemMeta()).setDisplayName("§eRyu");
        KitAPI.ryu.setItemMeta(KitAPI.ryumeta);
        p.getInventory().setItem(1, KitAPI.ryu);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Seya(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Seya");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.seya = new ItemStack(Material.DIAMOND);
        (KitAPI.seyameta = KitAPI.seya.getItemMeta()).setDisplayName("§eSeya");
        KitAPI.seya.setItemMeta(KitAPI.seyameta);
        p.getInventory().setItem(1, KitAPI.seya);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void specialist(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Specialist");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.specialist = new ItemStack(Material.ENCHANTED_BOOK);
        (KitAPI.specialistmeta = KitAPI.specialist.getItemMeta()).setDisplayName("§eSpecialist");
        KitAPI.specialist.setItemMeta(KitAPI.specialistmeta);
        p.getInventory().setItem(1, KitAPI.specialist);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Sonic(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Sonic");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.sonic = new ItemStack(Material.LAPIS_BLOCK);
        (KitAPI.sonicmeta = KitAPI.sonic.getItemMeta()).setDisplayName("§eSonic");
        KitAPI.sonic.setItemMeta(KitAPI.sonicmeta);
        p.getInventory().setItem(1, KitAPI.sonic);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Titan(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Titan");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.titan = new ItemStack(Material.BEDROCK);
        (KitAPI.titanmeta = KitAPI.titan.getItemMeta()).setDisplayName("§eTitan");
        KitAPI.titan.setItemMeta(KitAPI.titanmeta);
        p.getInventory().setItem(1, KitAPI.titan);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Urgal(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Urgal");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.urgal = new ItemStack(Material.REDSTONE);
        (KitAPI.urgalmeta = KitAPI.urgal.getItemMeta()).setDisplayName("§eUrgal");
        KitAPI.urgal.setItemMeta(KitAPI.urgalmeta);
        p.getInventory().setItem(1, KitAPI.urgal);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Turtle(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Turtle");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Madman(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Madman");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Kangaroo(final Player p) {
        com.marcello.classes.Kangaroo.KangarroStats.put(p.getName(), 0);
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Kangaroo");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.Kangaroo = new ItemStack(Material.FIREWORK);
        (KitAPI.Kangaroometa = KitAPI.Kangaroo.getItemMeta()).setDisplayName("§eKangaroo");
        KitAPI.Kangaroo.setItemMeta(KitAPI.Kangaroometa);
        p.getInventory().setItem(1, KitAPI.Kangaroo);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Fisherman(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Fisherman");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        KitAPI.Fisherman = new ItemStack(Material.FISHING_ROD);
        (KitAPI.Fishermanmeta = KitAPI.Fisherman.getItemMeta()).setDisplayName("§eFisherman");
        KitAPI.Fisherman.setItemMeta(KitAPI.Fishermanmeta);
        p.getInventory().setItem(1, KitAPI.Fisherman);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Ninja(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Ninja");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Vinking(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Viking");
        final ItemStack espada = new ItemStack(Material.STONE_AXE);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eViking");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
    
    public static void Fps(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Fps");
        final ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);
        p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
        p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
        espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eFPS");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        p.updateInventory();
    }
    
    public static void Simulator(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Simulator");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§6§lFPS Simulator");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        p.updateInventory();
    }
    
    public static void Sumo(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Sumo");
        p.getInventory().setHelmet(new ItemStack(Material.AIR));
        p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        p.getInventory().setLeggings(new ItemStack(Material.AIR));
        p.getInventory().setBoots(new ItemStack(Material.AIR));
        final ItemStack kb = new ItemStack(Material.STICK);
        final ItemMeta kbmeta = kb.getItemMeta();
        kbmeta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        kbmeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        kbmeta.setDisplayName("§eSumo");
        kb.setItemMeta(kbmeta);
        p.getInventory().setItem(0, kb);
        p.updateInventory();
    }
    
    public static void aMain(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Main");
        final ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);
        p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
        p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
        espada.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eMAIN");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        p.updateInventory();
    }
    
    public static void Gladiator1(final Player p) {
        p.getInventory().clear();
        setKit(p, "Warp Glad");
        final ItemStack kits = new ItemStack(Material.IRON_FENCE);
        final ItemMeta kitsmeta = kits.getItemMeta();
        kitsmeta.setDisplayName("§aDesafiar Gladiator §8(Clique)");
        kits.setItemMeta(kitsmeta);
        final ItemStack warps = new ItemStack(Material.INK_SACK, 1, (short)8);
        final ItemMeta warpsmeta = warps.getItemMeta();
        warpsmeta.setDisplayName("§aProcurar Partida §8(Clique)");
        warps.setItemMeta(warpsmeta);
        p.getInventory().setItem(3, kits);
        p.getInventory().setItem(5, warps);
        p.updateInventory();
    }
    
    public static void umVum(final Player p) {
        p.getInventory().clear();
        setKit(p, "1v1");
        final ItemStack kits = new ItemStack(Material.BLAZE_ROD);
        final ItemMeta kitsmeta = kits.getItemMeta();
        kitsmeta.setDisplayName("§aDesafiar 1v1 §8(Clique)");
        kits.setItemMeta(kitsmeta);
        final ItemStack warps = new ItemStack(Material.INK_SACK, 1, (short)8);
        final ItemMeta warpsmeta = warps.getItemMeta();
        warpsmeta.setDisplayName("§aDuelo Rapido §8(Clique)");
        warps.setItemMeta(warpsmeta);
        p.getInventory().setItem(3, kits);
        p.getInventory().setItem(5, warps);
        p.updateInventory();
    }
    
    public static void ArenaFish(final Player p) {
        p.getInventory().clear();
        setKit(p, "ArenaFish");
        final ItemStack fish = new ItemStack(Material.FISHING_ROD);
        final ItemMeta fishmeta = fish.getItemMeta();
        fishmeta.setDisplayName("§eFisherman");
        fish.setItemMeta(fishmeta);
        p.getInventory().setItem(4, fish);
        p.updateInventory();
    }
    
    public static void TexturaArena(final Player p) {
        p.getInventory().clear();
        setKit(p, "Textura");
        final ItemStack textura = new ItemStack(Material.ITEM_FRAME);
        final ItemMeta texturameta = textura.getItemMeta();
        texturameta.setDisplayName("§bMostre suas texturas aqui");
        textura.setItemMeta(texturameta);
        p.getInventory().setItem(4, textura);
        p.updateInventory();
    }
    
    public static void Challenge(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Challenge");
        p.getInventory().setHelmet(new ItemStack(Material.AIR));
        p.getInventory().setChestplate(new ItemStack(Material.AIR));
        p.getInventory().setLeggings(new ItemStack(Material.AIR));
        p.getInventory().setBoots(new ItemStack(Material.AIR));
        p.updateInventory();
    }
    
    public static void Evento(final Player p) {
        p.getInventory().clear();
        setKit(p, "Evento");
        final ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
        final BookMeta bm = (BookMeta)book.getItemMeta();
        bm.setTitle("§b§lARENAPVP");
        bm.setAuthor("§7Como jogar este evento");
        final ArrayList<String> pages = new ArrayList<String>();
        bm.setPages((List)pages);
        book.setItemMeta((ItemMeta)bm);
        p.getInventory().setHelmet(new ItemStack(Material.AIR));
        pages.add("§7Seja bem vindo a este evento, aqui voc\u00ea ir\u00e1 esperar um staffer setar o kit, ap\u00f3s isso o pvp e o dano ser\u00e1 ativado, todos come\u00e7aram a tirar pvp os ultimos 3 seram os vencedores, o 3 lugar ganhara §61000 §7coins, o 2 lugar ganhara §65000 §7coins, e o 1 lugar ganhara um vip §D§lULTIMATE §7 por uma semana. ");
        p.getInventory().setChestplate(new ItemStack(Material.AIR));
        p.getInventory().setLeggings(new ItemStack(Material.AIR));
        p.getInventory().setBoots(new ItemStack(Material.AIR));
        p.getInventory().setItem(4, book);
        p.updateInventory();
    }
    
    public static void Ajnin(final Player p) {
        p.getInventory().clear();
        DarSopas(p);
        setKit(p, "Ajnin");
        final ItemStack espada = new ItemStack(Material.STONE_SWORD);
        espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        final ItemMeta espadameta = espada.getItemMeta();
        espadameta.setDisplayName("§eEspada");
        espada.setItemMeta(espadameta);
        p.getInventory().setItem(0, espada);
        setArenaCommand.TeleportArenaRandom(p);
        p.updateInventory();
    }
}
