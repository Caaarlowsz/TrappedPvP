package com.marcello.utils;

import org.bukkit.entity.Player;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;

public class KillsDeathsMoney {
	public static void addKill(final Player p, final int i) {
		final int Value = TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Kills");
		TrappedPvP.getInstace().stats.set(String.valueOf(p.getName()) + ".Kills", (Object) (Value + 1));
		TrappedPvP.getInstace().save();
	}

	public static void addDeaths(final Player p, final int i) {
		final int Value = TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Deaths");
		TrappedPvP.getInstace().stats.set(String.valueOf(p.getName()) + ".Deaths", (Object) (Value + 1));
		TrappedPvP.getInstace().save();
	}

	public static void addMoney(final Player p, final int i) {
		final int Value = TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Money");
		TrappedPvP.getInstace().stats.set(String.valueOf(p.getName()) + ".Money", (Object) (Value + 100));
		TrappedPvP.getInstace().save();
	}

	public static void removermoney(final Player p, final int i) {
		final int Value = TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Money");
		if (Value - 60 > 0) {
			TrappedPvP.getInstace().stats.set(String.valueOf(p.getName()) + ".Money", (Object) (Value - 50));
		} else {
			TrappedPvP.getInstace().stats.set(String.valueOf(p.getName()) + ".Money", (Object) 0);
		}
		TrappedPvP.getInstace().save();
	}

	public static int getKills(final Player p) {
		return TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Kills");
	}

	public static int getDeaths(final Player p) {
		return TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Deaths");
	}

	public static int getMoney(final Player p) {
		return TrappedPvP.getInstace().stats.getInt(String.valueOf(p.getName()) + ".Money");
	}
}
