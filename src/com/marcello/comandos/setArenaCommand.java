package com.marcello.comandos;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.marcello.Main;

public class setArenaCommand implements Listener, CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
			return true;
		}
		final Player p = (Player) sender;
		if (p.hasPermission("cmd.setarenas") && label.equalsIgnoreCase("setarena")) {
			if (args.length == 0) {
				p.sendMessage("§a§lSETARENA §7Utilize o comando §a/setarena (1-10)");
				return true;
			}
			if (args[0].equalsIgnoreCase("1")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a1");
				Main.getInstace().arenas.set("arena1.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena1.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena1.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena1.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena1.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena1.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("2")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a2");
				Main.getInstace().arenas.set("arena2.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena2.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena2.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena2.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena2.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena2.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("3")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a3");
				Main.getInstace().arenas.set("arena3.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena3.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena3.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena3.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena3.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena3.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("4")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a4");
				Main.getInstace().arenas.set("arena4.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena4.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena4.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena4.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena4.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena4.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("5")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a5");
				Main.getInstace().arenas.set("arena5.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena5.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena5.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena5.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena5.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena5.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("6")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a6");
				Main.getInstace().arenas.set("arena6.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena6.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena6.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena6.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena6.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena6.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("7")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a7");
				Main.getInstace().arenas.set("arena7.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena7.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena7.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena7.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena7.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena7.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().saveConfig();
			}
			if (args[0].equalsIgnoreCase("8")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a8");
				Main.getInstace().arenas.set("arena8.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena8.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena8.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena8.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena8.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena8.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("9")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a9");
				Main.getInstace().arenas.set("arena9.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena9.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena9.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena9.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena9.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena9.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
			if (args[0].equalsIgnoreCase("10")) {
				p.sendMessage("§a§lSETARENA §7Voc\u00ea setou a arena §a10");
				Main.getInstace().arenas.set("arena10.x", (Object) p.getLocation().getX());
				Main.getInstace().arenas.set("arena10.y", (Object) p.getLocation().getY());
				Main.getInstace().arenas.set("arena10.z", (Object) p.getLocation().getZ());
				Main.getInstace().arenas.set("arena10.pitch", (Object) p.getLocation().getPitch());
				Main.getInstace().arenas.set("arena10.yaw", (Object) p.getLocation().getYaw());
				Main.getInstace().arenas.set("arena10.world", (Object) p.getLocation().getWorld().getName());
				Main.getInstace().save();
			}
		}
		return false;
	}

	public static void TeleportArenaRandom(final Player p) {
		final Random dice = new Random();
		final int number = dice.nextInt(4);
		switch (number) {
		case 0: {
			final World w = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena1.world"));
			final double x = Main.getInstace().arenas.getDouble("arena1.x");
			final double y = Main.getInstace().arenas.getDouble("arena1.y");
			final double z = Main.getInstace().arenas.getDouble("arena1.z");
			final Location lobby = new Location(w, x, y, z);
			lobby.setPitch((float) Main.getInstace().arenas.getDouble("arena1.pitch"));
			lobby.setYaw((float) Main.getInstace().arenas.getDouble("arena1.yaw"));
			p.getWorld().playEffect(lobby, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby);
			break;
		}
		case 1: {
			final World w2 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena2.world"));
			final double x2 = Main.getInstace().arenas.getDouble("arena2.x");
			final double y2 = Main.getInstace().arenas.getDouble("arena2.y");
			final double z2 = Main.getInstace().arenas.getDouble("arena2.z");
			final Location lobby2 = new Location(w2, x2, y2, z2);
			lobby2.setPitch((float) Main.getInstace().arenas.getDouble("arena2.pitch"));
			lobby2.setYaw((float) Main.getInstace().arenas.getDouble("arena2.yaw"));
			p.getWorld().playEffect(lobby2, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby2);
			break;
		}
		case 2: {
			final World w3 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena3.world"));
			final double x3 = Main.getInstace().arenas.getDouble("arena3.x");
			final double y3 = Main.getInstace().arenas.getDouble("arena3.y");
			final double z3 = Main.getInstace().arenas.getDouble("arena3.z");
			final Location lobby3 = new Location(w3, x3, y3, z3);
			lobby3.setPitch((float) Main.getInstace().arenas.getDouble("arena3.pitch"));
			lobby3.setYaw((float) Main.getInstace().arenas.getDouble("arena3.yaw"));
			p.getWorld().playEffect(lobby3, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby3);
			break;
		}
		case 3: {
			final World w4 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena4.world"));
			final double x4 = Main.getInstace().arenas.getDouble("arena4.x");
			final double y4 = Main.getInstace().arenas.getDouble("arena4.y");
			final double z4 = Main.getInstace().arenas.getDouble("arena4.z");
			final Location lobby4 = new Location(w4, x4, y4, z4);
			lobby4.setPitch((float) Main.getInstace().arenas.getDouble("arena4.pitch"));
			lobby4.setYaw((float) Main.getInstace().arenas.getDouble("arena4.yaw"));
			p.getWorld().playEffect(lobby4, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby4);
			break;
		}
		case 4: {
			final World w5 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena5.world"));
			final double x5 = Main.getInstace().arenas.getDouble("arena5.x");
			final double y5 = Main.getInstace().arenas.getDouble("arena5.y");
			final double z5 = Main.getInstace().arenas.getDouble("arena5.z");
			final Location lobby5 = new Location(w5, x5, y5, z5);
			lobby5.setPitch((float) Main.getInstace().arenas.getDouble("arena5.pitch"));
			lobby5.setYaw((float) Main.getInstace().arenas.getDouble("arena5.yaw"));
			p.getWorld().playEffect(lobby5, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby5);
			break;
		}
		case 5: {
			final World w6 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena6.world"));
			final double x6 = Main.getInstace().arenas.getDouble("arena6.x");
			final double y6 = Main.getInstace().arenas.getDouble("arena6.y");
			final double z6 = Main.getInstace().arenas.getDouble("arena6.z");
			final Location lobby6 = new Location(w6, x6, y6, z6);
			lobby6.setPitch((float) Main.getInstace().arenas.getDouble("arena6.pitch"));
			lobby6.setYaw((float) Main.getInstace().arenas.getDouble("arena6.yaw"));
			p.getWorld().playEffect(lobby6, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby6);
			break;
		}
		case 6: {
			final World w7 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena7.world"));
			final double x7 = Main.getInstace().arenas.getDouble("arena7.x");
			final double y7 = Main.getInstace().arenas.getDouble("arena7.y");
			final double z7 = Main.getInstace().arenas.getDouble("arena7.z");
			final Location lobby7 = new Location(w7, x7, y7, z7);
			lobby7.setPitch((float) Main.getInstace().arenas.getDouble("arena7.pitch"));
			lobby7.setYaw((float) Main.getInstace().arenas.getDouble("arena7.yaw"));
			p.getWorld().playEffect(lobby7, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby7);
			break;
		}
		case 7: {
			final World w8 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena8.world"));
			final double x8 = Main.getInstace().arenas.getDouble("arena8.x");
			final double y8 = Main.getInstace().arenas.getDouble("arena8.y");
			final double z8 = Main.getInstace().arenas.getDouble("arena8.z");
			final Location lobby8 = new Location(w8, x8, y8, z8);
			lobby8.setPitch((float) Main.getInstace().arenas.getDouble("arena8.pitch"));
			lobby8.setYaw((float) Main.getInstace().arenas.getDouble("arena8.yaw"));
			p.getWorld().playEffect(lobby8, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby8);
			break;
		}
		case 8: {
			final World w9 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena9.world"));
			final double x9 = Main.getInstace().arenas.getDouble("arena9.x");
			final double y9 = Main.getInstace().arenas.getDouble("arena9.y");
			final double z9 = Main.getInstace().arenas.getDouble("arena9.z");
			final Location lobby9 = new Location(w9, x9, y9, z9);
			lobby9.setPitch((float) Main.getInstace().arenas.getDouble("arena9.pitch"));
			lobby9.setYaw((float) Main.getInstace().arenas.getDouble("arena9.yaw"));
			p.getWorld().playEffect(lobby9, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby9);
			break;
		}
		case 9: {
			final World w10 = Bukkit.getServer().getWorld(Main.getInstace().arenas.getString("arena10.world"));
			final double x10 = Main.getInstace().arenas.getDouble("arena10.x");
			final double y10 = Main.getInstace().arenas.getDouble("arena10.y");
			final double z10 = Main.getInstace().arenas.getDouble("arena10.z");
			final Location lobby10 = new Location(w10, x10, y10, z10);
			lobby10.setPitch((float) Main.getInstace().arenas.getDouble("arena10.pitch"));
			lobby10.setYaw((float) Main.getInstace().arenas.getDouble("arena10.yaw"));
			p.getWorld().playEffect(lobby10, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, 5.0f, 5.0f);
			p.teleport(lobby10);
			break;
		}
		}
	}
}
