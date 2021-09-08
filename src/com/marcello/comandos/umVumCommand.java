package com.marcello.comandos;

import org.bukkit.plugin.Plugin;
import java.util.Iterator;
import org.bukkit.potion.PotionEffect;
import org.bukkit.Sound;
import com.marcello.Main;
import org.bukkit.Bukkit;
import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import com.marcello.utils.WarpsAPI;

public class umVumCommand extends WarpsAPI implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
            return true;
        }
        final Player p = (Player)sender;
        if (args.length == 0) {
            if (KitAPI.getKit(p) != "Nenhum") {
                p.sendMessage("§c§LKIT §7Voc\u00ea ja est\u00e1 utilizando um kit. remova-o para poder selecionar outro kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                umVumCommand.segundos.add(p.getDisplayName());
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (umVumCommand.segundos.contains(p.getDisplayName())) {
                            p.sendMessage("§2§LWARP §7Voc\u00ea entrou para a warp §a§l1v1");
                            p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);
                            WarpsAPI.ir(p, "1v1");
                            p.setLevel(0);
                            umVumCommand.segundos.remove(p.getDisplayName());
                            KitAPI.umVum(p);
                            for (final PotionEffect effect : p.getActivePotionEffects()) {
                                p.removePotionEffect(effect.getType());
                            }
                            p.setHealth(20);
                        }
                    }
                }, 1L);
            }
        }
        else if (args[0].equalsIgnoreCase("set")) {
            if (p.hasPermission("cmd.setarenas")) {
                WarpsAPI.Set(p, "1v1");
                p.sendMessage("§2§lWARP §7Voc\u00ea setou a arena §a§l1v1");
            }
        }
        else if (args[0].equalsIgnoreCase("loc1")) {
            if (p.hasPermission("cmd.setarenas")) {
                WarpsAPI.Set(p, "1v1loc1");
                p.sendMessage("§2§lWARP §7Voc\u00ea setou a arena §a§l1v1 (pos1)");
            }
        }
        else if (args[0].equalsIgnoreCase("loc2") && p.hasPermission("cmd.setarenas")) {
            WarpsAPI.Set(p, "1v1loc2");
            p.sendMessage("§2§lWARP §7Voc\u00ea setou a arena §a§l1v1 (pos2)");
        }
        return false;
    }
}
