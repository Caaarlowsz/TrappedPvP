package com.marcello.guis;

import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.Sound;
import org.bukkit.inventory.Inventory;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.ArrayList;
import org.bukkit.ChatColor;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class KitSelector implements Listener, CommandExecutor
{
    public static ItemStack amarelo;
    public static ItemMeta amarelometa;
    public static ItemStack verde;
    public static ItemMeta verdemeta;
    public static ItemStack azul;
    public static ItemMeta azulmeta;
    public static ItemStack vermelho;
    public static ItemMeta vermelhometa;
    public static ItemStack vidro;
    public static ItemMeta vidrometa;
    public static ItemStack vidro1;
    public static ItemMeta vidro1meta;
    public static ItemStack loja;
    public static ItemMeta lojameta;
    public static ItemStack corante;
    public static ItemMeta corantemeta;
    public static ItemStack pvp;
    public static ItemMeta pvpmeta;
    public static ItemStack kangaroo;
    public static ItemMeta kangaroometa;
    public static ItemStack ajnin;
    public static ItemMeta ajninmeta;
    public static ItemStack thresh;
    public static ItemMeta threshmeta;
    public static ItemStack viper;
    public static ItemMeta vipermeta;
    public static ItemStack snail;
    public static ItemMeta snailmeta;
    public static ItemStack health;
    public static ItemMeta healthmeta;
    public static ItemStack reaper;
    public static ItemMeta reapermeta;
    public static ItemStack switcher;
    public static ItemMeta switchermeta;
    public static ItemStack Fisherman;
    public static ItemMeta Fishermanmeta;
    public static ItemStack stomper;
    public static ItemMeta stompermeta;
    public static ItemStack viking;
    public static ItemMeta vikingmeta;
    public static ItemStack ninja;
    public static ItemMeta ninjameta;
    public static ItemStack boxer;
    public static ItemMeta boxermeta;
    public static ItemStack deshfire;
    public static ItemMeta deshfiremeta;
    public static ItemStack deshviper;
    public static ItemMeta deshvipermeta;
    public static ItemStack ff;
    public static ItemMeta ffmeta;
    public static ItemStack hulk;
    public static ItemMeta hulkmeta;
    public static ItemStack madman;
    public static ItemMeta madmanmeta;
    public static ItemStack ryu;
    public static ItemMeta ryumeta;
    public static ItemStack seya;
    public static ItemStack monk;
    public static ItemMeta monkmeta;
    public static ItemMeta seyameta;
    public static ItemStack sonic;
    public static ItemMeta sonicmeta;
    public static ItemStack magma;
    public static ItemMeta magmameta;
    public static ItemStack rain;
    public static ItemMeta rainmeta;
    public static ItemStack anchor;
    public static ItemMeta anchormeta;
    public static ItemStack assassin;
    public static ItemStack hunter;
    public static ItemStack huntermeta;
    public static ItemMeta assassinmeta;
    public static ItemStack head;
    public static ItemMeta headmeta;
    public static ItemStack specialist;
    public static ItemMeta specialistmeta;
    public static ItemStack titan;
    public static ItemMeta titanmeta;
    public static ItemStack vidro3;
    public static ItemMeta vidro3meta;
    public static ItemStack antistomper;
    public static ItemMeta antistompermeta;
    public static ItemStack urgal;
    public static ItemMeta urgalmeta;
    public static ItemStack thor;
    public static ItemMeta thormeta;
    public static ItemStack timelord;
    public static ItemMeta timelordmeta;
    public static ItemStack phantom;
    public static ItemMeta phantommeta;
    public static ItemStack poseidon;
    public static ItemMeta poseidonmeta;
    public static ItemStack quickdropper;
    public static ItemMeta quickdroppermeta;
    public static ItemStack Camel;
    public static ItemMeta Camelmeta;
    public static ItemStack burstmaster;
    public static ItemMeta burstmastermeta;
    public static ItemStack Gladiator;
    public static ItemMeta Gladiatormeta;
    public static ItemStack livro;
    public static ItemMeta livrometa;
    public static ItemStack ar;
    public static ItemMeta armeta;
    public static ItemStack close;
    public static ItemMeta closemeta;
    public static ItemStack arrow;
    public static ItemMeta arrowmeta;
    public static ItemStack arrow2;
    public static ItemMeta arrow2meta;
    
    public static List<String> Lore(String string) {
        final String[] split = string.split(" ");
        string = "";
        final ChatColor color = ChatColor.GOLD;
        final ArrayList<String> newString = new ArrayList<String>();
        for (int i = 0; i < split.length; ++i) {
            if (string.length() > 20 || string.endsWith(".")) {
                newString.add(color + string);
                if (string.endsWith(".")) {
                    newString.add("");
                }
                string = "";
            }
            string = String.valueOf(string) + ((string.length() == 0) ? "" : " ") + split[i];
        }
        newString.add(string);
        return newString;
    }
    
    @EventHandler
    public void Clicar(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.CHEST && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bKits §7(Clique)")) {
            p.chat("/kits");
        }
    }
    
    @EventHandler
    public void Perfils(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.ANVIL && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bPerfil §7(Clique)")) {
            p.chat("/perfil");
        }
    }
    
    @EventHandler
    public void Admins(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.getMaterial(397) && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bUltils §7(Clique)")) {
            p.chat("/ultils");
        }
    }
    
    @EventHandler
    public void Clicar4(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.PAPER && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bClick §7(Clique)")) {
            p.chat("/ct");
        }
    }
    
    @EventHandler
    public void Execute(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§7\u25b8 Kits (P\u00e1gina 1)") && e.getCurrentItem().isSimilar(KitSelector.vidro)) {
                e.setCancelled(true);
                p.closeInventory();
            }
        }
    }
    
    @EventHandler
    public void Execute5(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§7\u25b8 Kits (P\u00e1gina 1)") && e.getCurrentItem().isSimilar(KitSelector.head)) {
                e.setCancelled(true);
                p.closeInventory();
            }
        }
    }
    
    @EventHandler
    public void Execute1(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            if (Inv.getTitle().equalsIgnoreCase("§ASeus Kits")) {
                if (e.getCurrentItem().isSimilar(KitSelector.vidro1)) {
                    e.setCancelled(true);
                }
                if (e.getCurrentItem().isSimilar(KitSelector.amarelo)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/warps");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.head)) {
                    e.setCancelled(true);
                }
                if (e.getCurrentItem().isSimilar(KitSelector.verde)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kits");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.azul)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/rank");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.vermelho)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/tag");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.pvp)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit pvp");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.kangaroo)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit kangaroo");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.viper)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit viper");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.snail)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit snail");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.reaper)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit reaper");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.Fisherman)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit fisherman");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.stomper)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit stomper");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.viking)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit viking");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.ninja)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit ninja");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.boxer)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit boxer");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.deshfire)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit deshfire");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.deshviper)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit deshviper");
                }
                if (e.getCurrentItem().isSimilar(KitSelector.ff)) {
                    e.setCancelled(true);
                    p.closeInventory();
                    p.chat("/kit forcefield");
                }
            }
            if (e.getCurrentItem().isSimilar(KitSelector.ajnin)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit ajnin");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.anchor)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit anchor");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.assassin)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit assassin");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.monk)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit monk");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.rain)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit rain");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.magma)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit magma");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.viking)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit viking");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.switcher)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit switcher");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.ff)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit forcefield");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.hulk)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit hulk");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.madman)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit madman");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.specialist)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit specialist");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.urgal)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit urgal");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.corante)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kits");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.thor)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit thor");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.timelord)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit timelord");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.phantom)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit phantom");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.hulk)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit hulk");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.quickdropper)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit quickdropper");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.antistomper)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit antistomper");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.urgal)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit urgal");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.corante)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kits");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.timelord)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit timelord");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.poseidon)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit poseidon");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.Gladiator)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit Gladiator");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.ar)) {
                e.setCancelled(true);
                p.closeInventory();
            }
            if (e.getCurrentItem().isSimilar(KitSelector.vidro3)) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().isSimilar(KitSelector.arrow)) {
                e.setCancelled(true);
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 0.0f);
                p.chat("/kits");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.arrow2)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kits");
            }
            if (e.getCurrentItem().isSimilar(KitSelector.close)) {
                e.setCancelled(true);
                p.closeInventory();
            }
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cVoce precisa ser um player");
            return true;
        }
        final Player p = (Player)sender;
        final Inventory kit = Bukkit.createInventory((InventoryHolder)p, 54, "§aSeus Kits");
        KitSelector.vidro1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)0);
        (KitSelector.vidro1meta = KitSelector.vidro1.getItemMeta()).setDisplayName("§f-");
        KitSelector.vidro1.setItemMeta(KitSelector.vidro1meta);
        KitSelector.vidro3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)5);
        (KitSelector.vidro3meta = KitSelector.vidro3.getItemMeta()).setDisplayName("§a-");
        KitSelector.vidro3.setItemMeta(KitSelector.vidro3meta);
        KitSelector.amarelo = new ItemStack(Material.WOOL, 1, (short)4);
        (KitSelector.amarelometa = KitSelector.amarelo.getItemMeta()).setDisplayName("§eWarps");
        KitSelector.amarelo.setItemMeta(KitSelector.amarelometa);
        KitSelector.verde = new ItemStack(Material.WOOL, 1, (short)5);
        (KitSelector.verdemeta = KitSelector.verde.getItemMeta()).setDisplayName("§aKits");
        KitSelector.verde.setItemMeta(KitSelector.verdemeta);
        KitSelector.azul = new ItemStack(Material.WOOL, 1, (short)11);
        (KitSelector.azulmeta = KitSelector.azul.getItemMeta()).setDisplayName("§9Ranks");
        KitSelector.azul.setItemMeta(KitSelector.azulmeta);
        KitSelector.vermelho = new ItemStack(Material.WOOL, 1, (short)14);
        (KitSelector.vermelhometa = KitSelector.azul.getItemMeta()).setDisplayName("§cTags");
        KitSelector.vermelho.setItemMeta(KitSelector.vermelhometa);
        KitSelector.ar = new ItemStack(Material.AIR);
        KitSelector.armeta = KitSelector.ar.getItemMeta();
        KitSelector.ar.setItemMeta(KitSelector.armeta);
        KitSelector.arrow = new ItemStack(Material.getMaterial(351), 1, (short)8);
        (KitSelector.arrowmeta = KitSelector.arrow.getItemMeta()).setDisplayName("§7§lP\ufffd?GINA ANTERIOR");
        KitSelector.arrow.setItemMeta(KitSelector.arrowmeta);
        KitSelector.arrow2 = new ItemStack(Material.getMaterial(351), 1, (short)10);
        (KitSelector.arrow2meta = KitSelector.arrow2.getItemMeta()).setDisplayName("§a§lPROXINA P\u00c0GINA");
        KitSelector.arrow2.setItemMeta(KitSelector.arrow2meta);
        KitSelector.vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)10);
        (KitSelector.vidrometa = KitSelector.vidro.getItemMeta()).setDisplayName("§5Seus kits");
        KitSelector.vidro.setItemMeta(KitSelector.vidrometa);
        KitSelector.livro = new ItemStack(Material.BOOK);
        (KitSelector.livrometa = KitSelector.livro.getItemMeta()).setDisplayName("§a\u25b8 Kits");
        KitSelector.livro.setItemMeta(KitSelector.livrometa);
        KitSelector.pvp = new ItemStack(Material.STONE_SWORD);
        (KitSelector.pvpmeta = KitSelector.pvp.getItemMeta()).setDisplayName("§aKit §7- §fPvP");
        KitSelector.pvpmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.pvp.setItemMeta(KitSelector.pvpmeta);
        KitSelector.kangaroo = new ItemStack(Material.FIREWORK);
        (KitSelector.kangaroometa = KitSelector.kangaroo.getItemMeta()).setDisplayName("§aKit §7- §fKangaroo");
        KitSelector.kangaroometa.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.kangaroo.setItemMeta(KitSelector.kangaroometa);
        KitSelector.viper = new ItemStack(Material.FERMENTED_SPIDER_EYE);
        (KitSelector.vipermeta = KitSelector.viper.getItemMeta()).setDisplayName("§aKit §7- §fViper");
        KitSelector.vipermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.viper.setItemMeta(KitSelector.vipermeta);
        KitSelector.snail = new ItemStack(Material.WEB);
        (KitSelector.snailmeta = KitSelector.snail.getItemMeta()).setDisplayName("§aKit §7- §fSnail");
        KitSelector.snailmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.snail.setItemMeta(KitSelector.snailmeta);
        KitSelector.reaper = new ItemStack(Material.WOOD_HOE);
        (KitSelector.reapermeta = KitSelector.reaper.getItemMeta()).setDisplayName("§aKit §7- §fReaper");
        KitSelector.reapermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.reaper.setItemMeta(KitSelector.reapermeta);
        KitSelector.Fisherman = new ItemStack(Material.FISHING_ROD);
        (KitSelector.Fishermanmeta = KitSelector.Fisherman.getItemMeta()).setDisplayName("§aKit §7- §fFisherman");
        KitSelector.Fishermanmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.Fisherman.setItemMeta(KitSelector.Fishermanmeta);
        KitSelector.stomper = new ItemStack(Material.DIAMOND_BOOTS);
        (KitSelector.stompermeta = KitSelector.stomper.getItemMeta()).setDisplayName("§aKit §7- §fStomper");
        KitSelector.stompermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.stomper.setItemMeta(KitSelector.stompermeta);
        KitSelector.viking = new ItemStack(Material.IRON_AXE);
        (KitSelector.vikingmeta = KitSelector.viking.getItemMeta()).setDisplayName("§aKit §7- §fViking");
        KitSelector.vikingmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.viking.setItemMeta(KitSelector.vikingmeta);
        KitSelector.boxer = new ItemStack(Material.QUARTZ);
        (KitSelector.boxermeta = KitSelector.boxer.getItemMeta()).setDisplayName("§aKit §7- §fBoxer");
        KitSelector.boxermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.boxer.setItemMeta(KitSelector.boxermeta);
        KitSelector.deshfire = new ItemStack(Material.REDSTONE_BLOCK);
        (KitSelector.deshfiremeta = KitSelector.deshfire.getItemMeta()).setDisplayName("§aKit §7- §fDeshfire");
        KitSelector.deshfiremeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.deshfire.setItemMeta(KitSelector.deshfiremeta);
        KitSelector.deshviper = new ItemStack(Material.EMERALD_BLOCK);
        (KitSelector.deshvipermeta = KitSelector.deshviper.getItemMeta()).setDisplayName("§aKit §7- §fDeshviper");
        KitSelector.deshvipermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.deshviper.setItemMeta(KitSelector.deshvipermeta);
        KitSelector.ff = new ItemStack(Material.NETHER_FENCE);
        (KitSelector.ffmeta = KitSelector.ff.getItemMeta()).setDisplayName("§aKit §7- §fForcefield");
        KitSelector.ffmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.ff.setItemMeta(KitSelector.ffmeta);
        KitSelector.hulk = new ItemStack(Material.SADDLE);
        (KitSelector.hulkmeta = KitSelector.hulk.getItemMeta()).setDisplayName("§aKit §7- §fHulk");
        KitSelector.hulkmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.hulk.setItemMeta(KitSelector.hulkmeta);
        KitSelector.specialist = new ItemStack(Material.ENCHANTED_BOOK);
        (KitSelector.specialistmeta = KitSelector.specialist.getItemMeta()).setDisplayName("§aKit §7- §fSpecialist");
        KitSelector.specialistmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.specialist.setItemMeta(KitSelector.specialistmeta);
        KitSelector.antistomper = new ItemStack(Material.DIAMOND_HELMET);
        (KitSelector.antistompermeta = KitSelector.antistomper.getItemMeta()).setDisplayName("§aKit §7- §fAntiStompr");
        KitSelector.antistompermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.antistomper.setItemMeta(KitSelector.antistompermeta);
        KitSelector.urgal = new ItemStack(Material.POTION);
        (KitSelector.urgalmeta = KitSelector.urgal.getItemMeta()).setDisplayName("§aKit §7- §fUrgal");
        KitSelector.urgalmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.urgal.setItemMeta(KitSelector.urgalmeta);
        KitSelector.ninja = new ItemStack(Material.COMPASS);
        (KitSelector.ninjameta = KitSelector.ninja.getItemMeta()).setDisplayName("§aKit §7- §fNinja");
        KitSelector.ninjameta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.ninja.setItemMeta(KitSelector.ninjameta);
        KitSelector.thor = new ItemStack(Material.WOOD_AXE);
        (KitSelector.thormeta = KitSelector.thor.getItemMeta()).setDisplayName("§aKit §7- §fThor");
        KitSelector.thormeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.thor.setItemMeta(KitSelector.thormeta);
        KitSelector.quickdropper = new ItemStack(Material.BOWL);
        (KitSelector.quickdroppermeta = KitSelector.quickdropper.getItemMeta()).setDisplayName("§aKit §7- §fQuickDropper");
        KitSelector.quickdroppermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.quickdropper.setItemMeta(KitSelector.quickdroppermeta);
        KitSelector.poseidon = new ItemStack(Material.WATER_BUCKET);
        (KitSelector.poseidonmeta = KitSelector.poseidon.getItemMeta()).setDisplayName("§aKit §7- §fPoseidon");
        KitSelector.poseidonmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.poseidon.setItemMeta(KitSelector.poseidonmeta);
        KitSelector.phantom = new ItemStack(Material.FEATHER);
        (KitSelector.phantommeta = KitSelector.phantom.getItemMeta()).setDisplayName("§aKit §7- §fPhantom");
        KitSelector.phantommeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.phantom.setItemMeta(KitSelector.phantommeta);
        KitSelector.madman = new ItemStack(Material.POTION, 1, (short)8232);
        (KitSelector.madmanmeta = KitSelector.madman.getItemMeta()).setDisplayName("§aKit §7- §fMadman");
        KitSelector.madmanmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.madman.setItemMeta(KitSelector.madmanmeta);
        KitSelector.head = new ItemStack(Material.CAKE);
        (KitSelector.headmeta = KitSelector.head.getItemMeta()).setDisplayName("§aKits disponiveis");
        KitSelector.head.setItemMeta(KitSelector.headmeta);
        KitSelector.Gladiator = new ItemStack(Material.IRON_FENCE);
        (KitSelector.Gladiatormeta = KitSelector.Gladiator.getItemMeta()).setDisplayName("§aKit §7- §fGladiator");
        KitSelector.Gladiatormeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.Gladiator.setItemMeta(KitSelector.Gladiatormeta);
        KitSelector.thor = new ItemStack(Material.STONE_AXE);
        (KitSelector.thormeta = KitSelector.thor.getItemMeta()).setDisplayName("§aKit §7- §fThor");
        KitSelector.thormeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.thor.setItemMeta(KitSelector.thormeta);
        KitSelector.anchor = new ItemStack(Material.ANVIL);
        (KitSelector.anchormeta = KitSelector.anchor.getItemMeta()).setDisplayName("§aKit §7- §fAnchor");
        KitSelector.anchormeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.anchor.setItemMeta(KitSelector.anchormeta);
        KitSelector.rain = new ItemStack(Material.ARROW);
        (KitSelector.rainmeta = KitSelector.rain.getItemMeta()).setDisplayName("§aKit §7- §fRain");
        KitSelector.rainmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.rain.setItemMeta(KitSelector.rainmeta);
        KitSelector.assassin = new ItemStack(Material.GOLD_SWORD);
        (KitSelector.assassinmeta = KitSelector.assassin.getItemMeta()).setDisplayName("§aKit §7- §fAssassin");
        KitSelector.assassinmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.assassin.setItemMeta(KitSelector.assassinmeta);
        KitSelector.monk = new ItemStack(Material.BLAZE_ROD);
        (KitSelector.monkmeta = KitSelector.monk.getItemMeta()).setDisplayName("§aKit §7- §fMonk");
        KitSelector.monkmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.monk.setItemMeta(KitSelector.monkmeta);
        KitSelector.magma = new ItemStack(Material.LAVA_BUCKET);
        (KitSelector.magmameta = KitSelector.magma.getItemMeta()).setDisplayName("§aKit §7- §fMagma");
        KitSelector.magmameta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.magma.setItemMeta(KitSelector.magmameta);
        KitSelector.switcher = new ItemStack(Material.SNOW_BALL);
        (KitSelector.switchermeta = KitSelector.switcher.getItemMeta()).setDisplayName("§aKit §7- §fSwitcher");
        KitSelector.switchermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.switcher.setItemMeta(KitSelector.switchermeta);
        KitSelector.timelord = new ItemStack(Material.WATCH);
        (KitSelector.timelordmeta = KitSelector.timelord.getItemMeta()).setDisplayName("§aKit §7- §fTimeLord");
        KitSelector.timelordmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.timelord.setItemMeta(KitSelector.timelordmeta);
        KitSelector.ajnin = new ItemStack(Material.NETHER_STAR);
        (KitSelector.ajninmeta = KitSelector.ajnin.getItemMeta()).setDisplayName("§aKit §7- §fAjnin");
        KitSelector.ajninmeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.ajnin.setItemMeta(KitSelector.ajninmeta);
        KitSelector.quickdropper = new ItemStack(Material.BOWL);
        (KitSelector.quickdroppermeta = KitSelector.quickdropper.getItemMeta()).setDisplayName("§aKit §7- §fQuickDropper");
        KitSelector.quickdroppermeta.setLore((List)Lore("§7Clique para selecionar"));
        KitSelector.quickdropper.setItemMeta(KitSelector.quickdroppermeta);
        for (int i = 0; i != 54; ++i) {
            kit.setItem(0, KitSelector.arrow);
            kit.setItem(2, KitSelector.amarelo);
            kit.setItem(3, KitSelector.verde);
            kit.setItem(4, KitSelector.head);
            kit.setItem(5, KitSelector.azul);
            kit.setItem(6, KitSelector.vermelho);
            kit.setItem(8, KitSelector.arrow2);
            kit.setItem(9, KitSelector.vidro3);
            kit.setItem(10, KitSelector.vidro3);
            kit.setItem(11, KitSelector.vidro3);
            kit.setItem(12, KitSelector.vidro3);
            kit.setItem(13, KitSelector.vidro3);
            kit.setItem(14, KitSelector.vidro3);
            kit.setItem(15, KitSelector.vidro3);
            kit.setItem(16, KitSelector.vidro3);
            kit.setItem(17, KitSelector.vidro3);
            kit.setItem(18, KitSelector.pvp);
            kit.setItem(19, KitSelector.kangaroo);
            kit.setItem(20, KitSelector.Fisherman);
            kit.setItem(21, KitSelector.viper);
            kit.setItem(22, KitSelector.snail);
            kit.setItem(23, KitSelector.stomper);
            kit.setItem(24, KitSelector.Gladiator);
            kit.setItem(25, KitSelector.reaper);
            kit.setItem(26, KitSelector.viking);
            kit.setItem(27, KitSelector.magma);
            kit.setItem(28, KitSelector.deshfire);
            kit.setItem(29, KitSelector.specialist);
            kit.setItem(30, KitSelector.hulk);
            kit.setItem(31, KitSelector.ninja);
            kit.setItem(32, KitSelector.antistomper);
            kit.setItem(33, KitSelector.timelord);
            kit.setItem(34, KitSelector.monk);
            kit.setItem(35, KitSelector.boxer);
            kit.setItem(36, KitSelector.madman);
            kit.setItem(37, KitSelector.deshviper);
            kit.setItem(38, KitSelector.poseidon);
            kit.setItem(39, KitSelector.anchor);
            kit.setItem(40, KitSelector.ajnin);
            kit.setItem(41, KitSelector.rain);
            kit.setItem(42, KitSelector.thor);
            kit.setItem(43, KitSelector.urgal);
            kit.setItem(44, KitSelector.assassin);
            kit.setItem(45, KitSelector.phantom);
            kit.setItem(46, KitSelector.quickdropper);
            kit.setItem(47, KitSelector.switcher);
        }
        p.openInventory(kit);
        return false;
    }
}
