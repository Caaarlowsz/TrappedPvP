package com.marcello.comandos;

import org.bukkit.plugin.Plugin;
import com.marcello.Main;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import com.marcello.api.HorarioAPI;
import org.bukkit.Bukkit;
import com.marcello.manager.ListVips;
import java.util.ArrayList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class SorteioVipCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender.hasPermission("cmd.sortearvip")) {
            final ArrayList<String> Vip = new ArrayList<String>();
            ListVips[] values;
            for (int length = (values = ListVips.values()).length, i = 0; i < length; ++i) {
                final ListVips s = values[i];
                if (!Vip.contains(s.name())) {
                    Vip.add(s.name().toLowerCase());
                }
            }
            Bukkit.broadcastMessage("              §c§lReverse§f§lMC         ");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("§7§lESTAMOS INICIANDO UM SORTEIO  ");
            Bukkit.broadcastMessage("§7§lPR\u00caMIO SER\u00c0 UM VIP DE 15 DIAS       ");
            Bukkit.broadcastMessage("§7§lHOR\u00c0RIO DE INICIO: §c§l" + HorarioAPI.getHorario());
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("              §7§l» §c§LSORTEIO             ");
            new BukkitRunnable() {
                public void run() {
                    final ArrayList<Player> Players = new ArrayList<Player>();
                    Player[] onlinePlayers;
                    for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                        final Player all = onlinePlayers[i];
                        if (!Players.contains(all)) {
                            Players.add(all);
                        }
                    }
                    final Player random = Players.get(new Random().nextInt(Players.size()));
                    Bukkit.broadcastMessage("              §c§lReverse§f§lMC         ");
                    Bukkit.broadcastMessage("");
                    Bukkit.broadcastMessage("§7§lO SORTEIO DE UM §a§lVIP §7§lFOI FINALIZADO");
                    Bukkit.broadcastMessage("§7§lO GANHADOR FOI: §c" + random.getName());
                    Bukkit.broadcastMessage("§7§lHOR\u00c0RIO FINAZILADO: §c§l" + HorarioAPI.getHorario());
                    final Random r = new Random();
                    final int x = r.nextInt(Vip.size());
                    Bukkit.broadcastMessage("§7§lO VIP GANHO FOI: §a§l" + Vip.get(x));
                    Bukkit.broadcastMessage("");
                    Bukkit.broadcastMessage("              §7§l» §c§LSORTEIO             ");
                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + random.getName() + " group set " + Vip.get(x));
                }
            }.runTaskLater((Plugin)Main.instance, 200L);
        }
        return false;
    }
}
