package com.marcello.authme;

import org.bukkit.Sound;
import com.marcello.Main;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class Register implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String arg2, final String[] arg3) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("register")) {
            if (Main.plugin.getConfig().contains("Login." + p.getName().toLowerCase() + ".senha")) {
                p.sendMessage("�b�lREGISTER �7Est\u00e1 conta ja est\u00e1 registrada no nosso banco de dados.");
                p.playSound(p.getLocation(), Sound.EXPLODE, 5.0f, 5.0f);
                return true;
            }
            if (arg3.length == 0) {
                p.sendMessage("�b�lREGISTER �7Para efetuar seu registro utilize �b/register (senha)");
                return true;
            }
            if (arg3[0].length() <= 5) {
                p.sendMessage("b�lREGISTER �7A senha precisa conter no minimo 5 caracteres.");
                return true;
            }
            if (arg3.length == 1) {
                final String senha = arg3[0];
                Main.plugin.getConfig().set("Login." + p.getName().toLowerCase() + ".senha", (Object)senha);
                p.sendMessage("�6�l\u26a0 �b�lREGISTER �aVoc\u00ea registrou sua conta com sucesso");
                Main.login.remove(p.getName());
                Main.login.remove(p.getName());
                Main.plugin.saveConfig();
                return true;
            }
        }
        return false;
    }
}
