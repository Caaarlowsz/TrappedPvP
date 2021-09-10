package com.marcello.comandos;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
			return true;
		}
		final Player p = (Player) sender;
		if (!p.hasPermission("cmd.head")) {
			p.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
			return true;
		}
		if (args.length == 0) {
			p.sendMessage("§2§LHEAD §7Utilize o comando §a/head (nick)");
		} else {
			final ItemStack C1 = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
			final SkullMeta sm = (SkullMeta) C1.getItemMeta();
			sm.setOwner(args[0]);
			sm.setDisplayName(args[0]);
			sm.setDisplayName("§7" + args[0]);
			C1.setItemMeta((ItemMeta) sm);
			p.getInventory().addItem(new ItemStack[] { C1 });
			p.updateInventory();
		}
		return false;
	}
}
