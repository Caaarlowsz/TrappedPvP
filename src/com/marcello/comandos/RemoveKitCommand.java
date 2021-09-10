package com.marcello.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemoveKitCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("removekit")) {
			if (!sender.hasPermission("cmd.removekit")) {
				sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§c§LREMOVEKIT §7Utilize o comando §c/givekit (nick) (kit)");
				return true;
			}
			if (args.length != 2) {
				p.sendMessage("§c§LREMOVEKIT §7Utilize o comando §c/givekit (nick) (kit)");
				return true;
			}
			final String kit = args[1];
			final Player jogador = Bukkit.getPlayer(args[0]);
			if (kit.equalsIgnoreCase("Boxer")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lBOXER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.boxer");
				return true;
			}
			if (kit.equalsIgnoreCase("Switcher")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lSWITCHER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.switcher");
				return true;
			}
			if (kit.equalsIgnoreCase("BurstMaster")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lBUSRSTMASTER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.burstmaster");
				return true;
			}
			if (kit.equalsIgnoreCase("Thresh")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lTHRESH §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.thresh");
				return true;
			}
			if (kit.equalsIgnoreCase("Monk")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lMONK §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.monk");
				return true;
			}
			if (kit.equalsIgnoreCase("Camel")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lCAMEL §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.camel");
				return true;
			}
			if (kit.equalsIgnoreCase("Deshfire")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lDESHFIRE §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.deshfire");
				return true;
			}
			if (kit.equalsIgnoreCase("Ajnin")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lAJNIN §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.ajnin");
				return true;
			}
			if (kit.equalsIgnoreCase("Deshviper")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lDESHVIPER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.deshviper");
				return true;
			}
			if (kit.equalsIgnoreCase("Fisherman")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lFISHERMAN §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.fisherman");
				return true;
			}
			if (kit.equalsIgnoreCase("Forcefield")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lFORCEFIELD §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.forcefield");
				return true;
			}
			if (kit.equalsIgnoreCase("Gladiator")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lGLADIATOR §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.gladiator");
				return true;
			}
			if (kit.equalsIgnoreCase("Hulk")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lHULK §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.hulk");
				return true;
			}
			if (kit.equalsIgnoreCase("Kangaroo")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lKANGAROO §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.kangaroo");
				return true;
			}
			if (kit.equalsIgnoreCase("Madman")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lMADMAN §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.madman");
				return true;
			}
			if (kit.equalsIgnoreCase("Ninja")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lNINJA §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.ninja");
				return true;
			}
			if (kit.equalsIgnoreCase("Phantom")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lPHANTOM §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.phantom");
				return true;
			}
			if (kit.equalsIgnoreCase("Poseidon")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lPOSEIDON §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.poseidon");
				return true;
			}
			if (kit.equalsIgnoreCase("Reaper")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lREAPER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.reaper");
				return true;
			}
			if (kit.equalsIgnoreCase("Ryu")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lRYU §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.ryu");
				return true;
			}
			if (kit.equalsIgnoreCase("Seya")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lSEYA §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.seya");
				return true;
			}
			if (kit.equalsIgnoreCase("Snail")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lSNAIL §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.Snail");
				return true;
			}
			if (kit.equalsIgnoreCase("Sonic")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lSONIC §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.sonic");
				return true;
			}
			if (kit.equalsIgnoreCase("Specialist")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lSPECIALIST §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.specialist");
				return true;
			}
			if (kit.equalsIgnoreCase("Stomper")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lSTOMPER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.stomper");
				return true;
			}
			if (kit.equalsIgnoreCase("Thor")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lTHOR §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.thor");
				return true;
			}
			if (kit.equalsIgnoreCase("TimeLord")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lTIMELORD §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.timelord");
				return true;
			}
			if (kit.equalsIgnoreCase("Titan")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lTITAN §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.titan");
				return true;
			}
			if (kit.equalsIgnoreCase("Turtle")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lTURTLE §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.turtle");
				return true;
			}
			if (kit.equalsIgnoreCase("Urgal")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lURGAL §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.urgal");
				return true;
			}
			if (kit.equalsIgnoreCase("Viking")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lVIIKNG §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.viking");
				return true;
			}
			if (kit.equalsIgnoreCase("Viper")) {
				p.sendMessage("§c§lREMOVEKIT §7O kit §4§lVIPER §7Foi removido do jogador §c " + jogador.getName()
						+ "§7(§e" + jogador.getUniqueId() + "§7)");
				Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
						"pex user " + jogador.getName() + " remove kit.Viper");
				return true;
			}
		}
		return false;
	}
}
