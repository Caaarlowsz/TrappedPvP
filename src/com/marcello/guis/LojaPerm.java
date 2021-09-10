package com.marcello.guis;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
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

import com.marcello.utils.KillsDeathsMoney;

public class LojaPerm implements Listener, CommandExecutor {
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack vidro1;
	public static ItemMeta vidro1meta;
	public static ItemStack fps;
	public static ItemMeta fpsmeta;
	public static ItemStack main;
	public static ItemMeta mainmeta;
	public static ItemStack prisma;
	public static ItemMeta prismameta;
	public static ItemStack sumo;
	public static ItemMeta sumometa;
	public static ItemStack close;
	public static ItemMeta closemeta;
	public static ItemStack cor;
	public static ItemMeta cormeta;
	public static ItemStack livro;
	public static ItemMeta livrometa;

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
		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
				&& p.getItemInHand().getType() == Material.DIAMOND
				&& p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bLoja §7(Clique)")) {
			p.chat("/lojaperm");
		}
	}

	@EventHandler
	public void warps(final InventoryClickEvent e) {
		if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
			final Inventory inv = e.getInventory();
			final Player p = (Player) e.getWhoClicked();
			if (inv.getTitle().equals("§5Perm")) {
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 5.0f, 5.0f);
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(LojaPerm.close)) {
				p.chat("/ultils");
			}
			if (e.getCurrentItem().isSimilar(LojaPerm.main)) {
				p.closeInventory();
				p.sendMessage("§b§lSTORE §7Este Item sera adicionado em breve");
			}
			if (e.getCurrentItem().isSimilar(LojaPerm.cor)) {
				if (KillsDeathsMoney.getMoney(p) >= 10000) {
					KillsDeathsMoney.removermoney(p, 10000);
					Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
							"pex user " + p.getName() + " add chat.cor");
					p.sendMessage("§b§lSTORE §7Permiss\u00e3o adquirida com sucesso aproveite");
					p.closeInventory();
				} else if (KillsDeathsMoney.getMoney(p) < 10000) {
					p.sendMessage("§b§lSTORE §7Voc\u00ea n\u00e3o possui §b§l10.000 §7para comprar este item");
					p.closeInventory();
				}
			}
			if (e.getCurrentItem().isSimilar(LojaPerm.prisma)) {
				if (KillsDeathsMoney.getMoney(p) >= 15000) {
					KillsDeathsMoney.removermoney(p, 15000);
					Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
							"pex user " + p.getName() + " add tag.reverse");
					p.sendMessage("§b§lSTORE §7Tag adquirida com sucesso aproveite");
					p.closeInventory();
				} else if (KillsDeathsMoney.getMoney(p) < 15000) {
					p.sendMessage("§b§lSTORE §7Voc\u00ea n\u00e3o possui §b§l15.000 §7para comprar este item");
					p.closeInventory();
				}
			}
		}
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoce precisa ser um player");
			return true;
		}
		final Player p = (Player) sender;
		final Inventory warp = Bukkit.createInventory((InventoryHolder) p, 27, "§5Perm");
		LojaPerm.vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
		(LojaPerm.vidrometa = LojaPerm.vidro.getItemMeta()).setDisplayName("§aWarps");
		LojaPerm.vidro.setItemMeta(LojaPerm.vidrometa);
		LojaPerm.livro = new ItemStack(Material.BOOK);
		(LojaPerm.livrometa = LojaPerm.livro.getItemMeta()).setDisplayName("§aWarps");
		LojaPerm.livro.setItemMeta(LojaPerm.livrometa);
		LojaPerm.prisma = new ItemStack(Material.NAME_TAG);
		(LojaPerm.prismameta = LojaPerm.prisma.getItemMeta()).setDisplayName("§7Tag §f- §c§lREVERSE");
		LojaPerm.prismameta.setLore(Lore("§7» §b§l15.000 §7Coins"));
		LojaPerm.prisma.setItemMeta(LojaPerm.prismameta);
		LojaPerm.fps = new ItemStack(Material.GLASS);
		(LojaPerm.fpsmeta = LojaPerm.fps.getItemMeta()).setDisplayName("§5Warp §f- §7FPS");
		LojaPerm.fps.setItemMeta(LojaPerm.fpsmeta);
		LojaPerm.main = new ItemStack(Material.DIAMOND_CHESTPLATE);
		(LojaPerm.mainmeta = LojaPerm.main.getItemMeta()).setDisplayName("§5Em breve...");
		LojaPerm.mainmeta.setLore(Lore("§5Isso ser\u00e1 adicionado em breve."));
		LojaPerm.main.setItemMeta(LojaPerm.mainmeta);
		LojaPerm.sumo = new ItemStack(Material.STICK);
		(LojaPerm.sumometa = LojaPerm.sumo.getItemMeta()).setDisplayName("§5Warp §f- §7Sumo");
		LojaPerm.sumo.setItemMeta(LojaPerm.sumometa);
		LojaPerm.close = new ItemStack(Material.REDSTONE);
		(LojaPerm.closemeta = LojaPerm.close.getItemMeta()).setDisplayName("§c§lVOLTAR");
		LojaPerm.close.setItemMeta(LojaPerm.closemeta);
		LojaPerm.closemeta.setLore(Lore("§7Feche o menu"));
		LojaPerm.cor = new ItemStack(Material.COOKIE);
		(LojaPerm.cormeta = LojaPerm.cor.getItemMeta()).setDisplayName("§7Falar §f- §cC§fo§9l§ao§0r§4i§1d§3o");
		LojaPerm.cormeta.setLore(Lore("§7» §b§l10.000 §7Coins"));
		LojaPerm.cor.setItemMeta(LojaPerm.cormeta);
		for (int i = 0; i != 27; ++i) {
			warp.setItem(11, LojaPerm.cor);
			warp.setItem(13, LojaPerm.prisma);
			warp.setItem(15, LojaPerm.main);
		}
		p.openInventory(warp);
		return false;
	}
}
