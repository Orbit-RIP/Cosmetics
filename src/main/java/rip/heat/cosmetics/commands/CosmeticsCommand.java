package rip.heat.cosmetics.commands;

import cc.fyre.proton.command.Command;
import org.bukkit.entity.Player;
import rip.heat.cosmetics.menu.CosmeticsSelectionMenu;

public class CosmeticsCommand {

    @Command(names = {"cosmetics"}, permission = "")
    public static void cosmeticsCommand(Player sender) {
        new CosmeticsSelectionMenu().openMenu(sender);
    }
}
