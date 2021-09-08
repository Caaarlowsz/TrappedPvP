package com.marcello.manager;

import org.bukkit.entity.Player;

public class Groups
{
    public static String getRank(final Player p) {
        if (p.hasPermission("tag.dono")) {
            return "§4§lDONO";
        }
        if (p.hasPermission("tag.gerente")) {
            return "§C§lGERENTE";
        }
        if (p.hasPermission("tag.admin")) {
            return "§c§lADMIN";
        }
        if (p.hasPermission("tag.modplus")) {
            return "§5§lMOD+";
        }
        if (p.hasPermission("tag.mod")) {
            return "§5§lMOD";
        }
        if (p.hasPermission("tag.trial")) {
            return "§5§lTRIAL";
        }
        if (p.hasPermission("tag.helper")) {
            return "§9§lHELPER";
        }
        if (p.hasPermission("tag.youtuber+")) {
            return "§3§lYOUTUBER+";
        }
        if (p.hasPermission("tag.youtuber")) {
            return "§b§lYOUTUBER";
        }
        if (p.hasPermission("tag.ultimate")) {
            return "§d§lULTIMATE";
        }
        if (p.hasPermission("tag.premium")) {
            return "§6§lPREMIUM";
        }
        if (p.hasPermission("tag.light")) {
            return "§a§lLIGHT";
        }
        if (p.hasPermission("tag.developer")) {
            return "§3§lDEVELOPER";
        }
        if (p.hasPermission("tag.builder")) {
            return "§e§lBUILDER";
        }
        if (p.hasPermission("tag.normal")) {
            return "§7§lMEMBRO";
        }
        return "§7§lMEMBRO";
    }
}
