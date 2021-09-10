package com.marcello.authme;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.marcello.Main;

public class Login implements Listener {
	public static boolean premium(final String nome) {
		try {
			final URL url = new URL("https://minecraft.net/haspaid.jsp?user=" + nome);
			final String prem = new BufferedReader(new InputStreamReader(url.openStream())).readLine().toUpperCase();
			final boolean premium = Boolean.valueOf(prem);
			if (premium) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	@EventHandler
	public void aoLogin(final PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		Main.login.add(p.getName());
		if (Main.plugin.getConfig().contains("Login." + p.getName().toLowerCase() + ".senha")) {
			Main.plugin.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, (Runnable) new Runnable() {
				@Override
				public void run() {
					if (Main.login.contains(p.getName())) {
						p.sendMessage("§b§lLOGIN §7Para efetuar seu login utilize §b/login (senha)");
					}
				}
			}, 0L, 100L);
		}
		if (!Main.plugin.getConfig().contains("Login." + p.getName().toLowerCase() + ".senha")) {
			Main.plugin.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, (Runnable) new Runnable() {
				@Override
				public void run() {
					if (Main.login.contains(p.getName())) {
						p.sendMessage("§b§lREGISTER §7Para efetuar seu registro utilize §b/register (senha)");
					}
				}
			}, 0L, 100L);
		}
	}
}
