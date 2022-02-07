package rip.heat.cosmetics.menu;

import cc.fyre.proton.menu.Button;
import cc.fyre.proton.menu.Menu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import rip.orbit.nebula.util.CC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CosmeticsSelectionMenu extends Menu {

    @Override
    public String getTitle(Player player) {
        return "Cosmetics";
    }

    @Override
    public Map<Integer, Button> getButtons(Player player) {
        Map<Integer, Button> buttons = new HashMap<>();
        buttons.put(10, new Button() {
            @Override
            public String getName(Player player) {
                return CC.translate("&a&lArmor");
            }

            @Override
            public List<String> getDescription(Player player) {
                List<String> lore = new ArrayList<>();
                lore.add(" ");
                lore.add("&7Change your armor design.");
                lore.add(" ");
                lore.add("&bSelected armor: ");
                return CC.translate(lore);
            }

            @Override
            public Material getMaterial(Player player) {
                return Material.LEATHER_CHESTPLATE;
            }
        });
        return buttons;
    }
}
