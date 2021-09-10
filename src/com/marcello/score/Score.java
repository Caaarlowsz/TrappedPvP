package com.marcello.score;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import com.marcello.Main;
import com.marcello.utils.KillsDeathsMoney;
import com.marcello.utils.KitAPI;

public class Score {
	private static String[] animation;
	private static Integer animationI;

	static {
		Score.animation = new String[] { "§b§lTRAPPED", "§b§lTRAPPED", "§f§lT§b§lRAPPED", "§b§lT§f§lR§b§lAPPED",
				"§b§lTR§f§lA§b§lPPED", "§b§lTRA§F§LP§B§LPED", "§b§lTRAP§f§lP§b§lED", "§b§lTRAPP§f§lE§b§lD",
				"§b§lTRAPPED§f§lMC", "§b§lTRAPPED", "§bTRAPPED§f§lMC", "§b§lTRAPPED", "§0§l§kTRAPPED§f§lMC" };
		Score.animationI = 0;
	}

	public static void setScore(final Player p) {
		final Scoreboard score = Bukkit.getScoreboardManager().getNewScoreboard();
		final Objective o = score.registerNewObjective("dummy", "dummy");
		o.setDisplayName("§b§lTRAPPED§f§lMC");
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		final Team kills = score.registerNewTeam("kills");
		final OfflinePlayer of0 = Bukkit.getOfflinePlayer("§fMatou §7\u279c §3");
		kills.addPlayer(of0);
		kills.setSuffix(new StringBuilder(String.valueOf(KillsDeathsMoney.getKills(p))).toString());
		final Team deaths = score.registerNewTeam("deaths");
		final OfflinePlayer of2 = Bukkit.getOfflinePlayer("§fMortes §7\u279c §3");
		deaths.addPlayer(of2);
		deaths.setSuffix(new StringBuilder(String.valueOf(KillsDeathsMoney.getDeaths(p))).toString());
		final Team money = score.registerNewTeam("money");
		final OfflinePlayer of3 = Bukkit.getOfflinePlayer("§fCoins §7\u279c §3");
		money.addPlayer(of3);
		money.setSuffix(new StringBuilder(String.valueOf(KillsDeathsMoney.getMoney(p))).toString());
		final Team kit = score.registerNewTeam("kit");
		final OfflinePlayer of4 = Bukkit.getOfflinePlayer("§fKit §7\u279c  §3");
		kit.addPlayer(of4);
		kit.setSuffix(KitAPI.getKit(p));
		final Team online = score.registerNewTeam("online");
		final OfflinePlayer of5 = Bukkit.getOfflinePlayer("§fOnline §7\u279c §3");
		online.addPlayer(of5);
		online.setSuffix(
				String.valueOf(String.valueOf(Bukkit.getOnlinePlayers().length)) + "§3/§3" + Bukkit.getMaxPlayers());
		o.getScore(of0).setScore(7);
		o.getScore(of2).setScore(6);
		o.getScore(of3).setScore(5);
		o.getScore(Bukkit.getOfflinePlayer("§f§l")).setScore(4);
		o.getScore(of4).setScore(2);
		o.getScore(Bukkit.getOfflinePlayer("§9§l")).setScore(1);
		o.getScore(of5).setScore(0);
		p.setScoreboard(score);
	}

	public static void updateScore(final Player p) {
		final Scoreboard score = p.getScoreboard();
		if (score.getObjective("dummy") != null) {
			final Team kills = score.getTeam("kills");
			final Team deaths = score.getTeam("deaths");
			final Team money = score.getTeam("money");
			final Team kit = score.getTeam("kit");
			final Team online = score.getTeam("online");
			score.getObjective(DisplaySlot.SIDEBAR).setDisplayName(Score.animation[Score.animationI]);
			kills.setSuffix("0");
			deaths.setSuffix("0");
			money.setSuffix("0");
			kit.setSuffix(KitAPI.getKit(p));
			online.setSuffix(String.valueOf(String.valueOf(Bukkit.getOnlinePlayers().length)) + "§6/§e"
					+ Bukkit.getMaxPlayers());
		}
	}

	public static void timerUpdate() {
		Main.plugin.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, (Runnable) new Runnable() {
			@Override
			public void run() {
				Player[] onlinePlayers;
				for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
					final Player p = onlinePlayers[i];
					Score.updateScore(p);
				}
				if (Score.animationI < Score.animation.length - 1) {
					Score.access$2(Score.animationI + 1);
				} else {
					Score.access$2(0);
				}
			}
		}, 0L, 10L);
	}

	static void access$2(final Integer animationI) {
		Score.animationI = animationI;
	}
}
