package com.marcello;

import com.marcello.comandos.RegrasCommand;
import com.marcello.comandos.Loja;
import com.marcello.comandos.UpRankCommand;
import com.marcello.comandos.GiveXpCommand;
import com.marcello.comandos.MOTDCommand;
import com.marcello.comandos.AutoSoupCommand;
import com.marcello.comandos.RemoveKitCommand;
import com.marcello.comandos.PermissionsListCommand;
import com.marcello.comandos.RemovePermissionCommand;
import com.marcello.comandos.GiveVipCommand;
import com.marcello.comandos.GroupSetCommand;
import com.marcello.comandos.PromoveCommand;
import com.marcello.comandos.SorteioVipCommand;
import com.marcello.comandos.SorteioKitCommand;
import com.marcello.comandos.ReloadCommand;
import com.marcello.comandos.sKitCommand;
import com.marcello.comandos.GivePermissionCommand;
import com.marcello.comandos.GiveKitCommand;
import com.marcello.comandos.InvisCommand;
import com.marcello.comandos.VisCommand;
import com.marcello.comandos.MonitorCommand;
import com.marcello.comandos.ReportCommand;
import com.marcello.comandos.ClearchatCommand;
import com.marcello.comandos.KitCommand;
import com.marcello.comandos.DeathCommand;
import com.marcello.comandos.GiveKillsCommand;
import com.marcello.comandos.CageCommand;
import com.marcello.comandos.TeleportCommand;
import com.marcello.comandos.EventoCommand;
import com.marcello.comandos.StaffCommand;
import com.marcello.comandos.CoinsCommand;
import com.marcello.comandos.BroadcastCommand;
import com.marcello.comandos.SpawnCommand;
import com.marcello.comandos.TellCommand;
import com.marcello.comandos.SimulatorCommand;
import com.marcello.comandos.MainCommand;
import com.marcello.comandos.HelpCommand;
import com.marcello.comandos.ChallengeCommand;
import com.marcello.comandos.GamemodeCommand;
import com.marcello.comandos.SumoCommand;
import com.marcello.comandos.FpsCommand;
import com.marcello.comandos.InvseeCommand;
import com.marcello.comandos.HeadCommand;
import com.marcello.comandos.PingCommand;
import com.marcello.authme.Mudar;
import com.marcello.authme.Register;
import com.marcello.authme.Logar;
import com.marcello.comandos.PvPCommand;
import com.marcello.comandos.TopDeathCommand;
import com.marcello.comandos.TopKillCommand;
import com.marcello.comandos.TopCoinsCommand;
import com.marcello.comandos.GladiatorCommand;
import org.bukkit.command.CommandExecutor;
import com.marcello.umvum.CmdsSpeed;
import com.marcello.comandos.umVumCommand;
import com.marcello.umvum.Speed1v1;
import com.marcello.umvum.Events1v1;
import com.marcello.classes.Assassin;
import com.marcello.classes.Anchor;
import com.marcello.classes.Rain;
import com.marcello.manager.TopKillStreak;
import com.marcello.outros.ServerSignVIP;
import com.marcello.classes.Switcher;
import com.marcello.classes.Magma;
import com.marcello.classes.Monk;
import com.marcello.classes.Ajnin;
import com.marcello.comandos.AplicarCommand;
import com.marcello.guis.LojaPerm;
import com.marcello.guis.UltilsMenu;
import com.marcello.guis.FpsMenu;
import com.marcello.guis.RankGUI;
import com.marcello.guis.PerfilGUI;
import com.marcello.utils.Listeners;
import com.marcello.comandos.ChatCommand;
import com.marcello.comandos.ManutentionCommand;
import com.marcello.guis.VisGui;
import com.marcello.guis.Monitor;
import com.marcello.guis.Admins;
import com.marcello.comandos.setArenaCommand;
import com.marcello.comandos.YoutuberCommand;
import com.marcello.classes.Viking;
import com.marcello.classes.Reaper;
import com.marcello.classes.Snail;
import com.marcello.classes.Viper;
import com.marcello.classes.Fisherman;
import com.marcello.classes.Kangaroo;
import com.marcello.guis.KitSelector;
import com.marcello.events.RespawnEvent;
import com.marcello.events.ChatEvent;
import com.marcello.events.NerfsEvent;
import com.marcello.classes.Forcefield;
import com.marcello.classes.AntiTower;
import com.marcello.classes.Hulk;
import com.marcello.classes.Madman;
import com.marcello.classes.Boxer;
import com.marcello.classes.Deshviper;
import com.marcello.classes.Deshfire;
import com.marcello.classes.Turtle;
import com.marcello.classes.Specialist;
import com.marcello.events.SoupEvent;
import com.marcello.events.ServerexitEvent;
import com.marcello.events.CompassEvent;
import com.marcello.events.KillEvent;
import com.marcello.events.AllEvent;
import com.marcello.events.JoinEvent;
import com.marcello.classes.Stomper;
import com.marcello.outros.ServerSignRecraft;
import com.marcello.outros.ServerSignSoup;
import com.marcello.comandos.AdminCommand;
import com.marcello.comandos.BuildCommand;
import com.marcello.events.BrokenItemEvent;
import com.marcello.comandos.TagCommand;
import com.marcello.classes.Ninja;
import com.marcello.comandos.ClicktestCommand;
import com.marcello.guis.Warps;
import com.marcello.classes.Phantom;
import com.marcello.classes.Poseidon;
import com.marcello.classes.TimeLord;
import com.marcello.classes.Thor;
import com.marcello.classes.Urgal;
import com.marcello.utils.WarpsAPI;
import com.marcello.events.PluginsEvent;
import com.marcello.utils.TagsAPI;
import com.marcello.classes.Gladiator;
import com.marcello.jumps.Ferro;
import com.marcello.jumps.Diamante;
import com.marcello.jumps.Esponja;
import com.marcello.jumps.EndPortal;
import com.marcello.comandos.TexturaCommand;
import com.marcello.comandos.FishermanCommand;
import com.marcello.authme.Login;
import org.bukkit.event.Listener;
import com.marcello.authme.Block;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.FileOutputStream;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import com.marcello.api.TitleAPI;
import com.marcello.manager.Groups;
import com.marcello.utils.KitAPI;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import com.marcello.score.Score;
import net.minecraft.util.com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Main instance;
    public static Plugin plugin;
    public File stats1;
    public YamlConfiguration stats;
    public File warps1;
    public YamlConfiguration warps;
    public File arenas1;
    public YamlConfiguration arenas;
    public File perms1;
    public YamlConfiguration perms;
    public static List<String> jogadores;
    public static ArrayList<String> Jogadores;
    public static ArrayList<String> fazendoLogin;
    public static ArrayList<String> login;
    
    static {
        Main.jogadores = (List<String>)Lists.newArrayList();
        Main.Jogadores = new ArrayList<String>();
        Main.fazendoLogin = new ArrayList<String>();
        Main.login = new ArrayList<String>();
    }
    
    public static Main getInstace() {
        return Main.instance;
    }
    
    public static Plugin getPlugin() {
        return Main.plugin;
    }
    
    public void onEnable() {
        Main.plugin = (Plugin)this;
        (Main.instance = this).saveConfig();
        (Main.instance = this).saveDefaultConfig();
        Score.timerUpdate();
        final File stats = new File(this.getDataFolder(), "stats.yml");
        if (!stats.exists()) {
            this.saveResource("stats.yml", false);
        }
        this.stats1 = new File(this.getDataFolder(), "stats.yml");
        this.stats = YamlConfiguration.loadConfiguration(this.stats1);
        final File warps = new File(this.getDataFolder(), "warps.yml");
        if (!warps.exists()) {
            this.saveResource("warps.yml", false);
        }
        this.warps1 = new File(this.getDataFolder(), "warps.yml");
        this.warps = YamlConfiguration.loadConfiguration(this.warps1);
        final File arenas = new File(this.getDataFolder(), "arenas.yml");
        if (!arenas.exists()) {
            this.saveResource("arenas.yml", false);
        }
        this.arenas1 = new File(this.getDataFolder(), "arenas.yml");
        this.arenas = YamlConfiguration.loadConfiguration(this.arenas1);
        this.saveResource("arenas.yml", false);
        this.arenas1 = new File(this.getDataFolder(), "arenas.yml");
        this.arenas = YamlConfiguration.loadConfiguration(this.arenas1);
        new BukkitRunnable() {
            public void run() {
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                    final Player p = onlinePlayers[i];
                    final int ping = ((CraftPlayer)p).getHandle().ping;
                    final int online = Bukkit.getOnlinePlayers().length;
                    TitleAPI.sendTabTitle(p, "§3§lTRAPPED§F§LPVP\n", "§7Kit Atual: §3" + KitAPI.getKit(p) + " §7| §7Rank: " + Groups.getRank(p) + " §7| §7Online: §a" + online + "\n" + "\n" + "§7Twitter: §e@RedeTrapped_");
                }
            }
        }.runTaskTimer((Plugin)this, 0L, 15L);
        this.RegisterEvents();
        this.Comandos();
        Segundos1();
        final ConsoleCommandSender e = Bukkit.getConsoleSender();
        e.sendMessage("§e§l§b§lKitPvP §7- §fPlugin habilitado com sucesso.");
    }
    
    public void onDisable() {
        final ConsoleCommandSender e = Bukkit.getConsoleSender();
        e.sendMessage("§e§l§b§lKitPvP §7- §fPlugin desabilitado com sucesso.");
    }
    
    public void saveConfiguration(final File file, final YamlConfiguration config) {
        try {
            final Writer fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charset.forName("UTF-8")));
            fileWriter.write(config.saveToString());
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void RegisterEvents() {
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Block(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Login(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new FishermanCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new TexturaCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new EndPortal(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Esponja(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Diamante(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Ferro(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Gladiator(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new TagsAPI(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new PluginsEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new WarpsAPI(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Urgal(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Thor(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new TimeLord(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Poseidon(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Phantom(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new WarpsAPI(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Warps(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ClicktestCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Ninja(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new TagCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new BrokenItemEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new BuildCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new AdminCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ServerSignSoup(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ServerSignRecraft(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Stomper(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new JoinEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new AllEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new KillEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new CompassEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ServerexitEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new SoupEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Specialist(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Turtle(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Deshfire(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Deshviper(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Boxer(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Madman(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Hulk(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new AntiTower(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Forcefield(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new NerfsEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ChatEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new RespawnEvent(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new KitSelector(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Kangaroo(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Fisherman(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Viper(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Snail(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Reaper(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Viking(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new YoutuberCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new setArenaCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Admins(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Monitor(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new VisGui(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ManutentionCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ChatCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Listeners(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new PerfilGUI(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new RankGUI(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new FpsMenu(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new UltilsMenu(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new LojaPerm(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new AplicarCommand(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Ajnin(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Monk(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Magma(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Switcher(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ServerSignVIP(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new TopKillStreak(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Rain(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Anchor(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Assassin(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Events1v1(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Speed1v1(), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new umVumCommand(), (Plugin)this);
    }
    
    public void Comandos() {
        this.getCommand("speed1v1").setExecutor((CommandExecutor)new CmdsSpeed());
        this.getCommand("1v1").setExecutor((CommandExecutor)new umVumCommand());
        this.getCommand("gladiator").setExecutor((CommandExecutor)new GladiatorCommand());
        this.getCommand("topcoins").setExecutor((CommandExecutor)new TopCoinsCommand());
        this.getCommand("topkills").setExecutor((CommandExecutor)new TopKillCommand());
        this.getCommand("topdeaths").setExecutor((CommandExecutor)new TopDeathCommand());
        this.getCommand("TogglePvP").setExecutor((CommandExecutor)new PvPCommand());
        this.getCommand("login").setExecutor((CommandExecutor)new Logar());
        this.getCommand("register").setExecutor((CommandExecutor)new Register());
        this.getCommand("mudarsenha").setExecutor((CommandExecutor)new Mudar());
        this.getCommand("ping").setExecutor((CommandExecutor)new PingCommand());
        this.getCommand("head").setExecutor((CommandExecutor)new HeadCommand());
        this.getCommand("inv").setExecutor((CommandExecutor)new InvseeCommand());
        this.getCommand("fps").setExecutor((CommandExecutor)new FpsCommand());
        this.getCommand("sumo").setExecutor((CommandExecutor)new SumoCommand());
        this.getCommand("textura").setExecutor((CommandExecutor)new TexturaCommand());
        this.getCommand("gm").setExecutor((CommandExecutor)new GamemodeCommand());
        this.getCommand("challenge").setExecutor((CommandExecutor)new ChallengeCommand());
        this.getCommand("ajuda").setExecutor((CommandExecutor)new HelpCommand());
        this.getCommand("main").setExecutor((CommandExecutor)new MainCommand());
        this.getCommand("fisherman").setExecutor((CommandExecutor)new FishermanCommand());
        this.getCommand("simulator").setExecutor((CommandExecutor)new SimulatorCommand());
        this.getCommand("tell").setExecutor((CommandExecutor)new TellCommand());
        this.getCommand("warps").setExecutor((CommandExecutor)new Warps());
        this.getCommand("spawn").setExecutor((CommandExecutor)new SpawnCommand());
        this.getCommand("testclick").setExecutor((CommandExecutor)new ClicktestCommand());
        this.getCommand("tags").setExecutor((CommandExecutor)new TagCommand());
        this.getCommand("tag").setExecutor((CommandExecutor)new TagCommand());
        this.getCommand("bc").setExecutor((CommandExecutor)new BroadcastCommand());
        this.getCommand("coins").setExecutor((CommandExecutor)new CoinsCommand());
        this.getCommand("sc").setExecutor((CommandExecutor)new StaffCommand());
        this.getCommand("youtuber").setExecutor((CommandExecutor)new YoutuberCommand());
        this.getCommand("rank").setExecutor((CommandExecutor)new RankGUI());
        this.getCommand("liga").setExecutor((CommandExecutor)new RankGUI());
        this.getCommand("menufps").setExecutor((CommandExecutor)new FpsMenu());
        this.getCommand("evento").setExecutor((CommandExecutor)new EventoCommand());
        this.getCommand("tp").setExecutor((CommandExecutor)new TeleportCommand());
        this.getCommand("arena").setExecutor((CommandExecutor)new CageCommand());
        this.getCommand("givekills").setExecutor((CommandExecutor)new GiveKillsCommand());
        this.getCommand("morrer").setExecutor((CommandExecutor)new DeathCommand());
        this.getCommand("setarena").setExecutor((CommandExecutor)new setArenaCommand());
        this.getCommand("build").setExecutor((CommandExecutor)new BuildCommand());
        this.getCommand("admin").setExecutor((CommandExecutor)new AdminCommand());
        this.getCommand("kit").setExecutor((CommandExecutor)new KitCommand());
        this.getCommand("kits").setExecutor((CommandExecutor)new KitSelector());
        this.getCommand("clearchat").setExecutor((CommandExecutor)new ClearchatCommand());
        this.getCommand("report").setExecutor((CommandExecutor)new ReportCommand(getInstace()));
        this.getCommand("tphere").setExecutor((CommandExecutor)new TeleportCommand());
        this.getCommand("tpall").setExecutor((CommandExecutor)new TeleportCommand());
        this.getCommand("admins").setExecutor((CommandExecutor)new Admins());
        this.getCommand("monitorgui").setExecutor((CommandExecutor)new Monitor());
        this.getCommand("monitorar").setExecutor((CommandExecutor)new MonitorCommand());
        this.getCommand("vis").setExecutor((CommandExecutor)new VisCommand());
        this.getCommand("invis").setExecutor((CommandExecutor)new InvisCommand());
        this.getCommand("visgui").setExecutor((CommandExecutor)new VisGui());
        this.getCommand("manutencao").setExecutor((CommandExecutor)new ManutentionCommand());
        this.getCommand("givekit").setExecutor((CommandExecutor)new GiveKitCommand());
        this.getCommand("givepermission").setExecutor((CommandExecutor)new GivePermissionCommand());
        this.getCommand("skit").setExecutor((CommandExecutor)new sKitCommand());
        this.getCommand("chat").setExecutor((CommandExecutor)new ChatCommand());
        this.getCommand("atualizar").setExecutor((CommandExecutor)new ReloadCommand());
        this.getCommand("sortearkit").setExecutor((CommandExecutor)new SorteioKitCommand());
        this.getCommand("sortearvip").setExecutor((CommandExecutor)new SorteioVipCommand());
        this.getCommand("promover").setExecutor((CommandExecutor)new PromoveCommand());
        this.getCommand("groupset").setExecutor((CommandExecutor)new GroupSetCommand());
        this.getCommand("givevip").setExecutor((CommandExecutor)new GiveVipCommand());
        this.getCommand("removepermission").setExecutor((CommandExecutor)new RemovePermissionCommand());
        this.getCommand("permissionslist").setExecutor((CommandExecutor)new PermissionsListCommand());
        this.getCommand("removekit").setExecutor((CommandExecutor)new RemoveKitCommand());
        this.getCommand("perfil").setExecutor((CommandExecutor)new PerfilGUI());
        this.getCommand("lojaperm").setExecutor((CommandExecutor)new LojaPerm());
        this.getCommand("ultils").setExecutor((CommandExecutor)new UltilsMenu());
        this.getCommand("autosoup").setExecutor((CommandExecutor)new AutoSoupCommand());
        this.getCommand("aplicar").setExecutor((CommandExecutor)new AplicarCommand());
        this.getCommand("setmotd").setExecutor((CommandExecutor)new MOTDCommand());
        this.getCommand("givexp").setExecutor((CommandExecutor)new GiveXpCommand());
        this.getCommand("upar").setExecutor((CommandExecutor)new UpRankCommand());
        this.getCommand("loja").setExecutor((CommandExecutor)new Loja());
        this.getCommand("regras").setExecutor((CommandExecutor)new RegrasCommand());
    }
    
    public void save() {
        try {
            this.stats.save(this.stats1);
            this.warps.save(this.warps1);
            this.arenas.save(this.arenas1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void Segundos1() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)getInstace(), (Runnable)new Runnable() {
            @Override
            public void run() {
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                    final Player s = onlinePlayers[i];
                    if (KitAPI.KitDelay.containsKey(s.getName())) {
                        KitAPI.KitDelay.put(s.getName(), KitAPI.KitDelay.get(s.getName()) - 1);
                    }
                }
            }
        }, 0L, 20L);
    }
}
