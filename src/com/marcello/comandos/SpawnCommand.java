package com.marcello.comandos;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.score.Score;
import com.marcello.utils.KitAPI;
import com.marcello.utils.WarpsAPI;

public class SpawnCommand extends WarpsAPI implements CommandExecutor {
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	public static ItemStack click;
	public static ItemMeta clickmeta;
	public static ItemStack perfil;
	public static ItemMeta perfilmeta;
	public static ItemStack parkour;
	public static ItemMeta parkourmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	public static ItemStack admins;
	public static ItemMeta adminsmeta;

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("�cVoc\u00ea N\u00e3o Pode usar isso No Console!");
			return true;
		}
		final Player p = (Player) sender;
		if (args.length == 0) {
			SpawnCommand.segundos.add(p.getName());
			p.sendMessage("�2�LWARP �7Teleportando para o spawn em �a3 �7segundos");
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 250, 50));
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 250, 50));
			Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(), (Runnable) new Runnable() {
				@Override
				public void run() {
					if (SpawnCommand.segundos.contains(p.getName())) {
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("  ");
						p.sendMessage("�2�LWARP �7Voc\u00ea foi teleportado para o �a�lSPAWN");
						WarpsAPI.ir(p, "spawn");
						p.setLevel(0);
						SpawnCommand.segundos.remove(p.getName());
						KitAPI.KitDelay.remove(p.getName());
						KitAPI.RemoveKit(p);
						Score.setScore(p);
						p.getInventory().clear();
						p.getInventory().setHelmet(new ItemStack(Material.AIR));
						p.getInventory().setChestplate(new ItemStack(Material.AIR));
						p.getInventory().setLeggings(new ItemStack(Material.AIR));
						p.getInventory().setBoots(new ItemStack(Material.AIR));
						for (final PotionEffect effect : p.getActivePotionEffects()) {
							p.removePotionEffect(effect.getType());
							p.setHealth(20);
							SpawnCommand.kits = new ItemStack(Material.CHEST);
							(SpawnCommand.kitsmeta = SpawnCommand.kits.getItemMeta())
									.setDisplayName("�bKits �7(Clique)");
							SpawnCommand.kits.setItemMeta(SpawnCommand.kitsmeta);
							SpawnCommand.admins = new ItemStack(Material.getMaterial(397), 1, (short) 3);
							(SpawnCommand.adminsmeta = SpawnCommand.admins.getItemMeta())
									.setDisplayName("�bUltils �7(Clique)");
							SpawnCommand.admins.setItemMeta(SpawnCommand.adminsmeta);
							SpawnCommand.warps = new ItemStack(Material.BOOK);
							(SpawnCommand.warpsmeta = SpawnCommand.warps.getItemMeta())
									.setDisplayName("�bWarps �7(Clique)");
							SpawnCommand.warps.setItemMeta(SpawnCommand.warpsmeta);
							SpawnCommand.click = new ItemStack(Material.PAPER);
							(SpawnCommand.clickmeta = SpawnCommand.click.getItemMeta())
									.setDisplayName("�bClick �7(Clique)");
							SpawnCommand.click.setItemMeta(SpawnCommand.clickmeta);
							SpawnCommand.loja = new ItemStack(Material.DIAMOND);
							(SpawnCommand.lojameta = SpawnCommand.loja.getItemMeta())
									.setDisplayName("�bLoja �7(Clique)");
							SpawnCommand.loja.setItemMeta(SpawnCommand.lojameta);
							SpawnCommand.perfil = new ItemStack(Material.ANVIL);
							(SpawnCommand.perfilmeta = SpawnCommand.perfil.getItemMeta())
									.setDisplayName("�bPerfil �7(Clique)");
							SpawnCommand.perfil.setItemMeta(SpawnCommand.perfilmeta);
							p.getInventory().setItem(1, SpawnCommand.loja);
							p.getInventory().setItem(5, SpawnCommand.warps);
							p.getInventory().setItem(3, SpawnCommand.kits);
							p.getInventory().setItem(7, SpawnCommand.click);
							p.updateInventory();
						}
					}
				}
			}, 100L);
		} else if (args[0].equalsIgnoreCase("set") && p.hasPermission("cmd.setarenas")) {
			WarpsAPI.Set(p, "spawn");
			p.sendMessage("�2�LWARP �7Voc\u00ea setou a warp �a�lSPAWN");
		}
		return false;
	}

	protected List<String> Lore(final String string) {
		return null;
	}
}
