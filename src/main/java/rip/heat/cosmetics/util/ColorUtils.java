package rip.heat.cosmetics.util;

import org.bukkit.Color;

public class ColorUtils {

    public static Color getBukkitColor(String n) {
        String name = n.toUpperCase();
        switch (name) {
            case "RED": {
                return Color.RED;
            }
            case "BLUE": {
                return Color.BLUE;
            }
            case "BLACK": {
                return Color.BLACK;
            }
            case "YELLOW": {
                return Color.YELLOW;
            }
            case "AQUA": {
                return Color.AQUA;
            }
            case "FUCHSIA": {
                return Color.FUCHSIA;
            }
            case "GRAY": {
                return Color.GRAY;
            }
            case "GREEN": {
                return Color.GREEN;
            }
            case "MAROON": {
                return Color.MAROON;
            }
            case "NAVY": {
                return Color.NAVY;
            }
            case "ORANGE": {
                return Color.ORANGE;
            }
            case "LIME": {
                return Color.LIME;
            }
            case "OLIVE": {
                return Color.OLIVE;
            }
            case "PURPLE": {
                return Color.PURPLE;
            }
            case "TEAL": {
                return Color.TEAL;
            }
            case "SILVER": {
                return Color.SILVER;
            }
        }
        return Color.WHITE;
    }

    public static Color getBukkitColorCode(String n) {
        String name = n.toUpperCase();
        switch (name) {
            case "§4": {
                return Color.fromRGB(170,0,0);
            }
            case "&c":
            case "§c§o":
            case "§c": {
                return Color.fromRGB(255,85,85);
            }
            case "§6": {
                return Color.fromRGB(255,170,0);
            }
            case "§e": {
                return Color.fromRGB(255,255,85);
            }
            case "§2": {
                return Color.fromRGB(0,170,0);
            }
            case "§a": {
                return Color.fromRGB(85,255,85);
            }
            case "§b": {
                return Color.fromRGB(85,255,255);
            }
            case "§3": {
                return Color.fromRGB(0,170,170);
            }
            case "§1": {
                return Color.fromRGB(0,0,170);
            }
            case "§9": {
                return Color.fromRGB(85,85,255);
            }
            case "§d": {
                return Color.fromRGB(255,85,255);
            }
            case "§5": {
                return Color.fromRGB(170,0,170);
            }
        }
        return Color.WHITE;
    }
}
