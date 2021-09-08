package com.marcello.comandos;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class PermissionsListCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (p.hasPermission("cmd.permissionslist") && cmd.getName().equalsIgnoreCase("permissionslist") && args.length == 0) {
            p.sendMessage("§eExibindo lista de permiss\u00f5es:");
            p.sendMessage("§e");
            p.sendMessage("§7Admin - Permiss\u00e3o ao Modo Administrador");
            p.sendMessage("§7staffchat - Permiss\u00e3o ao StaffChat");
            p.sendMessage("§7fullkit - Permiss\u00e3o ao FullKit (Todos os kits)");
            p.sendMessage("§7teleportar - Permiss\u00e3o para Usar o /tp , tphere e /tpall");
            p.sendMessage("§7setgroups - Permiss\u00e3o para setar grupos");
            p.sendMessage("§7givevips - Permiss\u00e3o para dar Vips");
            p.sendMessage("§7givekit - Permiss\u00e3o para Dar Kits");
            p.sendMessage("§7sortearkit - Permiss\u00e3o para Sortear Kits (/sortearkit)");
            p.sendMessage("§7sortearvip - Permiss\u00e3o para Sortear Vips (/sortearvip)");
            p.sendMessage("§7");
            p.sendMessage("§c[OBSERVA\u00c7\u00c3O] Essas permiss\u00f5es devem ser usadas no /givepermission ou /removepermission, Exemplo:");
            p.sendMessage("§7/givepermission Tester Admin");
            p.sendMessage("§cDar\u00e1 ao jogador 'Tester' a Permiss\u00e3o do /admin (Modo Administrador)");
            p.sendMessage("§4[AVISO] O USO INAPROPRIADO, DE M\ufffd? F\u00c9, E ABUSIVO DESTES COMANDOS PODEM CAUSAR PERDA PERMANENTE DO SEU CARGO!");
            return true;
        }
        return false;
    }
}
