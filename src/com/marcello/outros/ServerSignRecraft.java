package com.marcello.outros;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ServerSignRecraft implements Listener {
	@EventHandler
	public void Escrever(final SignChangeEvent e) {
		final Player p = e.getPlayer();
		if (p.hasPermission("placa.recraft") && e.getLine(0).equalsIgnoreCase("recraft")) {
			e.setLine(0, "§b§lTRAPPED");
			e.setLine(2, "§eRecraft");
			e.setLine(3, "§7(Clique)");
			p.sendMessage("§E§LRECRAFT §7A placa foi criada com sucesso");
		}
	}

	@EventHandler
	public void Inv(final PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				&& ((e.getClickedBlock() != null && e.getClickedBlock().getType() == Material.WALL_SIGN)
						|| e.getClickedBlock().getType() == Material.SIGN_POST)) {
			final Sign s = (Sign) e.getClickedBlock().getState();
			final String[] lines = s.getLines();
			if (lines.length > 0 && lines[0].equals("§b§lTRAPPED") && lines.length > 2 && lines[2].equals("§eRecraft")
					&& lines.length > 3 && lines[3].equals("§7(Clique)")) {
				final Inventory inv = Bukkit.createInventory((InventoryHolder) p, 27, "§b§lTRAPPED §7Recraft");
				final ItemStack cogu1 = new ItemStack(Material.RED_MUSHROOM, 64);
				final ItemMeta cogu1meta = cogu1.getItemMeta();
				cogu1.setItemMeta(cogu1meta);
				final ItemStack cogu2 = new ItemStack(Material.BROWN_MUSHROOM, 64);
				final ItemMeta cogu2meta = cogu2.getItemMeta();
				cogu2.setItemMeta(cogu2meta);
				final ItemStack potes = new ItemStack(Material.BOWL, 64);
				final ItemMeta potesmeta = potes.getItemMeta();
				potes.setItemMeta(potesmeta);
				for (int i = 0; i != 9; ++i) {
					inv.setItem(i, cogu1);
				}
				for (int i = 9; i != 18; ++i) {
					inv.setItem(i, cogu2);
				}
				for (int i = 18; i != 27; ++i) {
					inv.setItem(i, potes);
				}
				p.openInventory(inv);
			}
		}
	}
}
