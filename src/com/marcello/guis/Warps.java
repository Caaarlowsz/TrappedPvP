package com.marcello.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.marcello.utils.WarpsAPI;

public class Warps implements Listener, CommandExecutor {
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
	public static ItemStack gladiator;
	public static ItemMeta gladiatormeta;

	@EventHandler
	public void Clicar(final PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
				&& p.getItemInHand().getType() == Material.BOOK
				&& p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bWarps §7(Clique)")) {
			p.chat("/warps");
		}
	}

	public static int getQuantidate(final String warp) {
		int quantidade = 0;
		Player[] onlinePlayers;
		for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
			final Player p = onlinePlayers[i];
			if (WarpsAPI.getWarp(p).equalsIgnoreCase(warp)) {
				++quantidade;
			}
		}
		return quantidade;
	}

	@EventHandler
	public void Execute(final InventoryClickEvent e) {
		if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
			final Player p = (Player) e.getWhoClicked();
			final Inventory Inv = e.getInventory();
			Inv.getTitle().equalsIgnoreCase("§aWarps");
			if (e.getCurrentItem().isSimilar(Warps.vidro)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(Warps.amarelo)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/warps");
			}
			if (e.getCurrentItem().isSimilar(Warps.verde)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kits");
			}
			if (e.getCurrentItem().isSimilar(Warps.head)) {
				e.setCancelled(true);
			}
			if (e.getCurrentItem().isSimilar(Warps.azul)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/rank");
			}
			if (e.getCurrentItem().isSimilar(Warps.vermelho)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/tag");
			}
			if (e.getCurrentItem().isSimilar(Warps.vidro)) {
				e.setCancelled(true);
			}
			if (e.getCurrentItem().isSimilar(Warps.vidro1)) {
				e.setCancelled(true);
			}
			if (e.getCurrentItem().isSimilar(Warps.main)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/main");
			}
			if (e.getCurrentItem().isSimilar(Warps.sumo)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/sumo");
			}
			if (e.getCurrentItem().isSimilar(Warps.textura)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/textura");
			}
			if (e.getCurrentItem().isSimilar(Warps.lava)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/challenge");
			}
			if (e.getCurrentItem().isSimilar(Warps.Rdm)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§4§lERRO §7Est\u00e1 warp ser\u00e1 adicionada em breve");
			}
			if (e.getCurrentItem().isSimilar(Warps.Mdr)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§4§lERRO §7Est\u00e1 warp ser\u00e1 adicionada em breve");
			}
			if (e.getCurrentItem().isSimilar(Warps.Evento)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/evento");
			}
			if (e.getCurrentItem().isSimilar(Warps.fps)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/menufps");
			}
			if (e.getCurrentItem().isSimilar(Warps.fish)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/fisherman");
			}
			if (e.getCurrentItem().isSimilar(Warps.gladiator)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/gladiator");
			}
			if (e.getCurrentItem().isSimilar(Warps.z1v1)) {
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
		final Player p = (Player) sender;
		final Inventory warp = Bukkit.createInventory((InventoryHolder) p, 54, "§aWarps");
		Warps.vidro1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 0);
		(Warps.vidro1meta = Warps.vidro1.getItemMeta()).setDisplayName("§f-");
		Warps.vidro1.setItemMeta(Warps.vidro1meta);
		Warps.amarelo = new ItemStack(Material.WOOL, 1, (short) 4);
		(Warps.amarelometa = Warps.amarelo.getItemMeta()).setDisplayName("§eWarps");
		Warps.amarelo.setItemMeta(Warps.amarelometa);
		Warps.verde = new ItemStack(Material.WOOL, 1, (short) 5);
		(Warps.verdemeta = Warps.verde.getItemMeta()).setDisplayName("§aKits");
		Warps.verde.setItemMeta(Warps.verdemeta);
		Warps.azul = new ItemStack(Material.WOOL, 1, (short) 11);
		(Warps.azulmeta = Warps.azul.getItemMeta()).setDisplayName("§9Ranks");
		Warps.azul.setItemMeta(Warps.azulmeta);
		Warps.head = new ItemStack(Material.CAKE);
		(Warps.headmeta = Warps.head.getItemMeta()).setDisplayName("§eWarps disnoniveis");
		Warps.head.setItemMeta(Warps.headmeta);
		Warps.vermelho = new ItemStack(Material.WOOL, 1, (short) 14);
		(Warps.vermelhometa = Warps.azul.getItemMeta()).setDisplayName("§cTags");
		Warps.vermelho.setItemMeta(Warps.vermelhometa);
		Warps.arrow = new ItemStack(Material.getMaterial(351), 1, (short) 8);
		(Warps.arrowmeta = Warps.arrow.getItemMeta()).setDisplayName("§7§lP\ufffd?GINA ANTERIOR");
		Warps.arrow.setItemMeta(Warps.arrowmeta);
		Warps.arrow2 = new ItemStack(Material.getMaterial(351), 1, (short) 10);
		(Warps.arrow2meta = Warps.arrow2.getItemMeta()).setDisplayName("§a§lPROXINA P\u00c0GINA");
		Warps.arrow2.setItemMeta(Warps.arrow2meta);
		Warps.vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
		(Warps.vidrometa = Warps.vidro.getItemMeta()).setDisplayName("§e-");
		Warps.vidro.setItemMeta(Warps.vidrometa);
		Warps.livro = new ItemStack(Material.BOOK);
		(Warps.livrometa = Warps.livro.getItemMeta()).setDisplayName("§aWarps");
		Warps.livro.setItemMeta(Warps.livrometa);
		Warps.lava = new ItemStack(Material.LAVA_BUCKET);
		(Warps.lavameta = Warps.lava.getItemMeta()).setDisplayName("§eWarp §7- §fLava");
		Warps.lava.setItemMeta(Warps.lavameta);
		Warps.textura = new ItemStack(Material.ITEM_FRAME);
		(Warps.texturameta = Warps.textura.getItemMeta()).setDisplayName("§eWarp §7- §fTextura");
		Warps.textura.setItemMeta(Warps.texturameta);
		Warps.fps = new ItemStack(Material.GLASS);
		(Warps.fpsmeta = Warps.fps.getItemMeta()).setDisplayName("§eWarp §7- §fFPS");
		Warps.fps.setItemMeta(Warps.fpsmeta);
		Warps.main = new ItemStack(Material.DIAMOND_CHESTPLATE);
		(Warps.mainmeta = Warps.main.getItemMeta()).setDisplayName("§eWarp §7- §fMain");
		Warps.main.setItemMeta(Warps.mainmeta);
		Warps.sumo = new ItemStack(Material.APPLE);
		(Warps.sumometa = Warps.sumo.getItemMeta()).setDisplayName("§eWarp §7- §fSumo");
		Warps.sumo.setItemMeta(Warps.sumometa);
		Warps.fish = new ItemStack(Material.IRON_BOOTS);
		(Warps.fishmeta = Warps.fish.getItemMeta()).setDisplayName("§eWarp §7- §fParkuor");
		Warps.fish.setItemMeta(Warps.fishmeta);
		Warps.z1v1 = new ItemStack(Material.BLAZE_ROD);
		(Warps.z1v1meta = Warps.z1v1.getItemMeta()).setDisplayName("§eWarp §7- §f1v1");
		Warps.z1v1.setItemMeta(Warps.z1v1meta);
		Warps.Rdm = new ItemStack(Material.getMaterial(58));
		(Warps.Rdmmeta = Warps.Rdm.getItemMeta()).setDisplayName("§eWarp §7- §fRdm");
		Warps.Rdm.setItemMeta(Warps.Rdmmeta);
		Warps.Evento = new ItemStack(Material.BEDROCK);
		(Warps.Eventometa = Warps.Evento.getItemMeta()).setDisplayName("§eWarp §7- §fEvento");
		Warps.Evento.setItemMeta(Warps.Eventometa);
		Warps.Mdr = new ItemStack(Material.CAKE);
		(Warps.Mdrmeta = Warps.Mdr.getItemMeta()).setDisplayName("§eWarp §7- §fMdr");
		Warps.Mdr.setItemMeta(Warps.Mdrmeta);
		Warps.gladiator = new ItemStack(Material.IRON_FENCE);
		(Warps.gladiatormeta = Warps.gladiator.getItemMeta()).setDisplayName("§eWarp §7- §fGladiator");
		Warps.gladiator.setItemMeta(Warps.gladiatormeta);
		for (int i = 0; i != 54; ++i) {
			warp.setItem(0, Warps.arrow);
			warp.setItem(2, Warps.amarelo);
			warp.setItem(3, Warps.verde);
			warp.setItem(4, Warps.head);
			warp.setItem(5, Warps.azul);
			warp.setItem(6, Warps.vermelho);
			warp.setItem(8, Warps.arrow2);
			warp.setItem(9, Warps.vidro);
			warp.setItem(10, Warps.vidro);
			warp.setItem(11, Warps.vidro);
			warp.setItem(12, Warps.vidro);
			warp.setItem(13, Warps.vidro);
			warp.setItem(14, Warps.vidro);
			warp.setItem(15, Warps.vidro);
			warp.setItem(16, Warps.vidro);
			warp.setItem(17, Warps.vidro);
			warp.setItem(22, Warps.gladiator);
			warp.setItem(28, Warps.fps);
			warp.setItem(29, Warps.lava);
			warp.setItem(30, Warps.z1v1);
			warp.setItem(31, Warps.textura);
			warp.setItem(32, Warps.fish);
			warp.setItem(33, Warps.main);
			warp.setItem(34, Warps.sumo);
			warp.setItem(39, Warps.Rdm);
			warp.setItem(40, Warps.Evento);
			warp.setItem(41, Warps.Mdr);
		}
		p.openInventory(warp);
		return false;
	}
}
