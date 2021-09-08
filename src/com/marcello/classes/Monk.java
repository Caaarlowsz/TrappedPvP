package com.marcello.classes;

import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import java.util.Random;
import com.marcello.api.CooldownAPI;
import com.marcello.utils.KitAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.Listener;

public class Monk implements Listener
{
    @EventHandler
    public void monkHabilidade(final PlayerInteractEntityEvent e) {
        final Player p = e.getPlayer();
        if (!(e.getRightClicked() instanceof Player)) {
            return;
        }
        final Player jogadorClicado = (Player)e.getRightClicked();
        if (p.getItemInHand().getType() == Material.BLAZE_ROD && KitAPI.getKit(p) == "Monk" && CooldownAPI.Cooldown.containsKey(p.getName())) {
            e.setCancelled(true);
            p.sendMessage("§c§lKIT §7Seu kit §4§lMONK §7est\u00e1 em cooldown aguarde alguns segundos");
            return;
        }
        if (p.getItemInHand().getType() == Material.BLAZE_ROD && KitAPI.getKit(p) == "Monk" && !CooldownAPI.Cooldown.containsKey(p.getName())) {
            final int random = new Random().nextInt(jogadorClicado.getInventory().getSize() - 10 + 1 + 10);
            final ItemStack ItemSelecionado = jogadorClicado.getInventory().getItem(random);
            final ItemStack ItemMudado = jogadorClicado.getItemInHand();
            jogadorClicado.setItemInHand(ItemSelecionado);
            jogadorClicado.getInventory().setItem(random, ItemMudado);
            jogadorClicado.sendMessage("§c§lKIT §7Seu inventario foi bagun\u00e7ado por um §4§lMONK");
            CooldownAPI.addCooldown(p, 35);
        }
    }
}
