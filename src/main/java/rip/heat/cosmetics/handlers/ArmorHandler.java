package rip.heat.cosmetics.handlers;

import org.bukkit.Material;
import org.bukkit.Color;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import rip.heat.cosmetics.Cosmetics;
import rip.heat.cosmetics.util.ColorUtils;
import rip.heat.cosmetics.util.ItemBuilder;
import rip.orbit.nebula.rank.Rank;

import java.util.Locale;

public class ArmorHandler {

    public static void applyArmor(Player player, Rank rank) {
        if (Cosmetics.getInstance().getConfig().contains(rank.getName().toLowerCase())) {
            ItemStack helmet = new ItemBuilder(Material.LEATHER_HELMET).setLeatherArmorColor(ColorUtils.getBukkitColor(Cosmetics.getInstance().getConfig().getString(rank.getName().toLowerCase() + ".contents.helmet.color"))).toItemStack();
            ItemStack chestplate = new ItemBuilder(Material.LEATHER_CHESTPLATE).setLeatherArmorColor(ColorUtils.getBukkitColor(Cosmetics.getInstance().getConfig().getString(rank.getName().toLowerCase() + ".contents.chestplate.color"))).toItemStack();
            ItemStack leggings = new ItemBuilder(Material.LEATHER_LEGGINGS).setLeatherArmorColor(ColorUtils.getBukkitColor(Cosmetics.getInstance().getConfig().getString(rank.getName().toLowerCase() + ".contents.leggings.color"))).toItemStack();
            ItemStack boosts = new ItemBuilder(Material.LEATHER_BOOTS).setLeatherArmorColor(ColorUtils.getBukkitColor(Cosmetics.getInstance().getConfig().getString(rank.getName().toLowerCase() + ".contents.boots.color"))).toItemStack();
            player.getInventory().setHelmet(helmet);
            player.getInventory().setChestplate(chestplate);
            player.getInventory().setLeggings(leggings);
            player.getInventory().setBoots(boosts);
        }
    }

}
