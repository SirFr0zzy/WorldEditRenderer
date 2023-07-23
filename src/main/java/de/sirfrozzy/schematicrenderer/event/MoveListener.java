package de.sirfrozzy.schematicrenderer.event;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveListener implements Listener {

    private Location oldLocation;

    @EventHandler
    public void handle(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location blockLoc = player.getTargetBlockExact(255).getLocation();
        if (blockLoc != oldLocation) {
            oldLocation = blockLoc;

        }
    }

}
