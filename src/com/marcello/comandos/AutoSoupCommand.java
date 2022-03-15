package com.marcello.comandos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;

public class AutoSoupCommand implements CommandExecutor {
	public static HashMap<String, ItemStack[]> saveinv;
	public static HashMap<String, ItemStack[]> armadura;
	public static ArrayList<String> AutoSoupChecker;

	static {
		AutoSoupCommand.saveinv = new HashMap<String, ItemStack[]>();
		AutoSoupCommand.armadura = new HashMap<String, ItemStack[]>();
		AutoSoupCommand.AutoSoupChecker = new ArrayList<String>();
	}

	public static int getAmount(final Player p, final Material m) {
		int amount = 0;
		ItemStack[] arrayOfItemStack;
		for (int j = (arrayOfItemStack = p.getInventory().getContents()).length, i = 0; i < j; ++i) {
			final ItemStack item = arrayOfItemStack[i];
			if (item != null && item.getType() == m && item.getAmount() > 0) {
				amount += item.getAmount();
			}
		}
		return amount;
	}

	public boolean onCommand(final CommandSender sender, final Command comando, final String label,
			final String[] args) {
		final Player p = (Player) sender;
		if (!(sender instanceof Player)) {
			sender.sendMessage("�7Comando apenas no servidor!");
			return true;
		}
		if (comando.getName().equalsIgnoreCase("autosoup")) {
			if (!p.hasPermission("cmd.autosoup")) {
				p.sendMessage("�c�lPERMISSAO �7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("�a�LAUTOSOUP �7Utilize o comando �a/autosoup (nick)");
				return true;
			}
			final Player t = Bukkit.getPlayer(args[0]);
			if (t == null) {
				p.sendMessage("�a�lAUTOSOUP �7Parece que este player n\u00e3o est\u00e1 conectado ao servidor");
				return true;
			}
			final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
			AutoSoupCommand.saveinv.put(t.getName(), t.getInventory().getContents());
			AutoSoupCommand.armadura.put(t.getName(), t.getInventory().getArmorContents());
			t.getInventory().clear();
			final Random r = new Random();
			final int gg = r.nextInt(23) + 9;
			t.getInventory().setItem(gg, sopa);
			t.getInventory().setItem(gg, sopa);
			t.setHealth(4.5);
			t.closeInventory();
			p.openInventory((Inventory) t.getInventory());
			AutoSoupCommand.AutoSoupChecker.add(t.getName());
			p.sendMessage("�a�LAUTOSOUP �7Iniciando analise de autosoup...");
			Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.instance, (Runnable) new Runnable() {
				@Override
				public void run() {
					p.closeInventory();
					p.sendMessage("");
					p.sendMessage("");
					p.sendMessage("�a�LAUTOSOUP �7Jogador Testado: �f" + t.getName());
					p.sendMessage("�a�LAUTOSOUP �7Tomou a sopa: �fN\u00e3o");
					if (AutoSoupCommand.getAmount(p, Material.MUSHROOM_SOUP) == 1) {
						p.sendMessage("�a�LAUTOSOUP �7Probabilidade: �fNenhuma.");
					} else {
						p.sendMessage("");
						p.sendMessage("");
						p.sendMessage("�a�LAUTOSOUP �7Jogador Testado: �f" + t.getName());
						p.sendMessage("�a�LAUTOSOUP �7Tomou a sopa: �fSim");
						p.sendMessage("�a�LAUTOSOUP �7Probabilidade: �fSuspeito.");
						p.sendMessage("         �7Solicite tela!�c         ");
					}
					p.sendMessage("");
				}
			}, 30L);
			Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) TrappedPvP.instance, (Runnable) new Runnable() {
				@Override
				public void run() {
					t.setHealth(20.0);
					AutoSoupCommand.AutoSoupChecker.remove(t.getName());
					t.getInventory().setContents((ItemStack[]) AutoSoupCommand.saveinv.get(t.getName()));
					t.getInventory().setArmorContents((ItemStack[]) AutoSoupCommand.armadura.get(t.getName()));
					t.updateInventory();
				}
			}, 45L);
		}
		return false;
	}
}
