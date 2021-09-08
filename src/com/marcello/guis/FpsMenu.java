package com.marcello.guis;

import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class FpsMenu implements Listener, CommandExecutor
{
    public static ItemStack head;
    public static ItemMeta headmeta;
    public static ItemStack textura;
    public static ItemMeta texturameta;
    public static ItemStack amarelo;
    public static ItemMeta amarelometa;
    public static ItemStack verde;
    public static ItemMeta verdemeta;
    public static ItemStack azul;
    public static ItemMeta azulmeta;
    public static ItemStack vermelho;
    public static ItemMeta vermelhometa;
    public static ItemStack bolo;
    public static ItemMeta bolometa;
    public static ItemStack loja;
    public static ItemMeta lojameta;
    public static ItemStack corante;
    public static ItemMeta corantemeta;
    public static ItemStack arrow;
    public static ItemMeta arrowmeta;
    public static ItemStack arrow2;
    public static ItemMeta arrow2meta;
    public static ItemStack vidro;
    public static ItemMeta vidrometa;
    public static ItemStack vidro1;
    public static ItemMeta vidro1meta;
    public static ItemStack fps;
    public static ItemMeta fpsmeta;
    public static ItemStack main;
    public static ItemMeta mainmeta;
    public static ItemStack lava;
    public static ItemMeta lavameta;
    public static ItemStack sumo;
    public static ItemMeta sumometa;
    public static ItemStack fish;
    public static ItemMeta fishmeta;
    public static ItemStack z1v1;
    public static ItemMeta z1v1meta;
    public static ItemStack Rdm;
    public static ItemMeta Rdmmeta;
    public static ItemStack Evento;
    public static ItemMeta Eventometa;
    public static ItemStack Mdr;
    public static ItemMeta Mdrmeta;
    public static ItemStack livro;
    public static ItemMeta livrometa;
    
    public static List<String> Lore(final String string) {
        return null;
    }
    
    @EventHandler
    public void Execute(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory Inv = e.getInventory();
            Inv.getTitle().equalsIgnoreCase("§aEscolha a fps");
            if (e.getCurrentItem().isSimilar(FpsMenu.vidro)) {
                e.setCancelled(true);
                p.closeInventory();
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.amarelo)) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.verde)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kits");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.head)) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.azul)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/rank");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.vermelho)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/tag");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.vidro)) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.vidro1)) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.main)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/main");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.sumo)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/sumo");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.textura)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/textura");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.lava)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/challenge");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.Rdm)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/simulator");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.Mdr)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/simulator");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.Evento)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/fps");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.fps)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/menufps");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.fish)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/fisherman");
            }
            if (e.getCurrentItem().isSimilar(FpsMenu.z1v1)) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/1v1");
            }
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cVoce precisa ser um player");
            return true;
        }
        final Player p = (Player)sender;
        final Inventory warp = Bukkit.createInventory((InventoryHolder)p, 27, "§aEscolha a fps");
        FpsMenu.vidro1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)0);
        (FpsMenu.vidro1meta = FpsMenu.vidro1.getItemMeta()).setDisplayName("§f-");
        FpsMenu.vidro1.setItemMeta(FpsMenu.vidro1meta);
        FpsMenu.amarelo = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)4);
        (FpsMenu.amarelometa = FpsMenu.amarelo.getItemMeta()).setDisplayName("§e-");
        FpsMenu.amarelo.setItemMeta(FpsMenu.amarelometa);
        FpsMenu.verde = new ItemStack(Material.WOOL, 1, (short)5);
        (FpsMenu.verdemeta = FpsMenu.verde.getItemMeta()).setDisplayName("§aKits");
        FpsMenu.verde.setItemMeta(FpsMenu.verdemeta);
        FpsMenu.azul = new ItemStack(Material.WOOL, 1, (short)11);
        (FpsMenu.azulmeta = FpsMenu.azul.getItemMeta()).setDisplayName("§9Ranks");
        FpsMenu.azul.setItemMeta(FpsMenu.azulmeta);
        FpsMenu.head = new ItemStack(Material.CAKE);
        (FpsMenu.headmeta = FpsMenu.head.getItemMeta()).setDisplayName("§eWarps disnoniveis");
        FpsMenu.head.setItemMeta(FpsMenu.headmeta);
        FpsMenu.vermelho = new ItemStack(Material.WOOL, 1, (short)14);
        (FpsMenu.vermelhometa = FpsMenu.azul.getItemMeta()).setDisplayName("§cTags");
        FpsMenu.vermelho.setItemMeta(FpsMenu.vermelhometa);
        FpsMenu.arrow = new ItemStack(Material.getMaterial(351), 1, (short)8);
        (FpsMenu.arrowmeta = FpsMenu.arrow.getItemMeta()).setDisplayName("§7§lP\u00c1GINA ANTERIOR");
        FpsMenu.arrow.setItemMeta(FpsMenu.arrowmeta);
        FpsMenu.arrow2 = new ItemStack(Material.getMaterial(351), 1, (short)10);
        (FpsMenu.arrow2meta = FpsMenu.arrow2.getItemMeta()).setDisplayName("§a§lPROXINA P\u00c0GINA");
        FpsMenu.arrow2.setItemMeta(FpsMenu.arrow2meta);
        FpsMenu.vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)4);
        (FpsMenu.vidrometa = FpsMenu.vidro.getItemMeta()).setDisplayName("§e-");
        FpsMenu.vidro.setItemMeta(FpsMenu.vidrometa);
        FpsMenu.livro = new ItemStack(Material.BOOK);
        (FpsMenu.livrometa = FpsMenu.livro.getItemMeta()).setDisplayName("§aWarps");
        FpsMenu.livro.setItemMeta(FpsMenu.livrometa);
        FpsMenu.lava = new ItemStack(Material.LAVA_BUCKET);
        (FpsMenu.lavameta = FpsMenu.lava.getItemMeta()).setDisplayName("§eWarp §7- §fLava");
        FpsMenu.lava.setItemMeta(FpsMenu.lavameta);
        FpsMenu.textura = new ItemStack(Material.ITEM_FRAME);
        (FpsMenu.texturameta = FpsMenu.textura.getItemMeta()).setDisplayName("§eWarp §7- §fTextura");
        FpsMenu.textura.setItemMeta(FpsMenu.texturameta);
        FpsMenu.fps = new ItemStack(Material.GLASS);
        (FpsMenu.fpsmeta = FpsMenu.fps.getItemMeta()).setDisplayName("§eWarp §7- §fFPS");
        FpsMenu.fps.setItemMeta(FpsMenu.fpsmeta);
        FpsMenu.main = new ItemStack(Material.DIAMOND_CHESTPLATE);
        (FpsMenu.mainmeta = FpsMenu.main.getItemMeta()).setDisplayName("§eWarp §7- §fMain");
        FpsMenu.main.setItemMeta(FpsMenu.mainmeta);
        FpsMenu.sumo = new ItemStack(Material.APPLE);
        (FpsMenu.sumometa = FpsMenu.sumo.getItemMeta()).setDisplayName("§eWarp §7- §fSumo");
        FpsMenu.sumo.setItemMeta(FpsMenu.sumometa);
        FpsMenu.fish = new ItemStack(Material.IRON_BOOTS);
        (FpsMenu.fishmeta = FpsMenu.fish.getItemMeta()).setDisplayName("§eWarp §7- §fParkuor");
        FpsMenu.fish.setItemMeta(FpsMenu.fishmeta);
        FpsMenu.z1v1 = new ItemStack(Material.BLAZE_ROD);
        (FpsMenu.z1v1meta = FpsMenu.z1v1.getItemMeta()).setDisplayName("§eWarp §7- §f1v1");
        FpsMenu.z1v1.setItemMeta(FpsMenu.z1v1meta);
        FpsMenu.Rdm = new ItemStack(Material.getMaterial(58));
        (FpsMenu.Rdmmeta = FpsMenu.Rdm.getItemMeta()).setDisplayName("§eWarp §7- §fRdm");
        FpsMenu.Rdm.setItemMeta(FpsMenu.Rdmmeta);
        FpsMenu.Evento = new ItemStack(Material.IRON_CHESTPLATE);
        (FpsMenu.Eventometa = FpsMenu.Evento.getItemMeta()).setDisplayName("§eFps FullIron");
        FpsMenu.Evento.setItemMeta(FpsMenu.Eventometa);
        FpsMenu.Mdr = new ItemStack(Material.LEATHER_CHESTPLATE);
        (FpsMenu.Mdrmeta = FpsMenu.Mdr.getItemMeta()).setDisplayName("§6Fps Simulator");
        FpsMenu.Mdr.setItemMeta(FpsMenu.Mdrmeta);
        for (int i = 0; i != 27; ++i) {
            warp.setItem(0, FpsMenu.vidro1);
            warp.setItem(1, FpsMenu.vidro1);
            warp.setItem(2, FpsMenu.amarelo);
            warp.setItem(3, FpsMenu.amarelo);
            warp.setItem(4, FpsMenu.amarelo);
            warp.setItem(5, FpsMenu.amarelo);
            warp.setItem(6, FpsMenu.amarelo);
            warp.setItem(7, FpsMenu.vidro1);
            warp.setItem(8, FpsMenu.vidro1);
            warp.setItem(9, FpsMenu.vidro1);
            warp.setItem(10, FpsMenu.amarelo);
            warp.setItem(11, FpsMenu.amarelo);
            warp.setItem(12, FpsMenu.Mdr);
            warp.setItem(13, FpsMenu.vidro1);
            warp.setItem(14, FpsMenu.Evento);
            warp.setItem(15, FpsMenu.amarelo);
            warp.setItem(16, FpsMenu.amarelo);
            warp.setItem(17, FpsMenu.vidro1);
            warp.setItem(18, FpsMenu.vidro1);
            warp.setItem(19, FpsMenu.vidro1);
            warp.setItem(20, FpsMenu.amarelo);
            warp.setItem(21, FpsMenu.amarelo);
            warp.setItem(22, FpsMenu.amarelo);
            warp.setItem(23, FpsMenu.amarelo);
            warp.setItem(24, FpsMenu.amarelo);
            warp.setItem(25, FpsMenu.vidro1);
            warp.setItem(26, FpsMenu.vidro1);
        }
        p.openInventory(warp);
        return false;
    }
}
