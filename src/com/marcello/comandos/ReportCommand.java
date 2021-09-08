package com.marcello.comandos;

import org.bukkit.plugin.Plugin;
import com.marcello.api.ChatInterativo;
import org.bukkit.Sound;
import org.bukkit.Bukkit;
import org.apache.commons.lang.StringUtils;
import java.util.Arrays;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import com.marcello.Main;
import java.util.ArrayList;
import org.bukkit.command.CommandExecutor;

public class ReportCommand implements CommandExecutor
{
    public ArrayList<String> reported;
    private Main plugin;
    
    public ReportCommand(final Main plugin) {
        this.reported = new ArrayList<String>();
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        final Player p = (Player)sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
            return false;
        }
        if (commandLabel.equalsIgnoreCase("report")) {
            if (args.length >= 2) {
                final Player target = p.getServer().getPlayer(args[0]);
                if (target != null) {
                    if (this.reported.contains(p.getName())) {
                        p.sendMessage("§5§lREPORT §7Aguarde alguns segundos para pode reportar novamente");
                        return true;
                    }
                    final String reportMsg = StringUtils.join((Object[])Arrays.copyOfRange(args, 1, args.length), " ");
                    this.reported.add(p.getName());
                    p.sendMessage("§5§lREPORT §7Report enviado com sucesso obrigado por ajudar nossos staffers");
                    Player[] arrayOfPlayer;
                    for (int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length, i = 0; i < j; ++i) {
                        final Player s = arrayOfPlayer[i];
                        if (s.hasPermission("ver.report")) {
                            s.playSound(s.getLocation(), Sound.ANVIL_USE, 15.0f, 1.0f);
                            s.sendMessage("§c ");
                            s.sendMessage("§c ");
                            s.sendMessage("§c ");
                            s.sendMessage("§c ");
                            s.sendMessage("      §7» §5§lREPORT        ");
                            s.sendMessage("§c");
                            s.sendMessage("§7» §fJogador Reportado: §d" + target.getName());
                            s.sendMessage("§7» §fMotivo: §d" + reportMsg);
                            s.sendMessage("§7» §fReporter: §d" + p.getName());
                            s.sendMessage("§7» §fServidor: §dKitPvP");
                            ChatInterativo.Comando(s.getName(), "§7» Teleportar-se at\u00e9 o suspeito clique §5§l§nAQUI", "/tp " + target.getName(), "§7» Ir At\u00e9 §d" + target.getName());
                            ChatInterativo.Comando(s.getName(), "§7» Teleportar-se at\u00e9 quem reportou clique §5§l§nAQUI", "/tp " + p.getName(), "§7» Ir At\u00e9 §d" + p.getName());
                            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)this.plugin, (Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    ReportCommand.this.reported.remove(p.getName());
                                }
                            }, 300L);
                        }
                    }
                }
                else {
                    p.sendMessage("§5§lREPORT §7Este player est\u00e1 offline no momento");
                }
            }
            else {
                p.sendMessage("§5§lREPORT §7Utilize o comando §5/report (nick) (motivo)");
            }
        }
        return false;
    }
}
