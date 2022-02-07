package rip.heat.cosmetics.commands;

import cc.fyre.proton.command.Command;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CosmeticCommand {

    @Command(names = {"cosmetic list"}, permission = "orbit.headstaff")
    public static void cosmeticList(CommandSender sender) {
        sender.sendMessage(ChatColor.BLUE.toString() + ChatColor.STRIKETHROUGH + StringUtils.repeat('-', 35));
        sender.sendMessage(ChatColor.RED + "Colored Armor");
        sender.sendMessage(ChatColor.RED + "Particles");
        sender.sendMessage(ChatColor.BLUE.toString() + ChatColor.STRIKETHROUGH + StringUtils.repeat('-', 35));
    }
}
