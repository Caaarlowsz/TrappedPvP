package com.marcello.comandos;

import com.marcello.utils.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class KitCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cVoc\u00ea N\u00e3o Pode usar isso No Console!");
            return true;
        }
        final Player p = (Player)sender;
        if (args.length == 0) {
            p.chat("/kits");
            return true;
        }
        if (args[0].equalsIgnoreCase("pvp")) {
            if (!p.hasPermission("kit.pvp")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.PvP(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lPVP");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("assassin")) {
            if (!p.hasPermission("kit.assassin")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Assassin(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lASSASSIN");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("kangaroo")) {
            if (!p.hasPermission("kit.kangaroo")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Kangaroo(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lKANGAROO");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("anchor")) {
            if (!p.hasPermission("kit.anchor")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Anchor(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lANCHOR");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("rain")) {
            if (!p.hasPermission("kit.rain")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Rain(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lRAIN");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("switcher")) {
            if (!p.hasPermission("kit.switcher")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Switcher(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lSWITCHER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("magma")) {
            if (!p.hasPermission("kit.magma")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.magma(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lMAGMA");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("antistomper")) {
            if (!p.hasPermission("kit.antistomper")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.AntiStomper(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lANTISTOMPER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("viper")) {
            if (!p.hasPermission("kit.viper")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Viper(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lVIPER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("monk")) {
            if (!p.hasPermission("kit.monk")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Monk(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lMONK");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Snail")) {
            if (!p.hasPermission("kit.snail")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Snail(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lSNAIL");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Reaper")) {
            if (!p.hasPermission("kit.reaper")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Reaper(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lREAPER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Fisherman")) {
            if (!p.hasPermission("kit.fisherman")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Fisherman(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lFISHERMAN");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Stomper")) {
            if (!p.hasPermission("kit.stomper")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Stomper(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lSTOMPER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Viking")) {
            if (!p.hasPermission("kit.viking")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Vinking(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lVIKING");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Ninja")) {
            if (!p.hasPermission("kit.ninja")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Ninja(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lNINJA");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Boxer")) {
            if (!p.hasPermission("kit.Boxer")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Boxer(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lBOXER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Deshfire")) {
            if (!p.hasPermission("kit.Deshfire")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Deshfire(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lDESHFIRE");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Deshviper")) {
            if (!p.hasPermission("kit.Deshviper")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Deshviper(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lDESHVIPER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Forcefield")) {
            if (!p.hasPermission("kit.Forcefield")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Forcefield(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lFORCEFIELD");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Hulk")) {
            if (!p.hasPermission("kit.Hulk")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Hulk(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lHULK");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Madman")) {
            if (!p.hasPermission("kit.Madman")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Madman(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lMADMAN");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Specialist")) {
            if (!p.hasPermission("kit.Specialist")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.specialist(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lSPECIALIST");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Titan")) {
            if (!p.hasPermission("kit.Titan")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Titan(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lTITAN");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Urgal")) {
            if (!p.hasPermission("kit.urgal")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Urgal(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lURGAL");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Thor")) {
            if (!p.hasPermission("kit.Thor")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Thor(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lTHOR");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("TimeLord")) {
            if (!p.hasPermission("kit.TimeLord")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.TimeLord(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lTIMELORD");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("QuickDropper")) {
            if (!p.hasPermission("kit.QuickDropper")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.quickdropper(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lQUICKDROPPER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Poseidon")) {
            if (!p.hasPermission("kit.poseidon")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Poseidon(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lPOSEIDON");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Phantom")) {
            if (!p.hasPermission("kit.phantom")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Phantom(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lPHANTOM");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Camel")) {
            if (!p.hasPermission("kit.Camel")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Camel(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lCAMEL");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("BurstMaster")) {
            if (!p.hasPermission("kit.BurstMaster")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.BurstMaster(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lBURSTMASTER");
                return true;
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("Gladiator")) {
            if (!p.hasPermission("kit.Gladiator")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Gladiator(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lGLADIATOR");
                return true;
            }
            return true;
        }
        else {
            if (!args[0].equalsIgnoreCase("Ajnin")) {
                p.sendMessage("§c§lKIT §7O kit §4§l" + args[0] + " §7n\u00e3o existe");
                return false;
            }
            if (!p.hasPermission("kit.ajnin")) {
                p.sendMessage("§c§lKIT §7Voc\u00ea n\u00e3o possui este kit");
                return true;
            }
            if (KitAPI.getKit(p) == "Nenhum") {
                KitAPI.Ajnin(p);
                p.sendMessage("§c§lKIT §7Voc\u00ea selecionou o kit §4§lAJNIN");
                return true;
            }
            return true;
        }
    }
}
