package com.marcello.manager;

import org.bukkit.configuration.InvalidConfigurationException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.File;
import org.bukkit.enchantments.Enchantment;
import java.util.Iterator;
import org.bukkit.potion.PotionEffect;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.FireworkEffect;
import java.util.Random;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.Color;
import java.util.Collection;
import java.util.ArrayList;
import org.bukkit.Location;
import net.md_5.bungee.api.ChatColor;
import java.util.Collections;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.Material;
import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;

public class Metodos
{
    static HashMap<String, ItemStack[]> armor;
    static HashMap<String, ItemStack[]> inv;
    public static HashMap<String, Integer> ID;
    
    static {
        Metodos.armor = new HashMap<String, ItemStack[]>();
        Metodos.inv = new HashMap<String, ItemStack[]>();
        Metodos.ID = new HashMap<String, Integer>();
    }
    
    public static void Head(final Player p, final String nome, final int slot, final List<String> lore) {
        final ItemStack skull = new ItemStack(Material.getMaterial(397));
        final SkullMeta sm = (SkullMeta)skull.getItemMeta();
        sm.setLore((List)lore);
        skull.setDurability((short)3);
        sm.hasOwner();
        sm.setOwner(p.getName());
        sm.setDisplayName(nome);
        skull.setItemMeta((ItemMeta)sm);
        p.getInventory().setItem(slot, skull);
    }
    
    public static Integer getTOPNameArrayList(final List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
    
    public static void sendTabTitle(final Player player, String header, String footer) {
        if (header == null) {
            header = "";
        }
        header = ChatColor.translateAlternateColorCodes('&', header);
        if (footer == null) {
            footer = "";
        }
        footer = ChatColor.translateAlternateColorCodes('&', footer);
        header = header.replaceAll("%player%", player.getDisplayName());
        footer = footer.replaceAll("%player%", player.getDisplayName());
    }
    
    public static void saveArmor(final Player p) {
        Metodos.armor.put(p.getName(), p.getInventory().getArmorContents());
    }
    
    public static void loadArmor(final Player p) {
        p.getInventory().setArmorContents((ItemStack[])Metodos.armor.get(p.getName()));
        p.updateInventory();
    }
    
    public static void saveInv(final Player p) {
        Metodos.inv.put(p.getName(), p.getInventory().getArmorContents());
    }
    
    public static void loadInv(final Player p) {
        p.getInventory().setArmorContents((ItemStack[])Metodos.inv.get(p.getName()));
    }
    
    public static ArrayList<Location> getCircle(final Location loc, final Integer r) {
        final ArrayList<Location> locations = new ArrayList<Location>();
        final int y = loc.getBlockY();
        for (double i = 0.0; i < 360.0; i += 0.1) {
            final double angle = i * 3.141592653589793 / 180.0;
            final int x = (int)(loc.getX() + r * Math.cos(angle));
            final int z = (int)(loc.getZ() + r * Math.sin(angle));
            locations.add(new Location(loc.getWorld(), (double)x, (double)y, (double)z));
        }
        return locations;
    }
    
    public static Collection<? extends Player> allPlayer() {
        return null;
    }
    
    public static void SetRopaColorida(final Player p, final Color cor) {
        final ItemStack c = new ItemStack(Material.LEATHER_HELMET);
        final LeatherArmorMeta cm = (LeatherArmorMeta)c.getItemMeta();
        cm.setColor(cor);
        c.setItemMeta((ItemMeta)cm);
        p.getInventory().setHelmet(c);
        final ItemStack c2 = new ItemStack(Material.LEATHER_CHESTPLATE);
        final LeatherArmorMeta cm2 = (LeatherArmorMeta)c2.getItemMeta();
        cm2.setColor(cor);
        c2.setItemMeta((ItemMeta)cm2);
        p.getInventory().setChestplate(c2);
        final ItemStack c3 = new ItemStack(Material.LEATHER_LEGGINGS);
        final LeatherArmorMeta cm3 = (LeatherArmorMeta)c3.getItemMeta();
        cm3.setColor(cor);
        c3.setItemMeta((ItemMeta)cm3);
        p.getInventory().setLeggings(c3);
        final ItemStack c4 = new ItemStack(Material.LEATHER_BOOTS);
        final LeatherArmorMeta cm4 = (LeatherArmorMeta)c4.getItemMeta();
        cm4.setColor(cor);
        c4.setItemMeta((ItemMeta)cm4);
        p.getInventory().setBoots(c4);
        p.updateInventory();
    }
    
    public static int getAmount(final Player player, final Material id) {
        int amout = 0;
        ItemStack[] contents;
        for (int length = (contents = player.getInventory().getContents()).length, i = 0; i < length; ++i) {
            final ItemStack item = contents[i];
            if (item != null && item.getType() == id && item.getAmount() > 0) {
                amout += item.getAmount();
            }
        }
        return amout;
    }
    
    public static Inventory criarmenu(final int slot, final String nome) {
        return Bukkit.createInventory((InventoryHolder)null, slot, nome);
    }
    
    public static void Item1v1(final Player p) {
        p.getInventory().clear();
        p.getInventory().setArmorContents((ItemStack[])null);
        p.getInventory().setItem(2, itemStack(Material.IRON_FENCE, 0, 1, "§7» §aDesafiar §7«"));
        p.getInventory().setItem(4, itemStack(Material.SLIME_BALL, 0, 1, "§7» §aPartida Rapida §7«"));
        p.getInventory().setItem(6, itemStack(Material.REDSTONE, 0, 1, "§7» §aSair da 1v1 §7«"));
    }
    
    public static ItemStack head(final String nome, final String owner, final List<String> lore) {
        final ItemStack skull = new ItemStack(Material.getMaterial(397));
        final SkullMeta sm = (SkullMeta)skull.getItemMeta();
        sm.setLore((List)lore);
        skull.setDurability((short)3);
        sm.hasOwner();
        sm.setOwner(owner);
        sm.setDisplayName(nome);
        skull.setItemMeta((ItemMeta)sm);
        return skull;
    }
    
    public static ItemStack itemstack(final Material mat, final int data, final int quantia, final String nome, final List<String> lore) {
        final ItemStack a = new ItemStack(mat, quantia, (short)data);
        final ItemMeta am = a.getItemMeta();
        am.setLore((List)lore);
        am.setDisplayName(nome);
        a.setItemMeta(am);
        return a;
    }
    
    public static void SetItemHotBar(final Player p, final String nome, final int slot, final int data, final Material mat) {
        final ItemStack sopa = new ItemStack(mat, 1, (short)data);
        final ItemMeta sopam = sopa.getItemMeta();
        sopam.setDisplayName(nome);
        sopa.setItemMeta(sopam);
        p.getInventory().setItem(slot, sopa);
    }
    
    public static void spawnRandomFirework(final Location loc) {
        final Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        final FireworkMeta fwm = fw.getFireworkMeta();
        final Random r = new Random();
        final int rt = r.nextInt(4) + 1;
        FireworkEffect.Type type = FireworkEffect.Type.BALL;
        if (rt == 1) {
            type = FireworkEffect.Type.BALL;
        }
        if (rt == 2) {
            type = FireworkEffect.Type.BALL_LARGE;
        }
        if (rt == 3) {
            type = FireworkEffect.Type.BURST;
        }
        if (rt == 4) {
            type = FireworkEffect.Type.CREEPER;
        }
        if (rt == 5) {
            type = FireworkEffect.Type.STAR;
        }
        final Color c1 = Color.RED;
        final Color c2 = Color.YELLOW;
        final Color c3 = Color.ORANGE;
        final FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withColor(c2).withFade(c3).with(type).trail(r.nextBoolean()).build();
        fwm.addEffect(effect);
        fwm.setPower(1);
        fw.setFireworkMeta(fwm);
    }
    
    public static ItemStack ItemMenu(final Material mat, final int cor, final String nome, final List<String> lore) {
        final ItemStack item = new ItemStack(mat, 1, (short)cor);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setLore((List)lore);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final int durability, final int amount, final String nome) {
        final ItemStack item = new ItemStack(material, amount, (short)durability);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final int durability, final int amount, final String nome, final List<String> lore) {
        final ItemStack item = new ItemStack(material, amount, (short)durability);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setLore((List)lore);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final int amount, final int durability) {
        final ItemStack item = new ItemStack(material, amount, (short)durability);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static void fillInvGlass(final Material mat, final Inventory inv, final int cor) {
        final ItemStack a1 = new ItemStack(mat, 1, (short)cor);
        final ItemMeta am1 = a1.getItemMeta();
        am1.setDisplayName("§7-");
        a1.setItemMeta(am1);
        inv.addItem(new ItemStack[] { a1 });
        ItemStack[] arrayOfItemStack;
        for (int descpyro = (arrayOfItemStack = inv.getContents()).length, metapyro = 0; metapyro < descpyro; ++metapyro) {
            final ItemStack item = arrayOfItemStack[metapyro];
            if (item == null) {
                inv.setItem(inv.firstEmpty(), a1);
            }
        }
    }
    
    public static String Convert(final Integer i) {
        final int minutes = i / 60;
        final int seconds = i % 60;
        final String disMinu = String.valueOf((minutes < 10) ? "" : "") + minutes;
        final String disSec = String.valueOf((seconds < 10) ? "0" : "") + seconds;
        final String formattedTime = String.valueOf(disMinu) + ":" + disSec;
        return formattedTime;
    }
    
    public static String TimePerfeito(final Integer i) {
        final int minutes = i / 60;
        final int seconds = i % 60;
        final String disMinu = String.valueOf((minutes < 10) ? "" : "") + minutes;
        final String disSec = String.valueOf((seconds < 10) ? "" : "") + seconds;
        String formattedTime;
        if (i >= 60) {
            formattedTime = String.valueOf(disMinu) + "m " + disSec + "s";
        }
        else {
            formattedTime = String.valueOf(disSec) + "s";
        }
        if (i % 60 == 0) {
            formattedTime = String.valueOf(disMinu) + "m";
        }
        return formattedTime;
    }
    
    public static ItemStack head(final String owner) {
        final ItemStack skull = new ItemStack(Material.getMaterial(397));
        final SkullMeta sm = (SkullMeta)skull.getItemMeta();
        skull.setDurability((short)3);
        sm.hasOwner();
        sm.setOwner(owner);
        sm.setDisplayName("§e" + owner);
        skull.setItemMeta((ItemMeta)sm);
        return skull;
    }
    
    public static ItemStack head(final String owner, final String d) {
        final ItemStack skull = new ItemStack(Material.getMaterial(397));
        final SkullMeta sm = (SkullMeta)skull.getItemMeta();
        skull.setDurability((short)3);
        sm.hasOwner();
        sm.setOwner(owner);
        sm.setDisplayName("§e" + d);
        skull.setItemMeta((ItemMeta)sm);
        return skull;
    }
    
    public static void CriarArena(final Player p, final Player o) {
        o.getLocation().add(0.0, 13.0, 0.0).getBlock().setType(Material.BEDROCK);
        o.getLocation().add(0.0, 11.0, 1.0).getBlock().setType(Material.BEDROCK);
        o.getLocation().add(1.0, 11.0, 0.0).getBlock().setType(Material.BEDROCK);
        o.getLocation().add(0.0, 11.0, -1.0).getBlock().setType(Material.BEDROCK);
        o.getLocation().add(-1.0, 11.0, 0.0).getBlock().setType(Material.BEDROCK);
        o.getLocation().add(0.0, 10.0, 0.0).getBlock().setType(Material.BEDROCK);
        o.teleport(o.getLocation().add(0.0, 11.0, -0.05));
        o.teleport(o.getLocation().add(0.0, 0.0, -0.0));
        o.teleport(o.getLocation().add(0.0, 0.0, -0.0));
        o.teleport(o.getLocation().add(0.0, 0.0, -0.0));
        o.teleport(o.getLocation().add(0.0, 0.0, -0.0));
        o.teleport(o.getLocation().add(0.0, 0.0, -0.0));
        p.teleport((Entity)o);
        p.teleport(p.getLocation().add(0.0, 4.0, -0.01));
        p.sendMessage("§aA arena foi criada!");
        p.sendMessage("§cApos de verificar o player, remova os blocos!");
    }
    
    public static boolean isCommand(final String label, final String cmd) {
        return label.equalsIgnoreCase(cmd);
    }
    
    public static boolean isConsole(final CommandSender sender) {
        return sender instanceof Player;
    }
    
    public static boolean hasPermission(final CommandSender sender, final String label) {
        return !sender.hasPermission("cmd." + label);
    }
    
    public static void SemPerm(final CommandSender sender, final String label) {
        sender.sendMessage("§c§lERRO§7,Voc\u00c3ª nao Tem Permissao Para O Comando §c§l" + label);
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final List<String> lore) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setLore((List)lore);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final List<String> lore, final int q) {
        final ItemStack item = new ItemStack(material, q);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setLore((List)lore);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static void filltoInv(final Material mat, final Inventory inv, final int cor, final String nome) {
        final ItemStack a1 = new ItemStack(mat, 1, (short)cor);
        final ItemMeta am1 = a1.getItemMeta();
        am1.setDisplayName(nome);
        a1.setItemMeta(am1);
        inv.addItem(new ItemStack[] { a1 });
        ItemStack[] arrayOfItemStack;
        for (int descpyro = (arrayOfItemStack = inv.getContents()).length, metapyro = 0; metapyro < descpyro; ++metapyro) {
            final ItemStack item = arrayOfItemStack[metapyro];
            if (item == null) {
                inv.setItem(inv.firstEmpty(), a1);
            }
        }
    }
    
    public static void filltoInv(final Material mat, final Inventory inv, final String nome) {
        final ItemStack a1 = new ItemStack(mat, 1, (short)new Random().nextInt(14));
        final ItemMeta am1 = a1.getItemMeta();
        am1.setDisplayName(nome);
        a1.setItemMeta(am1);
        inv.addItem(new ItemStack[] { a1 });
        ItemStack[] arrayOfItemStack;
        for (int descpyro = (arrayOfItemStack = inv.getContents()).length, metapyro = 0; metapyro < descpyro; ++metapyro) {
            final ItemStack item = arrayOfItemStack[metapyro];
            if (item == null) {
                inv.setItem(inv.firstEmpty(), a1);
            }
        }
    }
    
    public static String GetALlArgs(final String[] args, final Integer inicia) {
        final StringBuilder sb = new StringBuilder();
        for (int i = inicia; i < args.length; ++i) {
            sb.append(args[i]).append(" ");
        }
        final String allArgs = sb.toString().trim();
        return ChatColor.translateAlternateColorCodes('&', allArgs);
    }
    
    public static void teleporta(final Player p, final int x, final int y, final int z) {
        p.teleport(new Location(p.getWorld(), (double)x, (double)y, (double)z));
    }
    
    public static void DarSopas(final Player p, final int quantia) {
        for (int x = 0; x < 55; ++x) {
            final ItemStack a = new ItemStack(Material.MUSHROOM_SOUP);
            final ItemMeta am = a.getItemMeta();
            am.setDisplayName("§fSopa");
            a.setItemMeta(am);
            p.getInventory().addItem(new ItemStack[] { a });
        }
    }
    
    public static void DarPotion(final Player p, final int quantia) {
        for (int x = 0; x < 55; ++x) {
            final ItemStack a = new ItemStack(Material.POTION, 1, (short)16421);
            final ItemMeta am = a.getItemMeta();
            am.setDisplayName("§fPotion");
            a.setItemMeta(am);
            p.getInventory().addItem(new ItemStack[] { a });
        }
    }
    
    public static void DarSopas(final Player p) {
        for (int x = 0; x < 55; ++x) {
            final ItemStack a = new ItemStack(Material.MUSHROOM_SOUP);
            final ItemMeta am = a.getItemMeta();
            am.setDisplayName("§fSopa");
            a.setItemMeta(am);
            p.getInventory().addItem(new ItemStack[] { a });
        }
    }
    
    public static void KitSelector(final Inventory inv, final Material mat, final String nome, final int slot, final int data, final List<String> lore) {
        final ItemStack a = new ItemStack(mat, 1, (short)data);
        final ItemMeta am = a.getItemMeta();
        am.setLore((List)lore);
        am.setDisplayName(nome);
        a.setItemMeta(am);
        inv.setItem(slot, a);
    }
    
    public static void KitSelector2(final Inventory inv, final Material mat, final String nome, final int data, final List<String> lore) {
        final ItemStack a = new ItemStack(mat, 1, (short)data);
        final ItemMeta am = a.getItemMeta();
        am.setLore((List)lore);
        am.setDisplayName(nome);
        a.setItemMeta(am);
        inv.addItem(new ItemStack[] { a });
    }
    
    public static void Set(final Player p, final String nome, final int slot, final Material mat) {
        final ItemStack a = new ItemStack(mat);
        final ItemMeta am = a.getItemMeta();
        am.setDisplayName(nome);
        a.setItemMeta(am);
        p.getInventory().setItem(slot, a);
    }
    
    public static void SetItemKIT(final Player p, final String nome, final int slot, final Material mat) {
        final ItemStack a = new ItemStack(mat);
        final ItemMeta am = a.getItemMeta();
        am.setDisplayName(nome);
        a.setItemMeta(am);
        p.getInventory().setItem(slot, a);
        Metodos.ID.put(p.getName(), mat.getId());
    }
    
    public static void Clear(final Player p) {
        p.getInventory().clear();
        p.getInventory().setArmorContents((ItemStack[])null);
        if (p.getActivePotionEffects() != null) {
            for (final PotionEffect e : p.getActivePotionEffects()) {
                p.removePotionEffect(e.getType());
            }
        }
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final String lore, final Enchantment enchant, final int levelEnchant) {
        final ItemStack item = new ItemStack(material);
        item.addUnsafeEnchantment(enchant, levelEnchant);
        final ItemMeta itemmeta = item.getItemMeta();
        final List<String> iteml = new ArrayList<String>();
        iteml.add(lore);
        itemmeta.setLore((List)iteml);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final int amount, final int durability, final List<String> lore) {
        final ItemStack item = new ItemStack(material, amount, (short)durability);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setLore((List)lore);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemstack(final Material mat, final int data, final int quantia, final String nome) {
        final ItemStack a = new ItemStack(mat, quantia, (short)data);
        final ItemMeta am = a.getItemMeta();
        am.setDisplayName(nome);
        a.setItemMeta(am);
        return a;
    }
    
    public static ItemStack itemstack(final Material mat, final int data, final int quantia, final String nome, final Enchantment enchant, final int level) {
        final ItemStack a = new ItemStack(mat, quantia, (short)data);
        final ItemMeta am = a.getItemMeta();
        am.addEnchant(enchant, level, true);
        am.setDisplayName(nome);
        a.setItemMeta(am);
        return a;
    }
    
    public static ItemStack itemStack(final Material material, final String nome) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final short data) {
        final ItemStack item = new ItemStack(material, 1, data);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final short data, final List<String> lore) {
        final ItemStack item = new ItemStack(material, 1, data);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setLore((List)lore);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final int q) {
        final ItemStack item = new ItemStack(material, q);
        final ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static ItemStack itemStack(final Material material, final String nome, final String lore) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta itemmeta = item.getItemMeta();
        final List<String> iteml = new ArrayList<String>();
        iteml.add(lore);
        itemmeta.setLore((List)iteml);
        itemmeta.setDisplayName(nome);
        item.setItemMeta(itemmeta);
        return item;
    }
    
    public static boolean isInteger(final String s) {
        try {
            Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            return false;
        }
        catch (NullPointerException e2) {
            return false;
        }
        return true;
    }
    
    public static void itemSpawn(final Player p) {
        p.getInventory().clear();
        final File file = new File(Variaveis.main.getDataFolder() + "/config.yml");
        final FileConfiguration c = (FileConfiguration)getyml(file);
        final String kname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("KitSelector.Name"));
        final String wname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("Warps.Name"));
        final String lname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("Loja.Name"));
        final String mname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("Menu.Name"));
        final ItemStack kit = itemStack(Material.getMaterial(c.getInt("KitSelector.ID")), 0, 1, kname);
        final ItemStack warp = itemStack(Material.getMaterial(c.getInt("Warps.ID")), 0, 1, wname);
        final ItemStack loja = itemStack(Material.getMaterial(c.getInt("Loja.ID")), 0, 1, lname);
        final ItemStack menu = itemStack(Material.getMaterial(c.getInt("Menu.ID")), 0, 1, mname);
        p.getInventory().setItem(c.getInt("KitSelector.Slot"), kit);
        p.getInventory().setItem(c.getInt("Loja.Slot"), loja);
        p.getInventory().setItem(c.getInt("Warps.Slot"), warp);
        p.getInventory().setItem(c.getInt("Menu.Slot"), menu);
    }
    
    public static YamlConfiguration getyml(final File file) {
        final YamlConfiguration config = new YamlConfiguration();
        try {
            final FileInputStream fileinputstream = new FileInputStream(file);
            config.load((Reader)new InputStreamReader(fileinputstream, Charset.forName("UTF-8")));
        }
        catch (FileNotFoundException e3) {
            System.out.print("File not found!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InvalidConfigurationException e2) {
            e2.printStackTrace();
        }
        return config;
    }
    
    public static void sendactionBar(final Player p, final String string) {
    }
}
