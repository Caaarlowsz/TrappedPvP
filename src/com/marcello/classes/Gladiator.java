package com.marcello.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.marcello.Main;
import com.marcello.utils.KitAPI;

public class Gladiator implements Listener {
	public static ArrayList<String> gladgladiator;
	public boolean generateGLASS;
	public HashMap<String, Location> oldl;
	public static HashMap<String, String> lutando;
	public HashMap<Integer, ArrayList<Location>> blocks;
	public HashMap<Player, Location> localizacao;
	public HashMap<Location, Block> bloco;
	public HashMap<Integer, String[]> players;
	public HashMap<String, Integer> tasks;
	int nextID;
	public int id1;
	public int id2;

	static {
		Gladiator.gladgladiator = new ArrayList<String>();
		Gladiator.lutando = new HashMap<String, String>();
	}

	public Gladiator() {
		this.generateGLASS = true;
		this.oldl = new HashMap<String, Location>();
		this.blocks = new HashMap<Integer, ArrayList<Location>>();
		this.localizacao = new HashMap<Player, Location>();
		this.bloco = new HashMap<Location, Block>();
		this.players = new HashMap<Integer, String[]>();
		this.tasks = new HashMap<String, Integer>();
		this.nextID = 0;
	}

	@EventHandler
	public void OnGladiatorKit(final PlayerInteractEntityEvent event) {
		final Player p = event.getPlayer();
		if (event.getRightClicked() instanceof Player) {
			final Player r = (Player) event.getRightClicked();
			if (p.getItemInHand().getType() == Material.IRON_FENCE && KitAPI.getKit(p) == "Gladiator") {
				final Location loc = new Location(p.getWorld(), (double) p.getLocation().getBlockX(),
						(double) (p.getLocation().getBlockY() + 70), (double) p.getLocation().getBlockZ());
				this.localizacao.put(p, loc);
				this.localizacao.put(r, loc);
				final Location loc2 = new Location(p.getWorld(), (double) (p.getLocation().getBlockX() + 8),
						(double) (p.getLocation().getBlockY() + 73), (double) (p.getLocation().getBlockZ() + 8));
				final Location loc3 = new Location(p.getWorld(), (double) (p.getLocation().getBlockX() - 8),
						(double) (p.getLocation().getBlockY() + 73), (double) (p.getLocation().getBlockZ() - 8));
				if (Gladiator.lutando.containsKey(p.getName()) || Gladiator.lutando.containsKey(r.getName())) {
					event.setCancelled(true);
					p.sendMessage("§c§lGLADIATOR §7Voc\u00ea ja est\u00e1 em uma arena gladiator");
					return;
				}
				final Integer currentID = this.nextID;
				++this.nextID;
				final ArrayList<String> list = new ArrayList<String>();
				list.add(p.getName());
				list.add(r.getName());
				this.players.put(currentID, list.toArray(new String[1]));
				this.oldl.put(p.getName(), p.getLocation());
				this.oldl.put(r.getName(), r.getLocation());
				if (this.generateGLASS) {
					final List<Location> cuboid = new ArrayList<Location>();
					cuboid.clear();
					for (int bX = -10; bX <= 10; ++bX) {
						for (int bZ = -10; bZ <= 10; ++bZ) {
							for (int bY = -1; bY <= 10; ++bY) {
								final Block b = loc.clone().add((double) bX, (double) bY, (double) bZ).getBlock();
								if (!b.isEmpty()) {
									event.setCancelled(true);
									p.sendMessage(
											"§c§lGLADIATOR §7Possuem blocos acima n\u00e3o \u00e9 possivel criar arena aqui");
									return;
								}
								if (bY == 10) {
									cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
								} else if (bY == -1) {
									cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
								} else if (bX == -10 || bZ == -10 || bX == 10 || bZ == 10) {
									cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
								}
							}
						}
					}
					for (final Location loc4 : cuboid) {
						loc4.getBlock().setType(Material.GLASS);
						this.bloco.put(loc4, loc4.getBlock());
					}
					loc2.setYaw(135.0f);
					p.teleport(loc2);
					loc3.setYaw(-45.0f);
					r.teleport(loc3);
					p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 110, 5));
					r.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 110, 5));
					p.sendMessage(
							"§c§lGLADIATOR §7Voc\u00ea desafiou um player para uma batalha, ambos possuem 5 segundos de invesibilidade para se preparar");
					p.sendMessage(
							"§c§lGLADIATOR §7Observa\u00e7\u00e3o, se passar 4 minutos na arena e ninguem morrer ambos voltaram para os locais de inicio, \u00e9 a arena ser\u00e1 deletada");
					r.sendMessage(
							"§c§lGLADIATOR §7Voc\u00ea foi desafiado por um player para uma batalha, ambos possuem 5 segundos de invesibilidade para se preparar");
					r.sendMessage(
							"§c§lGLADIATOR §7Observa\u00e7\u00e3o, se passar 4 minutos na arena e ninguem morrer ambos voltaram para os locais de inicio, \u00e9 a arena ser\u00e1 deletada");
					Gladiator.lutando.put(p.getName(), r.getName());
					Gladiator.lutando.put(r.getName(), p.getName());
					Gladiator.gladgladiator.add(p.getName());
					Gladiator.gladgladiator.add(r.getName());
					this.id2 = Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) Main.getInstace(),
							(Runnable) new Runnable() {
								@Override
								public void run() {
									if (Gladiator.lutando.containsKey(p.getName())
											&& Gladiator.lutando.get(p.getName()).equalsIgnoreCase(r.getName())
											&& Gladiator.lutando.containsKey(r.getName())
											&& Gladiator.lutando.get(r.getName()).equalsIgnoreCase(p.getName())) {
										p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 2000000, 5));
										r.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 2000000, 5));
									}
								}
							}, 2400L);
					this.id1 = Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) Main.getInstace(),
							(Runnable) new Runnable() {
								@Override
								public void run() {
									if (Gladiator.lutando.containsKey(p.getName())
											&& Gladiator.lutando.get(p.getName()).equalsIgnoreCase(r.getName())
											&& Gladiator.lutando.containsKey(r.getName())
											&& Gladiator.lutando.get(r.getName()).equalsIgnoreCase(p.getName())) {
										Gladiator.lutando.remove(p.getName());
										Gladiator.lutando.remove(r.getName());
										Gladiator.gladgladiator.remove(p.getName());
										Gladiator.gladgladiator.remove(r.getName());
										p.teleport((Location) Gladiator.this.oldl.get(p.getName()));
										r.teleport((Location) Gladiator.this.oldl.get(r.getName()));
										Gladiator.this.oldl.remove(p.getName());
										Gladiator.this.oldl.remove(r.getName());
										p.sendMessage(
												"§c§lGLADIATOR §7Ninguem venceu a batalha, voc\u00ea voltou para o local de inico");
										r.sendMessage(
												"§c§lGLADIATOR §7Ninguem venceu a batalha, voc\u00ea voltou para o local de inico");
										final Location loc = Gladiator.this.localizacao.get(p);
										final List<Location> cuboid = new ArrayList<Location>();
										for (int bX = -10; bX <= 10; ++bX) {
											for (int bZ = -10; bZ <= 10; ++bZ) {
												for (int bY = -1; bY <= 10; ++bY) {
													if (bY == 10) {
														cuboid.add(
																loc.clone().add((double) bX, (double) bY, (double) bZ));
													} else if (bY == -1) {
														cuboid.add(
																loc.clone().add((double) bX, (double) bY, (double) bZ));
													} else if (bX == -10 || bZ == -10 || bX == 10 || bZ == 10) {
														cuboid.add(
																loc.clone().add((double) bX, (double) bY, (double) bZ));
													}
												}
											}
										}
										for (final Location loc2 : cuboid) {
											loc2.getBlock().setType(Material.AIR);
											Gladiator.this.bloco.get(loc2).setType(Material.AIR);
										}
									}
								}
							}, 4800L);
				}
			}
		}
	}

	@EventHandler
	public void onPlayerInteractGlad(final PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		if (p.getItemInHand().getType() == Material.IRON_FENCE && KitAPI.getKit(p) == "Gladiator") {
			e.setCancelled(true);
			p.updateInventory();
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDrop(final PlayerDropItemEvent e) {
		final Player p = e.getPlayer();
		if (p.getItemInHand().getType() == Material.IRON_FENCE && KitAPI.getKit(p) == "Gladiator") {
			e.setCancelled(true);
			p.updateInventory();
			p.sendMessage("§c§lGLADIATOR §7Voc\u00ea n\u00e3o pode dropar o item do gladiator");
		}
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlyaerInteract(final PlayerInteractEvent e) {
		if (e.getAction() == Action.LEFT_CLICK_BLOCK && e.getClickedBlock().getType() == Material.GLASS
				&& e.getPlayer().getGameMode() != GameMode.CREATIVE
				&& Gladiator.lutando.containsKey(e.getPlayer().getName())) {
			e.setCancelled(true);
			e.getClickedBlock().setType(Material.BEDROCK);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) Main.getInstace(),
					(Runnable) new Runnable() {
						@Override
						public void run() {
							if (Gladiator.lutando.containsKey(e.getPlayer().getName())) {
								e.getClickedBlock().setType(Material.GLASS);
							}
						}
					}, 30L);
		}
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockBreak(final BlockBreakEvent e) {
		if (e.getBlock().getType() == Material.GLASS && e.getPlayer().getGameMode() != GameMode.CREATIVE
				&& Gladiator.lutando.containsKey(e.getPlayer().getName())) {
			e.setCancelled(true);
			e.getBlock().setType(Material.BEDROCK);
			Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) Main.getInstace(), (Runnable) new Runnable() {
				@Override
				public void run() {
					if (e.getPlayer().getGameMode() != GameMode.CREATIVE
							&& Gladiator.lutando.containsKey(e.getPlayer().getName())) {
						e.getBlock().setType(Material.GLASS);
					}
				}
			}, 30L);
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerLeft(final PlayerQuitEvent e) {
		final Player p = e.getPlayer();
		if (Gladiator.lutando.containsKey(p.getName())) {
			final Player t = Bukkit.getServer().getPlayer((String) Gladiator.lutando.get(p.getName()));
			Gladiator.lutando.remove(t.getName());
			Gladiator.lutando.remove(p.getName());
			Gladiator.gladgladiator.remove(p.getName());
			Gladiator.gladgladiator.remove(t.getName());
			final Location old = this.oldl.get(t.getName());
			t.teleport(old);
			t.sendMessage("§c§lGLADIATOR §7O jogador §c" + p.getName() + " §7deslogou no meio da batalha");
			t.sendMessage("§c§lGLADIATOR §7Voc\u00ea ganhou a batalha");
			Bukkit.getScheduler().cancelTask(this.id1);
			Bukkit.getScheduler().cancelTask(this.id2);
			t.removePotionEffect(PotionEffectType.WITHER);
			final Location loc = this.localizacao.get(p);
			final List<Location> cuboid = new ArrayList<Location>();
			for (int bX = -10; bX <= 10; ++bX) {
				for (int bZ = -10; bZ <= 10; ++bZ) {
					for (int bY = -1; bY <= 10; ++bY) {
						if (bY == 10) {
							cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
						} else if (bY == -1) {
							cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
						} else if (bX == -10 || bZ == -10 || bX == 10 || bZ == 10) {
							cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
						}
					}
				}
			}
			for (final Location loc2 : cuboid) {
				loc2.getBlock().setType(Material.AIR);
				this.bloco.get(loc2).setType(Material.AIR);
			}
			for (final Location loc2 : cuboid) {
				loc2.getBlock().setType(Material.AIR);
				this.bloco.get(loc2).setType(Material.AIR);
			}
			for (final Location loc2 : cuboid) {
				loc2.getBlock().setType(Material.AIR);
				this.bloco.get(loc2).setType(Material.AIR);
			}
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDeathGladiator(final PlayerDeathEvent e) {
		final Player p = e.getEntity();
		if (Gladiator.lutando.containsKey(p.getName())) {
			final Player k = Bukkit.getServer().getPlayer((String) Gladiator.lutando.get(p.getName()));
			final Location old = this.oldl.get(p.getName());
			k.teleport(old);
			k.sendMessage(
					"§c§lGLADIATOR §7Voc\u00ea venceu a batalha contra §c" + p.getName() + ChatColor.GREEN + "§a!");
			Bukkit.getScheduler().cancelTask(this.id1);
			Bukkit.getScheduler().cancelTask(this.id2);
			k.removePotionEffect(PotionEffectType.WITHER);
			k.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 10));
			Gladiator.lutando.remove(k.getName());
			Gladiator.lutando.remove(p.getName());
			Gladiator.gladgladiator.remove(p.getName());
			Gladiator.gladgladiator.remove(k.getName());
			final Location loc = this.localizacao.get(p);
			final List<Location> cuboid = new ArrayList<Location>();
			cuboid.clear();
			for (int bX = -10; bX <= 10; ++bX) {
				for (int bZ = -10; bZ <= 10; ++bZ) {
					for (int bY = -1; bY <= 10; ++bY) {
						if (bY == 10) {
							cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
						} else if (bY == -1) {
							cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
						} else if (bX == -10 || bZ == -10 || bX == 10 || bZ == 10) {
							cuboid.add(loc.clone().add((double) bX, (double) bY, (double) bZ));
						}
					}
				}
			}
			for (final Location loc2 : cuboid) {
				loc2.getBlock().setType(Material.AIR);
				if (this.bloco.containsKey(loc2)) {
					this.bloco.get(loc2).setType(Material.AIR);
				}
			}
		}
	}
}
