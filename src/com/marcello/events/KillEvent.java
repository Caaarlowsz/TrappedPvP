package com.marcello.events;

import org.bukkit.event.EventHandler;
import com.marcello.utils.KitAPI;
import com.marcello.utils.KillsDeathsMoney;
import com.marcello.score.Score;
import org.bukkit.entity.Player;
import com.marcello.utils.WarpsAPI;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.Listener;

public class KillEvent implements Listener
{
    @EventHandler
    public void Matan\u00e7a(final PlayerDeathEvent e) {
        final Player p = e.getEntity();
        final Player t = p.getKiller();
        WarpsAPI.ir(p, "Spawn");
        if (e.getEntity().getKiller() instanceof Player) {
            Score.setScore(p);
            KillsDeathsMoney.addDeaths(p, 1);
            KillsDeathsMoney.addKill(t, 1);
            KillsDeathsMoney.addMoney(t, 100);
            KillsDeathsMoney.removermoney(p, 50);
            KitAPI.RemoveKit(p);
            e.setDeathMessage((String)null);
            p.sendMessage("§c§lMORTE §7Voc\u00ea morreu para §c" + t.getName());
            p.sendMessage("§6§lCOINS §7Voc\u00ea perdeu 50 coins");
            p.setLevel(0);
            t.sendMessage("§a§lKILL §7Voc\u00ea matou o player §a" + p.getName());
            t.sendMessage("§6§lCOINS §7Voc\u00ea ganhou 100 coins");
            t.setLevel(1);
        }
        else {
            Score.setScore(p);
            KitAPI.RemoveKit(p);
            e.setDeathMessage("§c§lMORTE §cVoc\u00ea morreu.");
        }
    }
}
