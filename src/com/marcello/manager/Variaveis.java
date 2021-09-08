package com.marcello.manager;

import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import com.marcello.Main;

public class Variaveis
{
    public static Main main;
    public static String prefix;
    public static String ip;
    public static HashMap<String, Boolean> StaffChat;
    public static Boolean chat;
    public static List<String> Admin;
    public static List<String> combat;
    public static HashMap<String, String> modo;
    
    static {
        Variaveis.StaffChat = new HashMap<String, Boolean>();
        Variaveis.chat = true;
        Variaveis.Admin = new ArrayList<String>();
        Variaveis.combat = new ArrayList<String>();
        Variaveis.modo = new HashMap<String, String>();
    }
    
    public static boolean hasSopa(final Player p) {
        Boolean b = false;
        if (!Variaveis.modo.containsKey(p.getName())) {
            Variaveis.modo.put(p.getName(), "sopa");
        }
        if (Variaveis.modo.get(p.getName()).equalsIgnoreCase("sopa")) {
            b = true;
        }
        return b;
    }
    
    public static void setSopa(final Player p, final Boolean b) {
        if (b) {
            Variaveis.modo.put(p.getName(), "sopa");
        }
        else {
            Variaveis.modo.put(p.getName(), "potion");
        }
    }
    
    public static void setup(final Main m) {
        Variaveis.prefix = m.getConfig().getString("name").replace("&", "§");
        Variaveis.ip = m.getConfig().getString("ip").replace("&", "§");
    }
}
