package rip.heat.cosmetics.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import rip.heat.cosmetics.handlers.ArmorHandler;
import rip.orbit.nebula.Nebula;
import rip.orbit.nebula.profile.Profile;

public class CosmeticListener implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Profile profile = Nebula.getInstance().getProfileHandler().fromUuid(player.getUniqueId());

        if (profile != null) {
            ArmorHandler.applyArmor(player, profile.getActiveRank());
        }
    }
}
