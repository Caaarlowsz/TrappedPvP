package com.marcello.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.score.Score;
import com.marcello.utils.KitAPI;
import com.marcello.utils.WarpsAPI;

public class JoinEvent implements Listener {
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack perfil;
	public static ItemMeta perfilmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	public static ItemStack admins;
	public static ItemMeta adminsmeta;
	public static ItemStack click;
	public static ItemMeta clickmeta;

	@EventHandler
	public void Entrar(final PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		p.setGameMode(GameMode.SURVIVAL);
		WarpsAPI.ir(p, "spawn");
		if (!TrappedPvP.getInstace().stats.contains(new StringBuilder().append(p.getUniqueId()).toString())) {
			TrappedPvP.getInstace().stats.set(p.getUniqueId() + ".Kills", (Object) 0);
			TrappedPvP.getInstace().stats.set(p.getUniqueId() + ".Deaths", (Object) 0);
			TrappedPvP.getInstace().stats.set(p.getUniqueId() + ".Money", (Object) 0);
			TrappedPvP.getInstace().stats.set(p.getUniqueId() + ".Cash", (Object) 0);
			p.kickPlayer("         �cEstamos gerando suas informa\u00e7\u00f5es, por favor, entre novamente!");
			TrappedPvP.getInstace().save();
		}
		KitAPI.KitDelay.remove(p.getName());
		e.setJoinMessage((String) null);
		p.getInventory().clear();
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		p.setLevel(0);
		Score.setScore(p);
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("�7Seja bem vindo ao servidor �c�lReverse�f�lMC");
		p.sendMessage("�7Achou algum hacker ou bug? /report.");
		JoinEvent.kits = new ItemStack(Material.CHEST);
		(JoinEvent.kitsmeta = JoinEvent.kits.getItemMeta()).setDisplayName("�bKits �7(Clique)");
		JoinEvent.kits.setItemMeta(JoinEvent.kitsmeta);
		JoinEvent.admins = new ItemStack(Material.getMaterial(397), 1, (short) 3);
		(JoinEvent.adminsmeta = JoinEvent.admins.getItemMeta()).setDisplayName("�bUltils �7(Clique)");
		JoinEvent.admins.setItemMeta(JoinEvent.adminsmeta);
		JoinEvent.warps = new ItemStack(Material.BOOK);
		(JoinEvent.warpsmeta = JoinEvent.warps.getItemMeta()).setDisplayName("�bWarps �7(Clique)");
		JoinEvent.warps.setItemMeta(JoinEvent.warpsmeta);
		JoinEvent.click = new ItemStack(Material.PAPER);
		(JoinEvent.clickmeta = JoinEvent.click.getItemMeta()).setDisplayName("�bClick �7(Clique)");
		JoinEvent.click.setItemMeta(JoinEvent.clickmeta);
		JoinEvent.loja = new ItemStack(Material.DIAMOND);
		(JoinEvent.lojameta = JoinEvent.loja.getItemMeta()).setDisplayName("�bLoja �7(Clique)");
		JoinEvent.loja.setItemMeta(JoinEvent.lojameta);
		JoinEvent.perfil = new ItemStack(Material.ANVIL);
		(JoinEvent.perfilmeta = JoinEvent.perfil.getItemMeta()).setDisplayName("�bPerfil �7(Clique)");
		JoinEvent.perfil.setItemMeta(JoinEvent.perfilmeta);
		p.getInventory().setItem(1, JoinEvent.loja);
		p.getInventory().setItem(5, JoinEvent.warps);
		p.getInventory().setItem(3, JoinEvent.kits);
		p.getInventory().setItem(7, JoinEvent.click);
		p.updateInventory();
	}
}
