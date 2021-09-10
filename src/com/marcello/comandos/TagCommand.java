package com.marcello.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.marcello.api.ChatInterativo;
import com.marcello.manager.Elos;
import com.marcello.utils.TagsAPI;

import ca.wacos.nametagedit.NametagAPI;

public class TagCommand implements CommandExecutor, Listener {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Comando apenas para jogadores");
			return true;
		}
		final Player p = (Player) sender;
		if (args.length == 0) {
			if (p.hasPermission("tag.dono")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§4§lDONO", "/tag dono",
						"§e(Clique) §7§7Exemplo: §4§lDONO §4" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3§lDEVELOPER", "/tag developer",
						"§e(Clique) §7§7Exemplo: §3§lDEVELOPER §3" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c§lADMIN", "/tag admin",
						"§e(Clique) §7§7Exemplo: §c§lADMIN §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c§lGERENTE", "/tag gerente",
						"§e(Clique) §7§7Exemplo: §c§lGERENTE §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD+", "/tag modplus",
						"§e(Clique) §7§7Exemplo: §5§lMODPLUS §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lTRIAL", "/tag trial",
						"§e(Clique) §7§7Exemplo: §5§lTRIAL §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§9§lHELPER", "/tag helper",
						"§e(Clique) §7§7Exemplo: §9§lHELPER §9" + p.getName());
				ChatInterativo.Comando(p.getName(), "§e§lBUILDER", "/tag builder",
						"§e(Clique) §7§7Exemplo: §e§lBUILDER §e" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3§lYOUTUBER+", "/tag youtuber+",
						"§e(Clique) §7§7Exemplo: §3§lYOUTUBER+ §3" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b§lYOUTUBER", "/tag youtuber",
						"§e(Clique) §7§7Exemplo: §b§lYOUTUBER §b" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.gerente")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§c§lGERENTE", "/tag gerente",
						"§e(Clique) §7§7Exemplo: §c§lGERENTE §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD+", "/tag modplus",
						"§e(Clique) §7§7Exemplo: §5§lMODPLUS §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lTRIAL", "/tag trial",
						"§e(Clique) §7§7Exemplo: §5§lTRIAL §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§9§lHELPER", "/tag helper",
						"§e(Clique) §7§7Exemplo: §9§lHELPER §9" + p.getName());
				ChatInterativo.Comando(p.getName(), "§e§lBUILDER", "/tag builder",
						"§e(Clique) §7§7Exemplo: §e§lBUILDER §e" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3§lYOUTUBER+", "/tag youtuber+",
						"§e(Clique) §7§7Exemplo: §3§lYOUTUBER+ §3" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b§lYOUTUBER", "/tag youtuber",
						"§e(Clique) §7§7Exemplo: §b§lYOUTUBER §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.developer")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§3§lDEVELOPER", "/tag developer",
						"§e(Clique) §7§7Exemplo: §3§lDEVELOPER §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c§lADMIN", "/tag admin",
						"§e(Clique) §7§7Exemplo: §c§lADMIN §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c§lGERENTE", "/tag gerente",
						"§e(Clique) §7§7Exemplo: §c§lGERENTE §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD+", "/tag modplus",
						"§e(Clique) §7§7Exemplo: §5§lMODPLUS §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lTRIAL", "/tag trial",
						"§e(Clique) §7§7Exemplo: §5§lTRIAL §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§9§lHELPER", "/tag helper",
						"§e(Clique) §7§7Exemplo: §9§lHELPER §9" + p.getName());
				ChatInterativo.Comando(p.getName(), "§e§lBUILDER", "/tag builder",
						"§e(Clique) §7§7Exemplo: §e§lBUILDER §e" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3§lYOUTUBER+", "/tag youtuber+",
						"§e(Clique) §7§7Exemplo: §3§lYOUTUBER+ §3" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b§lYOUTUBER", "/tag youtuber",
						"§e(Clique) §7§7Exemplo: §b§lYOUTUBER §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.admin")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§c§lADMIN", "/tag admin",
						"§e(Clique) §7§7Exemplo: §c§lADMIN §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c§lGERENTE", "/tag gerente",
						"§e(Clique) §7§7Exemplo: §c§lGERENTE §c" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD+", "/tag modplus",
						"§e(Clique) §7§7Exemplo: §5§lMODPLUS §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lTRIAL", "/tag trial",
						"§e(Clique) §7§7Exemplo: §5§lTRIAL §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§9§lHELPER", "/tag helper",
						"§e(Clique) §7§7Exemplo: §9§lHELPER §9" + p.getName());
				ChatInterativo.Comando(p.getName(), "§e§lBUILDER", "/tag builder",
						"§e(Clique) §7§7Exemplo: §e§lBUILDER §e" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3§lYOUTUBER+", "/tag youtuber+",
						"§e(Clique) §7§7Exemplo: §3§lYOUTUBER+ §3" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b§lYOUTUBER", "/tag youtuber",
						"§e(Clique) §7§7Exemplo: §b§lYOUTUBER §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.modfull")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§5§lMOD+", "/tag modplus",
						"§e(Clique) §7§7Exemplo: §5§lMODPLUS §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.modplus")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§5§lMOD+", "/tag modplus",
						"§e(Clique) §7§7Exemplo: §5§lMODPLUS §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.builder")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§e§lBUILDER", "/tag builder",
						"§e(Clique) §7§7Exemplo: §e§lBUILDER §e" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.mod")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§5§lMOD", "/tag mod",
						"§e(Clique) §7§7Exemplo: §5§lMOD §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.trial")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§5§lTRIAL", "/tag trial",
						"§e(Clique) §7§7Exemplo: §5§lTRIAL §5" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.helper")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§9§lHELPER", "/tag helper",
						"§e(Clique) §7§7Exemplo: §9§lHELPER §9" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.youtuber+")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§3§lYOUTUBER+", "/tag youtuber+",
						"§e(Clique) §7§7Exemplo: §3§lYOUTUBER+ §3" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b§lYOUTUBER", "/tag youtuber",
						"§e(Clique) §7§7Exemplo: §b§lYOUTUBER §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.youtuber")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§b§lYOUTUBER", "/tag youtuber",
						"§e(Clique) §7§7Exemplo: §b§lYOUTUBER §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.ultimate")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§d§lULTIMATE", "/tag ultimate",
						"§e(Clique) §7§7Exemplo: §D§lULTIMATE §d" + p.getName());
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.premium")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§6§lPREMIUM", "/tag premium",
						"§e(Clique) §7§7Exemplo: §6§lPREMIUM §6" + p.getName());
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("tag.light")) {
				p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§a§lLIGHT", "/tag light",
						"§e(Clique) §7§7Exemplo: §a§lLIGHT §a" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
						"§e(Clique) §7§7Exemplo: §7" + p.getName());
				return true;
			}
			p.sendMessage("§d§lTAGS §7Voc\u00ea possui as tags:");
			p.sendMessage("§E");
			ChatInterativo.Comando(p.getName(), "§7§lNORMAL", "/tag normal",
					"§e(Clique) §7§7Exemplo: §7" + p.getName());
			return true;
		} else {
			if (p.hasPermission("tag.dono") && args[0].equalsIgnoreCase("dono")) {
				TagsAPI.setarTag(p, "§4§lDONO§4 ");
				NametagAPI.setPrefix(p.getName(), "§4§lDONO§4 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §4§lDONO");
				return true;
			}
			if (p.hasPermission("tag.gerente") && args[0].equalsIgnoreCase("gerente")) {
				TagsAPI.setarTag(p, "§c§lGERENTE§c ");
				NametagAPI.setPrefix(p.getName(), "§c§lGERENTE§c ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §c§lGERENTE");
				return true;
			}
			if (p.hasPermission("tag.admin") && args[0].equalsIgnoreCase("admin")) {
				TagsAPI.setarTag(p, "§c§lADMIN§c ");
				NametagAPI.setPrefix(p.getName(), "§c§lADMIN§c ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §c§lADMIN");
				return true;
			}
			if (p.getName().equalsIgnoreCase("ThauanBrG") && args[0].equalsIgnoreCase("developer")) {
				TagsAPI.setarTag(p, "§3§lDEVELOPER§3 ");
				NametagAPI.setPrefix(p.getName(), "§3§lDEVELOPER§3 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §3§lDEVELOPER");
				return true;
			}
			if (p.hasPermission("tag.mod+") && args[0].equalsIgnoreCase("modplus")) {
				TagsAPI.setarTag(p, "§5§lMOD+§5 ");
				NametagAPI.setPrefix(p.getName(), "§5§lMOD+§5 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §5§lMOD+");
				return true;
			}
			if (p.hasPermission("tag.mod") && args[0].equalsIgnoreCase("mod")) {
				TagsAPI.setarTag(p, "§5§lMOD§5 ");
				NametagAPI.setPrefix(p.getName(), "§5§lMOD§5 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §5§lMOD");
				return true;
			}
			if (p.hasPermission("tag.builder") && args[0].equalsIgnoreCase("builder")) {
				TagsAPI.setarTag(p, "§e§lBUILDER§e ");
				NametagAPI.setPrefix(p.getName(), "§e§lBUILDER§e ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §e§lBUILDER");
				return true;
			}
			if (p.hasPermission("tag.trial") && args[0].equalsIgnoreCase("trial")) {
				TagsAPI.setarTag(p, "§5§lTRIAL§5 ");
				NametagAPI.setPrefix(p.getName(), "§5§lTRIAL§5 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §5§lTRIAL");
				return true;
			}
			if (p.hasPermission("tag.helper") && args[0].equalsIgnoreCase("helper")) {
				TagsAPI.setarTag(p, "§9§lHELPER§9 ");
				NametagAPI.setPrefix(p.getName(), "§9§lHELPER§9 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §9§lHELPER");
				return true;
			}
			if (p.hasPermission("tag.youtuber+") && args[0].equalsIgnoreCase("youtuber+")) {
				TagsAPI.setarTag(p, "§3§lYOUTUBER+§3 ");
				NametagAPI.setPrefix(p.getName(), "§b§lYOUTUBER+§3 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §3§lYOUTUBER+");
				return true;
			}
			if (p.hasPermission("tag.youtuber") && args[0].equalsIgnoreCase("youtuber")) {
				TagsAPI.setarTag(p, "§b§lYOUTUBER§b ");
				NametagAPI.setPrefix(p.getName(), "§b§lYOUTUBER§b ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §B§lYOUTUBER");
				return true;
			}
			if (p.hasPermission("tag.ultimate") && args[0].equalsIgnoreCase("ultimate")) {
				TagsAPI.setarTag(p, "§d§lULTIMATE§d ");
				NametagAPI.setPrefix(p.getName(), "§d§lULTIMATE§d ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §d§lULTIMATE");
				return true;
			}
			if (p.hasPermission("tag.premium") && args[0].equalsIgnoreCase("premium")) {
				TagsAPI.setarTag(p, "§6§lPREMIUM§6 ");
				NametagAPI.setPrefix(p.getName(), "§6§lPREMIUM§6 ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §6§lPREMIUM");
				return true;
			}
			if (p.hasPermission("tag.light") && args[0].equalsIgnoreCase("light")) {
				TagsAPI.setarTag(p, "§a§lLIGHT§a ");
				NametagAPI.setPrefix(p.getName(), "§a§lLIGHT§a ");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §a§lLIGHT§a");
				return true;
			}
			if (p.hasPermission("tag.reverse") && args[0].equalsIgnoreCase("reverse")) {
				TagsAPI.setarTag(p, "§c§lREVERSE §c");
				NametagAPI.setPrefix(p.getName(), "§c§lREVERSE §c");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §c§lREVERSE");
				return true;
			}
			if (p.hasPermission("tag.normal") && args[0].equalsIgnoreCase("normal")) {
				TagsAPI.setarTag(p, "§7");
				NametagAPI.setPrefix(p.getName(), "§7");
				NametagAPI.setSuffix(p.getName(), " §7(" + Elos.getIconElo(p) + "§7)");
				p.sendMessage("§d§lTAGS §7Voc\u00ea selecionou a tag: §7§lNORMAL");
				return true;
			}
			return false;
		}
	}
}
