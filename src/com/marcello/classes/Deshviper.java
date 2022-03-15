package com.marcello.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.utils.KitAPI;

public class Deshviper implements Listener {
	public int boost;
	public static ArrayList<String> viper;
	static ArrayList<String> fall;
	public static HashMap<String, ItemStack[]> Armadura;
	public HashMap<String, ItemStack[]> saveinv;
	public static HashMap<String, ItemStack[]> savearmor;
	public static HashMap<String, ItemStack[]> armadura;
	public static HashMap<String, ItemStack[]> Armadura2;
	public static List<Player> cooldownm;

	static {
		Deshviper.viper = new ArrayList<String>();
		Deshviper.fall = new ArrayList<String>();
		Deshviper.Armadura = new HashMap<String, ItemStack[]>();
		Deshviper.savearmor = new HashMap<String, ItemStack[]>();
		Deshviper.armadura = new HashMap<String, ItemStack[]>();
		Deshviper.Armadura2 = new HashMap<String, ItemStack[]>();
		Deshviper.cooldownm = new ArrayList<Player>();
	}

	public Deshviper() {
		this.boost = 6;
		this.saveinv = new HashMap<String, ItemStack[]>();
	}

	@EventHandler
	public void DeshClick(final PlayerInteractEvent event) {
		final Player p = event.getPlayer();
		if (event.getPlayer().getItemInHand().getType() == Material.EMERALD_BLOCK && KitAPI.getKit(p) == "Deshviper") {
			if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK
					|| event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
				event.setCancelled(true);
			}
			if (Deshviper.cooldownm.contains(p)) {
				p.sendMessage("�c�lKIT �7Seu kit �4�lDESHVIPER�7 est\u00e1 em cooldown aguarde alguns segundos");
				return;
			}
			Deshviper.cooldownm.add(p);
			Deshviper.fall.add(p.getName());
			p.setVelocity(p.getEyeLocation().getDirection().multiply(this.boost).add(new Vector(0, 0, 0)));
			p.getPlayer().getWorld().playEffect(p.getPlayer().getLocation(), Effect.SMOKE, 10, 0);
			for (final Entity pertos : p.getNearbyEntities(8.0, 8.0, 8.0)) {
				if (pertos instanceof Player) {
					((Player) pertos).damage(7.0);
					pertos.setVelocity(new Vector(0.1, 0.0, 0.1));
					((Player) pertos).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 2), true);
				}
			}
			final ItemStack Capacete = new ItemStack(Material.LEATHER_HELMET);
			final LeatherArmorMeta kCapacete = (LeatherArmorMeta) Capacete.getItemMeta();
			kCapacete.setColor(Color.GREEN);
			Capacete.setItemMeta((ItemMeta) kCapacete);
			final ItemStack Peitoral = new ItemStack(Material.LEATHER_CHESTPLATE);
			final LeatherArmorMeta kPeitoral = (LeatherArmorMeta) Peitoral.getItemMeta();
			kPeitoral.setColor(Color.GREEN);
			Peitoral.setItemMeta((ItemMeta) kPeitoral);
			final ItemStack Calss = new ItemStack(Material.LEATHER_LEGGINGS);
			final LeatherArmorMeta kCalss = (LeatherArmorMeta) Calss.getItemMeta();
			kCalss.setColor(Color.GREEN);
			Calss.setItemMeta((ItemMeta) kCalss);
			final ItemStack Bota = new ItemStack(Material.LEATHER_BOOTS);
			final LeatherArmorMeta kBota = (LeatherArmorMeta) Capacete.getItemMeta();
			kBota.setColor(Color.GREEN);
			Bota.setItemMeta((ItemMeta) kBota);
			Deshviper.Armadura.put(p.getName(), p.getInventory().getArmorContents());
			p.getInventory().setHelmet(Capacete);
			p.getInventory().setChestplate(Peitoral);
			p.getInventory().setLeggings(Calss);
			p.getInventory().setBoots(Bota);
			p.updateInventory();
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
						}
					}, 0L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
						}
					}, 20L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
						}
					}, 30L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
						}
					}, 40L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
						}
					}, 50L);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							p.updateInventory();
							Deshviper.fall.remove(p.getName());
							p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
							p.getInventory().setHelmet(new ItemStack(Material.AIR));
							final ItemStack peito = new ItemStack(Material.LEATHER_CHESTPLATE);
							final LeatherArmorMeta kpeito = (LeatherArmorMeta) peito.getItemMeta();
							kpeito.setColor(Color.PURPLE);
							peito.setItemMeta((ItemMeta) kpeito);
							p.getInventory().setChestplate(peito);
							p.getInventory().setLeggings(new ItemStack(Material.AIR));
							p.getInventory().setBoots(new ItemStack(Material.AIR));
						}
					}, 60L);
			Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(), (Runnable) new Runnable() {
				@Override
				public void run() {
					Deshviper.cooldownm.remove(p);
					Deshviper.viper.remove(p.getName());
				}
			}, 700L);
		}
	}

	@EventHandler
	public void AiMeuCuv5(final EntityDamageEvent e) {
		if (!(e.getEntity() instanceof Player)) {
			return;
		}
		final Player p = (Player) e.getEntity();
		if (e.getCause() == EntityDamageEvent.DamageCause.FALL && Deshviper.fall.contains(p.getName())) {
			Deshviper.fall.remove(p.getName());
			e.setDamage(6.5);
		}
	}
}
