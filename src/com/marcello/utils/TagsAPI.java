package com.marcello.utils;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.manager.Elos;

import ca.wacos.nametagedit.NametagAPI;

public class TagsAPI implements Listener {
	public static void setarTag(final Player p, final String tag) {
		new BukkitRunnable() {
			public void run() {
				p.setDisplayName(String.valueOf(tag) + p.getName());
				NametagAPI.setPrefix(p.getName(), tag);
			}
		}.runTaskAsynchronously((Plugin) TrappedPvP.getInstace());
	}

	@EventHandler
	public void tag(final PlayerJoinEvent e) {
		new BukkitRunnable() {
			public void run() {
				final Player p = e.getPlayer();
				if (p.hasPermission("tag.dono")) {
					TagsAPI.setarTag(p, "�4�lDONO�4 ");
					NametagAPI.setPrefix(p.getName(), "�4�lDONO�4 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.gerente")) {
					TagsAPI.setarTag(p, "�C�lGERENTE�c ");
					NametagAPI.setPrefix(p.getName(), "�C�lGERENTE�c ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.admin")) {
					TagsAPI.setarTag(p, "�C�lADMIN�c ");
					NametagAPI.setPrefix(p.getName(), "�C�lADMIN�c ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.modplus")) {
					TagsAPI.setarTag(p, "�5�lMOD+�5 ");
					NametagAPI.setPrefix(p.getName(), "�5�lMOD+�5 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.mod")) {
					TagsAPI.setarTag(p, "�5�lMOD�5 ");
					NametagAPI.setPrefix(p.getName(), "�5�lMOD�5 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.trial")) {
					TagsAPI.setarTag(p, "�5�lTRIAL�5 ");
					NametagAPI.setPrefix(p.getName(), "�5�lTRIAL�5 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.helper")) {
					TagsAPI.setarTag(p, "�9�lHELPER�9 ");
					NametagAPI.setPrefix(p.getName(), "�9�lHELPER�9 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.youtuber+")) {
					TagsAPI.setarTag(p, "�3�lYT+�3 ");
					NametagAPI.setPrefix(p.getName(), "�3�lYT+�3 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.youtuber")) {
					TagsAPI.setarTag(p, "�B�lYOUTUBER�b ");
					NametagAPI.setPrefix(p.getName(), "�B�lYOUTUBER�b ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.ultimate")) {
					TagsAPI.setarTag(p, "�d�lULTIMATE�d ");
					NametagAPI.setPrefix(p.getName(), "�D�lULTIMATE�d ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.premium")) {
					TagsAPI.setarTag(p, "�6�lPREMIUM�6 ");
					NametagAPI.setPrefix(p.getName(), "�6�lPREMIUM�6 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.builder")) {
					TagsAPI.setarTag(p, "�2�lBUILDER�2 ");
					NametagAPI.setPrefix(p.getName(), "�2�lBUILDER�2 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.developer")) {
					TagsAPI.setarTag(p, "�3�lDEVELOPER�3 ");
					NametagAPI.setPrefix(p.getName(), "�3�lDEVELOPER�3 ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.light")) {
					TagsAPI.setarTag(p, "�a�lLIGHT�a ");
					NametagAPI.setPrefix(p.getName(), "�a�lLIGHT�a ");
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				if (p.hasPermission("tag.normal")) {
					TagsAPI.setarTag(p, "�7");
					p.setPlayerListName("�7" + p.getName());
					NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
					return;
				}
				TagsAPI.setarTag(p, "�7");
				p.setPlayerListName("�7" + p.getName());
				NametagAPI.setSuffix(p.getName(), " �7(" + Elos.getIconElo(p) + "�7)");
			}
		}.runTaskAsynchronously((Plugin) TrappedPvP.getInstace());
	}
}
