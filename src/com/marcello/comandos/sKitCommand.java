package com.marcello.comandos;

import com.marcello.api.ArraysAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;
import org.bukkit.command.CommandExecutor;

public class sKitCommand implements CommandExecutor
{
    public static HashMap<String, ItemStack[]> itens;
    public static HashMap<String, ItemStack[]> armadura;
    
    static {
        sKitCommand.itens = new HashMap<String, ItemStack[]>();
        sKitCommand.armadura = new HashMap<String, ItemStack[]>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("skit")) {
            if (!sender.hasPermission("cmd.skit")) {
                sender.sendMessage("§c§lPERMISSAO §7Voc\u00ea n\u00e3o possui permiss\u00e3o para este item");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§b§lSKIT §7Utilize o comando §b/skit (criar) §7ou §(aplicar) (nome)");
                return true;
            }
            if (args.length == 1) {
                p.sendMessage("§b§lSKIT §7Utilize o comando §b/skit (criar) §7ou §(aplicar) (nome)");
                return true;
            }
            if (args.length <= 2) {
                if (args[0].equalsIgnoreCase("criar")) {
                    final String nome = args[1];
                    if (sKitCommand.itens.containsKey(nome) && sKitCommand.armadura.containsKey(nome)) {
                        p.sendMessage("§b§lSKIT §7O kit §b" + nome + " §7j\u00e1 existe");
                        return true;
                    }
                    sKitCommand.itens.put(nome, p.getInventory().getContents());
                    sKitCommand.armadura.put(nome, p.getInventory().getArmorContents());
                    p.sendMessage("§b§lSKIT §7O kit nomeado de §b" + nome + " §7foi criado");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("remover")) {
                    final String nome = args[1];
                    if (!sKitCommand.itens.containsKey(nome) && !sKitCommand.armadura.containsKey(nome)) {
                        p.sendMessage("§b§lSKIT §7O kit §b" + nome + " §7 n\u00e3o est\u00e1 no nosso banco de dados");
                        return true;
                    }
                    sKitCommand.itens.remove(nome);
                    sKitCommand.armadura.remove(nome);
                    p.sendMessage("§b§lSKIT §7O kit §b" + nome + " §7foi removido do nosso banco de dados");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("aplicar")) {
                    final String nome = args[1];
                    if (!sKitCommand.itens.containsKey(nome) && !sKitCommand.armadura.containsKey(nome)) {
                        p.sendMessage("§b§lSKIT §7O kit §b" + nome + " §7 n\u00e3o est\u00e1 no nosso banco de dados");
                        return true;
                    }
                    if (sKitCommand.itens.containsKey(nome) && sKitCommand.armadura.containsKey(nome)) {
                        Player[] onlinePlayers;
                        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                            final Player todos = onlinePlayers[i];
                            if (todos != p && !ArraysAPI.Admin.contains(todos)) {
                                todos.getInventory().setContents((ItemStack[])sKitCommand.itens.get(nome));
                                todos.getInventory().setArmorContents((ItemStack[])sKitCommand.armadura.get(nome));
                                todos.updateInventory();
                                p.sendMessage("§b§lSKIT §7O kit §b" + nome + " §7foi aplicado para todos os jogadores!");
                                Bukkit.broadcastMessage("§b§lSKIT §7O kit §b" + nome + " §7foi aplicado para todos os jogadores");
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
