package com.marcello.comandos;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.github.caaarlowsz.trappedmc.kitpvp.TrappedPvP;
import com.marcello.api.HorarioAPI;
import com.marcello.manager.ListKits;

public class SorteioKitCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (sender.hasPermission("cmd.sortearkit")) {
			final ArrayList<String> Kit = new ArrayList<String>();
			ListKits[] values;
			for (int length = (values = ListKits.values()).length, i = 0; i < length; ++i) {
				final ListKits s = values[i];
				if (!Kit.contains(s.name())) {
					Kit.add(s.name().toLowerCase());
				}
			}
			Bukkit.broadcastMessage("              �c�lReverse�f�lMC         ");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("�7�lESTAMOS INICIANDO UM �c�lSORTEIO�7�l!  ");
			Bukkit.broadcastMessage("�7�lO PR\u00caMIO SER\u00c0 UM KIT ALEATORIO!       ");
			Bukkit.broadcastMessage("�7�lHORARARIO DE INICIO: �c�l" + HorarioAPI.getHorario());
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("              �7�l� �c�LSORTEIO             ");
			new BukkitRunnable() {
				public void run() {
					final ArrayList<Player> Players = new ArrayList<Player>();
					Player[] onlinePlayers;
					for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
						final Player all = onlinePlayers[i];
						if (!Players.contains(all)) {
							Players.add(all);
						}
					}
					final Player random = Players.get(new Random().nextInt(Players.size()));
					Bukkit.broadcastMessage("            �c�lReverse�f�lMC  ");
					Bukkit.broadcastMessage("");
					Bukkit.broadcastMessage("�7�lO SORTEIO DO KIT FOI FINALIZADO");
					Bukkit.broadcastMessage("�7�lO GANHADOR FOI: �c" + random.getName());
					Bukkit.broadcastMessage("�7�lHORARIO FINALIZADO: �c" + HorarioAPI.getHorario());
					final Random r = new Random();
					final int x = r.nextInt(Kit.size());
					Bukkit.broadcastMessage("�7�lO KIT GANHO FOI: �c�l" + Kit.get(x));
					Bukkit.broadcastMessage("");
					Bukkit.broadcastMessage("              �7�l� �c�LSORTEIO             ");
					Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(),
							"pex user " + random.getName() + " add kit." + Kit.get(x));
				}
			}.runTaskLater((Plugin) TrappedPvP.instance, 200L);
		}
		return false;
	}
}
