package com.marcello.comandos;

import org.bukkit.plugin.Plugin;
import java.util.Iterator;
import org.bukkit.potion.PotionEffectType;
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

public class MainCommand extends WarpsAPI implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
            return true;
        }
        final Player p = (Player)sender;
        if (args.length == 0) {
            if (KitAPI.getKit(p) != "Nenhum") {
                p.sendMessage("§c§LKIT §7Voc\u00ea ja est\u00e1 utilizando um kit. remova-o para poder selecionar outro kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                MainCommand.segundos.add(p.getDisplayName());
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstace(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (MainCommand.segundos.contains(p.getDisplayName())) {
                            p.sendMessage("§2§LWARP §7Voc\u00ea entrou para a warp §a§lMAIN");
                            p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);
                            WarpsAPI.ir(p, "main");
                            p.setLevel(0);
                            MainCommand.segundos.remove(p.getDisplayName());
                            KitAPI.aMain(p);
                            for (final PotionEffect effect : p.getActivePotionEffects()) {
                                p.removePotionEffect(effect.getType());
                            }
                            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 999999999, 1));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));
                            p.setHealth(20);
                        }
                    }
                }, 2L);
            }
        }
        else if (args[0].equalsIgnoreCase("set") && p.hasPermission("cmd.setarenas")) {
            WarpsAPI.Set(p, "main");
            p.sendMessage("§2§LWARP §7Voc\u00ea setou a arena §a§lMAIN");
        }
        return false;
    }
}
