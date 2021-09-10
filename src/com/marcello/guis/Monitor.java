package com.marcello.guis;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Monitor implements Listener, CommandExecutor {
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	public static ItemStack close;
	public static ItemMeta closemeta;
	public static ItemStack adminmode;
	public static ItemMeta adminmodemeta;
	public static ItemStack monitor;
	public static ItemMeta monitormeta;
	public static ItemStack vis;
	public static ItemMeta vismeta;

	public static List<String> Lore(final String string) {
		return null;
	}

	@EventHandler
	public void Execute(final InventoryClickEvent e) {
		if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
			final Player p = (Player) e.getWhoClicked();
			final Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§cAdmins - Monitor")) {
				if (e.getCurrentItem().isSimilar(Monitor.vidro)) {
					e.setCancelled(true);
					p.closeInventory();
				}
				if (e.getCurrentItem().isSimilar(Monitor.vidro)) {
					e.setCancelled(true);
					p.closeInventory();
				}
				if (e.getCurrentItem().isSimilar(Monitor.livro)) {
					e.setCancelled(true);
					p.closeInventory();
				}
				if (e.getCurrentItem().isSimilar(Monitor.vis)) {
					e.setCancelled(true);
					p.closeInventory();
					p.chat("/monitorar on");
				}
				if (e.getCurrentItem().isSimilar(Monitor.monitor)) {
					e.setCancelled(true);
					p.closeInventory();
					p.chat("/monitorar off");
				}
				if (e.getCurrentItem().isSimilar(Monitor.close)) {
					e.setCancelled(true);
					p.closeInventory();
					p.sendMessage("§cInvent\u00e1rio de §FMONITOR§c Fechado!");
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
		final Inventory warp = Bukkit.createInventory((InventoryHolder) p, 54, "§cAdmins - Monitor");
		Monitor.livro = new ItemStack(Material.BOOK);
		(Monitor.livrometa = Monitor.livro.getItemMeta()).setDisplayName("§c§lMONITOR");
		Monitor.livro.setItemMeta(Monitor.livrometa);
		Monitor.monitor = new ItemStack(Material.getMaterial(351), 1, (short) 8);
		(Monitor.monitormeta = Monitor.monitor.getItemMeta()).setDisplayName("§c§lDESATIVAR MODO MONITOR");
		Monitor.monitor.setItemMeta(Monitor.monitormeta);
		Monitor.vis = new ItemStack(Material.getMaterial(351), 1, (short) 10);
		(Monitor.vismeta = Monitor.vis.getItemMeta()).setDisplayName("§a§lATIVAR MODO MONITOR");
		Monitor.vis.setItemMeta(Monitor.vismeta);
		Monitor.close = new ItemStack(Material.REDSTONE);
		(Monitor.closemeta = Monitor.close.getItemMeta()).setDisplayName("§c§lFECHAR");
		Monitor.close.setItemMeta(Monitor.closemeta);
		for (int i = 0; i != 54; ++i) {
			warp.setItem(13, Monitor.livro);
			warp.setItem(21, Monitor.vis);
			warp.setItem(23, Monitor.monitor);
		}
		p.openInventory(warp);
		return false;
	}
}
