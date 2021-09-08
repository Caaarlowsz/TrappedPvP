package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GiveKitCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("givekit")) {
            if (!sender.hasPermission("cmd.givekit")) {
                sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§5§LGIVEKIT §7Utilize o comando §d/givekit (nick) (kit)");
                return true;
            }
            final int length = args.length;
            if (args.length != 2) {
                p.sendMessage("§5§LGIVEKIT §7Utilize o comando §d/givekit (nick) (kit)");
                return true;
            }
            final String kit = args[1];
            final Player jogador = Bukkit.getPlayer(args[0]);
            if (kit.equalsIgnoreCase("Boxer")) {
                p.sendMessage("§c§lKIT §7O kit §5§lBOXER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.boxer");
                return true;
            }
            if (kit.equalsIgnoreCase("Ajnin")) {
                p.sendMessage("§c§lKIT §7O kit §5§lAJNIN §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.ajnin");
                return true;
            }
            if (kit.equalsIgnoreCase("Switcher")) {
                p.sendMessage("§c§lKIT §7O kit §5§lSWITCHER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.switcher");
                return true;
            }
            if (kit.equalsIgnoreCase("Thresh")) {
                p.sendMessage("§c§lKIT §7O kit §5§lTHRESH §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.thresh");
                return true;
            }
            if (kit.equalsIgnoreCase("BurstMaster")) {
                p.sendMessage("§c§lKIT §7O kit §5§lBUSRSTMASTER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.burstmaster");
                return true;
            }
            if (kit.equalsIgnoreCase("Monk")) {
                p.sendMessage("§c§lKIT §7O kit §5§lMONK §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.monk");
                return true;
            }
            if (kit.equalsIgnoreCase("Camel")) {
                p.sendMessage("§c§lKIT §7O kit §5§lCAMEL §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.camel");
                return true;
            }
            if (kit.equalsIgnoreCase("Deshfire")) {
                p.sendMessage("§c§lKIT §7O kit §5§lDESHFIRE §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.deshfire");
                return true;
            }
            if (kit.equalsIgnoreCase("Deshviper")) {
                p.sendMessage("§c§lKIT §7O kit §5§lDESHVIPER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.deshviper");
                return true;
            }
            if (kit.equalsIgnoreCase("Fisherman")) {
                p.sendMessage("§c§lKIT §7O kit §5§lFISHERMAN §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.fisherman");
                return true;
            }
            if (kit.equalsIgnoreCase("Forcefield")) {
                p.sendMessage("§c§lKIT §7O kit §5§lFORCEFIELD §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.forcefield");
                return true;
            }
            if (kit.equalsIgnoreCase("Gladiator")) {
                p.sendMessage("§c§lKIT §7O kit §5§lGLADIATOR §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.gladiator");
                return true;
            }
            if (kit.equalsIgnoreCase("Hulk")) {
                p.sendMessage("§c§lKIT §7O kit §5§lHULK §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.hulk");
                return true;
            }
            if (kit.equalsIgnoreCase("Kangaroo")) {
                p.sendMessage("§c§lKIT §7O kit §5§lKANGAROO §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.kangaroo");
                return true;
            }
            if (kit.equalsIgnoreCase("Madman")) {
                p.sendMessage("§c§lKIT §7O kit §5§lMADMAN §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.madman");
                return true;
            }
            if (kit.equalsIgnoreCase("Ninja")) {
                p.sendMessage("§c§lKIT §7O kit §5§lNINJA §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.ninja");
                return true;
            }
            if (kit.equalsIgnoreCase("Phantom")) {
                p.sendMessage("§c§lKIT §7O kit §5§lPHANTOM §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.phantom");
                return true;
            }
            if (kit.equalsIgnoreCase("Poseidon")) {
                p.sendMessage("§c§lKIT §7O kit §5§lPOSEIDON §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.poseidon");
                return true;
            }
            if (kit.equalsIgnoreCase("Reaper")) {
                p.sendMessage("§c§lKIT §7O kit §5§lREAPER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.reaper");
                return true;
            }
            if (kit.equalsIgnoreCase("Ryu")) {
                p.sendMessage("§c§lKIT §7O kit §5§lRYU §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.ryu");
                return true;
            }
            if (kit.equalsIgnoreCase("Seya")) {
                p.sendMessage("§c§lKIT §7O kit §5§lSEYA §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.seya");
                return true;
            }
            if (kit.equalsIgnoreCase("Snail")) {
                p.sendMessage("§c§lKIT §7O kit §5§lSNAIL §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.Snail");
                return true;
            }
            if (kit.equalsIgnoreCase("Sonic")) {
                p.sendMessage("§c§lKIT §7O kit §5§lSONIC §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.sonic");
                return true;
            }
            if (kit.equalsIgnoreCase("Specialist")) {
                p.sendMessage("§c§lKIT §7O kit §5§lSPECIALIST §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.specialist");
                return true;
            }
            if (kit.equalsIgnoreCase("Stomper")) {
                p.sendMessage("§c§lKIT §7O kit §5§lSTOMPER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.stomper");
                return true;
            }
            if (kit.equalsIgnoreCase("Thor")) {
                p.sendMessage("§c§lKIT §7O kit §5§lTHOR §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.thor");
                return true;
            }
            if (kit.equalsIgnoreCase("TimeLord")) {
                p.sendMessage("§c§lKIT §7O kit §5§lTIMELORD §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.timelord");
                return true;
            }
            if (kit.equalsIgnoreCase("Titan")) {
                p.sendMessage("§c§lKIT §7O kit §5§lTITAN §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.titan");
                return true;
            }
            if (kit.equalsIgnoreCase("Turtle")) {
                p.sendMessage("§c§lKIT §7O kit §5§lTURTLE §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.turtle");
                return true;
            }
            if (kit.equalsIgnoreCase("Urgal")) {
                p.sendMessage("§c§lKIT §7O kit §5§lURGAL §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.urgal");
                return true;
            }
            if (kit.equalsIgnoreCase("Viking")) {
                p.sendMessage("§c§lKIT §7O kit §5§lVIIKNG §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.viking");
                return true;
            }
            if (kit.equalsIgnoreCase("Viper")) {
                p.sendMessage("§c§lKIT §7O kit §5§lVIPER §7Foi dado ao jogador " + jogador.getName() + "§7(§5" + jogador.getUniqueId() + "§7)");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.Viper");
                return true;
            }
        }
        return false;
    }
}
