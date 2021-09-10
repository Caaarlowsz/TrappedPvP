package com.marcello.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.marcello.classes.Kangaroo;
import com.marcello.classes.TimeLord;
import com.marcello.score.Score;
import com.marcello.utils.KitAPI;

public class RespawnEvent implements Listener {
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack warps;
	public static ItemStack perfil;
	public static ItemMeta perfilmeta;
	public static ItemMeta warpsmeta;
	public static ItemStack click;
	public static ItemMeta clickmeta;
	public static ItemStack parkour;
	public static ItemMeta parkourmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	public static ItemStack admins;
	public static ItemMeta adminsmeta;

	@EventHandler
	public void Respawnar(final PlayerRespawnEvent e) {
		final Player p = e.getPlayer();
		if (Kangaroo.KangarroStats.containsKey(p.getName())) {
			Kangaroo.KangarroStats.remove(p.getName());
			Score.setScore(p);
		}
		KitAPI.RemoveKit(p);
		p.setLevel(0);
		p.getInventory().clear();
		KitAPI.KitDelay.remove(p.getName());
		TimeLord.freeze.remove(p.getName());
		RespawnEvent.kits = new ItemStack(Material.CHEST);
		(RespawnEvent.kitsmeta = RespawnEvent.kits.getItemMeta()).setDisplayName("§bKits §7(Clique)");
		RespawnEvent.kits.setItemMeta(RespawnEvent.kitsmeta);
		RespawnEvent.admins = new ItemStack(Material.getMaterial(397), 1, (short) 3);
		(RespawnEvent.adminsmeta = RespawnEvent.admins.getItemMeta()).setDisplayName("§bUltils §7(Clique)");
		RespawnEvent.admins.setItemMeta(RespawnEvent.adminsmeta);
		RespawnEvent.warps = new ItemStack(Material.BOOK);
		(RespawnEvent.warpsmeta = RespawnEvent.warps.getItemMeta()).setDisplayName("§bWarps §7(Clique)");
		RespawnEvent.warps.setItemMeta(RespawnEvent.warpsmeta);
		RespawnEvent.click = new ItemStack(Material.PAPER);
		(RespawnEvent.clickmeta = RespawnEvent.click.getItemMeta()).setDisplayName("§bClick §7(Clique)");
		RespawnEvent.click.setItemMeta(RespawnEvent.clickmeta);
		RespawnEvent.loja = new ItemStack(Material.DIAMOND);
		(RespawnEvent.lojameta = RespawnEvent.loja.getItemMeta()).setDisplayName("§bLoja §7(Clique)");
		RespawnEvent.loja.setItemMeta(RespawnEvent.lojameta);
		RespawnEvent.perfil = new ItemStack(Material.ANVIL);
		(RespawnEvent.perfilmeta = RespawnEvent.perfil.getItemMeta()).setDisplayName("§bPerfil §7(Clique)");
		RespawnEvent.perfil.setItemMeta(RespawnEvent.perfilmeta);
		p.getInventory().setItem(1, RespawnEvent.loja);
		p.getInventory().setItem(5, RespawnEvent.warps);
		p.getInventory().setItem(3, RespawnEvent.kits);
		p.getInventory().setItem(7, RespawnEvent.click);
		p.updateInventory();
		p.setGameMode(GameMode.SURVIVAL);
	}
}
