package com.marcello.utils;

import org.bukkit.entity.Player;

import com.marcello.Main;

public class KillsDeathsMoney {
	public static void addKill(final Player p, final int i) {
		final int Value = Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Kills");
		Main.getInstace().stats.set(String.valueOf(p.getName()) + ".Kills", (Object) (Value + 1));
		Main.getInstace().save();
	}

	public static void addDeaths(final Player p, final int i) {
		final int Value = Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Deaths");
		Main.getInstace().stats.set(String.valueOf(p.getName()) + ".Deaths", (Object) (Value + 1));
		Main.getInstace().save();
	}

	public static void addMoney(final Player p, final int i) {
		final int Value = Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Money");
		Main.getInstace().stats.set(String.valueOf(p.getName()) + ".Money", (Object) (Value + 100));
		Main.getInstace().save();
	}

	public static void removermoney(final Player p, final int i) {
		final int Value = Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Money");
		if (Value - 60 > 0) {
			Main.getInstace().stats.set(String.valueOf(p.getName()) + ".Money", (Object) (Value - 50));
		} else {
			Main.getInstace().stats.set(String.valueOf(p.getName()) + ".Money", (Object) 0);
		}
		Main.getInstace().save();
	}

	public static int getKills(final Player p) {
		return Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Kills");
	}

	public static int getDeaths(final Player p) {
		return Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Deaths");
	}

	public static int getMoney(final Player p) {
		return Main.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Money");
	}
}
