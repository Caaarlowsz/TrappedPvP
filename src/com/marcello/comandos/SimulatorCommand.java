package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.utils.KitAPI;
import com.marcello.utils.WarpsAPI;

public class SimulatorCommand extends WarpsAPI implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("�cVoc\u00ea N\u00e3o Pode usar isso No Console!");
			return true;
		}
		final Player p = (Player) sender;
		if (args.length == 0) {
			if (KitAPI.getKit(p) != "Nenhum") {
				p.sendMessage(
						"�c�LKIT �7Voc\u00ea ja est\u00e1 utilizando um kit. remova-o para poder selecionar outro kit");
				return true;
			}
			if (KitAPI.getKit(p) == "Nenhum") {
				SimulatorCommand.segundos.add(p.getDisplayName());
				Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.getInstace(), (Runnable) new Runnable() {
					@Override
					public void run() {
						if (SimulatorCommand.segundos.contains(p.getDisplayName())) {
							p.sendMessage("�2�LWARP �7Voc\u00ea entrou para a warp �a�lSIMULATOR");
							p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);
							WarpsAPI.ir(p, "Simulator");
							p.setLevel(0);
							SimulatorCommand.segundos.remove(p.getDisplayName());
							KitAPI.Simulator(p);
							for (final PotionEffect effect : p.getActivePotionEffects()) {
								p.removePotionEffect(effect.getType());
							}
							p.setHealth(20);
						}
					}
				}, 1L);
			}
		} else if (args[0].equalsIgnoreCase("set") && p.hasPermission("cmd.setarenas")) {
			WarpsAPI.Set(p, "Simulator");
			p.sendMessage("�2�lWARP �7Voc\u00ea setou a arena �a�lSIMULATOR");
		}
		return false;
	}
}
