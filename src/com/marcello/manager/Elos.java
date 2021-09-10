package com.marcello.manager;

import org.bukkit.entity.Player;

import com.marcello.utils.KillsDeathsMoney;

public class Elos {
	public static String getIconElo(final Player p) {
		final double a = KillsDeathsMoney.getKills(p);
		if (a <= 99.0) {
			return "§f-";
		}
		if (a <= 199.0) {
			return "§a=";
		}
		if (a <= 299.0) {
			return "§e\u2630";
		}
		if (a <= 399.0) {
			return "§6\u2737";
		}
		if (a <= 499.0) {
			return "§b\u2726";
		}
		if (a <= 599.0) {
			return "§5\u2739";
		}
		if (a <= 699.0) {
			return "§c\u272b";
		}
		if (a <= 999.0) {
			return "§4\u272a";
		}
		return "§4\u272a";
	}

	public static String getElo(final Player p) {
		final double a = KillsDeathsMoney.getKills(p);
		if (a <= 99.0) {
			return "§f- §fUNRANKED";
		}
		if (a <= 199.0) {
			return "§a= §aPRYMARY";
		}
		if (a <= 299.0) {
			return "§e\u2630 §eBRONZE";
		}
		if (a <= 399.0) {
			return "§6\u2737 §6OURO";
		}
		if (a <= 499.0) {
			return "§b\u2726 DIAMOND";
		}
		if (a <= 599.0) {
			return "§5\u2739 ELITE";
		}
		if (a <= 699.0) {
			return "§c\u272b MASTER";
		}
		if (a <= 999.0) {
			return "§4\u272a §4LEGENDARY";
		}
		return "§4\u272a §4LEGENDARY";
	}
}
